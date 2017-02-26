package coinpurse;

public class MalayMoneyFactory extends MoneyFactory {
	static String curr;
	public MalayMoneyFactory(){
		
	}
	public Valuable createMoney(double value){
		Valuable var = null;
		if (value == 1 || value == 2 || value == 5 || value == 10 || value == 20 || value == 50 || value == 100){
			curr = "Ringgit";
			var = new Banknote(value,curr);
		}else if (value > 0 && value < 1){
			curr = "Sen";
			var = new Coin(value,curr);
		}
		return var;
	}
	
}
