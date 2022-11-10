package org.elasticsearch.patch;

import java.util.List;
import java.util.ArrayList;

import org.elasticsearch.action.admin.indices.create.CreateIndexClusterStateUpdateRequest;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexClusterStateUpdateRequest;
import org.elasticsearch.index.Index;
import client.ClientApp;
import api.model.Option;

public class Patch {
    private static ClientApp app;

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
}
