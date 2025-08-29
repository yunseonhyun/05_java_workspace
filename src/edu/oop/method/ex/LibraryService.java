package edu.oop.method.ex;

import java.util.Scanner;

/**
 * 도서관 회원 관리 기능 시스템 클래스
 */
public class LibraryService {
    // 필드 인스턴스 변수 속성
    Scanner sc = new Scanner(System.in);
    LibraryMember m1 = null; // -> m1만 사용 추가 Array -> ArrayList 활용
    LibraryMember m2 = null;
    LibraryMember m3 = null;



    public void displayMenu() {

        int input;

        while(true){
            System.out.println("""
=== 멤버 관리 프로그램 ===
1. 회원 등록
2. 회원 정보 확인
3. 회원 정보 수정
4. 도서 대출
5. 도서 반납
6. 도서관 입장/퇴장
7. HTML 역량 비교하기
0. 도서관 통계 확인
                """);

            System.out.print("메뉴 선택 : ");
            input = sc.nextInt();
            switch(input){
                case 1: // 회원 등록
                    System.out.println("회원을 등록할 슬롯을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    // createMember() 메서드 호출하여 새 회원 생성
                    int selected = sc.nextInt();
                    if (selected < 1 || selected > 3) {
                        System.out.println("잘못된 번호입니다. 1~3 중 선택하세요.");
                        return;
                    } else if (selected == 1) {
                        System.out.println("학생 등록을 시작하겠습니다.");
                        // 학생 등록을 위한 메서드 호출
                        m1 = createMember(); // return으로 가져올 아래 생성자 객체 대신 기능 명칭 작성

                    } else if (selected == 2) {
                        System.out.println("학생 등록을 시작하겠습니다.");
                        // 학생 등록을 위한 메서드 호출
                        m2 = createMember();
                    } else {
                        System.out.println("학생 등록을 시작하겠습니다.");
                        // 학생 등록을 위한 메서드 호출
                        m3 = createMember();
                    }
                    break;

                case 2: // 회원 정보 확인
                    System.out.println("회원 정보를 확인할 번호를 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    // createMember() 메서드 호출하여 새 회원 생성
                    selected = sc.nextInt();
                    if (selected < 1 || selected > 3) {
                        System.out.println("잘못된 번호입니다. 1~3 중 선택하세요.");
                        return;
                    } else if (selected == 1) {
                        memberInform(m1); //

                    } else if (selected == 2) {
                        memberInform(m2); // m2에 값을 대입하는 것이 아니라 m2를 활용해서 정보 출력
                    } else {
                        memberInform(m3);
                    }
                    break;
                    // memberInform() 메서드 호출하여 회원 정보 출력


                case 3: // 회원 정보 수정
                    System.out.println("정보를 수정할 회원을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    // updateMemberInfo() 메서드 호출
                    selected = sc.nextInt();
                    if (selected < 1 || selected > 3) {
                        System.out.println("잘못된 번호입니다. 1~3 중 선택하세요.");
                        return;
                    } else if (selected == 1) {
                        updateMemberInfo(m1); //

                    } else if (selected == 2) {
                        updateMemberInfo(m2); // m2에 값을 대입하는 것이 아니라 m2를 활용해서 정보 출력
                    } else {

                        updateMemberInfo(m3);
                    }
                    break;

                case 4: // 도서 대출
                    System.out.println("도서를 대출할 회원을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    // borrowBooks() 메서드 호출
                    selected = sc.nextInt();
                    if (selected < 1 || selected > 3) {
                        System.out.println("잘못된 번호입니다. 1~3 중 선택하세요.");
                        return;
                    } else if (selected == 1) {
                        borrowBooks(m1); //

                    } else if (selected == 2) {
                        borrowBooks(m2); // m2에 값을 대입하는 것이 아니라 m2를 활용해서 정보 출력
                    } else {

                        borrowBooks(m3);
                    }
                    break;

                case 5: // 도서 반납
                    System.out.println("도서를 반납할 회원을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    // returnBooks() 메서드 호출
                    selected = sc.nextInt();
                    if (selected < 1 || selected > 3) {
                        System.out.println("잘못된 번호입니다. 1~3 중 선택하세요.");
                        return;
                    } else if (selected == 1) {
                        returnBooks(m1); //

                    } else if (selected == 2) {
                        returnBooks(m2); // m2에 값을 대입하는 것이 아니라 m2를 활용해서 정보 출력
                    } else {

                        returnBooks(m3);
                    }
                    break;

                case 6: // 도서관 입장/퇴장
                    System.out.println("1=입장 / 2=퇴장");
                    System.out.print("선택: ");
                    // enterLibrary() 또는 exitLibrary() 메서드 호출
                    break;

                case 7: // 도서관 통계 확인
                    System.out.println("=== 도서관 운영 통계 ===");
                    // static 변수들과 상수들 출력
                    break;
            }
        }
    }


    /**
     *
     * @return 생성된 도서관 멤버를 각 멤버 위치에 전달
     */
    private LibraryMember createMember() {
        System.out.println("멤버쉽 정보 입력하세요 : ");
        String creatId = sc.next();
        System.out.println("멤버쉽 이름을 입력하세요 : ");
        String creatName = sc.next();
        System.out.println("멤버 번호 입력하세요 : ");
        String creatNumber = sc.next();
        System.out.println("멤버 나이 입력하세요 : ");
        int creatAge = sc.nextInt();

        return new LibraryMember(creatId, creatName, creatNumber, creatAge);



    }

    private String memberInform(LibraryMember member) {
        // String.format() = (static 메서드로 만들어짐) 정해진 형식에 원하는 값들을 끼워 넣어 새로운 문자열을 만드는 메서드
        // String.toString() = (일반 메서드로 만들어짐) 객체가 가진 데이터를 문자열로 파악하기 위해 만들어짐
        // 위와같은 자바 개발자가 만든 기능을 활용하지 않고 출력 가능
        // String + int -> 문자열에 숫자 이어붙여 문자열 처리됨
        return member.getMembershipId() + "/" + member.getMemberName() + "/" + member.getPhoneNumber() + "/" + member.getAge();
    }

    private void updateMemberInfo(LibraryMember member) {

        System.out.print("개명한 회원의 이름을 입력하세요 : ");
        String newname = sc.next();

        // 멤버 이름을 새로운 이름으로 변경
        member.setMemberName(newname);
        System.out.println("회원의 정보가 수정되었습니다.");
    }

    /**
     * 원하는 권수만큼 책을 대출
     * 대출의 최대는 10
     */
    private void borrowBooks(LibraryMember member) {
        System.out.println("대출할 책 권 수를 입력하세요 : ");
        int bookCount = sc.nextInt();

        int result = member.getBorrowedBooks() + bookCount;
        if(result > LibraryMember.MAX_BORROW_BOOKS){
            System.out.println("최대 " + LibraryMember.MAX_BORROW_BOOKS + "권만 대출 가능합니다.");
        } else {
            member.setBorrowedBooks(result);
            System.out.println(bookCount + "권 대출 완료. 총 대출 중인 도서 : " + member.getBorrowedBooks() + "권");
        }
    }

    private void returnBooks(LibraryMember member) {

        // 반납할 권수를 입력하세요. 입력 받음
        System.out.println("반납할 권 수를 입력하세요 : ");
        int returnCount = sc.nextInt();

        // result = borrowedBooks - bookCount
        int result = member.getBorrowedBooks() - returnCount;
        // result < 0 반납할 도서가 없습니다.
        if(result < 0){
            System.out.println("반납할 도서가 없습니다.");
        } else {
            member.setBorrowedBooks(result);
            System.out.println(returnCount + "권 반납 완료. 남은 대출 도서" + member.getBorrowedBooks());
        }


        // borrowedBooks = result;
        // 00권 반납 완료. 남은 대출 도서 borrowedBooks
    }
}