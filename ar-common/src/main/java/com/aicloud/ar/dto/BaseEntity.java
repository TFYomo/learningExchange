package com.aicloud.ar.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import tk.mybatis.mapper.annotation.Version;

import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * Created by tfyomo@qq.com on 2019-04-13 10:55
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseEntity {
    @Id
    @ApiModelProperty(value = "ID", example = "id")
    private Integer id;

    @Version
    private Integer version;

    @JSONField(serialize = false)
    @ApiModelProperty(hidden = true)
    @Transient
    private Integer pageSize = 5;

    /**
     * 开始页
     */
    @JSONField(serialize = false)
    @ApiModelProperty(hidden = true)
    @Transient
    private Integer pageNum = 0;

    /**
     * 总计
     */
    @JSONField(serialize = false)
    @ApiModelProperty(hidden = true)
    @Transient
    private Integer totalCount;

    /**
     * 排序
     */
    @JSONField(serialize = false)
    @ApiModelProperty(hidden = true)
    @Transient
    private String sort;

    /**
     * 通过字段[排序]
     */
    @JSONField(serialize = false)
    @ApiModelProperty(hidden = true)
    @Transient
    private String orderBy;
}
