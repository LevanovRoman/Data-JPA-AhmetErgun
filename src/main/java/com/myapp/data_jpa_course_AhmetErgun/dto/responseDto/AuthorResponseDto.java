package com.myapp.data_jpa_course_AhmetErgun.dto.responseDto;

import lombok.Data;

import java.util.List;

@Data
public class AuthorResponseDto {
    private Long id;
    private String name;
    private List<String> bookNames;
    private String zipcodeName;
}
