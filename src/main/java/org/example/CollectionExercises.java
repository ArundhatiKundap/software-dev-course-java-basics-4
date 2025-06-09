package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExercises {
    public String[] makeFruitStringArray() {
        // EXAMPLE:
        // Create and return an array of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        String[] fruits = new String[5];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        fruits[3] = "date";
        fruits[4] = "elderberry";

        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        // Create and return an array of strings with the given size (from the parameter)
        // Use a loop to set every element to "apple"
        // Replace the line below with your implementation
        String[] fruitsArray = new String[size];
        for(int i=0; i<size; i++){
            fruitsArray[i] = "apple";
        }
        return fruitsArray;
    }

    public String[] makeTopThreeArray(String[] fruits) {
        // Handle if input array has less than 3 elements
        int size = Math.min(fruits.length, 3);
        String[] topThreeArray = new String[size];
        for (int i = 0; i < size; i++) {
            topThreeArray[i] = fruits[i];
        }
        return topThreeArray;
    }

    public ArrayList<String> makeFruitList() {
        // Create and return an ArrayList of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        ArrayList<String>  fruitCuster = new ArrayList<>();

        fruitCuster.add("apple");
        fruitCuster.add("banana");
        fruitCuster.add("cherry");
        fruitCuster.add("date");
        fruitCuster.add("elderberry");
        return fruitCuster;

    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Create and return an ArrayList of strings with the given values
        // Replace the line below with your implementation
        ArrayList<String> favFruits = new ArrayList<>();
        favFruits.add(fruit1);
        favFruits.add(fruit2);
        favFruits.add(fruit3);
        return favFruits;
    }

    public HashMap<String, String> makeFruitMap() {
        // Create and return a HashMap with the following key-value pairs:
        // "apple" -> "red", "banana" -> "yellow", "cherry" -> "red", "date" -> "brown", "elderberry" -> "black"
        // Replace the line below with your implementation
        HashMap<String ,String> fruitMap = new HashMap<String ,String>();
        fruitMap.put("apple","red");
        fruitMap.put("banana","yellow");
        fruitMap.put("cherry","red");
        fruitMap.put("date","brown");
        fruitMap.put("elderberry","black");
        return fruitMap;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        // Return the value associated with the key "apple" in the given map, using the get method
        // Replace the line below with your implementationSystem
       return fruitMap.get("apple");
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Create and return a HashSet of strings with the given values
        // Replace the line below with your implementation
        HashSet<String> fruitSet = new HashSet<>();
        fruitSet.add(fruit1);
        fruitSet.add(fruit2);
        fruitSet.add(fruit3);
        return fruitSet;


    }
}
