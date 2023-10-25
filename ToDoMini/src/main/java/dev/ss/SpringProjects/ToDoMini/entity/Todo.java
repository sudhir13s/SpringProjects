package dev.ss.SpringProjects.ToDoMini.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Entity
@Table
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column(name = "user_name")
  private String userName;
  private String description;

  @Column(name = "target_date")
  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS][.SS][.S]")
  private LocalDateTime targetDate;

  public Todo() {
  }

  public Todo(long id, String userName, String description, LocalDateTime targetDate) {
    this.id = id;
    this.userName = userName;
    this.description = description;
    this.targetDate = targetDate;
  }

  public long getId() {
    return id;
  }

  public String getUserName() {
    return userName;
  }

  public String getDescription() {
    return description;
  }

  public LocalDateTime getTargetDate() {
    return targetDate;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setTargetDate(LocalDateTime targetDate) {
    this.targetDate = targetDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Todo todo = (Todo) o;
    return id == todo.id &&
        Objects.equals(userName, todo.userName) &&
        Objects.equals(description, todo.description) &&
        Objects.equals(targetDate, todo.targetDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userName, description, targetDate);
  }

  @Override
  public String toString() {
    return "Todo{" +
        "id=" + id +
        ", userName='" + userName + '\'' +
        ", description='" + description + '\'' +
        ", targetDate=" + targetDate +
        '}';
  }
}
