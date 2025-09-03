package edu.polymorphism.pack1.ex1.run;

import edu.polymorphism.pack1.ex1.service.MemberService;
import edu.polymorphism.pack1.ex1.service.ProductService;

public class CompanyRun {
    public static void main(String[] args) {
        ProductService ps = new ProductService();
        ps.Info(); // productService에 존재하는 info() 기능을 실행


        MemberService ms = new MemberService();
        ms.info();
    }
}
