/*
* Homework 
* Patrick Croke, pc4qq
*
*Sources: 
*/

import java.util.HashSet;


public class sets {
    public static HashSet<String> names = new HashSet<String>();
    public static HashSet<String> cards = new HashSet<String>();
    public static HashSet<String> topNames = new HashSet<String>();
    
    public static HashSet<String> names 
    (HashSet<String> cards, HashSet<String> topNames){
    
            for (String x : cards)
                names.add(x);
            for (String y : topNames)
                names.add(y);
        return names;
    }

    public static void main(String[] args) {
        
           cards.add("John");
           cards.add("Tim");
           cards.add("David");
           
           System.out.println(cards);
           
           topNames.add("John");
           topNames.add("Luke");
           topNames.add("Phil");
           topNames.add("Pat");
           
           System.out.println(topNames);
           
           names(cards, topNames);
           
           System.out.println(names);
    }
    
    
}
