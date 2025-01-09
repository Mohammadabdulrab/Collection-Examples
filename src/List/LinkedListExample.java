package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        //define the ArrayList
        List<Integer> list1 = new LinkedList<Integer>();

        //Adding or inserting the elements into the list

        list1.add(12);
        list1.add(77);
        list1.add(9);
        list1.add(55);
        list1.add(77);
        list1.add(80);
        list1.add(66);

        System.out.println("List is :" + list1);

        // remove or delete the data from the list

        list1.remove(3);
        System.out.println("List after removing the data from 3rd index of the list: " + list1);


        // searching the data at specific index or position
        System.out.println("Element at 4th index is :" + list1.get(4));
        System.out.println("Element at 2nd index is :" + list1.get(2));

        // size of the list

        System.out.println("Length of the list1 is :" + list1.size());

        // sort the list

        Collections.sort(list1);
        System.out.println("List1 after the sorting :" + list1);

        //traversing the list
        //foreach loop

        System.out.println("Traversing the list by using the foreach loop");
        for (Integer l1 : list1) {
            System.out.println(l1);
        }

        List abc=new ArrayList();
        abc.add(54);
        abc.add("abdul");
        abc.add(45.76);
        abc.add(45.87f);
        System.out.println(" abc list is :"+abc);
    }
}
