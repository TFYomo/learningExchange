package com.aicloud.ar.dto;

import lombok.Data;

/**
 * Created by tfyomo@qq.com on 2019-03-06 17:00
 */
@Data
public class BaseResult<T> {
    T data;

    Integer dataCounts;
}
