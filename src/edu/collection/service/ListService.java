package edu.collection.service;

import java.util.ArrayList;
import java.util.List;

// service.ListService 폴더와 클래스 한 번에 만들기
public class ListService {
    // List : 자료를 순차적으로 나열한 자료 구조(배열 비슷)
    // - 인덱스가 존재함
    // -> 인덱스로 순서가 구분되기 때문에 중복 데이터 저장 가능
    // 인덱스란? 0번부터 순차적으로 변수명칭이나 데이터들에 자리번호를 생성하는 것
    // for 문 작성할 때 사용하는 i = index의 약자로 많이 사용됨

    /**
     * List 사용해보기 -> Array 보다 편리함
     */
    public void method1(){
        // List 객체 생성
        // - List(인터페이스) : 특정 기능을 기준으로 만들어진 클래스 파일을 이용할 예정
        //                -> 인터페이스 이기 때문에 객체 생성 불가 -> 다형성 이용해서 사용
        // - ArrayList(클래스 문서가 존재) List의 후손 클래스

        List list = new ArrayList(); // ArrayList는 고무줄처럼 공간이 늘었다 줄었다 하기 때문에
        // 처음부터 몇 칸인지 설정을 안해줘도 됨

        list.add(1);
        list.add("아무거나 작성합니다.");
        System.out.println("list : " + list);
    }
}
