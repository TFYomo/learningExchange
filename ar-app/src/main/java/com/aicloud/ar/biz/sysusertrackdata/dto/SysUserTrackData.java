package com.aicloud.ar.biz.sysusertrackdata.dto;

import com.aicloud.ar.dto.BaseEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "sys_user_track_data")
public class SysUserTrackData extends BaseEntity {
    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id", example = "1")
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户名称
     */
    @ApiModelProperty(value = "用户名称", example = "吾乃小明")
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户职位id
     */
    @ApiModelProperty(value = "用户职位id", example = "1")
    @Column(name = "user_position_id")
    private Integer userPositionId;

    /**
     * 用户职位名称
     */
    @ApiModelProperty(value = "用户职位名称", example = "高级码农")
    @Column(name = "user_position_name")
    private String userPositionName;

    /**
     * 用户部门id
     */
    @ApiModelProperty(value = "用户部门id", example = "1")
    @Column(name = "user_department_id")
    private Integer userDepartmentId;

    /**
     * 用户部门名称
     */
    @ApiModelProperty(value = "用户部门名称", example = "码农科技研究中心")
    @Column(name = "user_department_name")
    private String userDepartmentName;

    /**
     * 任务时间
     */
    @ApiModelProperty(value = "任务时间", example = "2019-05014 14:10")
    @Column(name = "job_time")
    private Date jobTime;

    /**
     * 精度
     */
    @ApiModelProperty(value = "精度", example = "~")
    private String longitude;

    /**
     * 纬度
     */
    @ApiModelProperty(value = "纬度", example = "~")
    private String latitude;

    /**
     * 地址
     */
    @ApiModelProperty(value = "地址", example = "上海市徐家汇陆家嘴")
    private String address;

    @Transient
    @ApiModelProperty(hidden = true)
    private String jobTime_Start;

    @Transient
    @ApiModelProperty(hidden = true)
    private String jobTime_End;
}