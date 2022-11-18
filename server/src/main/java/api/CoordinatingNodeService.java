package api;

import api.model.*;



public interface CoordinatingNodeService {
    SearchResponse Search(SearchRequest request);

    FetchResponse Fetch(FetchRequest request);

    IndexResponse Index(IndexRequest request);

    DeleteResponse Delete(DeleteRequest request);

    CreateIndexResponse CreateIndex(CreateIndexRequest request);

    DeleteIndexResponse DeleteIndex(DeleteIndexRequest request);
    
    TestResponse Test(TestRequest request);
}
