package ru.stqa.pft.addressbook;

public class ContactDataV1 {
  private final String firstName;
  private final String lastName;
  private final String nickName;
  private final String company;

  public ContactDataV1(String firstName, String lastName, String nickName, String company) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.nickName = nickName;
    this.company = company;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getNickName() {
    return nickName;
  }

  public String getCompany() {
    return company;
  }
}
