
public class CreditCard {
	private double Balance;
	private double Limit;
	private String CCNumber;
	private String name;
	
	public CreditCard(double Balance, double Limit, String CCNumber, String name){
		Balance = 0;
		Limit = 10000;
		CCNumber = "00123456789";
		name = "John Smith";
	}
	public void Charge(double ChargeAmount){
		Balance += ChargeAmount;
	}
	public void payBalance(double Amount){
		Balance -= Amount;
	}
	public double getBalance(){
		return Balance;
	}
	public double getLimit(){
		return Limit;
	}
}
