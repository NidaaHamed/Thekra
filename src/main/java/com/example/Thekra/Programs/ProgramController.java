package com.example.Thekra.Programs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProgramController {
    @RequestMapping("/programs")
    public List<Program> getAllPrograms(){
        return Arrays.asList(
                new Program("msar","مسار","برنامج لحفظ القرآن بمدة تقدر من 3 - 4 سنوات وفق خطة ممنهجة ومحضرة بعناية من كادر المشروع"),
                new Program("methaq","ميثاق", "برنامج المتابعة الفردية"),
                new Program("m3areg","معارج", "علم وعمل")
        );
    }
}
