package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for(String i:array){
            if (i.equals(value)){
                return true;
            }
        } return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] newArray= new String[array.length];
        int index=0;
        int counter=array.length-1;
        while (counter>=0){
            newArray[index]=array[counter];
            index++;
            counter--;
        }
        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] newArray= new String[array.length];
        int index=0;
        int counter=array.length-1;
        while (counter>=0){
            newArray[index]=array[counter];
            index++;
            counter--;
        }
        counter=0;
        while(counter<array.length){
            if(!(newArray[counter].equals(array[counter]))){

                return false;
            }
            counter++;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        int arrayCount=0;
        int charCount=0;
        int found=0;
        int charValue = 'a';
        String temp;
        while(charValue<='z') {
            while (arrayCount < array.length) {
                temp=array[arrayCount].toLowerCase();
                while(charCount<temp.length()){

                if (temp.charAt(charCount)==charValue){found=1;}
                charCount++;
                }
                charCount=0;
                arrayCount++;
            }
            if (found==0){return false;}
            arrayCount = 0;
            found=0;
            charValue++;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurances=0;
        for(String i:array){
            if (i.equals(value)){
                occurances++;
            }
        }
        return occurances;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] newArray= new String[array.length-1];
        int currentIndex=0;
        for(String i:array){
            if (!(i.equals(valueToRemove))){
                newArray[currentIndex]=i;
                currentIndex++;
            }

        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        int counter=0;
        int newSize=array.length;
        /*two loops to iterate through the array; one to find the size of the new
        * modified array, and a second one to fill it.*/
        while (counter<array.length-1){
            if(array[counter].equals(array[counter+1])){
                newSize--;
                }
            counter++;
            }
        //resetting counter, initializing new array and index for it.
        counter = 0;
        String[] newArray= new String[newSize];
        newArray[newArray.length-1]=array[array.length-1];
        int newArrayIndex=0;
        while (counter<array.length-1){
            if(!(array[counter].equals(array[counter+1]))){
                newArray[newArrayIndex]=array[counter];
                newArrayIndex++;
            }
            counter++;
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> packedArray = new ArrayList<String>();
        //ArrayList<String> packedArray = new ArrayList<String>();
        int counter=0;
        int compare =1;
        String packed="";
        while (counter<array.length){
            packed=packed.concat(array[counter]);

            while(compare!=array.length&&(array[counter].equals(array[compare]))){

                packed=packed.concat(array[compare]);
                compare++;
            }
            packedArray.add(packed);
            packed="";
            counter=compare;
            compare++;
        }
        String newArray[]= new String[packedArray.size()];
        for(int i=0; i<=packedArray.size()-1;i++){
            newArray[i]=packedArray.get(i);
        }
        return newArray;

    }


}
