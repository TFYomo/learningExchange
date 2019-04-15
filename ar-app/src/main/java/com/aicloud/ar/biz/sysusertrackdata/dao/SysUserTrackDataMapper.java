package com.aicloud.ar.biz.sysusertrackdata.dao;

import com.aicloud.ar.biz.sysusertrackdata.dto.SysUserTrackData;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SysUserTrackDataMapper extends Mapper<SysUserTrackData> {
    List<SysUserTrackData> queryAll(SysUserTrackData dto);

    Integer queryAllCounts(SysUserTrackData dto);
}