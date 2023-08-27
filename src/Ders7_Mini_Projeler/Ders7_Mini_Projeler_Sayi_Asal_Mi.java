package Ders7_Mini_Projeler;

public class Ders7_Mini_Projeler_Sayi_Asal_Mi {
  public Ders7_Mini_Projeler_Sayi_Asal_Mi(){
      System.out.println("Ders 7 - Mini Projeler - Sayı Asal Mı?");

      // Bu projelerde temel amacımız Algoritmik Yapımızı geliştirmektir!!!

      // Asal Sayı Nedir ? -> 1'den ve kendisinden başka pozitif böleni olmayan sayılara asal sayı denmektedir.

      int number = 1;
      int remainder = number % 2; // "%" (Mod Operatörü) - Mod operatörü ilgili sayı ile bölümünden kalan değeri görmek için kullanılır.
      boolean isPrime = true;

      for(int i = 2; i < number; i++){
         if(number % i == 0) {
             isPrime = false;
         }
      }

      if (number < 2) {
          System.out.println("Girilen değer geçersizdir... Asal Sayılar 2'den başlamalıdır!!!");
      }else {
          System.out.println("Sayı asal mı? : " + isPrime);

      }

      // Buradaki kurduğumuz algoritma şu şekilde çalışmaktadır;

      // İlk önce sayının asal sayı olup olmadığını anlayabilmemiz için sayının sadece 1 ve kendisine bölünebildiğini bilmemiz gerekiyor.
      // Bunu öğrenmek için belirlediğimiz sayıya kadar olan sayıları bir döngü içerisine almalıyız.
      // Asal sayılar 2'den başladığı için başlangıç değerini 2 olarak belirliyoruz.
      // Gelelim döngümüzdeki asal sayı olup olmadığını belirten koşula;
      // Sayımızı mod operatörü ile döngümüzdeki önceki sayıları gezen i değerine bölüp kalan değerini buluyoruz.
      // Kalan sıfır olduğu zaman belirlediğimiz sayı farklı sayılara da tam olarak bölünebiliyor demek oluyor,
      // Bu da sayının asal olmadığını belirtmektedir.

      // Bu algoritma ile sayının asal olup olmadığını belirleyebiliriz.

      // Not : if içerisinde return kullanırsak o metot içerisindeki if çalıştığı vakitte metotu sonlandıracaktır.

  }
}
