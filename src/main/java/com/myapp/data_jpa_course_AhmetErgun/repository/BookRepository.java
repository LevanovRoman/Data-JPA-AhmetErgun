package com.myapp.data_jpa_course_AhmetErgun.repository;

import com.myapp.data_jpa_course_AhmetErgun.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
