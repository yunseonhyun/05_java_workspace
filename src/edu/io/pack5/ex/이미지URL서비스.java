package edu.io.pack5.ex;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class 이미지URL서비스 {

    public void dirSaveImg(String imgUrl, String imgDir, String imgName) {
        Path path = Path.of("practice", imgDir, imgName);
        System.out.println("path : " + path);
        System.out.println("path.getParent : " + path.getParent());
        // 파일이름 중복 처리

        try {
            // path.getParent() : 하위명칭 이외 폴더들을 모두 가져오는 기능
            // path.getFileName() : 마지막에 존재하는 이름을 가져오는 기능

            // 이름 뒤에 확장자가 오면 확장자를 지운 후 수정 작업이 필요함
            String name = path.getFileName().toString(); // 파일이름 가져오기
            System.out.println("name : " + name);

            int dot = name.lastIndexOf('.'); // .을 기준으로 앞에있는 글자만 가져오겠다.
            String baseName = name.substring(0, dot); // . 이전의 파일 명칭들이 존재
            String extName = name.substring(dot); // .png 확장자 명칭이 들어감

            int count = 1;

            do{
               String newNAme = baseName + "_" + count + extName;
               path = Path.of(imgDir, newNAme);
               count++; // 사자_8 .... 동일한 명칭의 파일이 없을 때 까지
            } while(Files.exists(path));



            System.out.println("baseName : " + baseName);
            System.out.println("extName : " + extName);

            Files.createDirectories(path.getParent());

            URL url = new URL(imgUrl);

            InputStream inputStream = url.openStream();
            Files.copy(inputStream, path);
            System.out.println("사진 저장 완료");

        } catch (IOException e) {
            System.out.println("오류 발생");
        }
    }
}
