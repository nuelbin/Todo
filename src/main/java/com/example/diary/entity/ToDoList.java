package com.example.diary.entity;


import com.example.diary.dto.ToDoRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ToDoList {

    private Long id;
    private String toDo;
    private String name;

    public void update(ToDoRequestDto dto) {
        this.toDo = dto.getToDo();
        this.name = dto.getName();

    }

}
