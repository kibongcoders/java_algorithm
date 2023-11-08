package com.kibong.chapterOne;

public class ReserveString {

    //문자열을 뒤집는 함수를 작성하라. 입력값은 문자 배열이며, 리턴 없이 입력 배열 내부를 직접 조작하라.

    public char[] solution(char[] answer){

        int start = 0;
        int end = answer.length - 1;

        while (start < end){

            char startChar = answer[start];
            char endChar = answer[end];

            answer[end] = startChar;
            answer[start] = endChar;

            start++;
            end--;
        }

        return answer;
    }

    public static void main(String[] args){

        char[] test = {'b', 'o', 'n', 'g'};

        ReserveString reserveString = new ReserveString();
        char[] solution = reserveString.solution(test);
        System.out.println(solution);
    }
}
