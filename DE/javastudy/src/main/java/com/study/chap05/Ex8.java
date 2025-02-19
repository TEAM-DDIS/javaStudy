package com.study.chap05;

/* 5-8. 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서
 *      개수만큼 '*'을 찍어서 그래프를 그리는 프로그램*/
public class Ex8 {
    public static void main(String[] args) {
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4];

        for (int i = 0; i < answer.length; i++) {
            counter[answer[i]-1] += 1;
        }

        for (int i = 0; i < counter.length; i++) {
            System.out.print(counter[i] + "*".repeat(counter[i]));
            System.out.println();
        }
    }
}

// 3***
// 2**
// 2**
// 4****