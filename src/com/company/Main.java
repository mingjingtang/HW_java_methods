package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// test function
        System.out.println(maxOfTwoNumbers(100,2));
        System.out.println(maxOfThree(1,5,10));
        System.out.println(isCharacterAVowel('g'));
        System.out.println(numArg("a","abc","d","you"));
        System.out.println(reverseString("jag testar"));
        String[] str = {"a","you","there"};
        System.out.println(findLongestWord(str));
        System.out.println(filterLongWords(str, 1));

    }
    //max of two numbers
    public static int maxOfTwoNumbers(int a, int b){
        if(a >= b){
            return a;
        }
        else{
            return b;
        }
    }

    //max of three numbers
    public static int maxOfThree(int a, int b, int c){
        return Math.max(Math.max(a,b),c);
    }

    //character is vowel or not
    public static boolean isCharacterAVowel(char a){
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
            return true;
        }
        else{
            return false;
        }
    }

    //count number of arguments
    public static int numArg(String... vars){
        int sum = 0;
        for(int i = 0; i < vars.length; i++){
            sum++;
        }
        return sum;
    }

    //reverse the input string
    public static String reverseString(String a){
        String result = "";
        for(int i = a.length()-1; i >= 0; i--){
            result += a.charAt(i);
        }
        return result;
    }

    //find the longest word
    public static int findLongestWord(String[] args){
        int longest = 0;
        for(int i = 0; i < args.length; i++){
            if(args[i].length() >= longest){
                longest = args[i].length();
            }
            else{
                continue;
            }
        }
        return longest;
    }

    //filter the word who are longer than i
    public static ArrayList<String> filterLongWords(String[] args, int a){
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < args.length; i++){
            if(args[i].length() > a){
                result.add(args[i]);
            }
            else{
                continue;
            }
        }
//        String[] array = result.toArray(new String[result.size()]);
        return result;
    }
}
