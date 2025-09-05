package edu.exception.pack1.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticeException1 {
    /**
     * 기능명칭 : method1()
     * 두 수를 입력 받아 나눈 몫 구하기
     * 정수 입력 1 :
     * 정수 입력 2 :
     *
     * System.out.println(정수 입력 1 / 정수 입력 2);
     * 에 대해 수행하고,
     * 정수 입력 2 : 를 0으로 입력했을 때 발생하는 예외를 catch 처리 한 후
     * System 출력문으로 0으로 숫자를 나눌 수 없습니다.
     *
     * 성공 실패 관계 없이 프로그램을 종료합니다. 띄우기
     */

    public void method1() {
        // 단축키 : 코드 블록을 드래그 한 후 ctrl + alt + t를 작성하면
        // if 부터 try-catch while 등 코드 블록에 대한 상황 설정을 할 수 있는
        // 블록들이 나옴
        Scanner sc = new Scanner(System.in);
            System.out.print("정수 입력 1 : ");
            int input1 = sc.nextInt();
            System.out.print("정수 입력 2 : ");
            int input2 = sc.nextInt();
        try {
            // 모든 코드를 작성하기 보다는 문제가 발생할 것 같은 구문만 무로 작성
            System.out.println("몫 : " + input1 / input2);
        } catch (ArithmeticException e) {
            System.out.println("a의 값 : " + input1);
            System.out.println("b의 값 : " + input2);
            System.out.println("0으로 숫자를 나눌 수 없습니다.");
            // 다른 방법을 시도하시겠습니까? +, * 와 같은 행동을 유도할 수 있음
        } finally{
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
