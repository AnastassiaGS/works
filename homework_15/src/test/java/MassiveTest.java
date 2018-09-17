import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MassiveTest {

    ArrayList<Integer> values;
    ArrayList<String> strings;

    public MassiveTest() {}


    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findSum() {
        Massive massive1 = new Massive();
        values.add(15);
        values.add(40);
        values.add(26);
        values.add(24);
       int actual =  massive1.findSum(values);
       int expected =  105;
       assertEquals (expected, actual);

    }

    @Test(timeout=200)
    public void findSum1() {
        Massive massive2 = new Massive();
        values.add(22);
        values.add(13);
        Assert.assertSame(massive2.findSum(values), 45);
      }


    @Test
    public void printArrayReverse() {
        Massive massive3 = new Massive();
        values.add(15);
        values.add(22);
        Assert.assertNotSame(massive3.printArrayReverse(values), values);

    }
    @Ignore
    @Test
    public void printArrayReverse2() {
        Massive massive4 = new Massive();
        strings.add("Mars");
        strings.add("Sun");
        strings.add("Mercury");
        strings.add("Earth");
        Assert.assertArrayEquals(new ArrayList[]{massive4.printArrayReverse(values)}, new ArrayList[]{values});
    }


    @Test()
    public void replaceElement() {
        Massive massive5 = new Massive();
        values.add(15);
        values.add(22);
        values.add(41);
        Assert.assertTrue(String.valueOf(massive5.replaceElement(values)), true);
    }
    @Ignore
    @Test
    public void replaceElement2() {
        Massive massive6 = new Massive();
        values.add(15);
        values.add(22);
        values.add(41);
        Assert.assertArrayEquals(new ArrayList[]{massive6.replaceElement(values)}, new ArrayList[]{values});
    }

    @Test
    public void containsElement1() {
        Massive massive7 = new Massive();
        strings.add("Mars");
        strings.add("Sun");
        strings.add("Mercury");
        strings.add("Earth");
        Assert.assertTrue(massive7.containsElement(strings));

    }
    @Test()
    public void containsElemen() {
        Massive massive8 = new Massive();
        strings.add("Mars");
        strings.add("Sun");
        strings.add("Mercury");
        strings.add("Earth");
        Assert.assertNull(massive8.containsElement(strings));

    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void calculateSize()  {
        Massive massive6 = new Massive();
        Integer a = 2;
        Assert.assertEquals(a, massive6.calculateSize(strings));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void calculateSize1() {
        Assert.fail();
        Assert.fail("Test calculateSize failed!");
       }



}