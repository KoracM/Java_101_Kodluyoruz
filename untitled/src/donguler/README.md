# While

If you can use the just 1 line while there is a 2 options:  
### Option 1:
```java
while(condition);
```

### Option 2:
```java
while(condition){}
```
---
# Do-While
Difference between while and do-while is that do-while runs at least 1 time 
whether the condition is true or not.

### Example:

```java
int i=1, j=1;
while(i<3){
    System.out.println("-j outside the do: "+j);
    System.out.println("*i: "+i);
    do{
        System.out.print("j: "+j+"\t");
        j++;
        }
    while(j<4);
        System.out.println();
        i++;
}
System.out.println("\nFinal j: "+j+"\tFinal i: "+i);
```
### Output:
```
-j outside the do: 1
*i: 1
j: 1	j: 2	j: 3	
-j outside the do: 4
*i: 2
j: 4	

Final j: 5	Final i: 3
```
---
# For

```java
int sum = 0,i=0,j=0;
        for ( i = 0, j = 0; i &lt; 5 || j &lt; 5; ++i, j = i + 1) {
            sum += i;
        }
        System.out.println("sum: "+sum+"\ti: "+i+"\tj: "+j);
```
* Buradaki `&lt (less than)`, `<` işaretine denk gelmekte. 
* Aynı zamanda `&gt (greater than)`, `>` işaretine denk gelmekte.

---

# `Pratikler`

---
# Döngüler

---
## *Pratik 1* - Girilen Sayıya Kadar Olan Çift Sayıları Bul

>0'dan girilen sayıya kadar çift olan sayıları bulunuz.

>**Ödev:** 0'dan girilen sayıya kadar olan sayılardan 
> 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayınız.
---

## *Pratik 2* - Tek Sayıların Toplamını Bul

>Negatif bir değer girilene kadar girilen tek sayıları toplayınız.

>**Ödev:** Tek bir sayı girilene kadar girilen değerlerden çift ve 4'ün katları olanları toplayınız.
---

## *Pratik 3* - Girilen Sayıdan Küçük 2’nin Kuvvetlerini Bul

>Girilen sayıya kadar olan 2'nin kuvvetlerini yazdırınız.

>**Ödev:** Girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdırınız.
---

## *Pratik 4* - Faktöriyel Hesaplama

>Girilen sayının faktöriyel değerini hesaplayınız.

>**Ödev:** Kombinasyon hesaplayan program yazınız.  
> **Kombinasyon formülü:  C(n,r) = n! / (r! * (n-r)!)**
---

## *Pratik 5* - Üslü Sayı Hesapla

>Taban ve üs değerlerini alıp üslü sayıyı hesaplayınız.

>**Ödev:** For döngüsü kullanarak yapınız.
---

## *Pratik 6* - Armstrong Sayıları Bul

>**Armstrong Sayı Nedir?**
> N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

* **Örneğin:** 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

* 1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.

* 1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

* 54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748

>**Ödev:** Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.  
* Örnek : 1643 = 1 + 6 + 4 + 3 = 14
---

## *Pratik 7* - Harmonik Sayıları Bul
>Harmonik seri formulü:  
1+(1/2)+(1/3)+(1/4)+(1/n)...

> **Örnek**:n=3 ise 1+(1/2)+(1/3) = 1.83
---

## *Pratik 8* - * ile Üçgen Çizme
>' * ' kullanarak üçgen çizelim.
>```java
>     * 
>    *** 
>   ***** 
>  ******* 
> ********* 
>***********
>```

> **Ödev:** ' * ' ile Elmas çiz
>```java 
>    *
>   ***
>  *****
> *******
>*********
>*********
> *******
>  *****
>   *** 
>    *
> ```
---

## *Pratik 9* - Basit ATM Projesi
>### Özellikler:
> * Kullanıcı ismi ve şifresi eşleşme kontrolü
> * Kullanıcı 3 kere yanlış giriş yaparsa sistemden atılacak
> * 4 adet işlem:
> 1. Para yatırma
> 2. Para çekme
> 3. Bakiye sorgulama
> 4. Çıkış
> * Bakiyeden fazla miktarı çekme, 
negatif değerler çekme ve yatırma gibi kontroller 

> **Ödev:** Aynı işlemleri switch-case kullanarak yapınız.
---
## *Pratik 10* - EBOB-EKOK Bulan Program
>EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu sayıların en büyük ortak böleni, kısaca EBOB‘u denir.  
>
>* ÖRNEK: 18 ve 24 sayılarının en büyük ortak bölenini adım adım bulalım.
>18’in bölenleri : 1, 2, 3, 6, 9, 18  
>24’ün bölenleri : 1, 2, 3, 4, 6, 8, 12, 24  
>Bu ortak bölenlerin en büyüğü **6 sayısı EBOB’tur.**

>EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak katı, kısaca EKOK‘u denir.
>
>* ÖRNEK: 6 ve 8 sayılarının en küçük ortak katını adım adım bulalım.
>6’nın katları : 6, 12, 18, 24, 30, 36, 42, 48, …  
>8’in katları : 8, 16, 24, 32, 40, 48, 56, 64, …  
>Bu ortak katlardan en küçüğü **24 sayısı EKOK’tur.**

>EKOK=(n1*n2) / EBOB
---

# `Ödevler`
---
## *Ödev 1* - Girilen Sayılardan Min-Max Değerlerini Bulma

>Kaç adet sayı girileceğini kullanıcıdan alıp girilen sayılardan
en büyüğünü ve en küçüğünü bulunuz.


```java
Örnek:
        
Kaç tane sayı gireceksiniz: 4
        
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
        
En büyük sayı: 100
En küçük sayı: -22
```
---
## *Ödev 2* - Girilen Sayının Mükemmel Sayı Olup Olmadığını Bulunuz
>**Mükemmel Sayılar:** Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
> toplamı kendisine eşit olan sayıya mükemmel sayı denir.

```java
Örnek:
        Bir sayı giriniz: 28
        28 Mükemmel sayıdır
        
        Bir sayı giriniz: 1
        1 Mükemmel sayı değildir.
        
        Bir sayı giriniz: 496
        496 Mükemmel sayıdır
```
---
## *Ödev 3* - ' * ' ile Ters Üçgen Çiziniz
>Üçgenin yüksekliğini kullanıcıdan alınız.

```java
Enter the height of the triangle: 5

*********
 *******
  *****
   ***
    *
```
---

## *Ödev 4* - Belirli Aralıkta Asal Sayıları Ekrana Yazdırınız
>Kullanıcıdan 0-? aralığını alıp bu aralıktaki asal sayıları yazdırınız.

```java
Araligi giriniz: 100
        
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
```
---
## *Ödev 5* - Fibonacci Serisi
>Kaç adet eleman olacağını kullanıcıdan alıp fibonacci serisini yazdırınız.

```java
8 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13  

        0 + 1 = 1

        1 + 1 = 2

        1 + 2 = 3

        2 + 3 = 5

        3 + 5 = 8

        5 + 8 = 13

        13 + 8 = 21

        21 + 8 = 34
```
---

## *Ödev 6* - HackerRank Challenge 1 (Java Loops 1)
Taken an integer N from user and print its first 10 multiples.

(Kullanıcıdan integer n sayısı alınız ve 10'a kadar olan çarpımlarını yazdırınız.)

Sample Input:
>2
 
Sample Output:
>2 x 1 = 2  
>2 x 2 = 4  
>2 x 3 = 6  
>2 x 4 = 8  
>2 x 5 = 10  
>2 x 6 = 12  
>2 x 7 = 14  
>2 x 8 = 16  
>2 x 9 = 18  
>2 x 10 = 20  
---

## *Ödev 7* - HackerRank Challenge 2 (Java Loops 2)
Take the q (query amount),a,b and n (step) from user and print the results.

>Formula: (a+2^0.b),(a+2^0.b+2^1.b),...,(a+2^0.b+2^1.b+...+2^(n-1).b)

Sample Input:
>2  
>0 2 10  
>5 3 5  
> (2: querry number, then a,b,n. a=0, b=2, n=10)

Sample Output:
>2 6 14 30 62 126 254 510 1022 2046  
>8 14 26 50 98

Explaination:
We have two queries:  
1. We use a=0, b=2 and n=10 to produce some series S0,S1,...,Sn-1
   * S0 = 0 + 1.2 = 0
   * S1 = 0 + 1.2 + 2.2 = 6
   * S2 = 0 + 1.2 + 2.2 + 4.2 = 14  
   ... to the S9.  
     

2. We use a=5, b=3 and n=5 to produce some series S0,S1,...,Sn-1
    * S0 = 5 + 1.3 = 8
    * S1 = 5 + 1.3 + 2.3 = 14
    * S2 = 5 + 1.3 + 2.3 + 4.3 = 26
    * S3 = 5 + 1.3 + 2.3 + 4.3 + 8.3 = 50
    * S4 = 5 + 1.3 + 2.3 + 4.3 + 8.3 + 16.3 = 98
---