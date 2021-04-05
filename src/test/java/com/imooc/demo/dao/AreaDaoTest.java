package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yangshucheng
 * @create 2021-04-03 16:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryArea() {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(2, areaList.size());
    }

    @Test
    public void queryAreaById() {
        Area area = areaDao.queryAreaById(1);
        assertEquals("东院",area.getAreaName());
    }

    @Test
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("南苑");
        area.setPriority(1);
        int effectedNumber = areaDao.insertArea(area);
        assertEquals(1,effectedNumber);
    }

    @Test
    @Ignore
    void updateArea() {
        Area area = new Area();
        area.setAreaName("西苑");
        area.setAreaId(3);
        area.setLastEditTime(new Date());
        int effectedNumber = areaDao.updateArea(area);
        assertEquals(1,effectedNumber);
    }

    @Test
    void deleteArea() {
        int effectedNumber = areaDao.deleteArea(3);
        assertEquals(1,effectedNumber);
    }
}