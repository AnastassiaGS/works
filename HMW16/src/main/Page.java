package Mine;

import java.util.*;

public class Page {

    ArrayList<Button> buttons;
    LinkedList<Field> fields;
    HashSet<Label> labels;
    TreeSet<Dropdown> dropdowns;
    private float id;
    private String title;


    public Page() {
        this.buttons = new ArrayList<>();
        this.fields = new LinkedList<>();
        this.labels = new HashSet<>();
        this.dropdowns = new TreeSet<>();
        this.id = 0;
        this.title = "";

    }

   /* public Page(ArrayList<Button> buttons, LinkedList<Field> fields, HashSet<Label> labels, TreeSet<Dropdown> dropdowns, float id, String title) {
        this.buttons = buttons;
        this.fields = fields;
        this.labels = labels;
        this.dropdowns = dropdowns;
        this.id = id;
        this.title = title;
    }*/

    // 1. Does a page contains a button
    public boolean containsButton(Button button) {
        return buttons.contains(button);
    }

//2. Get the 1st element, if it exists, else throw exception

    public Field getFirstElenemt(LinkedList<Field> fields) throws EmptyStackException {
        if (this.fields.isEmpty()) {
            throw new EmptyStackException("Field hasn't 1st element as it's empty");
        } else {
            return this.fields.getFirst();
        }
    }


    //3. Get the ast element, if it exists, else throw exception
    public Field getLastElenemt(LinkedList<Field> fields) throws EmptyStackException {
        {
            if (this.fields.isEmpty()) {
                throw new EmptyStackException("Field hasn't last element as it's empty");
            } else {
                return this.fields.getLast();
            }
        }
    }

    ////4. Takes in an array "labels", sets it into HashSet of the class, and returns into HashSet<Label>
    public HashSet<Label> convertToHashSet(Label[] labels) {
        return new HashSet<>(Arrays.asList(labels));
    }


    //5. Put list ArrayList<Label> into set TreeSet<Dropdown>

    public TreeSet<Dropdown> putTreeSetDropdown(List<Label> labels, boolean isSelected, String name) {

        for (Label label : labels) {
            String str = label.asString();
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            Dropdown dropdown = new Dropdown(list, true, "");
            dropdowns.add(dropdown);
        }
        return this.dropdowns;


    }


//6. Takes in 2 objects "label", and returns the result of the comparison by using "compareTo"

    public int compareObjects(Label label1, Label label2) {
        return label1.compareTo(label2);
    }


    //7. Write a method that displays the 3rd element of "Dropdowns" and returns LinkedHashSet <Dropdowns>, if this is impossible, it throws an exception

    public LinkedHashSet<Dropdown> getLinkedHashSet(int k) throws ArrayIndexOutOfBoundsException {
        TreeSet<Dropdown> dropdownTreeSet = new TreeSet<>();
        if (dropdownTreeSet.size() < k) {
            throw new ArrayIndexOutOfBoundsException("Out of bounds");
        } else {
            for (k = 0; k < dropdownTreeSet.size(); k++) {
                if (k == 2) {
                    System.out.println(dropdownTreeSet.toString());
                }
            }
        }
        LinkedHashSet<Dropdown> dropdownLinkedHashSet = new LinkedHashSet<>();
        for (Dropdown d : dropdownTreeSet) {
            System.out.print(dropdownLinkedHashSet.add(d));
        }
        return dropdownLinkedHashSet;
    }


}

