package com.bilgeadam.sayisalloto;


import java.util.Random;

public class SayisalLoto {

    public int sayiGetir(int minSayi) {
        Random rnd = new Random();
        int maxSayi = 49;
        return rnd.nextInt(maxSayi) + 1;
    }

    public static void main(String[] args) {
        SayisalLoto loto = new SayisalLoto();

        // 6'lı bir array oluşturduk.
        int sayilar[] = new int[6];

        for (int i = 1; i <= 6; i++) {
            sayilar[i] = loto.sayiGetir(49);
        }

        // arrayi yazdır.
        for (int i = 0; i < 6; i++) {
            System.out.println(sayilar[1]);
        }

    }
}

