package prg;

import java.util.Objects;

public class Fruit {

    private String fruitName;

    private Double price;

    public Fruit(String fruitName, Double price) {
        this.fruitName = fruitName;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String getFruitName() {
        return fruitName;
    }

    @Override
    public int hashCode() {
        return 2000;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(fruitName, fruit.fruitName);
    }

    /*@Override
    public boolean equals(Object obj) {

        if(obj == null)
            return false;

        if(obj == this)
            return true;

        return this.fruitName.equals(((Fruit)obj).getFruitName());
    }*/



    public String toString() {
        return this.fruitName;
    }
}
