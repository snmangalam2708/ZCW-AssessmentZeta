package com.zipcodewilmington.assessment1.part1;


/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        return (str.substring(0,1).toUpperCase() + str.substring(1));
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        String r = "";
        for (int i=str.length()-1; i>=0; i--) {

            r += str.charAt(i);
        }
                return r;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        String r = "";
        for (int i=str.length()-1; i>=0; i--) {

            r += str.charAt(i);
        }

        return (r.substring(0,1).toUpperCase() + r.substring(1));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        return str.substring(1,str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        char[] array = str.toCharArray();

        for(int i=0; i < array.length; i++){

            if( Character.isUpperCase(array[i]) ){

                array[i] = Character.toLowerCase( array[i] );

            }

            else if(Character.isLowerCase(array[i]) ){

                array[i] = Character.toUpperCase( array[i] );
            }

        }

        str = new String(array);
        return str;
    }
}
