package com.sample.paging.service.impl;

import com.sample.paging.constant.RoleType;
import com.sample.paging.dto.PageDTO;
import com.sample.paging.entity.Entity1;
import com.sample.paging.service.PagingService;

import java.util.ArrayList;
import java.util.List;

public class Entity1Service implements PagingService<Entity1> {
    public PageDTO<Entity1> getData() {
        PageDTO<Entity1> dto = new PageDTO<>();

        // Some logic
        List<Entity1> data = new ArrayList<>();
        data.add(Entity1.builder().role(RoleType.STUDENT).id(100).build());
        data.add(Entity1.builder().role(RoleType.STUDENT).id(101).build());
        data.add(Entity1.builder().role(RoleType.STUDENT).id(102).build());
        dto.setData(data);

        // Set page infos
        dto.setPageSize(10);
        dto.setPageNumber(1);
        dto.setTotalPages(5);
        dto.setTotalRecords(50);

        return dto;
    }
}
