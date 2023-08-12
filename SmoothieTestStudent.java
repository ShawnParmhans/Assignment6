import org.junit.Assert;
import org.junit.Test;

public class SmoothieTestStudent {

    @Test
    public void testCalcPrice() {
        Smoothie smoothie = new Smoothie("Strawberry Mango", Size.SMALL, 3, true);
        double expectedPrice = 5.0;
        double actualPrice = smoothie.calcPrice();

        Assert.assertEquals(expectedPrice, actualPrice, 0.0);
    }

    @Test
    public void testToString() {
        Smoothie smoothie = new Smoothie("Sour Supreme", Size.MEDIUM, 5, false);
        String expectedString = "Smoothie: Sour Supreme, Size: MEDIUM, Number of Fruits: 5, Has Protein Powder: false, Price: $5.5";
        String actualString = smoothie.toString();

        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void testEquals() {
        Smoothie smoothie1 = new Smoothie("Mango Madness", Size.LARGE, 2, true);
        Smoothie smoothie2 = new Smoothie("Mango Madness", Size.LARGE, 2, true);
        Smoothie smoothie3 = new Smoothie("Sweet&Sour", Size.SMALL, 4, false);

        Assert.assertEquals(smoothie1, smoothie2); 
        Assert.assertNotEquals(smoothie1, smoothie3); 
    }
}
