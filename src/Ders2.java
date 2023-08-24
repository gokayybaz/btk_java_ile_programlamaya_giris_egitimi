public class Ders2 {
    public Ders2() {
        // Ders 2 -> Değişkenler ve Temel Veri Tipleri
        // -----------------------------------------------------

        // Öncelikle neden değişkenleri kullanırız?
        /*
         -> Şöyle bir senaryomuz olsun;
         -> Ekranda gösterilecek bir metin olsun, bu metin yüzlerce ekranda gösterilsin diyelim,
         -> biz değişken kullanmazsak ekranların hepsine tek tek o metini yazarız ve yönetici gelip bizden o metni değiştirmemizi
            istediğinde işte o zaman patlarız. Çünkü biz bütün metinleri manuel olarak girdik. İşte bu senaryoyu dinamik hale getirmek için
            değişkenleri kullanmalıyız.
         -> Hemen senaryomuzu uygulayalım.
         */

        System.out.println("Merhaba Dünya 2");
        System.out.println("Merhaba Dünya 2");
        System.out.println("Merhaba Dünya 2");
        System.out.println("Merhaba Dünya 2");
        System.out.println("Merhaba Dünya 2");

        // Yönetici : Ekrandaki metinlerin değiştirilmesi gerekmektedir.
        // işte bu durumda tek tek değiştirmek zorundayız.

        // Ama aynı işlemi değişkenler kullanarak yapmış olsaydık;

        String metin = "Merhaba Dünya 3";
        System.out.println(metin);
        System.out.println(metin);
        System.out.println(metin);
        System.out.println(metin);

        // Böylece bütün ekranların değerlerini tek bir alandan dinamik bir şekilde yönetebilecektik.
        // Temelde değişkenleri dinamiklik ve reusability'lik sağlamak için kullanırız.
        // Not : Değişkenler kullanarak birden fazla yerde aynı metni veya değeri yazdırırsak bellek tasarrufuda yapmış oluyoruz.
        //       Bellekte değişken bir kere tanımlanıyor ve birden fazla yerde kullanılıyor bu da tasarrufa yol açmaktadır.

        // Değişken tanımlama : DeğişkeninTürü degiskeninIsmi = Değişkenin Değeri;
        // Değişken ismi : camelCasing standartında olmalıdır.

        // Temel (İlkel) Veri Tipleri
        // -----------------------------

        // Java tip güvenlikli bir dildir. Yani bir değişken tanımlamadan önce o değişkenin değerine göre tipini belirleyip aşağıdaki
        // veri tiplerinden uygun olanıyla oluşturmalıyız.

        // String : Metinsel ifadeleri tutmak için kullanılır.
        String userName = "gokayybaz";
        // char : Sadece karakterden oluşan ifadeyi tutmak için kullanılır.
        char userChar = 'g';

        // int : Tamsayıları tutmak için kullanılır.
        int number = 14556;
        // byte : Tamsayıları tutmak için kullanılır.
        byte number1 = 124;
        // short : Tamsayıları tutmak için kullanılır.
        short number2 = 3445;
        // long : Tamsayıları tutmak için kullanılır.
        long number3 = 454556565;

        // double : Ondalıklı sayıları tutmak için kullanılır.
        double length = 19.95;
        // float : Ondalıklı sayıları tutmak için kullanılır.
        float length2 = 56.67F;

        // boolean : Mantıksal ifadeleri tutmak için kullanılır. (true/false)
        boolean isLoginned = true;

        // Not : Birden fazla aynı tip değer tutmak için kullanabileceğimiz tiplerin olmasının sebebi tamamen ilgili sayının değeri ile alakalıdır.
        // Not1 : Tutacağımız sayı değerine göre uygun olan tip ile tanımlama yaparsak bellek yönetimimiz daha güçlü olacaktır.
    }
}
