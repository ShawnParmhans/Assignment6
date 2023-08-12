/*
Class: CMSC203 CRN 40398
Program: Assignment 6
Instructor: Farnaz Eivazi
Summary of Description: Beverage Shop
Due Date: 08/07/2023 
Integrity Pledge: I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
Shawn Parmhans
*/

public class Smoothie extends Beverage 
{
    private int numberOfFruits;
    private boolean addProteinPowder;

    //Constructor
    public Smoothie(String n,  Size s, int numFruit, boolean hasPP) 
    {
        super(n, Type.SMOOTHIE, s);
        numberOfFruits = numFruit;
        addProteinPowder = hasPP;
    }

    //Getters
    public int getNumberOfFruits() 
    {
        return numberOfFruits;
    }

    public boolean hasProteinPowder() 
    {
        return addProteinPowder;
    }
    private double getBasePrice() 
    {
        return BASE_PRICE;
    }

    //Setters
	public void setNumOfFruits(int numfr) 
	{
		numberOfFruits = numfr;
	}

	public void setProteinPowder(boolean addp) 
	{
		addProteinPowder = addp;
	}

    //calcPrice 
	@Override
	public double calcPrice() 
	{
	    int priceInCents = (int) (getBasePrice() * 100) + (int) (getSize().getSizePrice() * 100);

	    if (addProteinPowder)
	        priceInCents += 150; // 150 cents

	    priceInCents += 50 * numberOfFruits; // 50 cents per fruit

	    return priceInCents / 100.0; // Convert back to dollars
	}

    // toString 
    public String toString() 
    {
        return ("Smoothie: " + getBevName() + ", Size: " + getSize() 
        + ", Number of Fruits: " + numberOfFruits +
                ", Has Protein Powder: " + addProteinPowder 
                + ", Price: $" + calcPrice());
    }

    // Equals method
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Smoothie smoothie = (Smoothie) obj;
        return numberOfFruits == smoothie.numberOfFruits && addProteinPowder == smoothie.addProteinPowder;
    }
}
