package com.myapp.data_jpa_course_AhmetErgun.service;

import com.myapp.data_jpa_course_AhmetErgun.dto.requestDto.CategoryRequestDto;
import com.myapp.data_jpa_course_AhmetErgun.dto.responseDto.CategoryResponseDto;
import com.myapp.data_jpa_course_AhmetErgun.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    public Category getCategory(Long categoryId);
    public CategoryResponseDto addCategory(CategoryRequestDto categoryRequestDto);
    public CategoryResponseDto getCategoryById(Long categoryId);
    public List<CategoryResponseDto> getCategories();
    public CategoryResponseDto deleteCategory(Long categoryId);
    public CategoryResponseDto editCategory(Long categoryId, CategoryRequestDto categoryRequestDto);
}
