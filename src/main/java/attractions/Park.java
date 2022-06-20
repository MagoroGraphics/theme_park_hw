package attractions;

import people.Visitor;

public class Park extends Attraction {

    public Park(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 0;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 0;
    }
}
