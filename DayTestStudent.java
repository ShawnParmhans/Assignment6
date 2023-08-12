import org.junit.Assert;
import org.junit.Test;

public class DayTestStudent {

    @Test
    public void testEnumValues() {
        Day[] expectedDays = {Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY};
        Day[] actualDays = Day.values();

        Assert.assertArrayEquals(expectedDays, actualDays);
    }
}
