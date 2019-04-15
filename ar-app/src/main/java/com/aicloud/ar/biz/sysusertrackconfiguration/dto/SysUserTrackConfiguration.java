package com.aicloud.ar.biz.sysusertrackconfiguration.dto;

import com.aicloud.ar.dto.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "sys_user_track_configuration")
public class SysUserTrackConfiguration extends BaseEntity {
    /**
     * 名称
     */
    @ApiModelProperty(value = "名称", example = "1")
    private String name;

    /**
     * 采集对象
     */
    @ApiModelProperty(value = "采集对象", example = "1")
    @Column(name = "collection_objects")
    private Integer collectionObjects;

    /**
     * 采集频率
     */
    @ApiModelProperty(value = "采集频率", example = "1")
    @Column(name = "collection_frequency")
    private String collectionFrequency;

    /**
     * 采集启始时间
     */
    @ApiModelProperty(value = "采集启始时间", example = "2019-04-13 14:08")
    @Column(name = "collection_start_time")
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date collectionStartTime;

    /**
     * 采集结束时间
     */
    @ApiModelProperty(value = "采集结束时间", example = "2019-04-13 14:08")
    @Column(name = "collection_end_time")
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date collectionEndTime;

    /**
     * 是否生效
     */
    @ApiModelProperty(value = "是否生效", example = "1")
    private Integer enable;

    /**
     * 采集开始事件 从
     */
    @Transient
    @ApiModelProperty(hidden = true)
    private String collectionStartTime_BeginTime;

    /**
     * 采集开始事件 到
     */
    @Transient
    @ApiModelProperty(hidden = true)
    private String collectionStartTime_EndTime;

    /**
     * 采集结束时间 从
     */
    @Transient
    @ApiModelProperty(hidden = true)
    private String collectionEndTime_BeginTime;

    /**
     * 采集结束时间 到
     */
    @Transient
    @ApiModelProperty(hidden = true)
    private String collectionEndTime_EndTime;
}