package com.example.diary.service;

import com.example.diary.dto.ToDoRequestDto;
import com.example.diary.dto.ToDoResponseDto;
import com.example.diary.entity.ToDo;
import com.example.diary.repository.ToDoRepository;
import org.springframework.stereotype.Service;

@Service
public class ToDoServiceImpl implements ToDoService{

    private final ToDoRepository toDoRepository;

    public ToDoServiceImpl(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @Override
    public ToDoResponseDto saveToDo(ToDoRequestDto dto) {

        ToDo toDo = new ToDo(dto.getToDo(), dto.getName());
        ToDo saveToDo = ToDoRepository.saveToDo(toDo);

        return null;
    }
}
