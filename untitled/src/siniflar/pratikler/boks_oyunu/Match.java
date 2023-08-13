package siniflar.pratikler.boks_oyunu;

import java.util.Random;

public class Match {
    Fighter f1,f2;

    int minWeight,maxWeight; // Do fighters weights matches?

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        run();
    }

    public void run(){
        isCheck();
        int round=1;

        if(isCheck()){
            while (this.f1.hp>0 && this.f2.hp>0){
                //Who starts first, hits first.
                if(round==1){
                    if(whoStarts()){
                        System.out.println("\n-------------First Hit-------------");
                        this.f1.hp=this.f2.hit(this.f1);
                    }

                    else{
                        System.out.println("\n-------------First Hit-------------");
                        this.f2.hp=this.f1.hit(this.f2);
                    }
                    System.out.println("----------------------------------");
                    System.out.println(this.f1.name+"'s hp: "+this.f1.hp+"\t"+this.f2.name+"'s hp: "+this.f2.hp);
                    System.out.println("----------------------------------\n");
                    round++;
                }

                System.out.printf("\n-------------Round %d-------------\n",round);
                this.f1.hp=this.f2.hit(this.f1);
                if(isThereAWinner()){
                    System.out.println("\n"+this.f1.name+"'s hp: "+this.f1.hp+"\t"+this.f2.name+"'s hp: "+this.f2.hp);
                    System.out.println("----------------------------------\n");
                    break;
                }
                this.f2.hp=this.f1.hit(this.f2);
                if(isThereAWinner()){
                    System.out.println("\n"+this.f1.name+"'s hp: "+this.f1.hp+"\t"+this.f2.name+"'s hp: "+this.f2.hp);
                    System.out.println("----------------------------------\n");
                    break;
                }
                System.out.println("\n"+this.f1.name+"'s hp: "+this.f1.hp+"\t"+this.f2.name+"'s hp: "+this.f2.hp);
                System.out.println("----------------------------------\n");
                round++;
            }
        }
        else
            System.out.println("\nFighters weights do not match!");
        whoIsWinner();
    }

    boolean isThereAWinner(){
        boolean status;
        status= this.f1.hp <= 0 || this.f2.hp <= 0;
        return status;
    }

    public boolean whoStarts(){
        Random r=new Random();
        return r.nextBoolean();
    }

    void whoIsWinner(){
        String winner;

        winner=(this.f1.hp>this.f2.hp)?f1.name:f2.name;

        System.out.println("--[Winner is: "+winner+"]--");
    }

    boolean isCheck(){
        return ((this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight));
    }
}
