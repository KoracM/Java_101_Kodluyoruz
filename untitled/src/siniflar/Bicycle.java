package siniflar;

class Bicycle{
    int shift;
    String brand;

    public Bicycle(int shift, String brand) {
        this.shift = shift;
        System.out.println("Brand\t:\t"+brand+"\nThis.brand\t:\t"+this.brand);
        this.brand = brand;
    }

    void getInfo(){
        System.out.println("Shift\t:\t"+shift+"\nBrand\t:\t"+brand);
    }
}
