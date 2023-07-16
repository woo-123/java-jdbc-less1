package org.example.entity;

import java.time.LocalDateTime;

public class Category {

    private long id;

    private String name;
    private String description;
    private String keyword;
    private String state;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    //Constrution
    public Category() {
    }
    public Category(long id, String name, String description, String keyword, String state, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.keyword = keyword;
        this.state = state;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    //Encapsulation

    public Long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
