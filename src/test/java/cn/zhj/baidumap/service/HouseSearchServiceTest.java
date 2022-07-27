package cn.zhj.baidumap.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest()
@RunWith(SpringRunner.class)
public class HouseSearchServiceTest {

    @Autowired
    private HouseSearchService houseSearchService;

    @Test
    public void search() {
        Double maxLongitude = 121.91133923359655;
        Double minLongitude = 121.05126560612325;
        Double maxLatitude = 31.310712659507512;
        Double minLatitude = 31.159539944385315;
        Double zoom = 12d;
        this.houseSearchService.search(maxLongitude, minLongitude, maxLatitude, minLatitude, zoom)
                .forEach(houseResultVo -> System.out.println(houseResultVo));
    }
}