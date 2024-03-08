package com.example.Thekra.Programs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProgramController {
    @Autowired
    private ProgramService programService;
    @RequestMapping("/programs")
    public List<Program> getAllPrograms(){
        return programService.getAllPrograms();
    }
    @RequestMapping("/programs/{id}")
    public Optional<Program> getProgram(@PathVariable String id){
        return programService.getProgram(id);
    }
    @RequestMapping(method=RequestMethod.POST,value="/programs")
    public void addProgram(@RequestBody Program program){
        programService.addProgram(program);
    }
    @RequestMapping(method=RequestMethod.PUT,value="/programs/{id}")
    public void updateProgram(@RequestBody Program program,@PathVariable String id){
        programService.updateProgram(program,id);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/programs/{id}")
    public void deleteProgram(@PathVariable String id){
        programService.deleteProgram(id);
    }

}
