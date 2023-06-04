

public class Coffee extends Beverage
	{

	private final double extra_shot=0.50;
	private final double extra_syrup = 0.50;
	private boolean extrashot;
	private boolean extrasyrup;
	
	/** Constructors */
	public Coffee(String bevName, Size size, boolean Shot, boolean syrup) 
	{
		super(bevName,Type.COFFEE, size);
		this.extrashot=Shot;
		this.extrasyrup= syrup;
		
	}
	
	/** Utility */
	@Override
	public String toString()
	{
		return super.getBevName()+super.addSizePrice()+ extra_shot+extra_syrup+ 
				" your total would be "+ super.addSizePrice();
	}
	
	/** Calculate */
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
				if (extrasyrup == true )
				{
					price += extra_syrup;
				}
				if (extrashot==true)
				{
					price+=extra_shot;
				}
		return price;
	}

	public boolean equals(Coffee anothercoffe)
	{
		if(this.equals(anothercoffe)&& extrashot == anothercoffe.getExtraShot()&& extrasyrup == anothercoffe.getExtraSyrup())
		{		
			return true;					
		}
		else
			return false;
	}
	
	/** Accessors */
	public boolean getExtraSyrup()
	{
		return extrasyrup ;
	}
	public boolean getExtraShot() 
	{
		return extrashot;
	}
	
	
	/** Mutators */
	public void setExtraSyrup(boolean syrup)
	{
		this.extrasyrup = syrup;
	}
	public void setExtraShot(boolean shot)
	{
		this.extrashot=shot;
	}
	
		
}
