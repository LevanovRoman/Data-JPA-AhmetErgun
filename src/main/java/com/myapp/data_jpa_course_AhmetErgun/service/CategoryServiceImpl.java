package com.myapp.data_jpa_course_AhmetErgun.service;

import com.myapp.data_jpa_course_AhmetErgun.dto.mapper;
import com.myapp.data_jpa_course_AhmetErgun.dto.requestDto.CategoryRequestDto;
import com.myapp.data_jpa_course_AhmetErgun.dto.responseDto.CategoryResponseDto;
import com.myapp.data_jpa_course_AhmetErgun.model.Category;
import com.myapp.data_jpa_course_AhmetErgun.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public Category getCategory(Long categoryId) {
        return categoryRepository.findById(categoryId).orElseThrow(() ->
                new IllegalArgumentException("could not find category with id: " + categoryId));
    }

    @Override
    public CategoryResponseDto addCategory(CategoryRequestDto categoryRequestDto) {
        Category category = new Category();
        category.setName(categoryRequestDto.getName());
        categoryRepository.save(category);
        return mapper.categoryToCategoryResponseDto(category);
    }

    @Override
    public CategoryResponseDto getCategoryById(Long categoryId) {
        Category category = getCategory(categoryId);
        return mapper.categoryToCategoryResponseDto(category);
    }

    @Override
    public List<CategoryResponseDto> getCategories() {
        List<Category> categories = StreamSupport
                .stream(categoryRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return mapper.categoriesToCategoryResponseDtos(categories);
    }

    @Override
    public CategoryResponseDto deleteCategory(Long categoryId) {
        Category category = getCategory(categoryId);
        categoryRepository.delete(category);
        return mapper.categoryToCategoryResponseDto(category);
    }

    @Transactional
    @Override
    public CategoryResponseDto editCategory(Long categoryId, CategoryRequestDto categoryRequestDto) {
        Category categoryToEdit = getCategory(categoryId);
        categoryToEdit.setName(categoryRequestDto.getName());
        return mapper.categoryToCategoryResponseDto(categoryToEdit);
    }
}
