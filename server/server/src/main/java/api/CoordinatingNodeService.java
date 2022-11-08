package api;

import api.model.*;



public interface CoordinatingNodeService {
    SearchResponse Search(SearchRequest request);

    CreateIndexResponse CreateIndex(CreateIndexRequest request);
    
    TestResponse Test(TestRequest request);
}
