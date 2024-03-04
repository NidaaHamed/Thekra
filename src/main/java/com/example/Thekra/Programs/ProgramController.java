package com.example.Thekra.Programs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProgramController {
    @Autowired
    private ProgramService programService;
    @RequestMapping("/programs")
    public List<Program> getAllPrograms(){
        return programService.getAllPrograms();
    }
}
