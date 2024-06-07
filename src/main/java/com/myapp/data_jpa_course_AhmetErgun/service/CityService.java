package com.myapp.data_jpa_course_AhmetErgun.service;

import com.myapp.data_jpa_course_AhmetErgun.dto.requestDto.CityRequestDto;
import com.myapp.data_jpa_course_AhmetErgun.model.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService {
    public City addCity(CityRequestDto cityRequestDto);
    public List<City> getCities();
    public City getCity(Long cityId);
    public City deleteCity(Long cityId);
    public City editCity(Long cityId, CityRequestDto cityRequestDto);
}
