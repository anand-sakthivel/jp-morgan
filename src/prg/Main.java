package prg;


public class Main {

    public static void main(String[] args) {

        /**
         1. Allow Customers to add fruits cart.
         2. Added items should reduce from stock.
         3. Stock and Cart should be sync
         4. Total bill of Cart
         */

        Stocks stocks = new Stocks();
        stocks.fillStocks();

        stocks.showAvailableFruits();

        // 1.
        Fruit apple = new Fruit("Apple", 180d);
        Cart cart = new Cart();

        System.out.println(" Apple added 3 KG ");

        if(stocks.checkAvailability(apple)) {
            cart.add(apple, 3);         // 180 * 3 = 540
            stocks.syncStock(apple, 3);
        }

        stocks.showAvailableFruits();

        System.out.println(" Orange added 3 KG ");

        Fruit f = new Fruit("Orange", 120d);

        if(stocks.checkAvailability(f)) {
            cart.add(f, 3);        // 120 * 3 = 360
            stocks.syncStock(f, 3);
        }

        stocks.showAvailableFruits();

        System.out.println(" Orange added 3 KG ");

        Fruit banana = new Fruit("Banana", 120d);

        if(stocks.checkAvailability(banana)) {
            cart.add(banana, 30);        // 120 * 3 = 360
            stocks.syncStock(banana, 30);
        }

        stocks.showAvailableFruits();

        cart.displayTotalBill();

    }

}