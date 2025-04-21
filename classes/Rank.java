package classes;

public enum Rank {
    
    BRONZE(0), SILVER(.05), ROSE(.075), GOLD(.1), ELITE(.125), PREMIUM(.15);
    
    double discount;
    
    Rank(double discount) {
        this.discount = discount;
    }
    
    public double getDiscount() {
        return discount;
    }
}
