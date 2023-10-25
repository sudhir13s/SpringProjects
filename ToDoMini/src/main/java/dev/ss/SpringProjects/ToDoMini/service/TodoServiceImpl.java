package dev.ss.SpringProjects.ToDoMini.service;

import dev.ss.SpringProjects.ToDoMini.entity.Todo;
import dev.ss.SpringProjects.ToDoMini.repository.TodoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{

  Logger logger = LoggerFactory.getLogger(TodoServiceImpl.class);
//  @Autowired
  private final TodoRepository todoRepository;

  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }


  @Override
  public List<Todo> getTodoList() {
    return todoRepository.findAll();
  }

  @Override
  public Todo getTodoById(Long id) {
    logger.info(String.valueOf(todoRepository.findById(id).get()));
    return todoRepository.findById(id).get();
  }

  @Override
  public Todo addTodo(Todo todo) {
    return todoRepository.save(todo);
  }

  @Override
  public Todo updateTodo(Todo todo) {
    return todoRepository.save(todo);
  }

  @Override
  public Todo deleteTodo(Long id) {
    Todo todo = todoRepository.findById(id).get();
    todoRepository.deleteById(id);
    return todo;
  }
}
