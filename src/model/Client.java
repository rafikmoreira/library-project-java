package model;

import java.time.LocalDate;

public class Client {
  private int id;
  final private String name;
  final private LocalDate birthDate;

  public Client(String name, LocalDate birthDate) {
    this.name = name;
    this.birthDate = birthDate;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }
}
