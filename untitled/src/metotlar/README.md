# `Metotlar`

---

* Metotlar, içerisine parametre alabilir ya da almayabilirler ve bir dizi işlemleri gerçekleştirip
geriye değerler döndürebilirler ya da döndürmeyebilirler.
* Metotlar sayesinde yapılmak istenilen işlemler tekrar tekrar yazılmak yerine ilgili metot çağırılarak
işlemler gerçekleştirilir. Böylece kod tekrarı önlenir.


**Not:** 
* Metotlar içinde metot tanımlanamaz. Sınıflar içerisinde tanımlanır metotlar. Metot içinde metot kullanılabilir.
* Statik metotlar içerisinde statik metotlar çağırılabilir. Daha sonra detaylı öğrenilecek nedeni.
---
* Aşağıdaki gibi void bir metot içerisinde return anahtar kelimesi kullanılabilir yine de.
```java
public class PatikaDev {
  static void show() {
  System.out.println("Show metodu..");
  return;
  }
  public static void main(String[] args) {
  show();
  }
}
```

`*Not:* Metotlar ile fonksiyonlar arasında fark nelerdir? Daha sonra detaylıca bak!`  

Şimdilik kısaca farkı şudur: OOP(Object Oriented Programming)'de bir sınıf içerisinde tanımlanan yani dolayısıyla sınıfın varlığına
ihtiyaç duyan fonksiyonlara metotlar denir. OOP programlama dillerinde bu yüzden fonksiyon yerine metot kullanılır.

---

## Metotlarda Overloading (Aşırı Yükleme)

Metot overloading, aynı isme sahip **fakat farklı imzaya** sahip metotların tanımlanması işlemidir.

Fonksiyon imzası ise fonksiyonun ismi + aldığı parametrelerdir. Fonksiyonun geriye döndürdüğü veri türü dahil değildir.

**Örn:** Aşağıdaki metotlarda 1. metodun fonksiyon imzası int topla + int a, int b parametreleri değildir. 
Bu fonksiyonun imzası **'topla' ve 'int a, int b'** dir. Geriye döndürdüğü değer metot imzasına dahil değildir.

2.metodun imzası ise **'topla' ve 'int a, int b, int c'** dir.

```java
int topla(int a,int b){ 
    return a+b;
}
        
void topla(int a,int b,int c){
        System.out.println("Sum: "+(a+b+v));
}
```

### Peki neden metot overloading kullanılır?

Örnek olarak bir otomasyonda kullanıcının tüm bilgilerini yazdıracağımızı ele alalım. Kullanıcı, kullanıcı ismini girerek tüm bilgilerini
bulabiliriz ya da kullanıcının tckn'nu alıp kullanıcıyı bulabiliriz. Bu iki farklı parametreyi alıp kullanıcının tüm bilgilerini yazdıran
2 farklı fonksiyon oluşturursak ikisinin de farklı isimde olması saçma olur. Onun yerine ikisi de aynı isimde olması daha kullanışlı olur.

```java
public class bilgiIslem{
    void bilgileriYazdir(String nickname){
        /*Kullanici ismi ile kullanici bilgilerini db'den cekme islemleri vs */
        System.out.println("Kullanici bilgileri: "+......);
    }

    void bilgileriYazdir(int tckn){
        /*Kullanici tcknsi ile kullanici bilgilerini db'den cekme islemleri vs */
        System.out.println("Kullanici bilgileri: "+......);
    }
}
```
---

## Lokal Değişkenler ve Yaşam Döngüleri

Değişkenler belirli bir scope içerisinde tanımlıdır ve o scope içerisinde yaşam döngüleri vardır.

---
Örnek:
```java
public class a{
    public static void main(String[] args) {
        for(int i=0;i<4;i++){System.out.println("First i: "+i);}
        System.out.println();
        for(int i=0;i<7;i++){System.out.println("Second i: "+i);}
        System.out.println("i: "+i);
    }
}
```
Yukarıdaki örnekte **"System.out.println("i: "+i);"** bu kısımdan dolayı hata verir. Hata: variable i is not defined gibi bir hata verir.
Çünkü i değişkenleri sadece for içinde tanımlıdır. Yaşam döngüleri for içinde başlar ve son bulur.

Peki normalde javada int a=5;int a=6; gibi değişkeni 2 kere tanımlamak mümkün değilken burada neden 2 kere i tanımlanabilmiş. Bunun cevabı da
yukarıdaki cevapla aynı. 1.for döngüsündeki i'nin yaşam süresi 1.for içinde geçerlidir. 2.for döngüsünün içindeki i'nin yaşam süresi de 2.for içinde geçerlidir.
---
```java
public class a{
    public static void main(String[] args) {
        int i=0;
        for(i=0;i<=5;i++){System.out.println("1st i: "+i);}
        System.out.println(); //1 satir bosluk birakalim
        for(i=0;i<3;i++){System.out.println("2nd i: "+i);}
        System.out.println("Final i: "+i);
    }
}
```
Yukarıdaki örnekte **Final i: 3** burada bir hata vermez çünkü i değişkenini main içerisinde tanımladık yani i'nin yaşam süresi
main scope'u içindedir ve bu i'yi for döngüleri içerisinde kullandık. Hatta i'yi değiştirdik.

Bu durum aynı zamanda **if, while, do-while** gibi bloklar içerisinde de geçerlidir tabiki.

---
```java
public class a{
    static void changeValue(int a){
        a=10;
        System.out.println("a in the function: "+a);
    }
    
    public static void main(String[] args) {
        int a=5;
        changeValue(a);
        System.out.println("Final a: "+a);
    }
}
```
Yukarıdaki örnekte çıktı **Final a: 5** olacaktır. a'nın değerini değiştiremedik neden?

Çünkü changeValue fonksiyonu, main fonksiyonu içerisinde a'yı nasıl bilebilsin. Ee peki biz **changeValue(a)** ile fonksiyon içerisine
a'yı göndermedik mi?
Hayır, a'nın değerini yolladık ve hatta changeValue fonksiyonunun parametresi olan a, main içerisindeki a'dan farklıdır. changeValue fonksiyonuna
verdiğimiz a değeri, changeValue fonksiyonu içerisindeki a değerine kopyalanır. Yani changeValue içerisindeki a başka bir a değeridir ve fonksiyonun
scopeları içerisinde yaşam döngüsü vardır.

>Fonksiyonlara parametre aktarırken 2 yol vardır:
>1. Call by value(değer ile çağırma, değer ile aktarma)
>2. Call by reference (referans ile çağırma, referans ile aktarma)

Öncelikle bu ikisi farkı şudur. **Call by value** ile değer gönderilir. Değer gönderildiği için değişkenin tamamen kendisine ulaşılamaz.
Değişkenler ramde tutulur ve CPU onlara erişmek için adreslerini bilmelidir. CPU adres yolundan erişmek istediği değişkenin adresini yollar
ram ise değişkenin değerini CPU'ya gönderir. 

Yani değişkenin adresini yollarsak değişkene tamamen erişebiliriz, değerini değiştirebiliriz. Buna da **call by reference** denir.

Java, doğrudan adrese erişmemize izin vermez ama dolaylı yollardan call by reference javada da vardır (daha detaylı anlatılacak). C ise doğrudan adrese erişmeye izin verir.

C dilinde call by reference'a örnek:

``` c
#include <stdio.h>

void changeValue(int* x){
    *x=20;
}
int main(){
    int num=10;
    printf("Original value: %d\n", num); // Çıktı: Original value: 10

    changeValue(&num);
    printf("New value: %d\n", num); // Çıktı: New value: 20

    return 0;
}
```
Burada **'&'** işareti ile num değerinin adres değerini gönderiyoruz ve böylece num değişkene
tamamen erişebiliyoruz bellek üzerinden.
---

## Recursive Functions

Fonksiyonların kendi kendilerini çağırmaları demektir.

Bütün döngüleri recursive fonksiyonlar ile yazabiliriz. 
Döngülere oranla daha anlaşılır, sade ve az kodla yazılması
istenilenler recursive fonksiyonlar ile yazılabilir.

```java
import java.util.Scanner;

public class a {
    
    static int f(int x){
        if(x==0) return 0;
        return x+f(x-1);
    } 
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("[n*(n+1)/2]\nEnter the n: ");
        int number= input.nextInt();
        System.out.println("Result: "+f(number));
    }
}
```
Yukarıdaki örnekte 3 değerini girelim sonuç:6 olacaktır. Adım adım incelersek
### 1. **adım:** *f(3)*
* x=3
* x!=0
* return 3+f(2) //burada tekrar f(2) çağrılır.
### 2. **adım:** *f(2)*
* x=2
* x!=0
* return 2+f(1)
### 3. **adım:** *f(1)*
* x=1
* x!=0
* return 1+f(0)
### 4. **adım:** *f(0)*
* x=0
* x==0
* return 0

yani özetle ***f(3)=3+2+1+0=6***:
* f(3)=3+f(2)
* f(2)=2+f(1)
* f(1)=1+f(0)
* f(0)=0
---

# Pratikler

## *Pratik 1* - Metot İle Palindrom Sayı Bulma
>Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
>
>Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
---
## *Pratik 2* - Recursive ile Fibonacci Serisi Bulma
> 0,1,1,2,3,5,8,13,21... şeklinde kendinden bir önceki sayıların toplamı şeklinde olan sayılardır.
---
## *Pratik 3* - Gelişmiş Hesap Makinesi
Aşağıdaki fonksiyonlara sahip hesap makinesi yapınız:
>1- Toplama İşlemi  
>2- Çıkarma İşlemi  
>3- Çarpma İşlemi  
>4- Bölme işlemi  
>5- Üslü Sayı Hesaplama  
>6- Faktoriyel Hesaplama  
>7- Mod Alma  
>8- Dikdörtgen Alan ve Çevre Hesabı  
---

# Ödevler

## *Ödev 1* - Recursive Metot İle Üslü Sayı 
Üs alma işlemini döngü kullanmadan recursive metot ile yapınız.

>Taban değeri giriniz : 2  
>Üs değerini giriniz : 3  
>Sonuç : 8   
> 
>Taban değeri giriniz : 5  
>Üs değerini giriniz : 3  
>Sonuç : 125  
---
## *Ödev 2* - Recursive Metot İle Asal Sayılar
Girilen sayının asal olup olmadığını recursive metot kullanarak ekrana yazdırınız.

>Sayı Giriniz : 22  
>22 sayısı ASAL değildir !

>Sayı Giriniz : 2  
>2 sayısı ASALDIR !
---
## *Ödev 3* - Recursive Metot İle Desen
Kullanıcıdan alınan sayı 0 veya negatif olana kadar 5 çıkarınız.  
Sayı negatif veya 0 olduğunda ise tekrar sayının eski değerine gelene kadar 5 ekleyiniz.

**Not:** Her işlem sonrası değeri ekrana yazdırınız.

Örnek:
>N Sayısı : 16  
>Çıktısı : 16 11 6 1 -4 1 6 11 16 

>N Sayısı : 5  
>Çıktısı : 5 0 5 
---
## *Ödev 4* - HackerRank Java Method Overriding
**Not:** Daha sınıf konusu, overriding işlenmemişken bu örnek çok saçma bir seçim olmuş.
Daha önceden gördüğüm için yapabildim fakat yapılamaz ise can sıkılacak bir durum yok gayet normal.
---
Öncelikle sınıflar içerisinde değişkenleri, metotları vs tutabilirler. Miras alma ile bir sınıfın özellikleri başka sınıfa aktarılabilir.
Hatta yeni türetilecek bir sınıf, ata sınıftan kendine ait özellikler de ekleyerek türeyebilir.   

### Overriding işlemi nedir

```java
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
//----------------------------------------------------------------------
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}
```
şekilde 2 adet sınıf bulunmakta:
1. Sports sınıfı
2. Sports sınıfından türetilmiş Soccer sınıfı.

Soccer sınıfında görüldüğü üzere sports sınıfından aldığı getName() ve getNumberOfTeamMembers() isimli 2 metot değiştirilmiştir. İşte bu işleme overriding denir.  
Tabi overriding yapabilmek için üst sınıftan miras alınan **metodun parametreleri ve geri dönüş tipi** değiştirilmemeli.  
Buradaki metotların zaten parametleri yok ve değiştirilmemiş. Return tipleri de String kalmış sadece return değerleri değiştirilmiş.

### HackerRank Challenge'i neydi?

```java
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
}
```
Yukarıdaki 2 sınıf verilmiş ve bizden:
1. Soccer sınıfında, getNumberOfTeamMembers() metodunu override ederek n yerine 11 yazmamızı istiyor
2. En sonunda çıktı olarak da bunu yazdırmamızı bekliyor:

>Generic Sports  
>Each team has n players in Generic Sports  
>Soccer Class  
>Each team has 11 players in Soccer Class  
---

### Çözümden bahsedelim biraz:
Main metodu içerisinde

```java
Sports a=new Sports(); //ayni Scanner input=new Scanner(System.in); gibi

System.out.println(a.getName());
a.getNumberOfTeamMembers();
```
* Sports a=new Sports() ile Sports sınıfına ait bir a nesnesini oluşturuyoruz. Burada a yerine istediğinizi yazabilirsiniz. 
Bu nesnenin ismini belirtir.  

**New** 'den sonraki Sports ise içerisine parametre alabilir ya da almayabilir. Constructor method öğrenildiği zaman daha iyi anlaşılır.  
Mesela Scanner sınıfında bir nesne oluşturduğumuzda **System.in** parametresini alıyordu. 

Daha sonra oluşturduğumuz nesnenin metodunu kullanabilmek için nesne ismi yazıldıktan sonra **.** 'ya basılır. Zaten noktaya basılınca metot isimleri de gelir.

Peki neden birinde sout ile ekrana yazdırıp diğerinde metot çağırdık. Çünkü getName metodu geriye bir String değer döndürüyor. Metot içerisinde sout ile ekrana yazdırabilirdi diğer metot gibi.

Diğer metotda ise sout ile ekrana yazdırmıyoruz çünkü kendi içinde bir sout barındırıyor. Ama illa onu da yazdırmaya çalışırsak hata alırız çünkü yaptığımız void değer döndüren bir fonksiyonun değerini yazdırmak olur ki  
Void boş, boşluk demektir. Yani geriye bir değer döndürmez.
---