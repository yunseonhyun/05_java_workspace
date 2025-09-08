package edu.io.pack2.run;

import edu.io.pack2.service.파일작성Service;

import java.io.IOException;

public class 파일작성Run {
    public static void main(String[] args) throws IOException {
        파일작성Service service = new 파일작성Service();
        service.method1();
    }
}
