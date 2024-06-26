package com.myapp.data_jpa_course_AhmetErgun.service;

import com.myapp.data_jpa_course_AhmetErgun.dto.requestDto.AuthorRequestDto;
import com.myapp.data_jpa_course_AhmetErgun.dto.responseDto.AuthorResponseDto;
import com.myapp.data_jpa_course_AhmetErgun.model.Author;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {
    public AuthorResponseDto addAuthor(AuthorRequestDto authorRequestDto);
    public List<AuthorResponseDto> getAuthors();
    public AuthorResponseDto getAuthorById(Long authorId);
    public Author getAuthor(Long authorId);
    public AuthorResponseDto deleteAuthor(Long authorId);
    public AuthorResponseDto editAuthor(Long authorId, AuthorRequestDto authorRequestDto);
    public AuthorResponseDto addZipcodeToAuthor(Long authorId, Long zipcodeId);
    public AuthorResponseDto deleteZipcodeFromAuthor(Long authorId);
}
