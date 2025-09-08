package edu.io.pack2.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class 파일작성Service {

/*
Files.writeString() : Java 11부터 도입된 기능으로
                      간단히 문자열을 파일에 쓰는 방법

    파일을 작성할 때
    파일을 열고, 파일 내부에 글자를 작성한다 표기하고,
    try-catch를 이용해서 파일 생성하는데 문제가 없는지 확인하면서 진행
    영어, 숫자 이외 글자들 컴퓨터에서 글자깨짐없이 작성될 수 있도록
    인코딩하는 설정 또한 알아서 처리해주는 문서

자바 개발자들이 만든 class 문서 파일들
File : 가장 처음에 만들어진 파일에 관련된 기능들이 작성되어잇는 문서
        java.io

Files : Java 7부터 도입된 문서
        파일 및 디렉터리를 처리(생성, 복사, 이동, 쓰기, 읽기 등)을 더 편리하고
        문제없이 사용할 수 있도록 개선된 기능들을 모아놓은 File 업그레이드 버전
        /writeString() : java11에서 추가된 기능
        문자열을 파일에 작성하는 기능을 전담

Path : 주소 경로에 대한 정보를 기능적으로 작성해놓은 인터페이스

Paths : Path 기능들을 활용해서 만든 문서 파일
        -> 이 두가지를 사용하지 않아도 경로를 Files.getPath()와 같은 기능으로 파일의 경로를 가져올 수 있지만...
            경로에 대한 기능들만 중점적으로 작성해놓은 문서를 만들어놓은 이유는
            File 문서는 파일처리만 진행하자..
            Path 문서를 이용해서 경로에 해당하는건 이 문서를 통해서 이용하자
            역할에 따른 명확한 분리가 필요하다여겨 Paths가 생성된 것이지만
            Files.getPath()를 이용해도 큰 문제는 없다

            마치 Math.random()이 존재하고 Random.random() 존재하는 것과 같은 개념

            수학-랜덤기능                랜덤자체를 분리해서 사용

            Files                      .                  writeString    (Paths.get(filename), 파일내용);
            파일2버전문서를 활용해서 내부에 존재하는   문자열작성기능사용(문서가위치하는경로, 문서에 들어갈 내용);
 */

    public void method1(){
        String filename = "파일1.txt";
        String 파일내용 = "파일 1 내부에 글자를 작성할 것입니다.";

        try {
            // 파일들 문서를 이용해서 문자열로 글자를 작성

            Files.writeString(Paths.get(filename), 파일내용);
            System.out.println(filename + "파일 저장 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
