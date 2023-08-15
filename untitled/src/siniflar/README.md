# Sınıflar

Sınıflar içerisinde özellikler olarak değişkenleri, davranışlar olarak ad metotları tutan yapılardır.  

Bu yapılara ait nesneler farklı nesneler oluşturularak kod tekrarı önlenir. OOP (Object Oriented Programming) yaklaşımı bunu amaçlar.

**Örnek:**

```java
class Bicycle{
    int shift;
    String brand;
    
    void getInfo(){
        System.out.println("Shift\t:\t"+shift+"\nBrand\t:\t"+brand);
    }
}
```
Yukarıdaki örnekte bisiklet isminde sınıf tanımlandı. Bu sınıfa ait özellikler vites ve markası. Davranışı ise getInfo() metodu.

Bu sınıfa ait değişkenleri atamak, değişkenlere ulaşmak ve metodlarına ulaşmak için önce bu sınıftan bir nesne üretmeliyiz.  

Örn: Bianchi nesnesi oluşturalım ve değerlerini atayalım.

```java
public class Main {
    public static void main(String[] args) {
        Bicycle bianchi=new Bicycle();   //bianchi nesnesi olusturuldu
        bianchi.brand="Bianchi";         //bianchi nesnesinin marka degeri atandi
        bianchi.shift=21;                //bianchi nesnesinin shift degeri atandi
        bianchi.getInfo();               //bianchi nesnesinin getInfo() metodu cagirildi.
    }
}
```
Aslında new den sonraki Bicycle(); bir metot çünkü () işaretleri var. Bu metodun ismi de özel bir metot olan **constructor method** yani **yapıcı metot.**

Constructor metodlar nesne oluşturulduğunda çağırılırlar. Constructor method olmadan nesne oluşmaz. Ama bu sınıf içerisinde constructor metot tanımlamadık biz nasıl oluyor?.

Java otomatik olarak varsayılan bir constructor metot oluşturur. Tabi bu baya düz bir constructor metotdur. Mesela siz her bir nesne oluştuğunda constuctor metodu içerisinde 
"Nesne oluşturuldu" yazdırmasını isterseniz o constuctor metot içerisine gidip yazmanız gerekir.

Burada görüldüğü üzere yapıcı metot içerisine bir parametre almamış. Buradaki "Bianchi", shift gibi değerleri uzun uzun yazmak yerine parametre olara şu şekilde constructor metoda yollayabiliriz.

```java
class Bicycle{
    int shift;
    String brand;

    //constuctor method buradaki thisler ne anlama geliyor sonra aciklanacak
    public Bicycle(int shift, String brand) { 
        this.shift = shift;
        this.brand = brand;
    }

    void getInfo(){
        System.out.println("Shift\t:\t"+shift+"\nBrand\t:\t"+brand);
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Constructor c=new Constructor(5);
        Bicycle bianchi=new Bicycle(21,"Bianchi"); //goruldugu uzere bu sekilde parametreleri girmek daha pratik
        bianchi.getInfo();
    }
}
```
Şimdi gelelim bu **this** ifadeleri ne?

**Constuctor metodundaki parametre olan shift** ile *sınıf içerisinde shift değişkeni* aynı peki bunları java nasıl ayırt eder?  
İşte bu this sözcüğü ile. *this.shift ile bu sınıftaki shift değişkenini* gösterir, constructor **metottaki parametre olan shift** değil.

```java
public Bicycle(int shift, String brand) {
        this.shift = shift;
        System.out.println("Brand\t:\t"+brand+"\nThis.brand\t:\t"+this.brand);
        this.brand = brand;
    }
```
Yukarıdaki çıktısı:  
Brand	    :	Bianchi  
This.brand	:	null  

Bu ikisi bu şekilde karışabiliyorken this kullanmak yerine parametreyi farklı isimlendirsek ne olur?  
O zaman kullanıcı sınıf içerisindeki hangi değeri girdiğini bilemez.
---
# `Pratikler`

## *Pratik 1* - Öğrenci Bilgi Sistemi

Öğrenci, Öğretmen ve Dersler olmak üzere 3 adet sınıf oluşturunuz ve bunlardan 
oluşturulacak nesneler ile öğrenci bilgi sistemi oluşturunuz.

### Course Sınıfı Özellikleri :

* Nitelikler : name,code,prefix,note,Teacher  
* Metotlar : Course() , addTeacher() , printTeacher()  

### Teacher Sınıfı Özellikleri :
* Nitelikler : name,mpno,branch  
* Metotlar : Teacher()  

### Student Sınıfı Özellikleri :
* Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass  
* Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()

> **Ödev:**
> Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin.
> Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.  
>
>Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
>
>Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :
> 
>Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
---

## *Pratik 2* - Boks Oyunu

Dövüşçü, maç ve main olmak üzere 3 adet sınıf oluşturunuz.  
Kullanıcıdan aşağıdaki bilgileri alınız:
* Boksörün ismi
* Min hasar
* Max hasar
* Can
* Ağırlık
* Şans yüzdesi

Bu bilgiler alındıktan dövüş sırasında boksörün her vuruşu öncesi bu min-max
hasar arasında bir değer rastgele atanacak ve her round boksörler birbirlerine farklı 
hasarda vuracaklardır.

Şans yüzdesi ile de bloklama şansları olacaktır.

**Not:** Aşağıdaki durumları düzeltiniz:  
* Herhangi bir boksörün canının 0 altına inme durumunu düzeltiniz.
* Bir boksör canı bittiği halde karşıdakine vuramaz.

> **Ödev:** Hangi boksörün ilk başlayacağını %50 şans ile belirleyiniz.
---

## *Ödev 1* - Maaş Hesaplama

Kullanıcıdan aşağıdaki bilgiler alınacak:
* isim
* maaş
* çalışma saati
* işe alındığı yıl

Daha sonra şu bilgiler hesaplanacaktır:
* Çalışma saatine göre bonus
    * 40 saatten fazla çalışmış ise saat başı 30tl
* Şuanki maaşına göre vergi
  * Şuanki maaşı 1000 TL'den fazla ise %3 kadar vergi, az ise 0 vergi.
* Çalışma yılına göre maaş artışı
  * 10 yıldan az süredir çalışıyorsa %5 zam
  * 10-20 yıl arasında ise %10 zam
  * 20 yıldan fazla ise %15 zam

### Sınıfta olması gereken nitelikler:

* name
* salary
* workHours
* hireYear

### Sınıfta olması gereken metotlar:

* tax(): vergiyi hesaplayacak
* bonus(): çalışma saatine göre bonus hesaplayacak
* raiseSalary(): Başlangıç yılına göre zam hesaplayacak
* toString(): Çalışan ait bilgileri ekrana yazdıracak. 
**Not:** bu metot ismi String sınıfına ait toString() metodu ile karışabilir. Farklı isimlendirme verilebilir.

---