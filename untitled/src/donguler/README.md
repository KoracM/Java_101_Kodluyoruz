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

# `Pratikler ve Ödevler`

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