import org.junit.*;

import java.util.*;



public class PageTest2 {

    HashSet<Label> labels=new HashSet<>();
    TreeSet<Dropdown> dropdowns=new TreeSet<>();

    public PageTest2() {}

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
    }

   

    @Before
    public void setUp() throws Exception {
    }

    

    @Test
    public void putTreeSetDropdown() {

        Page page10 = new Page();
        ArrayList<Label> arrayListString = new ArrayList<>();
        Label label4 = new Label("Label4");
        Label label5 = new Label("Label5");
        Label label6 = new Label("Label6");
        arrayListString.add(label4);
        arrayListString.add(label5);
        arrayListString.add(label6);

        List<String> options = new ArrayList<>();
        options.add("Submit");
        options.add("Delete");
        options.add("Update");
        Dropdown dropdown1 = new Dropdown(options, true, "Tab");
        Dropdown dropdown2 = new Dropdown(options, true, "Tab");
        Dropdown dropdown3 = new Dropdown(options, true, "Tab");
        TreeSet<Dropdown> dropdowns = new TreeSet<>();
        dropdowns.add(dropdown1);
        dropdowns.add(dropdown2);
        dropdowns.add(dropdown3);

        Assert.assertNotNull(page10.putTreeSetDropdown(arrayListString, true, "Tab"));
    }

    @Test
    public void putTreeSetDropdown2() {
        Page page11= new Page();
        ArrayList<Label> arrayListString = new ArrayList<Label>();
        Label label4 = new Label("Label4");
        Label label5 = new Label("Label5");
        Label label6 = new Label("Label6");
        arrayListString.add(label4);
        arrayListString.add(label5);
        arrayListString.add(label6);
        List<String> options = new ArrayList<>();
        options.add("Submit");
        options.add("Delete");
        options.add("Update");
        Dropdown dropdown1 = new Dropdown(options, true, "Tab");
        Dropdown dropdown2 = new Dropdown(options, true, "Tab");
        Dropdown dropdown3 = new Dropdown(options, true, "Tab");
        TreeSet<Dropdown> dropdowns = new TreeSet<>();
        dropdowns.add(dropdown1);
        dropdowns.add(dropdown2);
        dropdowns.add(dropdown3);

      Assert.assertNotSame(null, page11.putTreeSetDropdown(arrayListString, true, "Tab"));
    }

    @Test
    public void convertToHashSet() {
        Page page12= new Page();
        Label label1 = new Label("Label1");
        Label label2 = new Label("Label2");
        Label label3 = new Label("Label3");
        Label[] labelArray = {label1, label2, label3};
        Assert.assertNotNull(page12.convertToHashSet(labelArray));
 }

    @Test(timeout = 100)
    public void convertToHashSet2() {
        Page page13= new Page();
        Label label1 = new Label("Labe1l");
        Label label2 = new Label("Label2");
        Label label3 = new Label("Label3");
        Label[] labelArray = {label1, label2, label3};
        Assert.assertNotSame(labelArray,  page13.convertToHashSet(labelArray));
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void getLinkedHashSet() throws ArrayIndexOutOfBoundsException {
        Page page14= new Page();
        List<String> options = new ArrayList<>();
        TreeSet<Dropdown> dropdownTreeSet = new TreeSet<Dropdown>();
        options.add("Submit");
        options.add("Delete");
        options.add("Update");
        Dropdown dropdown1 = new Dropdown(options, true, "Tab");
        Dropdown dropdown2 = new Dropdown(options, false, "Table");
        Dropdown dropdown3 = new Dropdown(options, true, "Calculator");
        dropdownTreeSet.add(dropdown1);
        dropdownTreeSet.add(dropdown2);
        dropdownTreeSet.add(dropdown3);
        Assert.assertEquals(null, page14.getLinkedHashSet(5));
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void getLinkedHashSet2() throws ArrayIndexOutOfBoundsException {
        Page page15= new Page();
        List<String> options = new ArrayList<>();
        TreeSet<Dropdown> dropdownTreeSet = new TreeSet<>();
        options.add("Submit");
        options.add("Delete");
        options.add("Update");
        Dropdown dropdown1 = new Dropdown(options, true, "Tab");
        Dropdown dropdown2 = new Dropdown(options, false, "Table");
        Dropdown dropdown3 = new Dropdown(options, true, "Calculator");
        dropdownTreeSet.add(dropdown1);
        dropdownTreeSet.add(dropdown2);
        dropdownTreeSet.add(dropdown3);
        Assert.assertTrue(page15.getLinkedHashSet(3)==null);
    }
    
    @After
    public void tearDown() throws Exception {
    }
    
    @AfterClass
    public static void tearDownAfterClass() throws Exception{
    }
}