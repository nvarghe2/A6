
import java.util.ArrayList;

public class BevShop implements BevShopInterface {

	private int numOfAlcoholdr;  
	private int currentOrder;
	private ArrayList<Order> orders;
	
	@Override
	public boolean isValidTime(int time) {
		if (time >= MIN_TIME && time <= MAX_TIME) {
			return true;
		}
		return false;
	}

	@Override
	public int getMaxNumOfFruits() {
		
		return 0;
	}

	@Override
	public int getMinAgeForAlcohol() {
		
		return MIN_AGE_FOR_ALCOHOL;
	}

	@Override
	public boolean isMaxFruit(int numOfFruits) {
		if (numOfFruits > MAX_FRUIT) {
			return true;
		}

		return false;
	}

	@Override
	public int getMaxOrderForAlcohol() {
		// TODO Auto-generated method stub
		return MAX_ORDER_FOR_ALCOHOL;
	}

	@Override
	public boolean isEligibleForMore() {
		if (numOfAlcoholdr < 3) {
			return true;
		}
	
		return false;
	}

	@Override
	public int getNumOfAlcoholDrink() {
		
		return numOfAlcoholdr;
	}

	@Override
	public boolean isValidAge(int age) {
		if (age > MIN_AGE_FOR_ALCOHOL) {
			return true;
		}
		return false;
	}

	@Override
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		Customer customer = new Customer(customerName, customerAge);
		Order order = new Order(time, day, customer);
		orders.add(order);
		currentOrder = orders.indexOf(order);
		numOfAlcoholdr = 0;
	}

		
	

	@Override
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		orders.get(currentOrder).addNewBeverage(bevName, size, extraShot, extraSyrup);
		
	}

	@Override
	public void processAlcoholOrder(String bevName, Size size) {
		orders.get(currentOrder).addNewBeverage(bevName, size);
		numOfAlcoholdr++;
		
	}

	@Override
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		orders.get(currentOrder).addNewBeverage(bevName, size, numOfFruits, addProtein);
	}

	@Override
	public int findOrder(int orderNo) {
		for (int i = 0; i < orders.size(); i++) {
			if (orders.get(i).getOrderNo() == orderNo) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
double orderSale = 0;
		
		for (Order o : orders) {
			if (o.getOrderNo() == orderNo) {
				for (Beverage b : o.getBeverages()) {
					orderSale += b.calcPrice();
				}
			}
		}
		
		return orderSale;

	}

	@Override
	public double totalMonthlySale() {
		double totalSale = 0;
				
				for (Order o : orders) {
					for (Beverage b : o.getBeverages()) {
						totalSale += b.calcPrice();
					}
				}
				
				return totalSale;

	}

	@Override
	public int totalNumOfMonthlyOrders() {
		
		return orders.size();
	}

	@Override
	public Order getCurrentOrder() {
		
		return orders.get(currentOrder);
	}

	@Override
	public Order getOrderAtIndex(int index) {
		// TODO Auto-generated method stub
		return orders.get(index);
	}

	@Override
	public void sortOrders() {
		for (int i = 0; i < orders.size()-1; i++) {
			int minOrderNumIdx = i;
			for (int j = i+1; j < orders.size(); j++) {
				if (orders.get(j).getOrderNo() < orders.get(minOrderNumIdx).getOrderNo()) {
					minOrderNumIdx = j;
				}
			}
				
			Order temp = orders.get(minOrderNumIdx);
			orders.set(minOrderNumIdx, orders.get(i));
			orders.set(i, temp);
		}

		
	}
	@Override
	public String toString ()
	{
		String s = "Monthly Orders\n";
		
		for (Order o : orders) {
			s += o.toString();
		}
		s += "Total Sale: " +totalMonthlySale();
		
		return s;

	}
	

}
