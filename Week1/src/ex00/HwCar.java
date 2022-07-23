package ex00;

public  class HwCar {
    public static final String SONATA = "Sonata";
    public static final String GRANDEUR = "Grandeur";
    public static final String GENESIS = "Genesis";
    String productName;
    public HwCar(String productName) {
        this.productName = productName;
    }
    public String toString() {
        return productName;
    }
}