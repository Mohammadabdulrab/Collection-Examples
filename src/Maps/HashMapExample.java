package Maps;
import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {

        //define HashMap
        HashMap<Integer, String> map1=new HashMap<>();

        //Adding the data

        map1.put(101, "Mango");
        map1.put(102, "Grapes");
        map1.put(103, "Banana");
        map1.put(104, "Watermelon");
        map1.put(null, "Mango");
        map1.put(105, "Strawberry");
        map1.put(106, "Pineapple");
        map1.put(101, "Mohammad Abdul Rab");// Override

        System.out.println("Map is : "+map1);

        // delete the data

        map1.remove(101);
        System.out.println("Map is after removing the data from the key 101 :"+map1);

        // Size of the data

        System.out.println("map1 length is :"+map1.size());

        //Get particular element from the map

        System.out.println("map1 element with key is 104 :"+map1.get(104));

        // travers the map
        System.out.println("Traversing the map using foreach loop");
        for(Map.Entry m1 : map1.entrySet()){
            System.out.println(m1.getKey()+"------"+m1.getValue());
        }
    }
}
