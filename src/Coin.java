

public class Coin  extends AbstractMoney{
	
	public Coin(double value){
		super(value, "bath");
	}
	/**
	 * Coin contractor with currency
	 * @param value of coin
	 * @param curr currency of coin
	 */
	public Coin(double value,String curr){
		super(value, curr);
	}
	/**
	 * convert to string with value and curr
	 */
	public String toString(){
		return super.value+"-"+curr+" coin";
	}
	@Override
	/**
	 * equals if currency and value is same
	 */
	public boolean equals(Object arg){
		if(arg == null){
			return false;
		}else 
			return ((Valuable) arg).getCurrency() == curr && ((Valuable)  arg).getValue() == value;
	}
	
}
