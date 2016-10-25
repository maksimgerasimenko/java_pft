package ru.stqa.pft.addressbook;

public class ContactDataV2 {
  private final String homeTelephone;
  private final String firstEmail;
  private final String secondEmail;
  private final String year;
  private final String day;
  private final String month;

  public ContactDataV2(String homeTelephone, String firstEmail, String secondEmail, String year, String day, String month) {
    this.homeTelephone = homeTelephone;
    this.firstEmail = firstEmail;
    this.secondEmail = secondEmail;
    this.year = year;
    this.day = day;
    this.month = month;
  }

  public String getHomeTelephone() {
    return homeTelephone;
  }

  public String getFirstEmail() {
    return firstEmail;
  }

  public String getSecondEmail() {
    return secondEmail;
  }

  public String getYear() {
    return year;
  }

  public String getDay() {
    return day;
  }

  public String getMonth() {
    return month;
  }
}
