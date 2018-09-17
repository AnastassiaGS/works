import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.LinkedList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	ArrayList<Button> buttons=new ArrayList<>();
    LinkedList<Field> fields=new LinkedList<>();
 
  @BeforeClass
  public void beforeClass() {
  }
  
 
 
  @BeforeTest
  public void beforeTest() {
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }
  
  @Test
  public void containsButton() {
      Page page = new Page();
      Button button1 = new Button("Registration","Press");
      buttons.add(button1);
      Assert.assertEquals(false, page.containsButton(button1));
  }
  
  @Test(timeout=100)
  public void containsButton1() {
      Page page = new Page();
      Button button1 = new Button("Registration","Press");
      buttons.add(button1);
      Assert.assertThat(page.containsButton(button1), is(false));
  }
  
  @Test (expected = EmptyStackException.class)
  public void getFirstElenemt() throws EmptyStackException {
      Page page1=new Page();
      Field field1 = new Field(1, 1);
      Field field2 = new Field(2, 5);
      Field field3 = new Field(3, 24);
      fields.add(field1);
      fields.add(field2);
      fields.add(field3);
      Assert.assertSame(field1, page1.getFirstElenemt(fields));
  }

  @Test (expected = EmptyStackException.class)
  public void getFirstElenemt2() throws EmptyStackException {
      LinkedList<Field> fields = new LinkedList<>();
      Page page2=new Page();
      Field field1 = new Field(1, 1);
      Field field2 = new Field(2, 5);
      Field field3 = new Field(3, 24);
      fields.add(field1);
      fields.add(field2);
      fields.add(field3);
      Assert.assertEquals(field1, page2.getFirstElenemt(fields));
  }

  @Test (expected = EmptyStackException.class)
  public void getLastElenemt() throws EmptyStackException {
      Page page3=new Page();
      Field field1 = new Field(1, 1);
      Field field2 = new Field(2, 5);
      Field field3 = new Field(3, 24);
      fields.add(field1);
      fields.add(field2);
      fields.add(field3);
      Assert.assertFalse(page3.getLastElenemt(fields)==field3);
  }

  @Test (enabled=false) 
  public void getLastElenemt2()  throws EmptyStackException {
      Page page4=new Page();
      Field field1 = new Field(1, 1);
      Field field2 = new Field(2, 5);
      Field field3 = new Field(3, 24);
      fields.add(field1);
      fields.add(field2);
      fields.add(field3);
      Assert.assertNotNull(page4.getLastElenemt(fields));
   }

  

  @AfterMethod
  public void afterMethod() {
  }

  @AfterTest
  public void afterTest() {
  }
  
  @AfterClass
  public void afterClass() {
  }

  
  
}
