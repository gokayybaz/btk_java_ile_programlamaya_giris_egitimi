public class Ders3 {
    public Ders3() {
        // Ders 3 -> Şart Blokları
        // Temel olarak şart bloklarını belirli bir koşula göre bir işlem yaptırmak istediğimiz zaman kullanırız.
        // Java'da kullanabileceğimiz şart blokları : if, if-else, if-elseif-else, switch-case
        // Hemen kullanmaya başlayalım;

        // Senaryomuz : Bir kullanıcı sisteme login olmuş ise anasayfaya yönlendirilsin.
        boolean userIsLoginned = true;
        if (userIsLoginned == true) {
            System.out.println("Anasayfaya Yönlendiriliyorsunuz...");
        }

        // Bir diğer senaryomuz : Kullanıcı sisteme giriş yapmış ise profilim sayfasına yönlendirilsin, giriş yapmamışsa anasayfaya yönlendirilsin.
        boolean userIsLoginned2 = false;
        if (userIsLoginned2 == true) {
            System.out.println("Profilim sayfasına yönlendiriliyorsunuz...");
        } else {
            System.out.println("Giriş yapmadığınız için anasayfaya yönlendiriliyorsunuz...");
        }

        // if : eğer demektir, else : değil ise demektir.

        // Tek satırda if else kullanımı
        System.out.println(userIsLoginned2 ? "Kullanıcı sisteme giriş yapmış" : "Kullanıcı sisteme giriş yapmamış");
        // "?" -> if/eğer,":" -> else/değil ise demektir.

        // Bir diğer senaryomuz : bir sayı olsun sayı 0'a eşitse 404 sayfasına yönlendirsin, sayı 1'e eşitse anasayfaya yönlendirsin, sayı 2'ye eşitse
        // profil sayfasına yönlendirsin.

        int sayi = 0;

        if (sayi == 0) {
            System.out.println("404 sayfasına yönlendiriliyorsunuz...");
        } else if (sayi == 1) {
            System.out.println("Anasayfaya yönlendiriliyorsunuz...");
        } else if (sayi == 2) {
            System.out.println("Profilim sayfasına yönlendiriliyorsunuz...");
        } else {
            System.out.println("Girilen değere uygun bir sayfa bulunmamaktadır.");
        }

        // else if : değil ise eğer demektir, birden fazla koşulu tek bir if else bloğunda tanımlamak için kullanılır.

        // Örnek 1 -> Üç sayı arasından en büyüğünü bulmak;
        int sayi1 = 145;
        int sayi2 = 56;
        int sayi3 = 400;
        int enBuyukSayi = sayi1;

        if (enBuyukSayi < sayi2) {
            enBuyukSayi = sayi2;
        } else if (enBuyukSayi < sayi3) {
            enBuyukSayi = sayi3;
        } else {
            enBuyukSayi = sayi1;
        }

        System.out.println("En büyük sayı : " + enBuyukSayi);

        // Birden fazla koşulu tek bir yapıda kurmak için kullanabileceğimiz bir diğer koşul yapısı;

        // Switch Case;

        int dayIndex = 0;
        switch (dayIndex) {
            case 0:
                System.out.println("Bugün günlerden Pazartesi");
                break;
            case 1:
                System.out.println("Bugün günlerden Salı");
                break;
            case 2:
                System.out.println("Bugün günlerden Çarşamba");
                break;
            case 3:
                System.out.println("Bugün günlerden Perşembe");
                break;
            case 4:
                System.out.println("Bugün günlerden Cuma");
                break;
            case 5:
                System.out.println("Bugün günlerden Cumartesi");
                break;
            case 6:
                System.out.println("Bugün günlerden Pazar");
                break;
            default:
                System.out.println("Girilen Index'e göre bir gün bulunmamaktadır.");
                break;

            // Yapısal açıklaması şu şekildedir;
            // Switch (koşul uygulanacak değer)
            // case koşul:
            // koşula uyuyorsa yapılacak işlem
            // break; ilgili koşula uyuyorsa ilgili koşul yapısını kesmek, ondan sonrasının çalışmamasını sağlamak.
            // default: -> girilen değer koşul yapısında bulunmuyorsa yapılacak işlem.

            // Genelde tek bir değer üzerinden çoklu koşul ile kontrol yapılacaksa kullanılır. Bellek için çoklu koşullarda if else'den daha yararlıdır.


        }
    }
}
