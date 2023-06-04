

public class Customer {

	private String name;
	private int age;
	
	/** Constructors */
	public Customer(String n, int a)
	{
		this.name=n;
		this.age=a;
	}
	public Customer(Customer c)
	{
		this.age=c.age;
		this.name = c.name;
	}
	
	/** Accessors */
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	
	/** Mutators */
	public void setAge(int a)
	{
		this.age = a;
	}
	public void setName( String n)
	{
		
		this.name=n;
	}
	
	/** Utility */
	@Override
	 
	public String toString ()
	{
		return "Customer name is: "+ name+ "and age is: "+ age;
	}
}
