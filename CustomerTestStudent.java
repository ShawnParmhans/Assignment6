import org.junit.Assert;
import org.junit.Test;

public class CustomerTestStudent {

    @Test
    public void testGetName() {
        Customer customer = new Customer("Micheal Jackson", 30);
        String expectedName = "Micheal Jackson";

        Assert.assertEquals(expectedName, customer.getName());
    }

    @Test
    public void testGetAge() {
        Customer customer = new Customer("Lil Uzi", 25);
        int expectedAge = 25;

        Assert.assertEquals(expectedAge, customer.getAge());
    }

    @Test
    public void testSetName() {
        Customer customer = new Customer("Michelle Obama", 30);
        String newName = "Michelle Obama";
        customer.setName(newName);

        Assert.assertEquals(newName, customer.getName());
    }

    @Test
    public void testSetAge() {
        Customer customer = new Customer("Jane Janes", 25);
        int newAge = 30;
        customer.setAge(newAge);

        Assert.assertEquals(newAge, customer.getAge());
    }

    @Test
    public void testToString() {
        Customer customer = new Customer("Shawnie", 30);
        String expectedToString = "Customer: Shawnie\nAge: 30";

        Assert.assertEquals(expectedToString, customer.toString());
    }
}
