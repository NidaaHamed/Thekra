package com.example.Thekra.Programs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Entity
@Table(name = "programs")
public class Program {
    @Id

    private String id;
    private String programName;
    private String description;

    public Program() {

    }
    public Program(String id, String programName, String description) {
        super();
        this.id = id;
        this.programName = programName;
        this.description = description;
    }
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
