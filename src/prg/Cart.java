package prg;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Fruit, Integer> cartmap;

    private Fruit fruit;

    private Integer quantity;

    public Cart() {
        this.cartmap = new HashMap<>();
    }

    public void add(Fruit fruit, Integer quantity) {
        this.cartmap.put(fruit, quantity);
    }

    public void remove(Fruit fruit, Integer quantity) {
        this.cartmap.put(fruit, this.cartmap.get(fruit) - quantity);
    }


    public void displayTotalBill() {
        Double totalBill = 0d;
        for(Map.Entry<Fruit, Integer> entry: cartmap.entrySet()) {
            Fruit fruit = entry.getKey();
            Integer quantity =entry.getValue();

            totalBill = totalBill + fruit.getPrice() * quantity;

        }
        System.out.println(" Total Bill :: " + totalBill);
    }
}
