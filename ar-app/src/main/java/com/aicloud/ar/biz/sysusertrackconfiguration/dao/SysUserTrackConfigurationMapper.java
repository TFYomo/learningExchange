package com.aicloud.ar.biz.sysusertrackconfiguration.dao;

import com.aicloud.ar.biz.sysusertrackconfiguration.dto.SysUserTrackConfiguration;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SysUserTrackConfigurationMapper extends Mapper<SysUserTrackConfiguration> {
    /**
      * @Auther: TFY
      * @Date: 2019-04-13 11:33
      * 
      * @Modifier: -
      * @Date Modified: -
      * 
      * @Description: 查询数据
      * @Param: 
      * @Return: 
      */
    List<SysUserTrackConfiguration> queryAll(SysUserTrackConfiguration dto);

    /**
      * @Auther: TFY
      * @Date: 2019-04-13 11:33
      *
      * @Modifier: -
      * @Date Modified: -
      *
      * @Description: 查询结果
      * @Param:
      * @Return:
      */
    Integer queryAllCounts(SysUserTrackConfiguration dto);
}