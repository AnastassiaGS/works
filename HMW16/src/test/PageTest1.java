
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@RunWith(value = Parameterized.class)

public class PageTest1 {
    private ArrayList<Label> values;
    private Label label1;
    private Label label2;
    private Label comp;

   @Parameterized.Parameters
        public static Collection parameters()  {

        List<Object[]> objects = Arrays.asList(new Object[][]{new Object[]{Arrays.asList( "LabelOne", "LabelTwo", "0")}, {Arrays.asList("LabelTwo", "LabelThree", "-1")}, {Arrays.asList("LabelThree", "LabelOne", "1")}});
        return objects;
    }


    public PageTest1(ArrayList<Label> values){
        this.values=values;
      }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
    }

   

    @Before
    public void setUp() throws Exception {
    }

    
    @Test
   public void compareObjects() {
        Page page20= new Page();
        label1=values.get(0);
        label2=values.get(1);
        comp= values.get(2);
         Assert.assertEquals(comp, page20.compareObjects(label1, label2));
    }

    @Test
    public void compareObjects2() {
        Page page21= new Page();
        label1=values.get(0);
        label2=values.get(1);
        Assert.assertNotNull(page21.compareObjects(label1, label2));
    }
    
    @After
    public void tearDown() throws Exception {
    }
    
    @AfterClass
    public static void tearDownAfterClass() throws Exception{
    }
}
