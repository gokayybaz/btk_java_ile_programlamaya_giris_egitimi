package Ders7_Mini_Projeler;

public class Ders7_Mini_Projeler_Kalin_Sesli_ve_Ince_Sesli_Harfler {
    public Ders7_Mini_Projeler_Kalin_Sesli_ve_Ince_Sesli_Harfler() {

        // Benim Yaptığım örnek;
        char[] kalinSesliHarfler = {'a','ı','o','u'};
        char[] inceSesliHarfler = {'e','i','ö','ü'};

        char harf = 'e';

        for (char kalinHarf : kalinSesliHarfler) {
            if(kalinHarf == harf){
                System.out.println("Girilen harf Kalın Seslidir !!!");
                return;
            }
        }

        for (char inceHarf : inceSesliHarfler) {
            if(inceHarf == harf){
                System.out.println("Girilen harf İnce Seslidir !!!");
                return;
            }
        }

        System.out.println("Girilen harf geçersizdir !!!");

        // ----------------------------------------------------------------------

        // Hocanın Yaptığı Örnek;

        switch (harf) {
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Girilen harf kalın sesli bir harftir.");
                break;
            default:
                System.out.println("Girilen harf ince sesli bir harftir.");
        }

    }
}
