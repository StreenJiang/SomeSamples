package com.sample.paging.service;

import com.sample.paging.dto.PageDTO;
import com.sample.paging.entity.base.BaseEntity;

public interface PagingService<T extends BaseEntity> {
    PageDTO<T> getData();
}
