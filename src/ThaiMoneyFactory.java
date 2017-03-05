

public class ThaiMoneyFactory extends MoneyFactory{
	String curr;
	public ThaiMoneyFactory(){
		
	}
	/**
	 *  create thai money
	 */
	public Valuable createMoney(double value){
		Valuable var = null;
		
		if (value == 20 || value == 50 || value == 100 || value == 500 || value == 1000){
			curr = "Bath";
			var = new Banknote(value,curr);
		}else if (value > 1 && value < 20){
			curr = "Bath";
			var = new Coin(value,curr);
		}else if (value > 0){
			curr = "Stang";
			var = new Coin(value,curr);
		}
		return var;
	}
}
