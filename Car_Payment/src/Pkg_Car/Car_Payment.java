package Pkg_Car;

public class Car_Payment {
	private double price;
	private double down_payment;
	private int length;
	private double interest;
	
	
	public Car_Payment(double p, double dp, int l, double i){
		this.price = p;
		this.down_payment = dp;
		this.length = l;
		this.interest = i;
		
		
	}
	public double monthly_payment() {
		return (interest / 12 * (price-down_payment))/(1-Math.pow((1+interest/12),-length));
		
	}
	public double total_spent_interest() {
		return length * monthly_payment()-(price- down_payment) ;
		
	}

}


