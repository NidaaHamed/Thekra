package com.example.Thekra.Programs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping("/programs/{id}")
    public Program getProgram(@PathVariable String id){
        return programService.getProgram(id);
    }
    @RequestMapping(method=RequestMethod.POST,value="/programs")
    public void addProgram(@RequestBody Program program){
        programService.addProgram(program);
    }

}
