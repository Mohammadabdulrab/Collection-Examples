package List;

import java.util.*;
public class StackExample {
    public static void main(String[] args) {
        //define the stack

        Stack<String> stck1=new Stack<String>();

        // Adding the data into the Stack

        stck1.push("ABCD");
        stck1.push("klsjo");
        stck1.push("ABCD");
        stck1.push("hjsks");
        stck1.push("Mohammad Abdul Rab");
        stck1.push("Md Tausif Qamar");
        stck1.push("Md Tabrez Qamar");


        System.out.println("Stack is :"+stck1);

        // remove or delete the value from the stack
        // In stack last inserted element will delete first
        // stack follow the rule LIFO

        stck1.pop();
        System.out.println("After removing the 1st element from the the stack:"+stck1);

        stck1.pop();
        System.out.println("After removing the 2st element from the the stack:"+stck1);

        // searching the data at specific index or position
        System.out.println("Element at 4th index is :"+ stck1.get(4));
        System.out.println("Element at 2nd index is :"+stck1.get(2));

        // size of the list

        System.out.println("Length of the list1 is :"+stck1.size());

        // sort the list

        Collections.sort(stck1);
        System.out.println("List1 after the sorting :"+stck1);

        //traversing the list
        //foreach loop

        System.out.println("Traversing the list by using the foreach loop");
        for(String l1:stck1){
            System.out.println(l1);
        }

    }
}
