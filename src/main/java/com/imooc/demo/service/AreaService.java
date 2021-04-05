package com.imooc.demo.service;

import com.imooc.demo.entity.Area;

import java.util.List;

/**
 * @author yangshucheng
 * @create 2021-04-03 17:13
 */
public interface AreaService {
    List<Area> queryAreaList();
    Area getAreaById(int areaId);
    boolean addArea(Area area);
    boolean modifyArea(Area area);
    boolean deleteArea(int areaId);
}
