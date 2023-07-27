# `JAVA 101 Kodluyoruz Pratikler`

---
# Koşullu İfadeler ve Kod Blokları

---
## *Pratik 1* - Hesap Makinesi

>Kullanıcıdan 2 adet sayı alıp daha sonra sunulan 
>* toplama, 
>* çıkarma, 
>* bölme ve 
>* çarpma   
>
>işlemini seçerek sonucu yazdıran hesap makinesi yazınız.

>Not: **Sıfıra bölme** hatasını da unutmayınız.
---

## *Pratik 2* - Kullanıcı girişi
>Kullanıcı sisteme kayıtlı ise kullanıcı ismi ve şifresi karşılaştıran basit bir kullanıcı girişi programı
---

## *Pratik 3* - Sınıfı Geçme Durumu
>Kullanıcıdan alınan (matematik, fizik, türkçe, kimya ve müzik) 5 dersin ortalamasını hesaplayıp gecme notunun altında ise ekrana 
kaldınız, geçtiyse de geçtiniz yazdıran kod.

>**Ödev:** Eğer girilen ders notları 0-100 aralığında değilse ortalamaya dahil edilmesin.
---

## *Pratik 4* - Hava Sıcaklığına Göre Etkinlik Önerme
>Koşullar:
> * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
> * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
> * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
> * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

> **Ödev:** Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
---
## *Pratik 5* - Sayıları Büyükten Küçüğe Sıralama
>Kullanıcıdan alınan 3 sayıyı büyükten küçüğe sıralayınız.

> **Ödev:** Küçükten büyüğe sıralamayı da ekleyiniz.
---

## *Pratik 6* - Burç Bulan Program
>* Koç Burcu : 21 Mart - 20 Nisan
>* Boğa Burcu : 21 Nisan - 21 Mayıs
>* İkizler Burcu : 22 Mayıs - 22 Haziran
>* Yengeç Burcu : 23 Haziran - 22 Temmuz
>* Aslan Burcu : 23 Temmuz - 22 Ağustos
>* Başak Burcu : 23 Ağustos - 22 Eylül
>* Terazi Burcu : 23 Eylül - 22 Ekim
>* Akrep Burcu : 23 Ekim - 21 Kasım
>* Yay Burcu : 22 Kasım - 21 Aralık
>* Oğlak Burcu : 22 Aralık - 21 Ocak
>* Kova Burcu : 22 Ocak - 19 Şubat
>* Balık Burcu : 20 Şubat - 20 Mart

> **Ödev:** Aynı örneği switch-case kullanmadan yapınız.
---

## *Hackerrank If-Else Challange*
>* If number is odd, print **"Weird"**
>* If number is even and in the inclusive range of 2 to 5, print **"Not Weird"**
>* If number is even and in the inclusive range of 6 to 20, print **"Weird"**
>* If number is even and greater than 20, print **"Not Weird**"
---

## *Ödev 1* - Uçak Bileti Fiyatı Hesaplama
>Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın:
> * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
> * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
> * Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
> * Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
> * Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
---
## *Ödev 2* - Çin Zodyağı Hesaplama
> **Çin Zodyağı:** 4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

> **Çin Zodyağı nasıl hesaplanır?:** Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.  
> * Doğum Tarihi %12 = 0 ➜ Maymun
> * Doğum Tarihi %12 = 1 ➜ Horoz
> * Doğum Tarihi %12 = 2 ➜ Köpek
> * Doğum Tarihi %12 = 3 ➜ Domuz
> * Doğum Tarihi %12 = 4 ➜ Fare
> * Doğum Tarihi %12 = 5 ➜ Öküz
> * Doğum Tarihi %12 = 6 ➜ Kaplan
> * Doğum Tarihi %12 = 7 ➜ Tavşan
> * Doğum Tarihi %12 = 8 ➜ Ejderha
> * Doğum Tarihi %12 = 9 ➜ Yılan
> * Doğum Tarihi %12 = 10 ➜ At
> * Doğum Tarihi %12 = 11 ➜ Koyun
---

## *Ödev 3* - Artık Yıl Hesaplama

 **Artık Yıl Nasıl Hesaplanır?:**  

> 1- Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
> * 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.  

> 2- 4'ün katı olmalarının dışında eğer ki 100'ün katıysa ve sadece 400'e bölünebilen yıllar artık yıllardır.
> * Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
---