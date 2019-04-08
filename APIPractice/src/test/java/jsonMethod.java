import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by zhangwei on 2019/4/8
 **/

public class jsonMethod {
    public static void main(String[] args){
        String test = "{\"retCode\":\"000000\",\"retMsg\":\"OK\",\"data\":{\"prov_cd\":\"100\",\"id_area_cd\":\"010\",\"id_name_cd\":\"北京\",\"num_type\":\"0\"}}";
        JSONObject jsonObject = JSONObject.parseObject(test);
        String datas = jsonObject.getString("data");
        JSONObject id_name_cd = JSONObject.parseObject(datas);
        System.out.println("归属地：" + id_name_cd.getString("id_name_cd"));
    }
}
