package com.sample.paging.controller;

import com.sample.paging.constant.RoleType;
import com.sample.paging.dto.PageDTO;
import com.sample.paging.entity.base.BaseEntity;
import com.sample.paging.factory.PagingFactory;
import com.sample.paging.service.PagingService;

public class Controller {
    public <T extends BaseEntity> PageDTO<T> getData(RoleType roleType) {
        PagingService<T> service = (PagingService<T>) PagingFactory.getService(roleType);
        return service.getData();
    }
}
