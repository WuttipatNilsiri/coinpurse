package coinpurse;

public class Coin implements Comparable<Coin>{
	double value;
	String curr = "Bath";
	/**
	 * Coin contractor
	 * @param value
	 */
	public Coin(double value){
		this.value = value;
	}
	/**
	 * Coin contractor with currency
	 * @param value of coin
	 * @param curr currency of coin
	 */
	public Coin(double value,String curr){
		this.value = value;
		this.curr = curr;
	}
	
	public double getValue(){
		return value;
	}
	public String getCurrency(){
		return curr;
	}
	/**
	 * check coin is same as the coin that use to test (Object arg) if arg is null it will return false
	 * if not it will check currency and value  
	 */
	public boolean equals(Object arg){
		if(arg == null){
			return false;
		}else 
			return ((Coin) arg).getCurrency() == this.curr && ((Coin) arg).getValue() == this.value;
	}
	/**
	 * compare value of coin if it same value it will compare currency
	 */
	public int compareTo(Coin c){
		  if(this.value-c.getValue() < 0.0){
			  return -1;
		  }else if(this.value-c.getValue() > 0.0){
			  return 1;
		  }else 
			  return this.curr.compareToIgnoreCase(c.getCurrency());
	}
	public String toString(){
		return value+"-"+curr;
	}
}
