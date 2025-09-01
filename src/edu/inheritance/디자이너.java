package edu.inheritance;

public class 디자이너 extends 직원{
    /*  extends 직원을 활용해서
    하나하나 직접 작성해야하는 필드명칭에서 공통적으로 활용할 필드 명칭을
    직원클래스에 작성하고, 이외 추가로 필요한 필드명칭만 디자이너에서 작성
    private String eName; // 사원이름
    private int eId; // 사원번호
    private double baseSalary; // 기본급
    private String department; // 부서
    private String designTool; // 디자인하는 도구
    */

    private String designTool; // 디자인하는 도구

    public 디자이너(String eNAme, int eId, double baseSalary, String department, String designTool) {
        // 하나하나 직접 작성해야하는 this를 직원 클래스에 작성하고 super를 이용하여
        // 직원 클래스에 작성된 this를 참조해서 사용한다 표기
        // this.eName = eName;
        // this.eId = eId;
        // this.baseSalary = baseSalary;
        // this.department = department;

        super(eNAme, eId, baseSalary, department);
        this.designTool = designTool;
    }

    public String getDesignTool() {
        return designTool;
    }
    public void setDesignTool(String designTool) {
        this.designTool = designTool;
    }

    /** @Override 표기는 extends 상속클래스로 가져온 기능을 재활용한다는 표기
     * 작성하지 않아도 동작하는데 문제 없지만
     * 작성해 주는 것이 개발자 간의 예의
    */
    public void info() {
        super.info();
        System.out.println("주 사용 디자인 도구 : " + getDesignTool());
    }

    @Override
    public void work() {
        // super.work()는 부모의 작성된 기능들을 추가로 사용하고자 할 때 작성
        // 기능에서는 super.기능명칭() 을 작성하는 것이 필수가 아님
        System.out.println(geteName() + "디자이너가" + getDesignTool() + "를 활용해 디자인합니다.");
    }
}
