package factory;

import factory.products.GraphicCard;
import factory.products.MotherBoard;
import factory.products.Processor;

public class CreateFactory {
    public Factory createFactory(String product){
        if(product.equalsIgnoreCase("processor"))
            return new Processor();
        else if (product.equalsIgnoreCase("graphicCard"))
            return new GraphicCard();
        else if (product.equalsIgnoreCase("motherboard"))
            return new MotherBoard();
        else return null;
    }


}
