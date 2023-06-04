

public class Alcohol extends Beverage{
	private boolean weekend;
	private final double weekend_price = 0.60;

	//Constructors
	public Alcohol(String bevName, Size size, boolean isweekend) {
		super(bevName,Type.ALCOHOL, size);
		this.weekend=isweekend;
		
	}
	
	@Override
	public String toString ()
	{
		return super.toString()+ "your beverage is offered in the weekend and here is your new total " + calcPrice();
	}
    
	public boolean equals (Alcohol alc)
    {
    	if (super.equals(alc)&& weekend == alc.getWeekend())
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
	
	public double calcPrice()
	{
double price = super.getBasePrice();
		

		if (super.getSize()==Size.SMALL )
		{
			price = super.getBasePrice();
		}
		if (super.getSize()==Size.MEDIUM )
		{
			price = super.getBasePrice()+super.getSizePrice();
		}
		if (super.getSize()==Size.LARGE )
		{
			price = super.getBasePrice()+2*super.getSizePrice();
		}
		
		if (weekend ==true)
		{
			price += weekend_price ;
		}
		return price;
	}
	
	/** Accessors */
	public boolean getWeekend()
	{
		return weekend;
	}
	public double getweekendprice()
	{
		return weekend_price;
	}
	
	}

