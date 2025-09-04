package edu.collection.pack3.service;

import java.util.HashMap;
import java.util.Map;

public class MapService {
    // Map : 특정 키워드(Key)를 입력하면
    // 해당되는 상세한 값(Value)을 얻을 수 있는 컬렉션 객체
    /**
     * K:V 형식으로 구성
     * K:V 한 쌍을 Entry라고 부름
     *
     * Key : 키워드 역할(== 변수이름 해당)
     *
     * 1) 중복 불가
     *      -> 중복되는 Key 입력시 Value를 덮어쓰기됨
     *
     * 2) 순서 유지 안됨
     *
     * Key 만 묶어서 보면 Set과 같은 특징을 지니고 있음
     * Map.keySet() / Map.EntrySet() 제공 하여 키 내에 작성된 데이터를 수정할 수 있음
     *
     * Value : 키워드에 해당하는 상세한 데이터
     * - Key로 인해서 모든 Value가 구분됨
     *      -> Map.get(Key) / Map.remove(Key) 형태로 사용
     */

    public void method1(){

        // HashMap 생성
        // map1의 데이터는 숫자, 문자열 형태로 이루어진 데이터들
        Map<Integer, String> map1 = new HashMap<>();

        // V put(K k, V v) : Map에 데이터를 추가하는 기능
        // - Map에 추가 시
        //      중복되는 Key가 없으면 null
        //      중복되는 Key가 있으면 이전 Value 반환됨
        //          인덱스 아님 순서없음 9번부터 작성해도 됨 번호 이어서 작성 안해도됨
        // 개발자가 필요로하는 공간의 명칭
        // 에그마요라는 데이터를 가져오기 위해서 1이라는 숫자를 이용하는 것일 뿐
        // 1의 위치는 알 수 없음
        System.out.println(map1.put(1,"에그마요")); // 데이터가 저장되도 된다는 null이 출력될 것
        System.out.println(map1.put(2,"로티세리바베큐")); // null : 비어있으니 데이터를 저장해도 됩니다.
        System.out.println(map1.put(3,"스테이크앤치즈"));
        // map에서 put으로 null이 나오는 건 데이터가 없다는 의미
        // 3이라는 키 명칭에 들어있는 데이터가 없습니다. (데이터 들어오는 것을 환영합니다.)
        System.out.println(map1.put(3,"스파이시쉬림프")); // key 3이 중복

        System.out.println(map1); // .toString() 생략한 상태로 출력 가능
        // map은 json처럼 중괄호 형태 {1=에그마요, 2=로티세리바베큐, 3=스파이시쉬림프}
        // list 배열은 대괄호 형태로 출력됨 [] 배열 모양

        // 2. V get(K k) : Key에 해당되는 Value 반환
        //                              일치하는 Key가 없으면 null 반환
        System.out.println("-".repeat(20));
        System.out.println(map1.get(1)); // 에그마요
        System.out.println(map1.get(0)); // null의 데이터를 반환

        String tmap1 = map1.get(2); // map1.get(2)를 직접적으로 데이터를 확인하는 것이 아니라
        System.out.println(tmap1); // tmap1이라는 공간에 담은 후 담겨있는 데이터를 확인

        // 3. int size() : Map에 저장된 Entry(K:V)의 개수
        System.out.println("size : " + map1.size());

        // 4. V remove(K k) :
        // - Key가 일치하는 Entry를 제거
        // - 일치하는 Key가 있다면 Value, 없다면 null 반환
        System.out.println("=".repeat(20));
        System.out.println("remove(2) : " + map1.remove(2));
        System.out.println("remove(5) : " + map1.remove(5));
        System.out.println(map1);

        // 5. void clear() : 모든 Entry 삭제
        // 6. boolean isEmpty() : 비어있는지 확인

        System.out.println("clear() 전 isEmpty() : " + map1.isEmpty()); // false : 데이터 들어있음

        map1.clear();

        System.out.println("clear() 후 isEmpty() : " + map1.isEmpty()); // true : 데이터 존재하지 않음
    }

    /**
     * Map에서 for문 대신 순차적으로 데이터를 출력하는 방법
     * 1) Map.keyset()
     *
     * 2) Entry.getKey() : key만 얻어오기
     *    Entry.getValue() : value만 얻어오기
     */
    public void method2(){
        Map<String, String> map2 = new HashMap<>();

        map2.put("학원", "서울시 종로구");
        map2.put("집", "서울시 중구");
        map2.put("롯데타워", "서울시 송파구");
        map2.put("63빌딩", "서울시 영등포구");

        /*
        1번의 경우 key의 개수만큼 get 메서드를 지속적으로 호출
                  key 1번이어도 개수만큼 get을 모두다 가져옴

        2번이 실무적으로 유용
        2번의 경우 map1.entrySet()으로 key-value를 하나씩 하나씩 바로 접근
        2번이 성능상 더 효율적
         */

        // 1번 방법
        // 향상된 for 문 + Set
        for(String key : map2.keySet()){
            System.out.printf("%-10s : %s \n", key, map2.get(key));
        }

        // 2번 방법
        // 향상된 for 문 + EntrySet
        // Map이라는 클래스 내부에 Entry라는 기능을 이용해서 key와 value를 확인하기 위한 기능
        //
        //
        // 향상된 for문은 항상 끝나기전 ) 소괄호 앞에 존재하는 명칭이 기준!!!!
        // 1. map1이 어디서 선언되었고, map2이라는 명칭의 공간이 생성되었는지 확인
        // 2. Map<Integer, String> map2 = new HashMap<>(); 선언된 map2의 자룧ㅇ을 확인
        // 문자열 문자열이기 때문에
        //      ↓ 아래 들어가는 자료형 또한 Map<String, String>과 동일하게 작성해야함
        //      ↓ map2에 존재하는 데이터들을 하나씩 하나씩 꺼내서 확인할 것이기 때문
        for(Map.Entry<String, String> entry : map2.entrySet()){
            System.out.printf("%-10s : %s \n", entry.getKey(), entry.getValue());
        }

    }

}
