package ru.stqa.pft.adress;// Generated by Selenium IDE

import org.junit.Test;

public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletion() {
    goToGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}
