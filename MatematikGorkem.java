package com.arslaner.interfacepaket;

public class MatematikGorkem implements IMatIslemler {


    @Override
    public void iyiSayiTopla() {
        int sayi1 = 60;
        int sayi2 = 90;
        int sonuc = sayi1+ sayi2;
        System.out.println("İki sayının toplamı= "+sonuc);
    }

    @Override
    public float ortalamaBul(int sayi1, int sayi2) {
        float sonuc = sayi1+sayi2 / 2f;
        System.out.println("Ortalaman = "+sonuc);
        return sonuc;

    }

}
