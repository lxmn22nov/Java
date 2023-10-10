//Implementing run time polymorphism.
// parent class Bank
class Bank
{
    // creating rateOfInterest method.
	float rateOfInterest()
    {
		return 0;
	}
}
// ICICI class extends Bank class.
class ICICI extends Bank
{
    // overriding rateOfInterest method.
	float rateOfInterest()
    {
		return 5.5f;
	}
}
// SBI class extends Bank class.
class SBI extends Bank
{
    // overriding rateOfInterest method.
	float rateOfInterest()
    {
		return 10.6f;
	}
}
// HDFC class extends Bank class.
class HDFC extends Bank
{
    // overriding rateOfInterest method.
	float rateOfInterest()
    {
		return 9.4f;
	}
}
class polymorphism1
{
    public static void main(String[] args) 
    {
        // creating variable of Bank class.
    	Bank B;
        B = new ICICI();
    	System.out.println("Rate of interest of ICICI is: "+B.rateOfInterest());
    	B = new SBI();
    	System.out.println("Rate of interest of SBI is: "+B.rateOfInterest());
    	B = new HDFC();
    	System.out.println("Rate of interest of HDFC is: "+B.rateOfInterest());
    }
}
