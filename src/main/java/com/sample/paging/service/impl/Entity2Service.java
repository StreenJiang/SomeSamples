package com.sample.paging.service.impl;

import com.sample.paging.constant.RoleType;
import com.sample.paging.dto.PageDTO;
import com.sample.paging.entity.Entity2;
import com.sample.paging.service.PagingService;

import java.util.ArrayList;
import java.util.List;

public class Entity2Service implements PagingService<Entity2> {
    public PageDTO<Entity2> getData() {
        PageDTO<Entity2> dto = new PageDTO<>();

        // Some logic
        List<Entity2> data = new ArrayList<>();
        data.add(Entity2.builder().role(RoleType.STUDENT).id(100).build());
        data.add(Entity2.builder().role(RoleType.STUDENT).id(101).build());
        data.add(Entity2.builder().role(RoleType.STUDENT).id(102).build());
        dto.setData(data);

        // Set page infos
        dto.setPageSize(10);
        dto.setPageNumber(1);
        dto.setTotalPages(5);
        dto.setTotalRecords(50);

        return dto;
    }
}
