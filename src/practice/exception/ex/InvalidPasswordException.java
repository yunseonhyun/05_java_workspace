package practice.exception.ex;

public class InvalidPasswordException extends Exception {
    public InvalidPasswordException() {
        System.out.println("일치하는 비밀번호가 존재하지 않습니다.");
        // super나 system이나 문자열 출력이기 때문에 크게 문제되진 않지만
        // super 작성해주는 것이 좋음
    }

    // 회사에서 기본적으로 예외상황에 대한 출력문을 작성해놓은 것을
    // 특수한 환경에서 수정하여 사용해야할 경우에는 ↓ 생성자를 활용해서 작성
    public InvalidPasswordException(String message) {
        super(message);
    }
}
