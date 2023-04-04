/*
Suggestions.java

Violeta Solorio

The program takes a guideline key an returns an array containing the revelant suggestions. 
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
 public class Suggestions {
     public static List<String> suggestions(String key) {
         ArrayList<String>suggestions = new ArrayList<String>();
         switch(key){
             case "you_guys":
             suggestions.add("you");
             suggestions.add("you all");
             suggestions.add("y'all");
                break;
             case "man_hours":
             suggestions.add("person hours");
             suggestions.add("engineer hours");
                break;
             case "grandfathered":
             suggestions.add("legacy status");
                break;
             case "dummy_value":
             suggestions.add("placeholder value");
             suggestions.add("sample value");
                break;
             case "sanity_check":
             suggestions.add("quick check");
             suggestions.add("confidence check");
             suggestions.add("coherence check");
                break;
             default: break;
         }
     return suggestions;
     }
 }
