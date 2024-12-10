package com.example.diary.dto;

import com.example.diary.entity.ToDoList;
import lombok.Getter;

@Getter
public class ToDoResponseDto {

    private Long id;
    private String toDo;
    private String name;

    public ToDoResponseDto(ToDoList todolist) {
        this.id = todolist.getId();
        this.toDo = todolist.getToDo();
        this.name = todolist.getName();
    }
}
