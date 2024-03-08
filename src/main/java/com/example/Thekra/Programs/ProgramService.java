package com.example.Thekra.Programs;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProgramService {
    @Autowired
    private ProgramRepository programRepository;
    public List<Program> getAllPrograms(){
        List<Program> programs = new ArrayList<>();
        programRepository.findAll().forEach(programs::add);
        return programs;
    }
    public Optional<Program> getProgram(String id){
        return programRepository.findById(id);
    }
    public void addProgram(Program p){
        programRepository.save(p);
    }
    public void updateProgram(Program p,String id){
        programRepository.save(p);
    }

    public void deleteProgram(String id) {
        programRepository.deleteById(id);
    }
}
