package com.aicloud.ar.biz.sysusertrackconfiguration.rest;

import com.aicloud.ar.biz.sysusertrackconfiguration.biz.SysUserTrackConfigurationService;
import com.aicloud.ar.biz.sysusertrackconfiguration.dto.SysUserTrackConfiguration;
import com.aicloud.ar.dto.BaseResult;
import com.coldwind.common.vo.ObjectRestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by tfyomo@qq.com on 2019-04-13 10:45
 */
@RestController
@RequestMapping("api/SysUserTrackConfigurationRest")
@Api(value = "用户轨迹配置", tags = {"用户轨迹配置"})
public class SysUserTrackConfigurationRest{
    @Autowired
    private SysUserTrackConfigurationService sysUserTrackConfigurationService;

    /**
     * @Auther: TFY
     * @Date: 2019-04-13 13:44
     *
     * @Modifier: -
     * @Date Modified: -
     *
     * @Description: 分页查询
     * @Param: [dto]
     * @Return: com.coldwind.common.vo.ObjectRestResponse<com.aicloud.ar.dto.BaseResult>
     */
    @ApiOperation(value = "用户轨迹配置分页条件查询", notes = "根据[pageNum]和[pageSize]进行分页")
    @PostMapping("/paging/query")
    public ObjectRestResponse<BaseResult> pagingQuery(@RequestBody(required = false) SysUserTrackConfiguration dto) {
        return new ObjectRestResponse<BaseResult>().result(sysUserTrackConfigurationService.pagingQuery(dto.getPageNum(), dto.getPageSize(), dto));
    }

    /**
     * @Auther: TFY
     * @Date: 2019-04-13 13:50
     *
     * @Modifier: -
     * @Date Modified: -
     *
     * @Description: -
     * @Param: [dto, id]
     * @Return: com.coldwind.common.vo.ObjectRestResponse<java.lang.String>
     */
    @ApiOperation(value = "用户轨迹配置更新", notes = "用户轨迹配置更新")
    @PutMapping("/vr/{id}")
    public ObjectRestResponse<String> vrUpdate(@RequestBody(required = true) SysUserTrackConfiguration dto, @PathVariable int id) throws Exception {
        dto.setId(id);
        Integer result = sysUserTrackConfigurationService.vrUpdate(dto);
        if (result <= 0) {
            throw new Exception("用户轨迹配置更新失败！");
        }
        return new ObjectRestResponse<String>().result("用户轨迹配置更新成功！");
    }

    /**
     * @Auther: TFY
     * @Date: 2019-04-13 13:50
     *
     * @Modifier: -
     * @Date Modified: -
     *
     * @Description: -
     * @Param: [dto]
     * @Return: com.coldwind.common.vo.ObjectRestResponse<java.lang.String>
     */
    @ApiOperation(value = "用户轨迹配置新增", notes = "用户轨迹配置新增")
    @PostMapping("/vr")
    public ObjectRestResponse<String> vrAdd(@RequestBody(required = true) SysUserTrackConfiguration dto) throws Exception {
        Integer result = sysUserTrackConfigurationService.vrInsert(dto);
        if (result <= 0) {
            throw new Exception("用户轨迹配置新增失败！");
        }
        return new ObjectRestResponse<String>().result("用户轨迹配置新增成功！");
    }

    /**
     * @Auther: TFY
     * @Date: 2019-04-13 14:20
     *
     * @Modifier: -
     * @Date Modified: -
     *
     * @Description: -
     * @Param: [id]
     * @Return: com.coldwind.common.vo.ObjectRestResponse<java.lang.String>
     */
    @ApiOperation(value = "用户轨迹配置刪除", notes = "用户轨迹配置刪除")
    @DeleteMapping("/vr/{id}")
    public ObjectRestResponse<String> remove(@PathVariable int id) throws Exception {
        Integer result =sysUserTrackConfigurationService.vrDelete(id);
        if (result <= 0) {
            throw new Exception("用户轨迹配置刪除失败！");
        }
        return new ObjectRestResponse<String>().result("用户轨迹配置刪除成功！");
    }


}
