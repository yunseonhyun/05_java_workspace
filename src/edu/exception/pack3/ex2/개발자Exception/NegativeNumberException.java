package edu.exception.pack3.ex2.개발자Exception;

public class NegativeNumberException extends RuntimeException {
    public NegativeNumberException() {
        super("음수는 입력할 수 없습니다");
    }

    public NegativeNumberException(String message) {
        super(message);
    }
}