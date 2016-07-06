package com.moutum.equ.service;

import java.util.List;
import java.util.Map;

import com.moutum.equ.domain.Equipment;
import com.moutum.equ.dto.EquipmentDto;
import com.moutum.equ.dto.PageBean;

/************************************************************************************
 * @Title        : EquipmentService.java
 * @Description : 
 * @Author       : BianWeiqing
 * @DateTime     : 2015年3月26日 下午3:41:14
 * @Copyright    : 2015 Moutum All Rights Reserved
 * @version      : V1.0
 ************************************************************************************/
public interface EquipmentService
{

    /********************************************************************************
     * 根据查询条件获取PageBean
     * @param pageNum
     * @param pageSize
     * @param map
     * @return
     ********************************************************************************/
    PageBean getPage(int pageNum, int pageSize, Map<String, Object> map);

    /********************************************************************************
     * 获取所有类型，状态，部门，标识的信息列表
     * @return
     ********************************************************************************/
    Map<String, List<?>> getSelectLists();

    /********************************************************************************
     * 根据ID查询设备
     * @param id
     * @return
     ********************************************************************************/
    Equipment select(int id);

    
    /********************************************************************************
     * 添加设备
     * @param equipment
     * @return 1:成功，0:设备编号重复, -1:操作失败
     ********************************************************************************/
    int save(Equipment equipment);
    
    /********************************************************************************
     * 修改设备信息
     * @param equipment
     * @return 1:成功，0:设备不存在, -1:操作失败
     ********************************************************************************/
    int modify(Equipment equipment);


    /********************************************************************************
     * 关联文档
     * @param equipmentId
     * @param idArray
     * @return
     ********************************************************************************/
    List<String> releDatum(long equipmentId, String[] idArray);
    

    /********************************************************************************
     * 根据编号查询设备
     * @param id
     * @return
     ********************************************************************************/
    Equipment select(String equipmentNo);

    /********************************************************************************
     * 数据类型转换Equipment=>EquipmentDto用于页面展示
     * @param equ
     * @return
     ********************************************************************************/
    EquipmentDto toEqudto(Equipment equ);

    /********************************************************************************
     * 查询所有设备
     * @return
     ********************************************************************************/
    List<Equipment> getAll();
}
