package client;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import com.baidu.cloud.starlight.api.rpc.StarlightClient;
import com.baidu.cloud.starlight.api.rpc.config.ServiceConfig;
import com.baidu.cloud.starlight.api.rpc.config.TransportConfig;
import com.baidu.cloud.starlight.core.rpc.SingleStarlightClient;
import com.baidu.cloud.starlight.core.rpc.proxy.JDKProxyFactory;

import api.CoordinatingNodeService;
import api.model.*;


public class ClientApp {
    private TransportConfig config;

    private StarlightClient starlightClient;

    private ServiceConfig clientConfig;

    private CoordinatingNodeService service;

    public ClientApp() {
        System.out.println("1111111111111111111111111111");
        config = new TransportConfig();
        System.out.println("222222222222222222222222222222");
        starlightClient = new SingleStarlightClient("192.168.180.128", 33333, config);
        /*System.out.println("33333333333333333333333333333333");*/
        starlightClient.init();
        /*System.out.println("44444444444444444444444444444444444"); */
 
        clientConfig = new ServiceConfig(); // 服务配置
        clientConfig.setServiceId("rpc.CoordinatingNodeService");
        clientConfig.setProtocol("brpc");

        JDKProxyFactory proxyFactory = new JDKProxyFactory();
        service = proxyFactory.getProxy(CoordinatingNodeService.class, clientConfig, starlightClient);

        //Statement s = new Statement("test123");

        //Map<String, String> temp = new HashMap<String, String>();
        //temp.put("a", "bcd");
        //Options op = new Options(temp);
        //SearchRequest request = new SearchRequest(1, 2, s, op);
        //SearchResponse response = service.Search(request);
        
        //starlightClient.destroy();
    }

    public ClientApp(String ip, int port)
    {
        TransportConfig config = new TransportConfig();
        StarlightClient starlightClient = new SingleStarlightClient(ip, port, config);
    }

    public void sendCreateIndexRequest(int requestId, String indexName, List<Option> options)
    {
        CreateIndexRequest request = new CreateIndexRequest(requestId, indexName, options);
        System.out.println(request.getRequestId());
        System.out.println(request.getIndexName());
        for(Option o:options)
        {
            System.out.println(o.getKey());
            System.out.println(o.getValue());
        }
        //sendTest();
        CreateIndexResponse response = service.CreateIndex(request);
        System.out.println(response.getCreateIndexRequestId());
        System.out.println(response.getResult().isSuccess());
        System.out.println(response.getResult().getError());
    }

    public void sendDeleteIndexRequest(int requestId, String indexName, List<Option> options)
    {
        DeleteIndexRequest request = new DeleteIndexRequest(requestId, indexName, options);
        System.out.println(request.getRequestId());
        System.out.println(request.getIndexName());
        DeleteIndexResponse response = service.DeleteIndex(request);

        System.out.println(response.getDeleteIndexRequestId());
        System.out.println(response.getResult().isSuccess());
        System.out.println(response.getResult().getError());
    }
/* 
    public static void main(String[] args) {
        TransportConfig config = new TransportConfig();
        StarlightClient starlightClient = new SingleStarlightClient("localhost", 8000, config);
        starlightClient.init();

        ServiceConfig clientConfig = new ServiceConfig(); // 服务配置
        clientConfig.setServiceId("rpc.CoordinatingNodeService");
        clientConfig.setProtocol("brpc");
        clientConfig.setSerializeMode("pb2-java");

        JDKProxyFactory proxyFactory = new JDKProxyFactory();
        CoordinatingNodeService service = proxyFactory.getProxy(CoordinatingNodeService.class, clientConfig, starlightClient);

        Statement s = new Statement("test123");

        Map<String, String> temp = new HashMap<String, String>();
        temp.put("a", "bcd");
        Options op = new Options(temp);
        SearchRequest request = new SearchRequest(1, 2, s, op);
        SearchResponse response = service.Search(request);
        
        starlightClient.destroy();
        System.exit(0);
    }*/
    public void sendTest()
    {
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
        temp.put(123, 456);
        TestRequest request = new TestRequest(666, "test request");
        request.setL(temp);
        List<Option> options = new ArrayList<Option>();
        options.add(new Option("cause", "api"));
        options.add(new Option("providedName", "testnames"));
        request.setOptions(options);
        /*List<String> strings = new ArrayList<String>();
        strings.add("test");
        strings.add("hello");
        request.setStrings(strings);*/
        TestResponse response = service.Test(request);

        System.out.println(response.getL().get(0).getText());
    }
}
