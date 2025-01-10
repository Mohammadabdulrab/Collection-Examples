package Sets;

import java.util.Collections;
import java.util.HashSet;

public class HAshSetExample {
    public static void main(String[] args) {

        // define the HashSet

        HashSet<String> map1= new HashSet<String>();

        // Adding the value in the HashSet

        map1.add("Mango");
        map1.add("Guava");
        map1.add("Banana");
        map1.add(null);
        map1.add("Mango"); // it does not allow duplicate values
        map1.add("Papaya");
        map1.add("Watermelon");
        map1.add("Lichi");

        System.out.println("HashSet is :"+map1);

        // remove the value from the HashSet

        map1.remove("Mango");
        System.out.println("HashSet after removing the :"+map1);

        String searchElement = "Banana";

        if (map1.contains(searchElement)) {
            System.out.println(searchElement + " is present in the HashSet.");
        } else {
            System.out.println(searchElement + " is not present in the HashSet.");
        }

        // Search for an element that is not in the HashSet
        searchElement = "Mango";

        if (map1.contains(searchElement)) {
            System.out.println(searchElement + " is present in the HashSet.");
        } else {
            System.out.println(searchElement + " is not present in the HashSet.");
        }
        // size of the list

        System.out.println("Length of the list1 is :"+map1.size());

        // sort the list

//        Collections.sort(map1);
//        System.out.println("List1 after the sorting :"+map1);

        //traversing the list
        //foreach loop

        System.out.println("Traversing the list by using the foreach loop");
        for(String l1:map1){
            System.out.println(l1);
        }



    }
}
