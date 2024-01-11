package prg;

import java.util.HashMap;
import java.util.Map;

public class Stocks {

    private Map<Fruit, Integer> map;

    public Stocks() {
        this.map = new HashMap<>();
    }

    public void fillStocks() {
        Fruit apple = new Fruit("Apple", 180D);
        Fruit banana = new Fruit("Banana", 80D);
        Fruit orange = new Fruit("Orange", 120D);
        Fruit mango = new Fruit("Mango", 150D);

        this.map.put(apple, 100);
        this.map.put(banana, 100);
        this.map.put(orange, 100);
        this.map.put(mango, 100);

    }

    public boolean checkAvailability(Fruit fruit) {
        if(this.map.containsKey(fruit)) {
            return this.map.get(fruit).intValue() > 0;
        }
        return false;
    }

    public void syncStock(Fruit fruit, Integer quantity) {
        this.map.put(fruit, this.map.get(fruit) - quantity );
    }

    public void showAvailableFruits() {
        System.out.println(this.map);
    }
}
