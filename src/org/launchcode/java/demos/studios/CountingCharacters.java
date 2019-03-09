package org.launchcode.java.demos.studios;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.*;

public class CountingCharacters {
    public static void main(String[] args){
        String message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.\n";

        //convert string of chars into an array of characters
        char[] charsInMessage = message.toCharArray();
        //populate the characters and their occurances into a Hashmap
        HashMap<Character, Integer> characters = new HashMap<>();

        /*Here we loop through every character in charsInMessage once (20). (21) Integer count will get the total amount of times charsInMessage[i]
         (the character we are check for) has been added into the characters Hashmap. We will then check to see if the characters Hashmap has the
         character we are looking for. If so, we add it it on line 23. If not we put the character and the number of times it occurs in the
         characters Hashmap plus one, to increment it.*/
        for (int i = 0; i < charsInMessage.length; i++){
            Integer count = characters.get(charsInMessage[i]);
            if (!characters.containsKey(charsInMessage[i])){
                characters.put(charsInMessage[i], 1);
            } else {
                characters.put(charsInMessage[i], count + 1);
            }

        }

        for (HashMap.Entry<Character, Integer> chars : characters.entrySet()){
            System.out.println(chars.getKey() + " : " + chars.getValue());
        }
    }
}
