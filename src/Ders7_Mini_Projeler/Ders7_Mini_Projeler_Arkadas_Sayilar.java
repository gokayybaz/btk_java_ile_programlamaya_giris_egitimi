package Ders7_Mini_Projeler;

public class Ders7_Mini_Projeler_Arkadas_Sayilar {
    public Ders7_Mini_Projeler_Arkadas_Sayilar() {
        // Nedir bu Arkadaş Sayılar?
        // Kendileri hariç, pozitif tam bölenlerinin toplamı birbirine eşit olan sayılara arkadaş sayılar denmektedir.
        // Bilinen en küçük arkadaş sayılar : 220 - 284'tür.

        int number = 18416;
        int number2 = 17296;
        int toplam = 0;

        for(int i = 1; i<number; i++){
            if(number % i == 0) {
                toplam = toplam + i;
            }
        }

        if (toplam == number2) {
            System.out.println("Girilen sayılar Arkadaş Sayılardır.");
        }else {
            System.out.println("Girilen sayılar Arkadaş Sayı Değillerdir.");
        }
    }
}
