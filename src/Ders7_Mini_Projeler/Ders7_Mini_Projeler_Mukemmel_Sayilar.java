package Ders7_Mini_Projeler;

import java.util.ArrayList;

public class Ders7_Mini_Projeler_Mukemmel_Sayilar {
    public Ders7_Mini_Projeler_Mukemmel_Sayilar() {
        // Öncelikle Mükemmel Sayı Nedir?
        // Kendinden başka pozitif tüm tam bölenlerin toplamı kendisine eşit olan sayıya mükemmel sayı denmektedir.
        int number = 6;
        int total = 0;

        for(int i = 1; i<number; i++){
            if(number % i == 0) {
                total = total + i;
            }
        }

        if (total == number) {
            System.out.println("Girilen Sayı Mükemmel Sayıdır !!!");
        }else {
            System.out.println("Girilen Sayı Mükemmel Sayı Değildir !!!");
        }

        System.out.println(total);


    }
}
