package com.example.demo.utils;

import lombok.NoArgsConstructor;

/**
 * Created by vuhien96 on 29/10/2020 15:07
 */

@NoArgsConstructor
public class PageUtil {
    public int limit;
    public int page;
    
    public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public PageUtil(int limit, int page) {
        this.limit = limit;
        if (page < 1) {
            this.page = 1;
        } else {
            this.page = page;
        }
    }

    public int calculateOffset() {
        return (page - 1) * limit;
    }

    public int calculateTotalPage(int totalItems) {
        int totalPages;
        if (totalItems % limit == 0) {
            totalPages = totalItems / limit;
        } else {
            totalPages = totalItems / limit + 1;
        }
        return totalPages;
    }
}
