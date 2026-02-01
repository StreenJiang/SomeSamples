package com.sample.paging.entity.base;

import com.sample.paging.constant.RoleType;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class BaseEntity {
    private long id;
    private RoleType role;
}
