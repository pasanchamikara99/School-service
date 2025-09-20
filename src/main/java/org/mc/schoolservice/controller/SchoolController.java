package org.mc.schoolservice.controller;


import org.mc.schoolservice.dto.SchoolDto;
import org.mc.schoolservice.models.School;
import org.mc.schoolservice.service.SchoolService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/school")
public class SchoolController {

    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping("/save")
    public School addSchool(@RequestBody SchoolDto school) {
        return schoolService.addSchool(school);
    }

    @GetMapping("/all")
    public List<School> fetchSchools() {
        return schoolService.fetchSchools();
    }

    @GetMapping("/{id}")
    public School fetchSchoolById(@PathVariable int id) {
        return schoolService.fetchSchoolById(id);
    }
}
