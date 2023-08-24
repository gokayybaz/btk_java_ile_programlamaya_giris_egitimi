public class Ders4_Donguler {
    public Ders4_Donguler() {
// Ders 4 -> Döngüler

        // Programlamada oldukça bir yere sahiptir, döngünün kullanılmadığı bir program yoktur.
        // Nedir bu döngüler;
        // Döngü : bir programda birbirine benzeyen işlemleri tekrarlamamızı sağlayan yapıdır.
        // Belli bir veri gurubunu veya belli bir işlemi bir döngü içerisinde gezmeye/yapmaya yarayan yapılardır.
        // Örnek olarak 100'e kadar saydırma, listeyi ekrana yazdırma, bir işlemi döngüye sokup istenildiği kadar çalıştırma
        // İşte bu yüzden döngüler çok önemlidir.

        // 0'dan 100'e kadar sayıları yazdırma
        for(int i = 0; i<100; i++){
            System.out.println("Sayı : " + i);
        }
        System.out.println("Döngü tamamlandı!");

        // for döngüsündeki ne kadar çalışacağını belirttiğimiz şart kısmına bakalım;
        // int i = 0; -> sayaç kısmıdır, döngünün başlangıç değerini belirtir.
        // i<100; -> koşul/şart kısmıdır, ne kadar çalışacağını belirtir.
        // i++ (i değerini tek tek arttır.) -> sayacın kaçar kaçar arttıracağını belirttiğimiz kısımdır.

        // Döngüleri çalışma mantığı şu şekildedir;
        // Döngü ilk önce çalışmaya başlar,
        // Döngü kod bloğunu çalıştırdıktan sonra başa döner ve koşula bakar,
        // Koşul sağlanıyorsa sayaçı belirttiğimiz değer kadar arttırıp tekrardan çalışmaya başlar,
        // Böyle böyle koşul sağlanana kadar içerisindeki işlemleri tekrarlar.
        // İşte döngüler bu şekilde çalışmaktadırlar.

        // while döngüsü
        int i = 0;
        while(i<10) {
            System.out.println(i);
            i++;
        }

        // while döngüsünün çalışma mantığı for döngüsü ile tamamen aynıdır.
        // Fakat burada yazım şekli for döngüsüne göre farklıdır.

        // do-while döngüsü
        do{
            System.out.println("Deneme : " + i);
            i++;
        }while (i<100);

        // do-while döngüsününde çalışma mantığı tamamen hem while ile hem de for ile aynıdır.
        // Sadece syntax olarak diğerlerinden farklıdır.

        // while döngüsü ile do-while döngüsü arasındaki fark;
        // while döngüsünde şart sağlanmadığı taktirde asla çalışmaz,
        // ama do while döngüsünde programın çalışma sırasına göre ilk önce do çalıştığı için ilk çalıştığında şarta uymuyorsa bile çalışacaktır.
        // Bunu nerede kullanırız : biz döngünün çalışıp çalışmadığını veri tabanına loglamak isteyebiliriz,
        // işte bu durumda do-while döngüsü ilk önce tek seferlik çalıştığı için döngünün çalışıp çalışmadığı bilgisini log olarak gönderebiliriz.

        // Programlamada genellikle for döngüsü kullanılmaktadır.

    }
}
