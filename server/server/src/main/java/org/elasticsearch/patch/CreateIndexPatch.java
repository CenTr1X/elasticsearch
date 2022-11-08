package org.elasticsearch.patch;

import org.elasticsearch.action.admin.indices.create.CreateIndexClusterStateUpdateRequest;
import client.ClientApp;
import api.model.Options;

public class CreateIndexPatch {
    private CreateIndexClusterStateUpdateRequest request;
    private static ClientApp app;

    public CreateIndexPatch()
    {
        System.out.println("no request test!!!!!!!!!!!!!!!!!!");
        //this.app = new ClientApp();
    }

    public CreateIndexPatch(CreateIndexClusterStateUpdateRequest request)
    {
        this.request = request;
    }

    public void execute()
    {
        ClientApp app = new ClientApp();
        Options options = new Options();
        options.addOption("cause", request.cause());
        options.addOption("providedName", request.getProvidedName());
        app.sendCreateIndexRequest((int)(Math.random()*10000), request.index(), options);
    }
    
    public static void init()
    {
        app = new ClientApp();
    }

    public static void executeTest()
    {
    	//ClientApp app = new ClientApp();
    	app.sendTest();
    }
}
