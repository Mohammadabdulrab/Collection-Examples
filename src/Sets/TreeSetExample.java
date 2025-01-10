package Sets;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        // define the LinkedHashSet

        TreeSet<String> map1= new TreeSet <String>();

        // Adding the value in the TreeSet

        map1.add("Mango");
        map1.add("Guava");
        map1.add("Banana");
       // map1.add(null);// it does not allow null value
        map1.add("Mango"); // it does not allow duplicate values
        map1.add("Papaya");
        map1.add("Watermelon");
        map1.add("Lichi");

        System.out.println("TreeSet  is :"+map1);

        // remove the value from the TreeSet

        map1.remove("Mango");
        System.out.println("TreeSet  after removing the :"+map1);

        // Search for an element that is  in the TreeSet

        String searchElement = "Banana";

        if (map1.contains(searchElement)) {
            System.out.println(searchElement + " is present in the TreeSet .");
        } else {
            System.out.println(searchElement + " is not present in the TreeSet .");
        }

        // Search for an element that is not in the TreeSet

        searchElement = "Mango";

        if (map1.contains(searchElement)) {
            System.out.println(searchElement + " is present in the TreeSet .");
        } else {
            System.out.println(searchElement + " is not present in the TreeSet .");
        }

        // size of the TreeSet

        System.out.println("Length of the TreeSet  is :"+map1.size());



        //traversing the TreeSet
        //foreach loop

        System.out.println("Traversing the TreeSet by using the foreach loop");
        for(String l1:map1){
            System.out.println(l1);
        }



    }
}
