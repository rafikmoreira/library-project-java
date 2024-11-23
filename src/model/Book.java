package model;

import java.time.LocalDateTime;

public class Book {
  final private Author author;
  private int id;
  final private String title;
  final private boolean isAvailable;
  final private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public Book(String title, Author author) {
    this.title = title;
    this.author = author;
    this.isAvailable = true;
    this.createdAt = LocalDateTime.now();
    this.updatedAt = LocalDateTime.now();
  }

  public Author getAuthor() {
    return author;
  }

  public int getId() {
    return id;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getTitle() {
    return this.title;
  }

  public boolean isAvailable() {
    return this.isAvailable;
  }

  public LocalDateTime getCreatedAt() {
    return this.createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return this.updatedAt;
  }
}
