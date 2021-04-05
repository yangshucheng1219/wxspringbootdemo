package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;

import java.util.List;

/**
 * @author yangshucheng
 * @create 2021-04-03 15:53
 */
public interface AreaDao {
    List<Area> queryArea();
    Area queryAreaById(int areaId);
    int insertArea(Area area);
    int updateArea(Area area);
    int deleteArea(int areaId);

}
