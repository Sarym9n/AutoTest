package ru.stqa.pft.adress;// Generated by Selenium IDE

import org.junit.Test;

public class GroupCreationTestsTest extends  TestBase {

  @Test
  public void testGroupCreation() {

    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("Autotest1", "Autotest2", "Autotest3"));
    submitGroupCreation();
    returnToGroupPage();
    out();
  }

}
