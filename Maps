import java.util.TreeMap;

/*
* Homework 
* Patrick Croke, pc4qq
*
*Sources: 
*/

public class MapsInClass {
    
    public static void main(String[] args) {
        TreeMap<String, Integer> phoneBook = new TreeMap<String, Integer>();
        phoneBook.put("Lorna", 321);
        phoneBook.put("Anna", 456);
        phoneBook.put("Grace", 789);
        phoneBook.put("Clayton", 115);
        System.out.println(reverseBook(phoneBook));
        // Output should be:  {115=Clayton, 321=Lorna, 456=Anna, 789=Grace}

    } // END main
    
 // reverseBook method that takes in a TreeMap phoneBook (<String, Integer>)
    // and returns another TreeMap that is the reverse of phoneBook (<Integer, String>).
    // That is, the key for phoneBook becomes the value for the new TreeMap, and the value for 
    // phoneBook becomes the key for the new TreeMap.
    
    
    
    public static TreeMap<Integer, String> reverseBook
    (TreeMap<String, Integer> phoneBook) {
        TreeMap<Integer, String> reversed = new TreeMap<Integer, String>();
        
       for (String key : phoneBook.keySet()) {
           Integer value = phoneBook.get(key);
           
           if(!reversed.containsKey(value)) {
               reversed.put(value,  key);
           }
       }
       return reversed;
    }

private static Integer get(String key) {
    // TODO Auto-generated method stub
    return null;
}
    
} // End class
