package com.arslaner;

import com.arslaner.interfacepaket.IMatIslemler;
import com.arslaner.interfacepaket.MatematikGorkem;

public class Main {

    public static void main(String[] args) {
        IMatIslemler mg = new MatematikGorkem();
        mg.iyiSayiTopla();
        mg.ortalamaBul(14,29);
    }
}
