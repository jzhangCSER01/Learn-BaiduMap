package cn.zhj.baidumap;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpRequest;
import org.junit.Test;

public class TestBaiduWebApi {

    private String ak = "1YDZFq1XMbHy2Ml42cA3LTIZwiCY0wYv";

    /**
     * 测试坐标转换服务
     */
    @Test
    public void testGeoconv(){
        String url = "https://api.map.baidu.com/geoconv/v1/?coords=114.21892734521,29.575429778924&from=1&to=5&ak={}";
        url = StrUtil.format(url, ak);
        String body = HttpRequest.get(url).execute().body();
        System.out.println(body);
    }

    /**
     * 测试 ip 定位
     */
    @Test
    public void TestLocation(){
        String url = "http://api.map.baidu.com/location/ip?ak={}&ip=123.8.65.60&coor=bd09ll";
        url = StrUtil.format(url, ak);
        String body = HttpRequest.get(url).execute().body();
        System.out.println(body);
    }

    /**
     * 测试地点输入提示服务
     */
    @Test
    public void TestSuggestion(){
        String url = "https://api.map.baidu.com/place/v2/suggestion?query=清华大&region=北京&city_limit=true&output=json&ak={}";
        url = StrUtil.format(url, ak);
        String body = HttpRequest.get(url).execute().body();
        System.out.println(body);
    }

    /**
     * 测试路线规划
     */
    @Test
    public void TestDriving(){
        String url = "https://api.map.baidu.com/direction/v2/driving?origin=40.009645,116.333374&destination=39.937016,116.453576&ak={}";
        url = StrUtil.format(url, ak);
        String body = HttpRequest.get(url).execute().body();
        System.out.println(body);
    }
}
