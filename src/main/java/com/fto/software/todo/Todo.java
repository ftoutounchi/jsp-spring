package com.fto.software.todo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Todo {
    private Long id;
    private String name;
    private String course;
    private LocalDate date;

    public Todo() {
    }

    public Todo(Long id, String name, String course, LocalDate date) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", date=" + date +
                '}';
    }
}
