package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by maksim.gerasimenko on 10/26/16.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().goToHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoGroupPage();
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
      app.getContactHelper().createContact(new ContactData("Maksim", "Gerasimenko", "0997803873", "ooosmileooo@mail.ru", "test1"), true);
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Maksim", "Gerasimenko", "0997803873", "ooosmileooo@mail.ru", null), false);
    app.getGroupHelper().updateGroupModification();
    app.getNavigationHelper().goToHomePage();
  }
}
