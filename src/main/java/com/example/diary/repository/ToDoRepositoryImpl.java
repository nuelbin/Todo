package com.example.diary.repository;

import com.example.diary.entity.ToDo;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ToDoRepositoryImpl implements ToDoRepository{

    private final Map<Long, ToDo> toDoList = new HashMap<>();

    @Override
    public ToDo saveToDo(ToDo toDo) {

        Long toDoId = toDoList.isEmpty() ? 1 : Collections.max(toDoList.keySet()) + 1;

        toDoList.put(toDoId, toDo);

        return toDo;
    }
}

