
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShoppingBasket {
    private Map<String, Purchase> shopingBasket;

    public ShoppingBasket() {
        shopingBasket = new HashMap<>();
    }

    public void add(String product, int price){
        if (shopingBasket.containsKey(product)){
            shopingBasket.get(product).increaseAmount();
        } else {
            shopingBasket.put(product, new Purchase(product, 1, price));
        }
    }

    public int price(){
        int price = 0;
        for (Purchase purchase : shopingBasket.values()){
            price += purchase.price();
        }
        return price;
    }

    public void print(){
        for (String item : shopingBasket.keySet()){
            System.out.println(item + ": " + shopingBasket.get(item).getAmount());
        }
    }
}
