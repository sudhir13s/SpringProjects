package dev.ss.SpringProjects.ToDoMini.service;

import dev.ss.SpringProjects.ToDoMini.entity.Todo;

import java.util.List;

public interface TodoService {

  List<Todo> getTodoList();
  Todo getTodoById(Long id);
  Todo addTodo(Todo todo);
  Todo updateTodo(Todo todo);
  Todo deleteTodo(Long id);
}
