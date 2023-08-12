import org.junit.Assert;
import org.junit.Test;

public class TypeTestStudent {

    @Test
    public void testEnumValues() {
        Type coffee = Type.COFFEE;
        Type smoothie = Type.SMOOTHIE;
        Type alcohol = Type.ALCOHOL;

        Assert.assertEquals("COFFEE", coffee.name());
        Assert.assertEquals("SMOOTHIE", smoothie.name());
        Assert.assertEquals("ALCOHOL", alcohol.name());
    }

    @Test
    public void testEnumToString() {
        Type coffee = Type.COFFEE;
        Type smoothie = Type.SMOOTHIE;
        Type alcohol = Type.ALCOHOL;

        Assert.assertEquals("COFFEE", coffee.toString());
        Assert.assertEquals("SMOOTHIE", smoothie.toString());
        Assert.assertEquals("ALCOHOL", alcohol.toString());
    }
}
