package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Category;
import com.example.demo.model.request.CreateCategoryRequest;

@Service
public interface CategoryService {
    List<Category> getListCategories();

    Category getCategoryById(long id);

    Category createCategory(CreateCategoryRequest createCategoryRequest);

    void updateCategory(CreateCategoryRequest createCategoryRequest, long id);

    void deleteCategory(long id);

    Page<Category> adminGetListCategory(String id, String name, String status, int page);

    void updateOrderCategory(int[] ids);

    //Đếm số danh mục
    long getCountCategories();
}
