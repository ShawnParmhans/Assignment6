public enum Size {
	SMALL(0.0),
    MEDIUM(1.0),
    LARGE(2.0);

    private double price;

    Size(double price) 
    {
        this.price = price;
    }

    public double getSizePrice() 
    {
        return price;
    }
}