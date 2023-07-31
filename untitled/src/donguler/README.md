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

