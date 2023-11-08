package com.kibong.chapterOne;

public class Palindrome {

    public static void main(String[] args) {
        String test = "Do geese see God?";

        int start = 0;
        int end = test.length()-1;

        boolean isPalindrome = true;

        while (start < end) {
            if(!Character.isLetterOrDigit(test.charAt(start))){
                start++;
            }else if(!Character.isLetterOrDigit(test.charAt(end))){
                end--;
            }else{
                if(Character.toLowerCase(test.charAt(start)) != Character.toLowerCase(test.charAt(end))){
                    isPalindrome = false;
                    break;
                }else{
                    start++;
                    end--;
                }
            }
        }

        System.out.println("answer = " + isPalindrome);
    }
}
