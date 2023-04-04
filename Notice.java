/*
Notice.java

Violeta Solorio

The program generates a notice alerting the user that a match has been found and suggests how they might improve their language
*/
class Notice {
 public static String notice(String key,Integer index,String match) {
     List<String> suggestedArray = Challenges.suggestions(key);
     //Converts integer index to string
     String stringIndex = Integer.toString(index);
     String notify = "<" + stringIndex + "> Consider replacing '"+match+ "' with ";
     // Finish adding key, and then add match string
     int count = 0;
     if(suggestedArray.size()> 1){
        for (int i = 0; i < suggestedArray.size(); i++) {
            notify += "'";
            notify += suggestedArray.get(i);
            notify += "'";
            // if it is the last element of the list, or is not added
            if(count < suggestedArray.size()-1){
                notify += " or ";
                count++;
            }
        }
     }else{
         notify += "'";
         notify += suggestedArray.get(0);
         notify += "'";
     }
     String link = " https://www.inclusive-styleguide.com/";
     String dashMatch = key.replace('_', '-');
     String reference = ". Reference"+ link + dashMatch + " for details.";
     notify += reference;
     return notify;
    }
}