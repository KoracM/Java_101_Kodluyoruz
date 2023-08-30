package diger_konular;

public class MathKutuphanesi {
    public static void main(String[] args) {
        //ceil: En yakin yukariya yuvarlar
        System.out.println("ceil(2.6) = "+Math.ceil(2.6));
        System.out.println("ceil(2.1) = "+Math.ceil(2.1));

        //Floor: En yakin asagiya yuvarlar
        System.out.println("\nfloor(2.6) = "+Math.floor(2.6));
        System.out.println("floor(2.1) = "+Math.floor(2.1));

        //Round: En yakina yuvarlar
        System.out.println("\nround(2.6) = "+Math.round(2.6));
        System.out.println("round(2.1) = "+Math.round(2.1));

        //Random: 0-1 arasi sayi uretir
        System.out.println("\nRandom: "+Math.random());

        //Bu sekilde int sayi da uretilebilir ya da random.nextInt
        System.out.println("Random: "+(int)(Math.random()*100));

        //Peki belirli bir aralikta uretmek istersek orn 5-10 arasi
        double aralikOlcek= Math.random()*(10-5+1);
        int sonuc=(int)(aralikOlcek+5);
        System.out.println("Random 5-10: "+sonuc);

        //Pow: ust alma
        System.out.println("\n2^3 = "+(int)(Math.pow(2,3)));

        //Abs: mutlak deger
        System.out.println("\n|-2.1| = "+Math.abs(2.1));

        //Sqrt: karekok
        System.out.println("\n9'un karekoku = "+Math.sqrt(9));

    }
}
