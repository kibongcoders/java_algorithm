package com.kibong.chapterOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//로그 파일 재정렬
public class ReorderDataInLogFiles {

    /**
     * 문제
     *
     * 로그를 재정렬하라. 기준은 다음과 같다.
     * 1. 로그의 가장 앞부분은 식별자로서, 순서에 영향을 끼치지 않는다.
     * 2. 문자로 구성된 로그가 숫자 로그보다 앞에 오며, 문자 로그는 사전순으로 한다.
     * 3. 문자가 동일할 경우에는 식별자순으로 한다.
     * 4. 숫자 로그는 입력 순서대로 한다.
     **/

    public ArrayList<String> solution(ArrayList<String> testArray){

        ArrayList<String> digitArray = new ArrayList<>();
        ArrayList<String> letterArray = new ArrayList<>();

        for (String test : testArray) {
            String[] testSplit = test.split(" ");
            if(Character.isDigit(testSplit[1].charAt(0))){
                digitArray.add(test);
            }else{
                letterArray.add(test);
            }
        }

        /**
         * sort에서 2개를 비교해
         * -1 뒤에 것이 큼, 0 같음, 1 뒤에 것이 작음
         * 그래서 -1이면 순서를 바꾸고 0, -1이면 순서를 바꾸지 않는다.
        **/
        letterArray.sort((String s1, String s2) -> {
            String[] split1 = s1.split(" ", 2);
            String[] split2 = s2.split(" ", 2);

            int compareTo = split1[1].compareTo(split2[1]);

            if (compareTo == 0) {
                return split1[0].compareTo(split2[0]);
            } else {
                return compareTo;
            }
        });

        letterArray.addAll(digitArray);

        return letterArray;
    }

    public static void main(String[] args){

        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("id1 8 1 5 1", "id2 art can", "id3 3 6", "id4 own kit dig", "id5 art zero"));

        ReorderDataInLogFiles reorderDataInLogFiles = new ReorderDataInLogFiles();
        ArrayList<String> solution = reorderDataInLogFiles.solution(stringList);

        System.out.println(Arrays.toString(solution.toArray(new String[0])));
    }
}
