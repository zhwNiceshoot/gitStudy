package com.qa.tests;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qa.data.Users;
import com.qa.utils.RestClient;
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
        restClient = new RestClient();
        HashMap<String,String> headermap = new HashMap<String, String>();
        headermap.put("Content-Type", "application/json");
        System.out.println("+++++++");
//        Users users = new Users("zhangwei","tester");
        HashMap<String,String> bodymap = new HashMap<String, String>();
        bodymap.put("name","morpheus");
        bodymap.put("job","leader");
        String userJsonString = JSON.toJSONString(bodymap);
        closeableHttpResponse = restClient.post(url,userJsonString,headermap);
        System.out.println(closeableHttpResponse);
        //验证状态码是不是200
        int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
        Assert.assertEquals(statusCode, 201,"status code is not 201");

        //断言响应json内容中name和job是不是期待结果
//        String responseString = EntityUtils.toString(closeableHttpResponse.getEntity());
//        JSONObject responseJson = JSON.parseObject(responseString);
        //System.out.println(responseString);
//        String name = TestUtil.getValueByJPath(responseJson, "name");
//        String job = TestUtil.getValueByJPath(responseJson, "job");
//        Assert.assertEquals(name, "Anthony","name is not same");
//        Assert.assertEquals(job, "tester","job is not same");same
    }
}
