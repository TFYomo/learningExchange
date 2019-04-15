package com.aicloud.ar.biz.sysusertrackconfiguration.biz;

import com.aicloud.ar.biz.sysusertrackconfiguration.dao.SysUserTrackConfigurationMapper;
import com.aicloud.ar.biz.sysusertrackconfiguration.dto.SysUserTrackConfiguration;
import com.aicloud.ar.dto.BaseResult;
import com.coldwind.common.service.BaseService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by tfyomo@qq.com on 2019-04-13 10:44
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SysUserTrackConfigurationService extends BaseService<SysUserTrackConfigurationMapper, SysUserTrackConfiguration> {
    /**
     * @Auther: TFY
     * @Date: 2019-04-13 11:17
     *
     * @Modifier: -
     * @Date Modified: -
     *
     * @Description: -
     * @Param: [pageNum, pageSize, dto]
     * @Return: com.coldwind.common.dto.PageResultDto
     */
    public BaseResult pagingQuery(Integer pageNum, Integer pageSize, SysUserTrackConfiguration dto) {
        PageHelper.startPage(pageNum, pageSize);
        return new BaseResult(){{
            setData(mapper.queryAll(dto));
            setDataCounts(mapper.queryAllCounts(dto));
        }};
    }

    /**
     * @Auther: TFY
     * @Date: 2019-04-13 13:47
     *
     * @Modifier: -
     * @Date Modified: -
     *
     * @Description: -
     * @Param: [dto]
     * @Return: java.lang.Integer
     */
    public Integer vrUpdate(SysUserTrackConfiguration dto) {
        return mapper.updateByPrimaryKeySelective(dto);
    }

    public Integer vrInsert(SysUserTrackConfiguration dto){
        return  mapper.insertSelective(dto);
    }

    public Integer vrDelete(Integer id){
        return mapper.deleteByPrimaryKey(id);
    }
}
