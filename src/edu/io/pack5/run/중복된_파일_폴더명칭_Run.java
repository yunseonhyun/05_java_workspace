package edu.io.pack5.run;


import edu.io.pack5.service.중복된_파일_폴더명칭_Service;

public class 중복된_파일_폴더명칭_Run {
    public static void main(String[] args) {
        중복된_파일_폴더명칭_Service service = new 중복된_파일_폴더명칭_Service();
        // service.saveImage1();
        // service.saveImage2();
        // service.saveImage3();
        // service.saveImage5();

        String imgUrl = "https://thvnext.bing.com/th/id/OIP.gkSVO6XV6kaiqB36IeHDhwHaE7?w=245&h=180&c=7&r=0&o=7&cb=ucfimgc2&pid=1.7&rm=3";
         service.kakaoSave(imgUrl);
    }

}
