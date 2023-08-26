public class Ders6_Stringler {
    public Ders6_Stringler() {
        // Stringler ile çalışmaya başlıyoruz;

        // Nedir bu Stringler?
        // Stringler içerisinde karakter dizisi barındıran metinsel ifadelerdir.
        // char array'idir.
        String message = "Bugün Hava Çok Güzel !";
        System.out.println(message);

        System.out.println("Karakter Sayısı : " + message.length());
        System.out.println("5. Karakter : " + message.charAt(4)); // Metindeki ilgili index'teki değeri yakalamak için kullanılır.
        System.out.println(message.concat(" Yaşasın...")); // Metinleri birleştirmek için kullanılır. Yeni bir metin oluşturur, ana metine müdahele etmez.
        System.out.println(message.startsWith("B")); // İlgili metnin ne ile başladığını bulmak için kullanırız. true/false dönmektedir.
        // Not : Java case sensitivity bir dil olduğundan dolayı küçük/büyük harf duyarlılığı oldukça fazladır.
        System.out.println(message.endsWith("!")); // İlgili metnin ne ile bittiğini bulmak için kullanırız. true/false dönmektedir.

        char[] chars = new char[5];
        message.getChars(0,5,chars,0); // İlgili metindeki belirli karakterleri alıp, bir array'e atamak için kullanılır.
        // srcBegin: Metinden alacağı karakterleri kaçıncı indexten başlatsın.
        // srcEnd: Metinden alacağı karakterleri kaçıncı indexte bitirsin.
        // chars: Hangi char array/dizi'sine aktarsın.
        // dstBegin: Aktarmaya aktaracağı dizinin kaçıncı index'inden başlatsın.
        for (char messageChar: chars) {
            //System.out.println("Karakter : " + messageChar+", ");
        }

        System.out.println(message.indexOf("av")); // Girilen ifadenin metindeki baştan başlayarak index numarasını bulmak için kullanılır.
        // Not : Girdiğimiz ifadenin metindeki baştan başlayarak ilk bulduğu index'ini verir ve orada işlemi bitirir.

        System.out.println(message.lastIndexOf("a")); // Girilen ifadenin metindeki sondan başlayarak index numarasını bulmak için kullanılır.
        // Not : Girdiğimiz ifadenin metindeki sondan başlayarak ilk bulduğu index'ini verir ve ortada işlemi bitirir.

        // ---------- Bölüm 2 ----------

        System.out.println(message.replace(" ","-")); // İlgili metindeki hedef değerleri farklı bir değere çevirmek için kullanırız.
        // İlgili metindeki neyi neyle değiştirmek istediğimizi belirlediğimiz zaman kullanabiliriz.
        // Yeni bir metin oluşturur, eski metin üzerinde herhangi bir oynama yapmaz.

        System.out.println(message.substring(4, 9)); // İlgili metinden girdiğimiz index numaraları arasındaki parçayı almak için kullanılır.
        System.out.println(message.substring(2)); // Yine ilgili metinden girdiğimiz index numarasından sonrasını almak için kullanılır.

        for (String kelime : message.split(" ")){ // İlgili metinden belirli bir karaktere göre kelime/veri ayırmak için kullanılır.
            System.out.println("Kelime : " + kelime);
        }
        // For döngüsü içerisinde kullanılmasının sebebi string bir char array'i olduğu için bu arrayı tek tek gezip ilgili ayraça göre
        // kelimeleri ayırmaktadır.

        System.out.println(message.toLowerCase()); // İlgili metindeki bütün harfleri küçültecektir.
        System.out.println(message.toUpperCase()); // İlgili metindeki bütün harfleri büyültecektir.

        System.out.print(message.trim()); // İlgili metnin başındaki ve sonundaki boşlukları atmaya yarar.





    }
}
