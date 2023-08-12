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

public class Coffee extends Beverage 
{
    private boolean hasExtraShot;
    private boolean hasExtraSyrup;

    public Coffee(String n, Size s, boolean ExtraShot, boolean ExtraSyrup) 
    {
        super(n, Type.COFFEE, s);
        hasExtraShot = ExtraShot;
        hasExtraSyrup = ExtraSyrup;
    }
 
    public String toString() 
    {
        String exShot = hasExtraShot ? "with extra shot" : "without extra shot";
        String exSyrup = hasExtraSyrup ? "with extra syrup" : "without extra syrup";
        return "Coffee: " + getBevName() + ", Size: " + getSize() +
        		", " + exShot + ", " + exSyrup + ", Price: $" + calcPrice();
    }
    
    @Override
    public double calcPrice() 
    {
        int priceInCents = (int) (BASE_PRICE * 100) + (int) (getSize().getSizePrice() * 100);
        if (hasExtraShot)
            priceInCents += 50;
        if (hasExtraSyrup)
            priceInCents += 50;

        return priceInCents / 100.0; // Convert back to dollars
    }
    
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        
        Coffee coffee = (Coffee) obj;
        return super.equals(obj) &&
                hasExtraShot == coffee.hasExtraShot &&
                hasExtraSyrup == coffee.hasExtraSyrup;
    }

    public boolean getExtraShot() {
        return hasExtraShot;
    }

    public void setExtraShot(boolean hasExtraShot) {
        this.hasExtraShot = hasExtraShot;
    }

    public boolean getExtraSyrup() {
        return hasExtraSyrup;
    }

    public void setExtraSyrup(boolean hasExtraSyrup) {
        this.hasExtraSyrup = hasExtraSyrup;
    }
}
