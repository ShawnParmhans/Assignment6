import org.junit.Assert;
import org.junit.Test;

public class SizeTestStudent {

    @Test
    public void testGetSizePrice() {
        double smallPrice = Size.SMALL.getSizePrice();
        double mediumPrice = Size.MEDIUM.getSizePrice();
        double largePrice = Size.LARGE.getSizePrice();

        Assert.assertEquals(0.0, smallPrice, 0.0);
        Assert.assertEquals(1.0, mediumPrice, 0.0);
        Assert.assertEquals(2.0, largePrice, 0.0);
    }
}
