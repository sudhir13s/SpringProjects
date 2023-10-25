package dev.ss.SpringProjects.ToDoMini.controller;


import dev.ss.SpringProjects.ToDoMini.entity.Todo;
import dev.ss.SpringProjects.ToDoMini.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

  Logger logger = LoggerFactory.getLogger(TodoController.class);
  @Autowired
  private TodoService todoService;


  @GetMapping()
  public List<Todo> getTodoList() {
    logger.info("getTodoList" + todoService.getTodoList().toString());
    return todoService.getTodoList();
  }

  @GetMapping(value = "/{id}")
  public Todo getTodo(@PathVariable("id") Long id) {
    logger.info("getTodo" + todoService.getTodoById(id).toString());
    return todoService.getTodoById(id);
  }

  @PostMapping()
  public Todo addTodoList(@RequestBody Todo body) {
    return todoService.addTodo(body);
  }

  @PutMapping()
  public Todo updateTodoList(@RequestBody Todo body) {
    return todoService.updateTodo(body);
  }

  @DeleteMapping(value = "/{id}")
  public Todo deleteTodoList(@PathVariable("id") Long id) {
    return todoService.deleteTodo(id);
  }
}
