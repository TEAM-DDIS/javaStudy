package com.study.chap09;

import java.io.File;

/* 9-3. 다음과 같은 실행결과가 나오도록 코드를 입력하시오. */
/* 실행결과
 * fullPath:c:\jdk1.8\work\PathSeparateTest.java
 * path:c:\jdk1.8\work
 * fileName:PathSeparateTest.java
* */
public class Ex3 {
    public static void main(String[] args) {
        String fullPath="c:\\jdk1.8\\work\\PathSeparateTest.java";
        String path="";
        String fileName="";

        File file = new File(fullPath);

        path = file.getParent();     //디렉토리 경로 가져오기
        fileName = file.getName();   //파일명 가져오기

        System.out.println("fullPath: " + fullPath);
        System.out.println("path: " + path);
        System.out.println("fileName: " + fileName);
    }
}
