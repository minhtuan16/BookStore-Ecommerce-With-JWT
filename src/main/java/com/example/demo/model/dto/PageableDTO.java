package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@AllArgsConstructor
@NoArgsConstructor
public class PageableDTO {
    private Object items;

    private int totalPages;

    private int currentPage;

	public Object getItems() {
		return items;
	}

	public void setItems(Object items) {
		this.items = items;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public PageableDTO(Object items, int totalPages, int currentPage) {
		super();
		this.items = items;
		this.totalPages = totalPages;
		this.currentPage = currentPage;
	}
    
    
}
