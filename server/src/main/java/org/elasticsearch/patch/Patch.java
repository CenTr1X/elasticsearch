package org.elasticsearch.patch;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import org.elasticsearch.action.admin.indices.create.CreateIndexClusterStateUpdateRequest;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexClusterStateUpdateRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.search.fetch.ShardFetchSearchRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.core.TimeValue;
import org.elasticsearch.common.xcontent.XContentHelper;
import org.elasticsearch.index.Index;
import org.elasticsearch.search.Scroll;

import client.ClientApp;
import api.model.Option;
import api.model.document.Document;


public class Patch {
    private static ClientApp app;

    private static int previousSearchId;

    public static void init()
    {
        app = new ClientApp();
    }

    public static void executeTest()
    {
    	//ClientApp app = new ClientApp();
    	app.sendTest();
    }

    public static void executeCreateIndex(CreateIndexClusterStateUpdateRequest request)
    {
        List<Option> options = new ArrayList<Option>();
        options.add(new Option("cause", request.cause()));
        options.add(new Option("providedName", request.getProvidedName()));
        app.sendCreateIndexRequest((int)(Math.random()*10000), request.index(), options);
    }
    
    public static void executeDeleteIndex(DeleteIndexClusterStateUpdateRequest request)
    {
        List<Option> options = new ArrayList<Option>();
        for(Index index:request.indices())
        {
            app.sendDeleteIndexRequest((int)(Math.random()*10000), index.getName(), options);
        }
    }

    public static void executeSearch(SearchRequest request)
    {
        List<String> indices = new ArrayList<String>();
        List<Option> options = new ArrayList<Option>();
        String source = null;
        for(String s: request.indices())
        {
            indices.add(s);
        }
        if (request.scroll() != null) {
            options.add(new Option("scroll", request.scroll().keepAlive().toString()));
        }
        if (request.source() != null) {
            source = request.source().toString();
        } 
        if (request.routing() != null) {
            options.add(new Option("routing", request.routing()));
        }
        if (request.preference() != null) {
            options.add(new Option("preference", request.preference()));
        }
        previousSearchId = (int)(Math.random()*10000);
        app.sendSearchRequest(previousSearchId, indices, source, options);
    }

    public static void executeFetch(ShardFetchSearchRequest request)
    {
        List<String> indices = new ArrayList<String>(Arrays.asList(request.indices()));
        List<Integer> docIds = Arrays.stream(request.docIds()).boxed().collect(Collectors.toList());
        List<Option> options = new ArrayList<Option>();
        app.sendFetchRequest((int)(Math.random()*10000), indices , previousSearchId, docIds, options);
    }

    public static void executeIndex(IndexRequest request)
    {
        String sSource;
        try {
            sSource = XContentHelper.convertToJson(request.source(), false);
        }
        catch (Exception e) {
            // ignore
        }
        Document doc = new Document(Integer.parseInt(request.id()), null, 0); 
        List<Option> options = new ArrayList<Option>();
        app.sendIndexRequest((int)(Math.random()*10000), request.index(), Integer.parseInt(request.id()), doc, options);
        app.sendPut(request.id());
    }

    public static void executeDelete(DeleteRequest request)
    {
        List<Option> options = new ArrayList<Option>();
        app.sendDeleteRequest((int)(Math.random()*10000), request.index(), Integer.parseInt(request.id()), options);
    }
}
