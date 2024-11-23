package model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Book {
  final private Author author;
  final private UUID id;
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
    this.id = UUID.randomUUID();
  }

  public Author getAuthor() {
    return author;
  }

  public UUID getId() {
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
