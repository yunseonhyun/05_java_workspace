package edu.polymorphism.pack3.ex1;

/**
 * public interface 소셜미디어기능들(){}
 * public class Meta플랫폼(){}
 *
 * 추상 존재하지 않고, 부모클래스 + 인터페이스 조합
 * public class Facebook extends Meta플랫폼 implements 소셜미디어기능등{}
 *
 * public abstract class Meta플랫폼(){}
 * 추상기능이존재하고, 부모클래스에 abstract를 활용한 조합
 * public class Facebook extends Meta플랫폼
 *
 */
public class Facebook extends Meta플랫폼{
    public Facebook() {
    }

    public Facebook(String 유저아이디) {
        super("Facebook", 유저아이디);
    }

    @Override
    public void post(String content) {
        System.out.println("[FaceBook] 텍스트 게시물 : " + content);
    }

    @Override
    public void like(String postId) {
        System.out.println("[FaceBook] 게시물 " + postId + "에 좋아요를 눌렀습니다.");
    }
}
