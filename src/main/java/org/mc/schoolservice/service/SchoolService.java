package org.mc.schoolservice.service;

import org.mc.schoolservice.dto.SchoolDto;
import org.mc.schoolservice.models.School;
import org.mc.schoolservice.repository.SchoolRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {


    private final SchoolRepository schoolRepository;

    public SchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public School addSchool(SchoolDto schoolDto) {

        School school = School.builder()
                .schoolName(schoolDto.getSchoolName())
                .principalName(schoolDto.getLocation())
                .location(schoolDto.getPrincipalName())
                .build();
        return schoolRepository.save(school);
    }

    public List<School> fetchSchools() {
        return schoolRepository.findAll();
    }

    public School fetchSchoolById(int id) {
        return schoolRepository.findById(id).orElse(null);
    }
}
