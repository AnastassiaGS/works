import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.LinkedList;

import static org.hamcrest.CoreMatchers.is;

public class PageTest {

    ArrayList<Button> buttons=new ArrayList<>();
    LinkedList<Field> fields=new LinkedList<>();
    public PageTest() {}

      @BeforeClass
    public static void setUpBeforeClass() throws Exception{
    }
   
    @org.junit.Before
    public void setUp() throws Exception {
    }

    

    @org.junit.Test
    public void containsButton() {
        Page page = new Page();
        Button button1 = new Button("Registration","Press");
        buttons.add(button1);
        Assert.assertEquals(false, page.containsButton(button1));
    }

    @org.junit.Test
    public void containsButton1() {
        Page page = new Page();
        Button button1 = new Button("Registration","Press");
        buttons.add(button1);
        Assert.assertThat(page.containsButton(button1), is(false));
    }

    @org.junit.Test (expected = EmptyStackException.class)
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

    @org.junit.Test (expected = EmptyStackException.class)
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

    @org.junit.Test (expected = EmptyStackException.class)
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

    @Ignore
    @org.junit.Test (expected = EmptyStackException.class)
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
    
    @org.junit.After
    public void tearDown() throws Exception {
    }
    
    @AfterClass
    public static void tearDownAfterClass() throws Exception{
    }

}