public class Ders8_Metotlar {
    public Ders8_Metotlar() {
        System.out.println("Metotlar ile çalışmaya başlıyoruz !!!");

        // Öncelikle nedir bu metotlar?
        // Not : Metotlar ve Fonksiyonlar aynıdır.
        // Metotlar programlamada oldukça önemli bir yere sahiptir, aslında bir işi gerçekleştiren yapılardır.
        // Programlamada işlemler metotlar içerisinde tanımlanır, sonradan ihtiyacımız olduğu yerde istediğimiz kadar çağırabiliriz.
        // Bu duruma Don't Repeat Yourself (DRY - Kendini Tekrarlama) denmektedir.

        // Metotlar kendi içerisinde dallara ayrılır;
        // -> Sadece iş yapacak metotlar,
        // -> Yaptığı iş sonucu geriye değer dönderecek metotlar,
        // -> Parametre alan metotlar

        // 1 - Hemen basit bir metot yazalım;
        // this : bir üstümüzdeki class'a erişmek için kullanılır.
        // this.getData : bu metotla aynı class içerisinde bulunan farklı metotu çağır demek oluyor.
        this.getData();

        // 2 - Geriye değer dönderen fonksiyonumuzu kullanalım;
        System.out.println("Gelen kullanıcı : " + this.getUserName());

        // 3 - Parametre alan, işlem yapan ve geriye değer dönderen metotumuzu kullanalım;
        System.out.println("Hesaplama sonucu : " + hesapla(100, 145));

        // 4 - Parametre olarak Variable Arguments alan metotumuzu kullanalım;
        System.out.println("Toplam sonucu : " + topla(45,778,67,44,23,15,678));
    }
    // 1 - Sadece iş yapacak metot
    // public : Erişim belirleyicidir, ilgili metota herkes erişebilir.
    // void : İlgili metot sadece iş yapacak demektir, geriye herhangi bir değer döndermeyecektir.
    public void getData() {
        System.out.println("Veriler Listelendi....");
    }

    // 2 - Geriye değer dönderecek metot
    // Bir adet geriye değer dönderen metot oluşturalım;
    public String getUserName(){
        return "gokayybaz";
    }
    // public : Erişim belirleyicidir. İlgili metota herkesin erişmesini sağlamaktadır.
    // String : Geriye dönecek değerin tipini belirtmek için kullanılması gerekmektedir.
    // return : İlgili değeri geriye döndürmek için kullanılır.

    // 3 - Parametre alacak, iş yapacak ve geriye sonucu dönderecek netot
    // Bir adet parametre alan ve geriye değer dönderen metot oluşturalım;
    public int hesapla(int sayi1, int sayi2) {
        int toplam = sayi1 + sayi2;
        return toplam;
    }
    // public : Erişim belirleyicidir, İlgili metota herkesin erişmesini sağlamaktadır.
    // int : İşlem gerçekleştikten sonra geriye dönecek değerin tipi belirtilmelidir.
    // (int sayi1, int sayi2) : Dışarıdan istenilen değerler burada tipi ve takma adı ile belirtilmelidir.
    // Metotlarda parametreler "()" içerisinde belirtilir.
    // int toplam : parametreden gelecek değerleri toplayıp işlem sonucu atanan değeri barındırır.
    // return toplam : işlem sonucu oluşan değeri geri döndermeye yarar. Böylece çağırdığımız yerde kullanabiliriz.

    // 4 - Parametre olarak Variable Arguments alan metot
    // Öncelikle Variable Arguments Nedir?
    // Variable Arguments : Normal parametreli metotlardan farklı olarak tek bir parametre ile istediğimiz kadar değer gönderebileceğimiz yapıyı kurmamıza
    // yaramaktadır. Örnek olarak Hesap Makinelerinde hesaplama işlemini yaparken istediğimiz kadar sayı ekleyebiliyoruz ya işte o yapıyı
    // Variable Arguments ile kurabiliriz.
    public static int topla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam = toplam + sayi;
        }
        return toplam;
    }
    // Veri tipinin sonuna koyduğumuz (int...) "..." işareti : Variable Arguments İşaretidir.
    // Biz bunu çok fazla kullanmak istemeyiz, çünkü ilerde nesneler ile çalışmaya başladığımız zaman gelen yapının nasıl olduğunu bilemeyeceğimiz
    // için test edilebilirliği oldukça zayıftır. Bunun yerine daha nesnel yönelimli koleksiyonlarr vb. yapıları kullanırız.
}
