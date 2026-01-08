package com.sample.paging.dto;

import com.sample.paging.entity.BaseEntity;

import java.util.List;

public class PageDTO<T extends BaseEntity> {
    private List<T> data;
    private int pageNumber;
    private int pageSize;
    private long totalRecords;
    private int totalPages;
}
