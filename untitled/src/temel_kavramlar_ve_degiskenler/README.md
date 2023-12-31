﻿# `JAVA 101 Kodluyoruz Pratikler`

---
# Temel Kavramlar ve Değişkenler

**Not:**  Javada küçük harflerin ve büyük harflerin kullanımı 
bazı şeyleri daha iyi açıklar.

*Küçük harfle başlayanlar(camelCase):*
* Metot ve değişken isimleri: 'calculateTotal', 'getUserInfo', 'itemCount'
* Paket isimleri: 'com.example.utilities', 'org.myapp.helpers'

*Büyük harfle başlayanlar(PascalCase):*
* Sınıf isimleri: 'String', 'ArrayList', 'MyCustomClass'
* Arayüz isimleri: 'Runnable', 'List', 'Drawable'

*Tüm harfler büyük (UPPERCASE_SNAKE_CASE):*
* Sabit (final) değişken isimleri: 'MAX_VALUE', 'PI', 'DEFAULT_TIMEOUT'

**Örnek:**
```java
import java.util.Scanner;
```
Burada java bir pakettir. util ise onun altındaki bir pakettir. Scanner ise util paketinin altındaki bir sınıftır.

---
## *Pratik 1* - Not Ortalaması Hesaplayan Program

>Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

>Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.  
Not : If ve Else kullanılmayacak...
---

## *Pratik 2* -KDV Tutarını Hesaplayan Program

>KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

>(Not : KDV tutarını 18% olarak alın)  
KDV'siz Fiyat = 10;  
KDV'li Fiyat = 11.8;  
KDV tutarı = 1.8;

>Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
---

## *Pratik 3* - Dik Üçgende Hipotenüs Bulan Program
>Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

>Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

>Formül
Üçgenin çevresi = 2𝑢  
𝑢 = (a+b+c) / 2  
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 ---

## *Pratik 4* - Taksimetre Programı
>Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

>Taksimetre KM başına 2.20 TL tutmaktadır.  
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.  
Taksimetre açılış ücreti 10 TL'dir.
---

## *Pratik 5* - Dairenin Alanını ve Çevresini Hesaplayan Program
>Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.  
Alan Formülü : π * r * r;  
Çevre Formülü : 2 * π * r;

>**Ödev:**
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.  
𝜋 sayısını = 3.14 alınız.  
Formül : (𝜋 * (r*r) * 𝛼) / 360
---
 
## *Odev 1* - Vücut Kitle İndeksi Hesaplama
>Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.  
Formül: Kilo (kg) / Boy(m) * Boy(m)

## *ODEV 2* - Manav Kasa Programı
>Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

>Meyveler ve KG Fiyatları  
Armut : 2,14 TL  
Elma : 3,67 TL  
Domates : 1,11 TL  
Muz: 0,95 TL  
Patlıcan : 5,00 TL  