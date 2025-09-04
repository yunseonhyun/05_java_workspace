package edu.collection.pack1.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManageRun {
    public static void main(String[] args) {
// TODO: 여기서 employeeManage() 메서드를 호출해보세요
        employeeManage();
    }
    /**
     * 🏢 회사 직원 관리 시스템 만들기 🏢
     *
     * 요구사항:
     * 1. 직원 이름을 저장할 리스트와 급여를 저장할 리스트 2개 만들기
     * 2. while문을 사용해서 계속 관리 기능 제공
     * 3. 각 기능별로 적절한 메시지 출력하기
     *
     * 메뉴 기능:
     * 1번 - 직원 등록 (이름과 급여를 입력받아서 각각의 리스트에 추가)
     * 2번 - 전체 직원 조회 (번호. 이름 - 급여만원 형태로 출력)
     * 3번 - 급여 수정 (직원 이름 입력받아서 해당 직원의 급여 변경)
     * 4번 - 직원 퇴사 (직원 이름 입력받아서 이름과 급여 모두 삭제)
     * 5번 - 급여 통계 (평균 급여, 최고 급여, 최저 급여 출력)
     * 0번 - 시스템 종료
     */
    public static void employeeManage() {
        // TODO: 1단계 - 직원 이름 리스트와 급여 리스트 만들기
        List<String> nameList = new ArrayList<>();
        List<Integer> salaryList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int menu = 0;

        // TODO: 2단계 - while 반복문으로 메뉴 시스템 만들기
        while(true) {
            // 메뉴 출력
            System.out.println("\\n🏢===== 회사 직원 관리 시스템 =====🏢");
            System.out.println("1️⃣ 직원 등록");
            System.out.println("2️⃣ 전체 직원 조회");
            System.out.println("3️⃣ 급여 수정");
            System.out.println("4️⃣ 직원 퇴사");
            System.out.println("5️⃣ 급여 통계");
            System.out.println("0️⃣ 시스템 종료");
            System.out.print("메뉴 선택 ➤ ");

            menu = sc.nextInt();
            sc.nextLine(); // 개행문자 제거

            switch(menu) {
                case 1:
                    // TODO: 3단계 - 직원 등록 구현
                    System.out.println("\\n👨‍💼===== 직원 등록 =====👨‍💼");
                    System.out.print("직원 이름을 입력하세요: ");
                    String name = sc.nextLine();

                    System.out.print("급여를 입력하세요(만원 단위): ");
                    int salary = sc.nextInt();


                    // nameList에 이름 추가, salaryList에 급여 추가
                    // "○○ 직원이 등록되었습니다! (급여: ○만원)" 출력
                    nameList.add(name);
                    salaryList.add(salary);
                    System.out.println(name + " 직원이 등록되었습니다! (급여 : " + salary + "만원)");

                    break;

                case 2:
                    // TODO: 4단계 - 전체 직원 조회 구현
                    System.out.println("\\n📋===== 전체 직원 조회 =====📋");
                    // nameList가 비어있으면 "등록된 직원이 없습니다." 출력
                    // 비어있지 않으면 for문으로 "1. 김대리 - 350만원" 형태로 출력
                    // (인덱스는 같기 때문에 nameList.get(i), salaryList.get(i) 활용)

                    if(nameList.isEmpty()){
                        System.out.println("등록된 직원이 없습니다.");
                    } else {
                        for(int i = 0; i < nameList.size(); i++){
                            System.out.println(i + ". " +  nameList.get(i) + " - " +  salaryList.get(i) + "만원");
                        }
                    }


                    break;

                case 3:
                    // TODO: 5단계 - 급여 수정 구현
                    System.out.println("\\n💰===== 급여 수정 =====💰");
                    System.out.print("급여를 수정할 직원 이름을 입력하세요: ");
                    String modifyName = sc.nextLine();

                    // nameList에서 입력받은 이름의 인덱스 찾기 (indexOf 사용)
                    // 인덱스가 -1이면 "존재하지 않는 직원입니다." 출력
                    // 인덱스가 -1이 아니면:
                    //   - 현재 급여 출력 "○○ 직원의 현재 급여: ○만원"
                    //   - 새로운 급여 입력받기
                    //   - salaryList에서 해당 인덱스의 값을 새로운 급여로 수정 (set 사용)
                    //   - "급여가 수정되었습니다!" 출력
                    int a = nameList.indexOf(modifyName);
                    if(a == -1){
                        System.out.println("존재하지 않는 직원입니다");
                    } else {
                        System.out.println(modifyName + "직원의 현재 급여 : " + salaryList.get(a) + "만원");
                        System.out.print("새로운 급여를 입력하세요(만원 단위) : ");
                        int newSalary = sc.nextInt();
                        salaryList.set(a, newSalary);
                        System.out.println("급여가 수정되었습니다.");
                    }

                    break;

                case 4:
                    // TODO: 6단계 - 직원 퇴사 구현
                    System.out.println("\\n👋===== 직원 퇴사 =====👋");
                    System.out.print("퇴사할 직원 이름을 입력하세요: ");
                    String deleteName = sc.nextLine();

                    // nameList에서 입력받은 이름의 인덱스 찾기
                    // 인덱스가 -1이면 "존재하지 않는 직원입니다." 출력
                    // 인덱스가 -1이 아니면:
                    //   - nameList에서 해당 인덱스 제거 (remove 사용)
                    //   - salaryList에서도 같은 인덱스 제거
                    //   - "○○ 직원이 퇴사 처리되었습니다." 출력
                    int b = nameList.indexOf(deleteName);
                    if(b == -1){
                        System.out.println("존재하지 않는 직원입니다.");
                    } else{
                        nameList.remove(b);
                        salaryList.remove(b);
                        System.out.println(nameList.get(b) + "직원이 퇴사 처리되었습니다.");
                    }


                    break;

                case 5:
                    // TODO: 7단계 - 급여 통계 구현 (조금 어려워요!)
                    System.out.println("\\n📊===== 급여 통계 =====📊");
                    // salaryList가 비어있으면 "등록된 직원이 없습니다." 출력
                    // 비어있지 않으면:
                    //   - 평균 급여 계산: 전체 급여 합계 ÷ 직원 수
                    //   - 최고 급여 찾기: for문으로 가장 큰 값 찾기
                    //   - 최저 급여 찾기: for문으로 가장 작은 값 찾기
                    //   - 결과 출력: "평균 급여: ○만원, 최고 급여: ○만원, 최저 급여: ○만원"
                    //   - 추가: "총 직원 수: ○명" 출력
                    int sum = 0;
                    int max = salaryList.get(0);
                    int min = salaryList.get(0);
                    int average;
                    if(salaryList.isEmpty()){
                        System.out.println("등록된 직원이 없습니다.");
                    } else {
                        for(int i = 0; i < nameList.size(); i++){
                            sum = sum + salaryList.get(i);
                        }
                        for(int j = 0; j < nameList.size(); j++){
                            if(salaryList.get(j) > max){
                                max = salaryList.get(j);
                            }
                        }
                        for(int k = 0; k < salaryList.size(); k++){
                            if(salaryList.get(k) < min){
                                min = salaryList.get(k);
                            }
                        }
                        average = sum / salaryList.size();
                        System.out.println("평균 급여" + average + "만원, 최고 급여 : " + max + "만원 최저 급여 : " + min + "만원 총 직원수 : " +
                        salaryList.size());
                    }

                    break;

                case 0:
                    System.out.println("\\n🏢 직원 관리 시스템을 종료합니다. 🏢");
                    System.out.println("수고하셨습니다! 👋");
                    return; // 프로그램 종료

                default:
                    System.out.println("❗ 잘못된 번호입니다. 0~5번 중에서 선택해주세요!");
            }
        }
    }
}

