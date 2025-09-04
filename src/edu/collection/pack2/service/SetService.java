package edu.collection.pack2.service;

import java.util.HashSet;
import java.util.Set;

public class SetService {
    // Set : 집합, 주머니
    // - 기본적으로 순서를 유지하지 않음
    //  (index 없음! -> get() 메서드가 존재하지 않음)

    // - 중복데이터 저장 불가(같은 데이터가 들어오면 덮어쓰기 됨)
    // 띄어쓰기나 공백도 모두 데이터로 칭함

    // set 객체 생성
    // 1. HashSet(대표) : 처리 속도가 빠른 Set

    // 2. LinkedHashSet : 순서를 유지하는 Set

    // 3. TreeSet : 자동 정렬되는 Set

    public void method1(){
        // List ArrayList와 동일하고, List에서 Set으로 변경된 것일
        Set<String> set = new HashSet<>();

        // 1. boolean add(E e) : 값을 넣고 true false 형태를 지니는 기능
        set.add("카카오");
        set.add("네이버");
        set.add("라인");
        set.add("당근");

        // 2. 모두 조회 출력 .toString을 생략하고, 변수이름만 작성가능 OK!
        System.out.println("set 공간에 들어간 데이터들의 순서 확인하기 : " + set);
        // set 공간에 들어간 데이터들의 순서 확인하기 : [카카오, 네이버, 당근, 라인]
        // 순서대로 저장 안됨

        set.add("배달의민족");
        set.add("배달의민족");
        set.add("배달의민족");
        set.add("배달의민족");
        set.add(" 배달의민족");
        set.add("배 달의민족");
        set.add("배달 의민족");
        set.add("배달의 민족");
        set.add("배달의민 족");
        set.add("배달의민족 ");
        System.out.println("set 공간에 들어간 데이터들의 중복 확인 : " + set);

        // 2. size() 개수 확인하기
        System.out.println("set의 개수" + set.size());
        // 중복된 배달의민족은 모두 덮어쓰기
        // 띄어쓰기로 공백을 준 배달의민족들은
        // 모두 다른 데이터로 판단하여 추가됨

        // null은 데이터가 존재하지 않을 표기
        // null 또한 데이터로 판단하기 때문에 1회 들어감
        // null 2개이상은 존재하지 않음

    }
}
