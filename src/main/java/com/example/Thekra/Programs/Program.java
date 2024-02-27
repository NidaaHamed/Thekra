package com.example.Thekra.Programs;

public class Program {
    private String id;

    public Program() {

    }
    public Program(String id, String programName, String description) {
        this.id = id;
        this.programName = programName;
        this.description = description;
    }

    private String programName;
    private String description;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
