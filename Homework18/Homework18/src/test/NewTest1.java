import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest1 {

	  @DataProvider(name="simpleDataProvider")
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { 0, labelOne, labelTwo },
	      new Object[] { 1, labelThree, labelTwo },
	      new Object[] { -1, labelOne, labelThree },
	      
	    };
	  }
	
 @BeforeClass
  public void beforeClass() {
  }
  
  @BeforeTest
  public void beforeTest() {
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }
  
  @Test(dataProvider = "dp")
  public void compareObjects(Integer n, Label label1, Label label2) {
	  Page page20= new Page();
      label1=values.get(0);
      label2=values.get(1);
      comp= values.get(2);
       Assert.assertEquals(comp, page20.compareObjects(label1, label2));
	  
  }
  
  @Test(dataProvider = "dp")
  public void compareObjects(Integer n, Label label1, Label label2) {
	  Page page21= new Page();
      label1=values.get(0);
      label2=values.get(1);
      Assert.assertNotNull(page21.compareObjects(label1, label2));
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

  
  @AfterTest
  public void afterTest() {
  }

}
