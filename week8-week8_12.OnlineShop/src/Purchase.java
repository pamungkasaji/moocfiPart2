
public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public int getAmount() {
        return amount;
    }

    public int price(){
        return this.unitPrice * this.amount;
    }

    public void increaseAmount(){
        this.amount += 1;
    }

    @Override
    public String toString(){
        return product + ": " + amount;
    }
}
