package factory;

import com.company.factory.IceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamFactTest {
    
    @Before
    public void setUp() throws Exception{
    }

    @Test
    public void shouldTwoIceCreamAreMakeEqual() {
        com.company.factory.IceCream iceCreamFact1 = new com.company.factory.IceCream();
        iceCreamFact1.setFlavor("Coconut");
        iceCreamFact1.setSalePrice(5.56);
        iceCreamFact1.setIngredients("Milk,Coconut,Salt");
        iceCreamFact1.setProductionCost(50.25);
        iceCreamFact1.setProductionTime(2);
        System.out.println(iceCreamFact1);

        com.company.factory.IceCream iceCreamFact2 = new com.company.factory.IceCream();
        iceCreamFact2.setFlavor("Coconut");
        iceCreamFact2.setSalePrice(5.56);
        iceCreamFact2.setIngredients("Milk,Coconut,Salt");
        iceCreamFact2.setProductionCost(50.25);
        iceCreamFact2.setProductionTime(2);
        System.out.println(iceCreamFact2);

        assertEquals(iceCreamFact1, iceCreamFact2);
    }


}
