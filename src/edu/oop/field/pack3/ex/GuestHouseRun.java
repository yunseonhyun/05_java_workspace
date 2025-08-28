package edu.oop.field.pack3.ex;

public class GuestHouseRun {
    public static void main(String[] args) {
        System.out.println("=== 게스트하우스 방문자 관리 시스템 ===");

        GuestHouse guest1 = new GuestHouse();
        GuestHouse guest2 = new GuestHouse();

        // 방문자 정보 설정
        guest1.setGuestName("김여행");
        guest1.setCheckInDate("2024-08-27");
        guest1.setRoomNumber(201);

        guest2.setGuestName("박배낭");
        guest2.setCheckInDate("2024-08-28");
        guest2.setRoomNumber(202);

        // static 변수 확인 (totalCount 최초 1회 실행이기 때문에 guest1이라고 작성해서 호출하는 대신
        // GuestHouse라는 클래스 이름으로 호출하는 것이 맞으므로
        // 자동완성에서 누락되는 것이 맞음)
        System.out.println("guest1이 보이는 총 방문자 수 : " + guest1.totalCount); // GuestHouse.totalCount
        System.out.println("guest2이 보이는 총 방문자 수 : " + guest2.totalCount); // GuestHouse.totalCount

        // 체크인 진행
        guest1.checkIn(); // 방문자 수 1 증가
        System.out.println("guest1이 보이는 총 방문자 수 : " + guest1.totalCount); // GuestHouse.totalCount
        // 27번째 줄에서 실행한 방문자 수는
        // 게스트 1번 사람만 보이는 방문자 수가 아니라 GuestHouse 클래스에서 자체적으로
        // 모든 게스트 하우스 사람들에게 제공하는 숫자이므로
        // 35 번째 줄에서 보이는 총 방문자 수는 guest1, guest2 모두 방문한 카운트가 보이는 것이 맞음
        guest2.checkIn(); // 방문자 수 1 증가
        System.out.println(("----- 체크인 후 방문자수 변화 ------"));
        System.out.println("guest1이 보이는 총 방문자 수 : " + guest1.totalCount); // GuestHouse.totalCount
        System.out.println("guest2이 보이는 총 방문자 수 : " + guest2.totalCount); // GuestHouse.totalCount

        // 올바른 Static 접근 방식
        System.out.println("guest2이 보이는 총 방문자 수 : " + GuestHouse.totalCount);

        System.out.println("=== 게스트 하우스 공통 정보 ==="); // 게스트 하우스 자체에서 제공
        System.out.println("게스트하우스명 : " + GuestHouse.GUESTHOUSE_NAME);
        System.out.println("WIFI 비밀번호 : " + GuestHouse.WIFI_PASSWORD);

        System.out.println("=== 게스트 하우스 운영 규정(static final) ===");
        System.out.println("체크인 시간 : " + GuestHouse.CHECK_IN_TIME);
        System.out.println("체크아웃 시간 : " + GuestHouse.CHECK_OUT_TIME);
        System.out.println("최대 숙박일수 : " + GuestHouse.MAX_STAY_DAYS + "일");
        System.out.println("최소 숙박일수 : " + GuestHouse.MIN_STAY_DAYS + "일");

        System.out.println("=== 방문자별 개별 정보 ===");
        guest1.guestInfo(); // 게스트 하우스가 공통으로 제공하는 것이 아닌 방문자 개별로 알아야하는 정보
        guest2.guestInfo(); // 게스트 하우스가 공통으로 제공하는 것이 아닌 방문자 개별로 알아야하는 정보
    }
}
