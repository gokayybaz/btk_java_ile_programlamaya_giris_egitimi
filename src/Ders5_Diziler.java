public class Ders5_Diziler {
    public Ders5_Diziler() {
        System.out.println("Dizilere Merhaba !!!");

        // Diziler Nedir?
        // Diziler programlamada kullanılan içerisinde birden fazla veri/değişken barındırabilen listelerdir.
        // Liste oldukları için içerisindeki elemanlara her türlü müdahalede bulunabiliriz.

        // Diziler olmasaydı ne yapacaktık?
        // Senaryomuz : Bir öğretmen sınıfında bulunan öğrencileri ekrana yazdırmak istiyor.
        String ogrenci1 = "Gökay";
        String ogrenci2 = "Hakkı";
        String ogrenci3 = "Benan";
        String ogrenci4 = "Zeynep";

        // Yukarıda öğrencileri tanımladık işte bunları ekranda yazdırmak istediğimiz zaman tek tek yazdırmak zorunda kalacaktık,
        // bu durumda kalmamak için biz çoklu listeleri diziler içerisinde tutup döngüler ile gezip ilgili işlemi yaptırtırız.

        // Hemen dizilere bir bakalım;

        String[] ogrenciler = new String[4];
        // String[] : İçerisinde string veri tipinde veriler bulunduran bir dizi oluşturmak için kullanılır.
        // String[4] : Dizinin uzunluğunu/eleman sayısını belirtmek için kullanılır.

        ogrenciler[0] = ogrenci1;
        // Dizinin 0'ıncı index'ine eklenecek elemanı atadık.
        // Not : Java, C# gibi dillerde dizilerin index numarası 0'dan başlamaktadır.
        ogrenciler[1] = ogrenci2;
        ogrenciler[2] = ogrenci3;
        ogrenciler[3] = ogrenci4;

        // For döngüsü ile diziyi dizinin uzunluğu kadar tek tek gezip dizinin gezdiğimiz andaki index numarasına sahip elemanını konsola yazdırdık.
        for (int i = 0; i < ogrenciler.length; i++) {
            //System.out.println("Öğrenci : " + ogrenciler[i]);
        }

        // Arrayler/Diziler için kullanabileceğimiz farklı bir for döngüsü tipi;
        for (String ogrenci : ogrenciler) {
            //System.out.println("Diğer : " + ogrenci);
        }

        // Açıklaması ogrenciler dizisini tek tek gez, gezdiğin o anki öğrenciyi ogrenci değişkenine ata ve bunu ogrenciler listesi tamamlanana kadar tekrarla.
        // Not : Her yeni elemanı gezdiğinde ogrenci değişkeninin değerini değiştirir.

        // İşte yukarıdaki tek tek ekrana basma sorunumuzu diziler ve for döngüsü ile kolay bir şekilde çözmüş olduk.

        // Diziler Recap

        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            total = total + number;
            // Dizi içerisindeki en büyük sayıyı bulmak.
            if (max < number) {
                max = number;
            }
            System.out.println("Numara : " + number);
        }

        System.out.println("Toplam : " + total);
        System.out.println("En Büyük : " + max);

        // Çok Boyutlu Diziler (Kullanımı çok yaygın değildir fakat öğrenilmesinde yarar vardır.)

        // Nedir bu çok boyutlu diziler?
        // birden fazla satırdan oluşan dizilerdir.
        // Matematikteki matris yapısına benzer, ve o tür çözümlerde bunu kullanabiliriz.

        // Hemen bir adet örnek oluşturalım;

        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        for(int i = 0; i<=2; i++){
            System.out.println("--------------------------");
            for (int k = 0; k<=2; k++){
                System.out.println(sehirler[i][k]);
            }
        }





    }
}
