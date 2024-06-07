package com.myapp.data_jpa_course_AhmetErgun.repository;

import com.myapp.data_jpa_course_AhmetErgun.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
