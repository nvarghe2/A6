

public class Smoothie extends Beverage{

		private int numFruit;
		private boolean protein ;
		private final double protein_price = 1.50;
		private final double fruit_price =0.5;
		
	
	public Smoothie(String bevName, Size size,int fruit, boolean addProtein ) {
		super(bevName,Type.SMOOTHIE, size);
		this.numFruit=fruit;
		this.protein=addProtein;
		
	}
	/** Utility */
	@Override
	public String toString()
	{
		return "your smoothie is a " + super.getSize() +" "+super.getBevName()+ " with "+
	getNumOfFruit()+ "fruits" + getAddProtein()+ " proteins"+ ".Your total is: ";
		
	}
	public boolean equals (Smoothie another)
	{
		if (super.equals(another)&& numFruit == another.getNumOfFruit()&& protein == another.getAddProtein())
				{
					return true;
				}
		else
			return false;
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
		price += numFruit*fruit_price;
		
		if (protein ==true)
		{
			price += protein_price ;
		}
		return price;
	}

/** Accessors */
	public int getNumOfFruit()
	{
		return numFruit;
	}
	public boolean getAddProtein()
	{
		return protein;
	}
	public double getFruitCost() {
		return fruit_price;
		}
	
	public double getProteinCost() {
		return protein_price;
		}

	
	/** Mutators */
	public void setNumOfFruit(int fruit)
	{
		this.numFruit=fruit;
	}
	
	public void setAddProtein(boolean Addprotein) {
		this.protein= Addprotein;
	}
	
	
	
	
	
	

}
