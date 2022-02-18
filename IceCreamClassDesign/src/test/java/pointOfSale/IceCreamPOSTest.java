package pointOfSale;

import com.company.pointofsale.IceCream;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class IceCreamPOSTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void shouldTwoIceCreamFlavorsAreEqual() {
        com.company.pointofsale.IceCream iceCreamPOS1 = new com.company.pointofsale.IceCream();
        iceCreamPOS1.setFlavor("Pistachio");
        iceCreamPOS1.setPrice(2.50);
        iceCreamPOS1.setQuantity(2);
        System.out.println(iceCreamPOS1);

        com.company.pointofsale.IceCream iceCreamPOS2 = new com.company.pointofsale.IceCream();
        iceCreamPOS2.setFlavor("Pistachio");
        iceCreamPOS2.setPrice(2.50);
        iceCreamPOS2.setQuantity(2);
        System.out.println(iceCreamPOS2);

       assertEquals(iceCreamPOS1, iceCreamPOS2);
    }


}
