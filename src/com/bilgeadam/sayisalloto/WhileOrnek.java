package com.bilgeadam.sayisalloto;

public class WhileOrnek {

    // for döngüsünden farkı,
    // sayıdan çok duruma bağlı olmasıdır.

    // while döngüsü ile 1den 10 a kadar merhaba yazdıralım.


    public static void main(String[] args) {

        int sayac = 1;

        while(sayac <= 10)
        {
            System.out.println(sayac+"Merhaba");

            //genelde bu unutuluri
            //program sonsuz döngüye giriyot.
            sayac = sayac + 1;
        }
    }


    {
        System.out.println();
    }

}
