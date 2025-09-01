package edu.inheritance.ex0;

public class 회사프로그램실행 {
    public static void main(String[] args){
        System.out.println("===== 더조은 직원 관리시스템 =====");

        // 직원 총 3명 대표제외
        개발자 dev1 = new 개발자("김개발", 1001, 4000000, "Java", "맥북");
        개발자 dev2 = new 개발자("이개발", 1002, 4000000, "Html", "윈도우");


        디자이너 des1 = new 디자이너("박디자인", 3001, 3000000, "design","Figma");

        매니저 mgr1 = new 매니저("최매니저", 2001, 5000000,"개발1팀", 8, 50000);
        // dev1의 직원 정보 출력
        dev1.info();
        dev1.work();
        dev1.codeReview();
        // dev2의 직원 정보 출력
        dev2.info();
        dev2.work();
        dev2.codeReview();
        // des1의 직원 정보 출력
        des1.info();
        des1.work();

        // mgr1의 직원 정보 출력
        mgr1.info();
        mgr1.work();
        mgr1.meeting();
    }
}
