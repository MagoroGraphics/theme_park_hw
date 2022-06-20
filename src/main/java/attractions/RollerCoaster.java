package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity {

    private double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
    }

    @Override
    public double defaultPrice() {
        return this.price;
    }

    @Override
    public double priceFor(Visitor visitor) {
        double price = defaultPrice();
        if(visitor.getHeight() > 200){
            return price * 2;
        }
        return defaultPrice();
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() > 12 && visitor.getHeight() > 145){
            return true;
        } else {
            return false;
        }
    }
}
