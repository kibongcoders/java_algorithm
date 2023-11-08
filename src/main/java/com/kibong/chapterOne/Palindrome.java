package com.kibong.chapterOne;

public class Palindrome {

    //주어진 문자열이 팬린드롬인지 확인하라, 대소문자를 구분하지 않으며, 영숫자만을 대상으로 한다.


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
