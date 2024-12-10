package com.example.diary.entity;


import com.example.diary.dto.ToDoRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class ToDo {

    @Setter
    private Long id;
    private String toDo;
    private String name;

    public ToDo(String toDo, String name) {
        this.toDo = toDo;
        this.name = name;
    }

    public void update(ToDoRequestDto dto) {
        this.toDo = dto.getToDo();
        this.name = dto.getName();

    }

}
