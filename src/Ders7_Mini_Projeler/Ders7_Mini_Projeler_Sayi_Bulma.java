package Ders7_Mini_Projeler;

public class Ders7_Mini_Projeler_Sayi_Bulma {
    public Ders7_Mini_Projeler_Sayi_Bulma() {
        int[] sayilar = { 1, 2, 5, 7, 9, 0 };
        int aranacakSayi = 2;

        for(int sayi : sayilar) {
            if(sayi == aranacakSayi) {
                System.out.println("Liste içerisinde aranan sayı bulunmaktadır : " + sayi);
                return;
            }
        }
        System.out.println("Liste içerisinde aranan sayı bulunmamaktadır !!!");
    }
}
