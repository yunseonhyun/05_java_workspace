package edu.io.pack4.run;

import edu.io.pack4.service.FiveWriteService;

public class FiveWriteRun {
    public static void main(String[] args) {
        FiveWriteService fws = new FiveWriteService();
        // fws.고전방식();
        fws.현대방식();
    }
}
