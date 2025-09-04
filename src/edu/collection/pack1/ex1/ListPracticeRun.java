package edu.collection.pack1.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeRun {
    // model, service, run으로 나누지 않고 한번에 실습
    // 메인메서드에서 모든 동작을 진행할 예정
    // 왜냐하면 List - ArrayList를 단순히 익히기 위한 실습이기 때문에 한 번에 작성
    public static void main(String[] args) {
        problem1(); // function javascript처럼 실행 가능
        problem2(); // function javascript처럼 실행 가능
        problem3(); // function javascript처럼 실행 가능
        problem4(); // function javascript처럼 실행 가능
        problem5(); // function javascript처럼 실행 가능
    }
    // void 앞에 static이 붙는다는 것은.. 변수이름에 의하여 호출되지 않고
    // 기능들 단독적으로 호출할 수 있도록 사용한다는 의미



    public static void problem1() {
        // 1. String 타입의 ArrayList를 생성하세요
        // 2. 본인의 취미 3개를 추가하세요 (예: "게임", "독서", "요리")
        // 3. 리스트의 크기를 출력하세요
        // 4. 모든 취미를 출력하세요 (반복문 사용)
        List<String> list1 = new ArrayList<String>();
        list1.add("게임");
        list1.add("독서");
        list1.add("요리");
        System.out.println(list1.size());
        System.out.println(list1);
    }

    public static void problem2() {
        // 1. Integer 타입의 ArrayList를 생성하세요
        // 2. 시험 점수 5개를 추가하세요 (85, 90, 78, 92, 88)
        // 3. 3번째 점수(인덱스 2)를 95로 수정하세요
        // 4. 수정 후 모든 점수를 출력하세요
        // 5. 가장 첫 번째 점수를 제거하고, 제거된 점수를 출력하세요
        List<Integer> list2 = new ArrayList<>();
        list2.add(85);
        list2.add(90);
        list2.add(78);
        list2.add(92);
        list2.add(88);
        list2.set(2, 95);
        System.out.println(list2);
        int a = list2.remove(0);
        System.out.println(a);
    }

    public static void problem3() {
        // 1. 음식 메뉴 리스트를 만들고 다음 메뉴를 추가하세요
        //    "김치찌개", "된장찌개", "불고기", "비빔밥", "냉면"
        // 2. "불고기"가 몇 번째 인덱스에 있는지 출력하세요
        // 3. "라면"이 메뉴에 있는지 확인하세요 (true/false 출력)
        // 4. "김치찌개"가 메뉴에 있는지 확인하세요
        // 5. 마지막 메뉴("냉면")를 제거하고 결과를 출력하세요
        List<String> list3 = new ArrayList<>();
        list3.add("김치찌개");
        list3.add("된장찌개");
        list3.add("불고기");
        list3.add("비빔밥");
        list3.add("냉면");
        System.out.println(list3.indexOf("불고기"));
        System.out.println(list3.contains("라면"));
        System.out.println(list3.contains("김치찌개"));
        list3.remove(4);
        System.out.println(list3);

    }

    public static void problem4() {
        // 1. 쇼핑 카트 리스트를 만드세요
        // 2. "사과", "바나나", "우유" 를 추가하세요
        // 3. 장바구니에 총 몇 개 상품이 있는지 출력하세요
        // 4. 2번째 상품을 "오렌지"로 바꾸세요
        // 5. 모든 상품을 "상품: 사과", "상품: 오렌지" 형태로 출력하세요

        List<String> list4 = new ArrayList<>();
        list4.add("사과");
        list4.add("바나나");
        list4.add("우유");
        System.out.println(list4.size());
        list4.set(1, "오렌지");
        for(int i = 0; i < list4.size(); i++){
            System.out.println("상품 : " + list4.get(i));
        }

    }

    public static void problem5() {
        // 1. 숫자 리스트를 만들고 [1, 3, 5, 7, 9, 2, 4, 6, 8, 10] 을 추가하세요
        // 2. 짝수만 찾아서 출력하세요 (힌트: 숫자 % 2 == 0)
        // 3. 5보다 큰 숫자의 개수를 세어보세요
        // 4. 가장 큰 숫자를 찾아서 출력하세요
        System.out.println("5번문제");
        List<Integer> list5 = new ArrayList<>();
        list5.add(1);
        list5.add(3);
        list5.add(5);
        list5.add(7);
        list5.add(9);
        list5.add(2);
        list5.add(4);
        list5.add(6);
        list5.add(8);
        list5.add(10);
        for(int i = 0; i < list5.size(); i++){
            if(list5.get(i) % 2 ==0){
                System.out.println(list5.get(i));
            }
        }

        List<Integer> list6 = new ArrayList<>();
        for(int i = 0; i < list5.size(); i++){
            if(list5.get(i) > 5 ){
                list6.add(list5.get(i));
            }
        }
        System.out.println("5보다 큰 숫자 개수 : " + list6.size());

        int max = 0;
        for(int i = 0; i < list5.size(); i++ ){
            if(list5.get(i) > max){
                max = list5.get(i);
            }
        }
        System.out.println(max);
    }




}
