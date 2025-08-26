package edu.control.loop;

import java.util.Scanner;

/*
* 루프 기능 설정용 클래스
* */
public class LoopEx { // <html>과 같이 페이지 내 코드 시작을 나타내는 구문

    /*
    * 1부터 10까지 출력하기
    */
    public void method1() {
        /*
        * 초기식 최초 1회 변수이름의 데이터를 설정하는 구문
        * 조건식 최최 1회 변수이름의 데이터를 기반으로 참 / 거짓인지 판별하는 구문
        *       참일 경우 중괄호 내에 존재하는 코드 구문 수행
        *       거짓일 경우 중괄호 탈출
        * 증감식 중괄호 내에 존재하는 구문을 수행하고 조건식을 판별하기 전에
        *       변수이름의 데이터를 증가하거나 감소하는 구문
        * */
        //     초기식   조건식   증감식
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);

        }



    }

    /*
     * 첫 번째 입력 받은 수부터
     * 두 번째 입력 받은 수까지
     * 1씩 증가하며 출력하기
     * */
    public void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 2가지를 입력하세요 : ");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        for(int i = input1; i <= input2; i++) {
            System.out.println(i);
        }
    }


    /** 코드에 대한 설명 작성 사용하는 주석
    * 두 수를 입력받아 1씩 증가하며 반복 출력하기
     * - 입력 받은 두 수 중에서
     * 작은 값이 초기식, 큰 값이 조건식에 사용되게 작성
     * 같은 경우 초기식 a 변수이름 조건식 b 변수이름
    * */
    public void method3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 두가지를 입력하세요 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // a가 b와 같거나 b보다 작은 경우
        if(a <= b) {
            for(int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else { // b가 a보다 작을 경우
            for(int i = b; i <= a; i++) {
                System.out.println(i);
            }
        }
    }


    /**
     * 최대, 최솟값 구하기 (Math)
     * - Java API 활용한 방법
     *
     * Math.min(a, b) = 수를 비교하여 최솟값 찾는 기능
     * Math.max(a, b) = 수를 비교하여 최대값 찾는 기능
     *
     * 사용자들로부터 두 수를 입력받고,
     * 입력 받은 수 중에 작은 값과 큰 값을 반환
     * 최소값부터 최대값까지 for문을 이용하여 출력
     *
     * 변수이름 (int 최소  int 최대  int i)
     * method4() 완성하기
     *
     * */
    public void method4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("두수를 입력하세요");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        int 최소 = Math.min(input1, input2);
        int 최대 = Math.max(input1, input2);

        for(int i = 최소; i <= 최대; i++){
            System.out.println(i);
        }
    }

} // </html>과 같이 페이지 내 코드 종료를 나타내는 구문

/*
* 주의할 점
* html 코드는 오류 최소화를 기반으로 작성하는 코드이기 때문에
* html 코드를 벗어난 상태에서 태그를 작성하거나 텍스트를 작성하더라도
* 문제가 발생하지 않음
*
* 하지만 자바는 코드 규칙을 준수하는 언어이기 때문에
* public class 파일이름 {
*
* }
*
* 의 중괄호를 벗어난 상태로 코드를 작성하면 에러 발생
* 반드시 중괄호 내부에 코드를 작성할 것
* */
