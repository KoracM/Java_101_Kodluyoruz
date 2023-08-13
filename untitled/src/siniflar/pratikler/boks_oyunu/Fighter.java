package siniflar.pratikler.boks_oyunu;


import java.util.Random;

public class Fighter {
    String name;
    int damage,weight,hp,minDamage,maxDamage,luck; //hp: hit points

    public Fighter(String name, int minDamage,int maxDamage, int hp,int luck,int weight) {
        this.name = name;
        this.damage =0;
        this.minDamage=minDamage;
        this.maxDamage=maxDamage;
        this.hp = hp;
        this.luck=luck;
        this.weight = weight;
    }

    int defineDamage(int min,int max){
        Random r=new Random();
        return  r.nextInt(max-min+1)+min;
    }

    int hit(Fighter rival){
        this.damage=defineDamage(minDamage,maxDamage);
        if(rival.dodge()){
            System.out.println(rival.name+" blocked "+this.name+"'s damage!");
            return rival.hp;
        }
        System.out.println(this.name+" hits ["+this.damage+"] to "+rival.name);

        if(rival.hp-this.damage<0)
            return 0;
        return rival.hp-this.damage;
    }

    boolean dodge(){
        Random r=new Random();
        return r.nextInt(100 + 1)<=this.luck;
    }
}
