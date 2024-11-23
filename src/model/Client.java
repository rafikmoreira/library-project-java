package model;

import java.time.LocalDate;
import java.util.UUID;

public class Client {
  final private UUID id;
  final private String name;
  final private LocalDate birthDate;

  public Client(String name, LocalDate birthDate) {
    this.name = name;
    this.birthDate = birthDate;
    this.id = UUID.randomUUID();
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }
}
