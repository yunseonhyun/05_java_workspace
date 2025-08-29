package edu.oop.method.ex;



import javax.crypto.Mac;
import java.util.Scanner;

/**
 * 결혼정보회사 회원 관리 서비스 클래스
 */
public class MatchingService {
    // 변수를 선언할 때는 클래스 명칭 바로 아래에 작성
    MatchingMember m1 = new MatchingMember();
    Scanner sc = new Scanner(System.in);
    public void displayMenu() {
        int input;

        while (true) {
            System.out.println("\n=== 더조은 결혼정보회사 관리 시스템 ===");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 정보 확인");
            System.out.println("3. 회원 정보 수정");
            System.out.println("0. 프로그램 종료");
            System.out.println("=====================================");

            System.out.print("메뉴 선택: ");
            input = sc.nextInt();

            switch (input) {
                case 1: registerNewMember(); break;
                case 2: viewMemberInfo(); break;
                case 3: updateMemberDetails(); break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    // --- 기능 메서드 ---
    public void registerNewMember() {
        System.out.print("아이디를 작성하세요 : ");
        String newId = sc.nextLine();
        System.out.print("이름을 작성하세요 : ");
        String newName = sc.nextLine();
        System.out.print("나이를 작성하세요 : ");
        int newAge = sc.nextInt();
        System.out.print("성별을 작성하세요 : ");
        char newGender = sc.next().charAt(0);
        System.out.print("직업을 작성하세요 : ");
        String newJob = sc.next();


        if (checkAgeValid()) { // 가입이 완성되는 경우는 나이기준이 true 이면 가입 완성
            MatchingMember.totalMemberCount++;
            System.out.println(m1.getMemberName() + "님이 회원가입하셨습니다. (회원ID: " + m1.getMemberId() + ")");
        } else { // 나이기준에서 false가 되면 가입 불가
            System.out.println("가입 연령 기준(" + MatchingMember.MIN_AGE_LIMIT + "세 ~ " + MatchingMember.MAX_AGE_LIMIT + "세)에 맞지 않아 등록이 취소됩니다.");
        }
    }


    private void updateMemberDetails() {
        System.out.println("어떤 정보를 수정하시겠습니까?");
        System.out.print("1:이름 / 2:나이 / 3:직업 >>");
        int choice = sc.nextInt();
        sc.nextLine();
        switch(choice) {
            case 1:
                System.out.print("이름을 입력하세요 : ");
                String memberName = sc.nextLine();
                m1.setMemberName(memberName);
                System.out.println("이름이 성공적으로 변경되었습니다.");
                break;
            case 2:
                System.out.print("나이를 입력하세요 : ");
                int memberAge = sc.nextInt();
                m1.setAge(memberAge);
                System.out.println("나이가 성공적으로 변경되었습니다.");
                break;
            case 3:
                System.out.print("직업을 입력하세요 : ");
                String memberJob = sc.nextLine();
                m1.setJob(memberJob);
                System.out.println("직업이 성공적으로 변경되었습니다.");
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
        System.out.println("수정된 최종 정보");
        viewMemberInfo();
    }



    /**
     * 나이를 확인하는 기능
     * @return 회사에서 원하는 나이 범위가 아니면 가입 불가
     */
    public boolean checkAgeValid() {
        // this. MatchingMember에서는 private으로 가리키고 있는 필드 명칭
        // MatchingMember를 m1이라는 변수명칭으로 호출
        return m1.getAge() >= MatchingMember.MIN_AGE_LIMIT && m1.getAge() <= MatchingMember.MAX_AGE_LIMIT;
    }

    public void viewMemberInfo() {
        System.out.println("--- 회원 정보 ---");
        System.out.printf("ID: %s, 이름: %s, 나이: %d세, 성별: %c, 직업: %s, 매칭점수: %d점\n",
                m1.getMemberId(), m1.getMemberName(), m1.getAge(), m1.getGender(), m1.getJob(), m1.getMatchingScore());
    }
}
