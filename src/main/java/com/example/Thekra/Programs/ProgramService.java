package com.example.Thekra.Programs;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProgramService {
    private List<Program> programs = Arrays.asList(
            new Program("msar","مسار","برنامج لحفظ القرآن بمدة تقدر من 3 - 4 سنوات وفق خطة ممنهجة ومحضرة بعناية من كادر المشروع"),
            new Program("methaq","ميثاق", "برنامج المتابعة الفردية"),
            new Program("m3areg","معارج", "علم وعمل")
    );
    public List<Program> getAllPrograms(){
        return programs;
    }
    public Program getProgram(String id){
        return programs.stream().filter(program -> program.getId().equals(id)).findFirst().get();
    }
}
