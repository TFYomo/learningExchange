package com.aicloud.ar.biz.sysusertrackdata.biz;

import com.aicloud.ar.biz.sysusertrackdata.dao.SysUserTrackDataMapper;
import com.aicloud.ar.biz.sysusertrackdata.dto.SysUserTrackData;
import com.aicloud.ar.dto.BaseResult;
import com.coldwind.common.service.BaseService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by tfyomo@qq.com on 2019-04-13 10:50
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SysUserTrackDataService extends BaseService<SysUserTrackDataMapper, SysUserTrackData> {
    /**
     * @Auther: TFY
     * @Date: 2019-04-13 14:00
     *
     * @Modifier: -
     * @Date Modified: -
     *
     * @Description: -
     * @Param: [pageNum, pageSize, dto]
     * @Return: com.aicloud.ar.dto.BaseResult
     */
    public BaseResult pagingQuery(Integer pageNum, Integer pageSize, SysUserTrackData dto) {
        PageHelper.startPage(pageNum, pageSize);
        return new BaseResult(){{
            setData(mapper.queryAll(dto));
            setDataCounts(mapper.queryAllCounts(dto));
        }};
    }

    /**
     * @Auther: TFY
     * @Date: 2019-04-13 14:00
     *
     * @Modifier: -
     * @Date Modified: -
     *
     * @Description: -
     * @Param: [dto]
     * @Return: java.lang.Integer
     */
    public Integer vrUpdate(SysUserTrackData dto) {
        return mapper.updateByPrimaryKeySelective(dto);
    }

    /**
     * @Auther: TFY
     * @Date: 2019-04-13 14:00
     *
     * @Modifier: -
     * @Date Modified: -
     *
     * @Description: -
     * @Param: [dto]
     * @Return: java.lang.Integer
     */
    public Integer vrInsert(SysUserTrackData dto) {
        return  mapper.insertSelective(dto);
    }

    /**
     * @Auther: TFY
     * @Date: 2019-04-13 14:00
     *
     * @Modifier: -
     * @Date Modified: -
     *
     * @Description: -
     * @Param: [id]
     * @Return: java.lang.Integer
     */
    public Integer vrDelete(int id) {
        return mapper.deleteByPrimaryKey(id);
    }
}
