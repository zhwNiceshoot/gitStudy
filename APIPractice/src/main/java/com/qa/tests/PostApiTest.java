package com.qa.tests;

import com.alibaba.fastjson.JSON;
import com.qa.data.Users;
import com.qa.utils.RestClient;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by zhangwei on 2019/4/2
 **/

public class PostApiTest {
    String host;
    String url;
    RestClient restClient;
    CloseableHttpResponse closeableHttpResponse;
    @BeforeClass
    public void setUp(){
        url = "https://reqres.in" + "/api/users";
    }
    @Test
    public void postApiTest() throws ClientProtocolException,IOException{
        url = "https://reqres.in" + "/api/users";
        restClient = new RestClient();
        HashMap<String,String> headermap = new HashMap<String, String>();
        headermap.put("Content-Type", "application/json");
//        Users users = new Users("zhangwei","tester");
        HashMap<String,String> bodymap = new HashMap<String, String>();
        bodymap.put("name","zhangwei");
        bodymap.put("job","leader");
        String userJsonString = JSON.toJSONString(bodymap);
        closeableHttpResponse = restClient.post(url,userJsonString,headermap);
        System.out.println(EntityUtils.toString(closeableHttpResponse.getEntity()));

//        验证状态码是不是200
        int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
        Assert.assertEquals(statusCode, 201,"status code is not 201");
    }
}
