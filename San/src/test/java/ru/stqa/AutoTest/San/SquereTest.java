package ru.stqa.AutoTest.San;

import org.junit.Test;
import org.testng.Assert;

public class SquereTest {

  @Test
  public void testArea () {
    Squere s = new Squere(5);
    Assert.assertEquals(s.area(),25);
  }
}
