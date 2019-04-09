package com.qa.tests;

import com.qa.utils.RestClient;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by zhangwei on 2019/4/9
 **/

public class GetApiTest {
    String url;
    RestClient restClient;
    CloseableHttpResponse closeableHttpResponse;
    @Test
    public void getApiTest() throws ClientProtocolException,IOException {
        url = "https://shop.10086.cn/i/v1/res/numarea/18301137378";
        restClient = new RestClient();
        closeableHttpResponse = restClient.get(url);
        System.out.println(closeableHttpResponse.getStatusLine());
        String test = EntityUtils.toString(closeableHttpResponse.getEntity());
        System.out.println(test);
    }
}
