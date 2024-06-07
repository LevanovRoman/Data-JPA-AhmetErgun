package com.myapp.data_jpa_course_AhmetErgun.repository;


import com.myapp.data_jpa_course_AhmetErgun.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
