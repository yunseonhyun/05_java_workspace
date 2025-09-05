package edu.exception.pack1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx1 {
    /*
    Exception : 코드로 처리 가능한 에러
    (예외)

    Exception Handling : Exception 발생 시 처리하는 구문
    (예외처리)
     */
    /*
    예외를 발생시키는 코드
     */
    public void method1(){
        int[] arr = {10, 20, 30, 40};

        for(int i=0; i<=arr.length; i++){
            System.out.println(arr[i]);
        }

        // java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        // 프로그램 실행 중 위와 같이 예외 상황이 발생하는 경우
        // 예외 상황에 맞는 코드가 수행되며
        // 자바 개발자가 만들어놓은 예외 출력문을 던진 후 실행종료됨

        // 자바 개발자가 만든 폴더위치와 폴더 내 존재하는 파일
        //                      java.lang.ArrayIndexOutOfBoundsException
        //                  배열과 숫자 관련해서 문제가 발생하면 Index 4 out of bounds for length 숫자
        //                  로 어떤 상황인지 개발자한테 문제되는 내용을 전달할 수 잇도록 만들어놓음
    }


    /*
    예외 발생 구문을 try-catch로 처리 (예외 처리)

    - try{} : 문제가 발생하라 것 같은(가능성이 있는) 코드들을 시도하는 구문

    - catch(예외){} : try 구문 시도 중 예외가 발생되어 던져진 경우
                        catch(예외)에 작성된 예외와 던져진 예외가 같으면
                        잡아서 {} 내 구문을 수행
                        -> 발생된 예외를 잡아서 처리했기 때문에 프로그램이 멈추지 않고 정상 수행
     */
    public void method2(){

        int[] arr = {10, 20, 30, 40};
        try {
            // 문제가 발생할 것 같은 코드들을 넣음
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // try에서 작성한 코드들 중에
            // 개발자가 예상했을 때 배열에서 index 번호보다
            // 더 큰 자리값을 요구할 때 발생하는 문제가 생길 것 같으면
            // 위와 같은 문제를 catch(잡아내서)
            // catch (ArrayIndexOutOfBoundsException e){} 중괄호 내에서
            // 개발자가 생각한 문제가 발생했고, 그 문제가 어떻게 발생했는지에 대해 출력
            System.out.println("개발자가 예상한 문제가 발생 : " + e); //
        } catch (Exception e) {
            // Exception 문서는 모든 문제들의 조상님
            // 개발자가 생각하지 못한 문제를 잡아내고 문제에 대해 출력하는 공간
            System.out.println("개발자가 생각하지 못한 예외 상황 발생 : " + e);
        }

    }


    public void method3(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("숫자 스캐너에 문자를 작성한다면!");

            System.out.print("점수 입력 1 : ");
            int input1 = sc.nextInt();
            System.out.print("점수 입력 2 : ");
            int input2 = sc.nextInt();

            System.out.println("숫자1의 결과 : " + input1 + ", 숫자2의 결과 : " + input2);
        } catch (InputMismatchException e) {
            // input 안에 들어가야하는 자료형이 Mismatch 됨
            System.out.println("숫자만 입력하는 공간입니다.");
            System.out.println("다시 작성해주세요.");
        } catch (Exception e) {
            System.out.println("개발자가 예기치 못한 문제가 발생했습니다.");
        }
    }

        /*
    예외 발생 구문을 try-catch로 처리 (예외 처리)

    - try{} : 문제가 발생하라 것 같은(가능성이 있는) 코드들을 시도하는 구문

    - catch(예외){} : try 구문 시도 중 예외가 발생되어 던져진 경우
                        catch(예외)에 작성된 예외와 던져진 예외가 같으면
                        잡아서 {} 내 구문을 수행
                        -> 발생된 예외를 잡아서 처리했기 때문에 프로그램이 멈추지 않고 정상 수행
    - finally : 마지막에서 반드시 수행해야하는 구문
                try 구문에서 예외 발생과 여부와 관계 없이
                무조건 수행해야하는 구문을 작성

     */



    public void method4(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("숫자 스캐너에 문자를 작성한다면!");

            System.out.print("점수 입력 1 : ");
            int input1 = sc.nextInt();
            System.out.print("점수 입력 2 : ");
            int input2 = sc.nextInt();

            System.out.println("숫자1의 결과 : " + input1 + ", 숫자2의 결과 : " + input2);
        } catch (InputMismatchException e) {
            // input 안에 들어가야하는 자료형이 Mismatch 됨
            System.out.println("숫자만 입력하는 공간입니다.");
            System.out.println("다시 작성해주세요.");
        } catch (Exception e) {
            System.out.println("개발자가 예기치 못한 문제가 발생했습니다.");
            System.out.println("회사에 오류에 대한 보고서 보내기 YES/NO");
            // 필수로 작성하는 것은 아니며, 선택적으로 작성 가능
        } finally { // try 에서 작성한 코드 성공/실패 관계없이 마지막에 실행
            System.out.println("프로그램을 종료합니다.");

        }
    }


}
