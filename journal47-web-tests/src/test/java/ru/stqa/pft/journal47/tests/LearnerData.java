package ru.stqa.pft.journal47.tests;

public class LearnerData {
  private final String lastName;
  private final String firstName;

  public LearnerData(String lastName, String firstName) {
    this.lastName = lastName;
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }
}
