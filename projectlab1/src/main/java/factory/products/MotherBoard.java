package factory.products;

import factory.Factory;

public class MotherBoard implements Factory {
    public String createProduct() {
        return "motherBoard";
    }
}
