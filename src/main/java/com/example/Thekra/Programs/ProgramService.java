package com.example.Thekra.Programs;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProgramService {
    private List<Program> programs = new ArrayList<>(Arrays.asList(
            new Program("msar","مسار","برنامج لحفظ القرآن بمدة تقدر من 3 - 4 سنوات وفق خطة ممنهجة ومحضرة بعناية من كادر المشروع"),
            new Program("methaq","ميثاق", "برنامج المتابعة الفردية"),
            new Program("m3areg","معارج", "علم وعمل")
    ));
    public List<Program> getAllPrograms(){
        return programs;
    }
    public Program getProgram(String id){
        return programs.stream().filter(program -> program.getId().equals(id)).findFirst().get();
    }
    public void addProgram(Program p){
        programs.add(p);
    }
    public void updateProgram(Program p,String id){
        for(int i=0 ; i<programs.size();i++){
            Program program = programs.get(i);
            if(program.getId().equals(id)){
                programs.set(i,p);
                return;
            }
        }
    }

    public void deleteProgram(String id) {
        programs.removeIf(p-> p.getId().equals(id));
    }
}
