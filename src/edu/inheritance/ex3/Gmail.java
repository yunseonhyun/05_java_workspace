package edu.inheritance.ex3;

public class Gmail extends GoogleService{
    private int inboxCount; // 받은 메일함의 메일 개수
    private int storageUsed; // 저장 공간 사용량(GB)

    // 생성자
    public Gmail() {
        super();
    }

    // 기본 생성자
    public Gmail(int inboxCount) {
        this.inboxCount = inboxCount;
    }

    // 생성자 GoogleService에 존재하는 필드 값만 사용하는 생성자
    // GoogleService에서 serviceName은 Gmail이기 때문에
    // 클라이언트한테 전달받은 값이 아니라, 개발자가 serviceName에 Gmail 서비스로 직접적으로 작성
    // 매개변수 내에는 클라이언트한테 전달받은 데이터만 가져오기
    public Gmail(String userEmail, String userName, String accountType) {
        super("Gmail", userEmail, userName, accountType);

    }

    // 매개변수 생성자 GoogleService 필드 + Gmail 필드 모두 사용하는 생성자
    public Gmail(String userEmail, String userName, String accountType, int inboxCount, int storageUsed) {
        super("Gmail", serviceName, userEmail, userName, accountType);
        this.inboxCount = inboxCount;
        this.storageUsed = storageUsed;
    }
    @Override
    public void search(){
        System.out.println("Gmail에서 메일을 검색합니다.");
    }

    @Override
    public void share(){
        System.out.println("Gmail에서 메일을 전달합니다.");
    }

    // Gmail 고유 메서드
    public void sendEmail() {
        System.out.println(userName + "님이 이메일을 발송합니다.");
    }

    // Getter
    public int getInboxCount() {
        return inboxCount;
    }

    public int getStorageUsed() {
        return storageUsed;
    }

    // Setter
    public void setInboxCount(int inboxCount) {
        this.inboxCount = inboxCount;
    }

    public void setStorageUsed(int storageUsed) {
        this.storageUsed = storageUsed;
    }
}
