package Mine;

import java.util.*;

public class Work {

    public static void main(String[] args) throws EmptyStackException, ArrayIndexOutOfBoundsException {

        // Create objects
       Button button = new Button("Log in", "Click here");
        Field field = new Field(1, 1);
        Label label = new Label("Label1");

        List<String> options = new ArrayList<>();
        options.add("Submit");
        options.add("Delete");
        options.add("Update");
        Dropdown dropdown = new Dropdown(options, true, "Tab");

        Page page = new Page();

// Initialize fields
        ArrayList<Button> buttons = new ArrayList<>();
        Button button1 = new Button("Log in", "Click here");
        buttons.add(button1);


        TreeSet<Dropdown> dropdowns = new TreeSet<>();
        Dropdown dropdown1 = new Dropdown(options, true, "Tab");
        Dropdown dropdown2 = new Dropdown(options, false, "Table");
        Dropdown dropdown3 = new Dropdown(options, true, "Calculator");


       // 1. Does a page contains a button
        Page page2 = new Page();

        System.out.println("Does a  page contains a button " + page2.containsButton(button));

        System.out.println();
        LinkedList<Field> fields = new LinkedList<>();
        Field field1 = new Field(1, 1);
        Field field2 = new Field(2, 5);
        Field field3 = new Field(3, 24);
        page2.fields.add(1, field1);
        page2.fields.add(2, field2);
        page2.fields.add(3, field3);
        //2. Get the 1st element, if it exists, else throw exception
        try {
            page2.getFirstElenemt(fields);
        } catch (EmptyStackException e) {
            System.out.println("This list is empty" + e.getMessage());
        }
        System.out.println(page2.getFirstElenemt(fields));
        //3. Get the ast element, if it exists, else throw exception
        try {
            page2.getLastElenemt(fields);
        } catch (EmptyStackException e) {
            System.out.println("This list is empty" + e.getMessage());
        }
        System.out.println(page2.getLastElenemt(fields));

        System.out.println();

        //4. Takes in an array "labels", sets it into HashSet of the class, and returns into HashSet<Label>
        Label label1 = new Label("Labe1");
        Label label2 = new Label("Label2");
        Label label3 = new Label("Label3");
        Label[] labelArray = {label1, label2, label3};
        page2.convertToHashSet(labelArray);

        System.out.println();

        //5. Put list ArrayList<Label> into set TreeSet<Dropdown>
        ArrayList<Label> arrayListString = new ArrayList<>();
        Label label4 = new Label("Label4");
        Label label5 = new Label("Label5");
        Label label6 = new Label("Label6");
        arrayListString.add(label4);
        arrayListString.add(label5);
        arrayListString.add(label6);
        TreeSet<Dropdown> treeSetDropdown = page2.putTreeSetDropdown(arrayListString, true, "Tab");
        Iterator<Dropdown> iterator1 =  treeSetDropdown.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());

        }

    //6. Takes in 2 objects "label", and returns the result of the comparison by using "compareTo"
        page2.compareObjects(new Label("Label"),new Label("LabelOne"));
        page2.compareObjects(new Label("Label5"),new Label("Label5"));
        page2.compareObjects(new Label("LabelThird"),new Label("LabelTwo"));

//7. Write a method that displays the 3rd element of "Dropdowns" and returns LinkedHashSet <Dropdowns>, if this is impossible, it throws an exception

        TreeSet<Dropdown> dropdownTreeSet = new TreeSet<>();
        LinkedHashSet<Dropdown> dropdownLinkedHashSet = new LinkedHashSet<>();
        Dropdown dropdown4 = new Dropdown(options, true, "Dropdown1");
        Dropdown dropdown5 = new Dropdown(options, false, "Dropdown2");
        Dropdown dropdown6 = new Dropdown(options, true, "Dropdown3");
        Dropdown dropdown7 = new Dropdown(options, false, "Dropdown4");
        dropdownTreeSet.add(dropdown4);
        dropdownTreeSet.add(dropdown5);
        dropdownTreeSet.add(dropdown6);
        dropdownTreeSet.add(dropdown7);

        try {
            page2.getLinkedHashSet(20);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This list is empty" + e.getMessage());
        }
        System.out.println("The 3rd element" + page2.getLinkedHashSet(2));

        Iterator<Dropdown> iter = dropdownLinkedHashSet.iterator();
        while (iter.hasNext());
        {
           System.out.println(iter.next().toString());
        }

}
}
