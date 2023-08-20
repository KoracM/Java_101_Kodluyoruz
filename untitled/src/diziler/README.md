# Diziler

Aynı türde birden fazla değişkeni tutmaya yarayan yapılardır.

Neden ihtiyaç duyarız, örnek:  
Bir sınıfa ait notları tutmak istersek sınıftaki her bir kişiyi
değişken olarak tanımlayabiliriz ki bu çok uğrastırıcı olur onun yerine
bir dizi tanımlarız ve içerisine notları atarız.

```java
int[] array = new int[10]; //10 elemanli
```
* İlk başta veri tipi belirtilip yanına **[ ]** işareti konulur. Bu dizi anlamına gelir bir çok programlama dilinde de.
* Daha sonra dizi ismi verilir. Buradakinin ismi **array**
* **New** anahtar sözcüğü kullanılır aynı nesne oluşturduğumuzdaki gibi sebebi açıklanacak daha sonra.
* En son olarak yine veri tipi yazılır ve **[ ]** içine boyutu yazılır.

Diziler de oluşturulurken **new** anahtar kelimesiyle oluşturulurlar 
aynı nesneler gibi çünkü bellekte dinamik olarak derleme öncesi yer ayrılır.

Peki neden int, float gibi (primitive data types) basit veri türleri
oluşturulurken **new** anahtar sözcüğü kullanılmaz, onlar bellekte yer
tutmuyor mu?

Çünkü basit veri türleri derleme sırasında bellekte yer ayrılır ve ayrılan
alan dinamik değil sabittir, sebebi budur.
```java
Scanner input=new Scanner(System.in);
System.out.print("Enter the size of the array: ");
int size= input.nextInt();
int[] array = new int[size];
```
Yukarıdaki gibi dizinin boyutunu dinamik bir şekilde kullanıcıdan 
runtime esnasında alabiliyoruz.

---

**Not:** Static metodu nesne oluşturmadan çağırabiliriz.

---

# Arrays Sınıfı

```java
import java.util.Arrays;
```
**Önce bir not:** Arrays sınıfı bir **yardımcı sınıf(helper class)** olduğu için
nesne üretilemez. Peki o zaman nesne üretilmeden nasıl kullanılır?

```java
Arrays.toString(array);
```
Yukarıdaki gibi direkt sınıf ismi yazılarak erişilir. Buradaki toString()
metodu geriye String değer döndürür.

## Helper Classes(Yardımcı Sınıflar) Nedir?

Genelde belirli işevi yerine getirmek üzere tasarlanmış, 
nesne oluşturulmadan kullanılan sınıflardır.  
Static alanlar içerdiği için nesne oluşturulamaz, onun yerine doğrudan erişilir.

CTRL basılı tutup Arrays sınıfına erişebilirsiniz. Arrays sınıfındaki
bütün metotların statik olduğunu görebilirsiniz.

Yardımcı sınıflar:
* Bir üst sınıf veya arayüzden türetilebilir.
* Başka sınıflara veya arayüzlere kalıtım aktarabilir.
* Nesne üretip erişmek yerine direkt sınıf isimleriyle erişilirler.

## Sık kullanılan metotlar:

* ### toString(): 
Diziyi String olarak geri döndürür. Ekrana bastırmada kullanılabilir.

---

* ### fill(): 
Girilen değerle diziyi tamamen doldurur.  
**Örnek:**   
array = [-2,11,5,12,7,3,0,10]   
Arrays.fill(array, 1) -> [1,1,1,1,1,1,1,1]


sadece belirli aralığı da doldurabiliriz:

array = [-2,11,5,12,7,3,0,10]   
Arrays.fill(array,4,6,1) -> [-2,11,5,12,1,1,0,10]    
***[4,6) yani 4 dahil 6 değil***

---

* ### sort()
Diziyi küçükten büyüğe sıralar.
**Not:**
```java
array=Arrays.sort(array); //hatali
Arrays.sort(array); //bu sekilde kullanilmali
```
Neden Peki?  
Diziler **referans** tipli değişkenlerdir. Yani verinin bellek adresini(referansını)
tutan değişkenlerdir. Doğrudan erişilip değiştirilebilirler. 

sort() metodunu geri dönüş değerini bir diziye atamamız gerekmiyor yani çünkü
sort metodu içerisinde diziye tamamen erişip değiştirdik zaten. Ayrıca sort metodu geri dönüş
tipi void.

---

* ### equals()
Girilen 2 diziyi karşılaştırır. Eşitse true değilse false döndürür.

---

* ### copyOf()

Girilen dizinin baştan kaç adet elemanının kopyalanacağı bilgilerini alır
geriye kopyalanmış diziyi döndürür.

```java
int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
int[] copyArray=Arrays.copyOf(liste,3);
System.out.println("copyArray: "+Arrays.toString(copyArray));
```
```java
copyArray: [6, 1, 55]
```
Geriye kopyalanmış diziyi döndürdüğü için bunun yeni bir diziye atamamız gerekir.

Girilen 3 değeri bitiş değil de baştan kaç adet elemanın kopyalancağı şeklinde de akılda tutulabilir  
ya da 3 bitiş noktası ve 3 dahil şeklinde de tutulabilir.

---

* ### copyOfRange()

Girilen dizinin başlangıç ve bitiş değerine göre yeni bir diziye içerik kopyalanır.

```java
int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
int[] copyArray = Arrays.copyOfRange(liste,1,3);
System.out.println("copyArray: "+Arrays.toString(copyArray));
```
```java
copyArray: [1, 55]
```
[1,3) yani 1 dahil 3 değil.

---

* ### binarySearch()

Öncelikle **binary search** algoritması nedir?

![binary_search_gif](img/binary_search.gif)

1. Önce dizi sıralanır çünkü bu algoritma sıralanmış sayılar üzerinde çalışır.
2. Hep ortanca değere bakılır bu şekilde aranan mesafe her seferinde yarıya bölüne bölüne ilerler.

Öncelikle ortanca değerden başlanır. (Çift ise ne olacak örneğin 6-> [1,2,3,4,5,6]. '3' ya da '4' seçilir algoritmaya göre değişir farketmez.)

Ortanca değer küçük büyük olma şartlarına göre sol parçaya ya da sağ parçaya ilerler ve bunu her adımda tekrarlar.

---
