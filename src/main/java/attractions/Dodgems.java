package attractions;

import people.Visitor;

public class Dodgems extends Attraction {

    private double price;

    public Dodgems(String name, int rating) {
        super(name, rating);
        this.price = 4.50;
    }

    @Override
    public double defaultPrice() {
        return price;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getAge() < 12){
            return defaultPrice()/2;
        }
        return defaultPrice();
    }
}
