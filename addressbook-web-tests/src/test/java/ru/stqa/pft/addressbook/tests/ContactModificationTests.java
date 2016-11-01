package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by maksim.gerasimenko on 10/26/16.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Maksim", "Gerasimenko", "0997803873", "ooosmileooo@mail.ru", null), false);
    app.getGroupHelper().updateGroupModification();
    app.getNavigationHelper().goToHomePage();
  }
}
