package com.sample.paging.factory;

import com.sample.paging.constant.RoleType;
import com.sample.paging.entity.base.BaseEntity;
import com.sample.paging.service.PagingService;
import com.sample.paging.service.impl.Entity1Service;
import com.sample.paging.service.impl.Entity2Service;

public class PagingFactory {
    // Autowired by spring
    private static Entity1Service entity1Service;
    private static Entity2Service entity2Service;

    public static PagingService<? extends BaseEntity> getService(RoleType roleType) {
        return switch (roleType) {
            case STUDENT -> entity1Service;
            case TEACHER -> entity2Service;
            default -> throw new RuntimeException("No service that matches this type " + roleType);
        };
    }
}
