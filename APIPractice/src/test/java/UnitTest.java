import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.qa.utils.RestClient;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by zhangwei on 2019/4/8
 **/

public class UnitTest {
    public static CloseableHttpResponse get(String url) throws ClientProtocolException,IOException {
        //创建一个可关闭的HttpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建一个HttpGet的请求对象
        HttpGet httpGet = new HttpGet(url);
        //执行请求,相当于postman上点击发送按钮，然后赋值给HttpResponse对象接收
        CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
        return httpResponse;
    }
    public static void main(String[] args) throws ClientProtocolException,IOException {
        CloseableHttpResponse closeableHttpResponse;
        RestClient restClient;
        restClient = new RestClient();
        String url = "https://shop.10086.cn/i/v1/res/numarea/18301137378";
        closeableHttpResponse = restClient.get(url);
        System.out.println(closeableHttpResponse.getStatusLine());
        String test = EntityUtils.toString(closeableHttpResponse.getEntity());
        System.out.println(test);
    }
}
