package edu.oop.method.ex;

import java.util.Scanner;

/**
 * 도서관 회원 관리 기능 시스템 클래스
 */
public class LibraryService {
    // 필드 인스턴스 변수 속성
    Scanner sc = new Scanner(System.in);
    LibraryMember m1 = null; // -> m1 만 사용  추가 Array -> ArrayList 활용
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
                    int select = sc.nextInt();
                    // createMember() 메서드 호출하여 새 회원 생성
                    if(select <1 || select > 3){
                        System.out.println("잘못된 번호입니다. 1~3 중선택하세요.");
                        return;
                    } else if (select == 1) m1=createMember();
                    else if (select == 2)  m2=createMember();
                    else m3=createMember();
                    break;

                case 2: // 회원 정보 확인
                    System.out.println("회원 정보를 확인할 번호를 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    select = sc.nextInt();
                    // memberInform() 메서드 호출하여 회원 정보 출력
                    if(select <1 || select > 3){
                        System.out.println("잘못된 번호입니다. 1~3 중선택하세요.");
                        return;
                    } else if (select == 1) memberInform(m1);
                        //1개의 인수가 필요하지만 0이(가) 발견되었습니다.
                        // () 내부에 1개이상의 매개변수를 넣어야하는데 () 내부가 빈 공간이다. 기능 규칙에 맞춰서 넣어라
                    else if (select == 2)  memberInform(m2); // m2 에 값을 대입하는 것이 아니라 m2를 활용해서 정보 출력
                    else memberInform(m3);
                    break;
                case 3: // 회원 정보 수정
                    System.out.println("정보를 수정할 회원을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    // updateMemberInfo() 메서드 호출
                    select = sc.nextInt();
                    if(select <1 || select > 3){
                        System.out.println("잘못된 번호입니다. 1~3 중선택하세요.");
                        return;
                    } else if (select == 1) updateMemberInfo(m1);
                    else if (select == 2)  updateMemberInfo(m2);
                    else updateMemberInfo(m3);
                    break;

                case 4: // 도서 대출
                    System.out.println("도서를 대출할 회원을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    // borrowBooks() 메서드 호출
                    select = sc.nextInt();
                    if(select <1 || select > 3){
                        System.out.println("잘못된 번호입니다. 1~3 중선택하세요.");
                        return;
                    } else if (select == 1) borrowBooks(m1);
                    else if (select == 2)  borrowBooks(m2);
                    else borrowBooks(m3);
                    break;

                case 5: // 도서 반납
                    System.out.println("도서를 반납할 회원을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    // returnBooks() 메서드 호출
                    select = sc.nextInt();
                    if(select <1 || select > 3){
                        System.out.println("잘못된 번호입니다. 1~3 중선택하세요.");
                        return;
                    } else if (select == 1) returnBooks(m1);
                    else if (select == 2)  returnBooks(m2);
                    else returnBooks(m3);
                    break;

                case 6: // 도서관 입장/퇴장
                    System.out.println("1=입장 / 2=퇴장");
                    System.out.print("선택: ");
                    select = sc.nextInt();
                    if(select <1 || select > 2){
                        System.out.println("잘못된 번호입니다. 1~2 중선택하세요.");
                        return;
                    } else if (select == 1) enterLibrary();
                    else exitLibrary();
                    // enterLibrary() 또는 exitLibrary() 메서드 호출
                    break;

                case 7: // 도서관 통계 확인
                    System.out.println("=== 도서관 운영 통계 ===");
                    System.out.println("전체 회원 수 : " + LibraryMember.totalMemberCount + "명");
                    System.out.println("현재 방문자 수 : " + LibraryMember.currentVisitorCount + "명");
                    System.out.println("도서관 이름 : " + LibraryMember.LIBRARY_NAME);
                    System.out.println("도서관 운영시간 : " + LibraryMember.MAX_BORROW_BOOKS + "권");
                    System.out.println("최소 가입 연령 : " + LibraryMember.MIN_AGE_LIMIT + "세");

                    break;
            }
        }
    }

    /**
     * LibraryMember(String membershipId, String memberName, String phoneNumber, int age)
     * - member1: "LIB001", "김독서", "010-1111-2222", 25
     * - member2: "LIB002", "이책읽기", "010-3333-4444", 19
     * - member3: "LIB003", "박학습", "010-5555-6666", 22
     * @return 생성된 도서관 멤버정보를 각 멤버 위치에 전달
     */
    private LibraryMember createMember() {
        System.out.print("멤버십 정보 입력하세요 : ");
        String newId = sc.next();
        System.out.print("멤버 이름을 입력하세요 : ");
        String newName = sc.next();
        System.out.print("멤버 번호를 입력하세요 : ");
        String newPhoneNumber = sc.next();
        System.out.print("멤버 나이를 입력하세요 : ");
        int newAge = sc.nextInt();
        if (newAge <LibraryMember.MIN_AGE_LIMIT) {
            System.out.println(LibraryMember.MIN_AGE_LIMIT + "이하이므로 가입할 수 없습니다.");
            return null; // private 옆에 접근 제한자 와 기능명칭 사이가 void가 아닌데 돌려보내야 할 때
            // 사용하는 트릭
            // 반환의 값을 무조건 작성해야 하기 때문에 null 로 처리
        }
        LibraryMember.totalMemberCount++; //회원수 증가
        return new LibraryMember(   newId, newName, newPhoneNumber, newAge  );
    }

    private String memberInform(LibraryMember member) {
        // String.format()   = (static 메서드로 만들어짐) 정해진 형식에 원하는 값들을 끼워 넣어 새로운 문자열을 만드는 메서드
        // String.toString() = (일반    메서드로 만들어짐) 객체가 가진 데이터를 문자열로 파악하기 위해 만들어짐
        // 위와같은 자바 개발자가 만든 기능을 활용하지 않고 출력 가능
        // member.getMembershipId() + "/" +member.getMemberName() + "/"+ member.getPhoneNumber()
        // String + int -> 문자열에 숫자 이어붙여 문자열 처리됨
        return member.getMembershipId() + "/" +member.getMemberName() + "/"+ member.getPhoneNumber() + "/" + member.getAge();
    }

    private void updateMemberInfo(LibraryMember member) {

        System.out.print("개명한 회원의 이름을 입력하세요 : ");
        String newName =  sc.next();

        // 멤버 이름을 새로운이름으로 변경
        member.setMemberName(newName);
        System.out.println("회원의 정보가 수정되었습니다.");
    }

    /**
     * 원하는 권수만큼 책 대출
     * 대출의 최대는 10
     */
    private void borrowBooks(LibraryMember member) {
        System.out.print("대출할 책 권 수를 입력하세요 : ");
        int bookCount = sc.nextInt();

        int result = member.getBorrowedBooks() + bookCount;

        if(result > LibraryMember.MAX_BORROW_BOOKS){
            System.out.println("최대 " + LibraryMember.MAX_BORROW_BOOKS + "권 만 대출 가능합니다.");
        } else {
            member.setBorrowedBooks(result);
            System.out.println(bookCount + "권 대출 완료. 총 대출 중인 도서 : " + member.getBorrowedBooks() + "권");
        }
    }

    /**
     *
     * @param member m1, m2, m3 가 들어올  위치
     */
    private void returnBooks(LibraryMember member) {
        System.out.print("반납할 권수를 입력하세요 : ");
        int bookCount = sc.nextInt();
        int result = member.getBorrowedBooks() - bookCount;
        if (result < 0) {
            System.out.println("반납할 도서가 존재하지 않습니다.");
        } else {
            System.out.println(bookCount + "권 반납 완료. 남은 대출 권수 : " + member.getBorrowedBooks());
        }
    }
/*
    static {
        totalMemberCount = 0;
        currentVisitorCount = 0;
        System.out.println("=== " + LIBRARY_NAME + " 시스템 초기화 완료 ===");
        System.out.println("운영시간: " + OPENING_HOURS);
    }
 */
    /**
     * 도서관 입장 기능
     */
    private void enterLibrary() {
        System.out.print("입장할 고객의 정보를 작성하세요 : ");
        String customerName = sc.next();
        LibraryMember.currentVisitorCount++;
        System.out.println(customerName + "님이 도서관에 입장하셨습니다.");
    }

    /**
     * 도서관 퇴장 기능
     */
    private void exitLibrary() {
        System.out.print("퇴장할 고객의 정보를 작성하세요 : ");
        String customerName = sc.next();
        LibraryMember.currentVisitorCount--;
        System.out.println( customerName + "님이 도서관에 퇴장하셨습니다.");
    }
}