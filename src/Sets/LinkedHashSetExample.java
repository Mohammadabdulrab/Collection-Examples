package Sets;


import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        // define the LinkedHashSet

        LinkedHashSet<String> map1= new LinkedHashSet<String>();

        // Adding the value in the LinkedHashSet

        map1.add("Mango");
        map1.add("Guava");
        map1.add("Banana");
        map1.add(null);
        map1.add("Mango"); // it does not allow duplicate values
        map1.add("Papaya");
        map1.add("Watermelon");
        map1.add("Lichi");

        System.out.println("LinkedHashSet is :"+map1);

        // remove the value from the LinkedHashSet

        map1.remove("Mango");
        System.out.println("LinkedHashSet after removing the :"+map1);

        // Search for an element that is  in the LinkedHashSet

        String searchElement = "Banana";

        if (map1.contains(searchElement)) {
            System.out.println(searchElement + " is present in the LinkedHashSet.");
        } else {
            System.out.println(searchElement + " is not present in the LinkedHashSet.");
        }

        // Search for an element that is not in the LinkedHashSet

        searchElement = "Mango";

        if (map1.contains(searchElement)) {
            System.out.println(searchElement + " is present in the LinkedHashSet.");
        } else {
            System.out.println(searchElement + " is not present in the LinkedHashSet.");
        }

        // size of the LinkedHashSet

        System.out.println("Length of the LinkedHashSet is :"+map1.size());



        //traversing the LinkedHashSet
        //foreach loop

        System.out.println("Traversing the LinkedHashSet by using the foreach loop");
        for(String l1:map1){
            System.out.println(l1);
        }



    }
}
