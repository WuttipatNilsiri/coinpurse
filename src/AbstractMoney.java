

public abstract class AbstractMoney implements Valuable {
	double value;
	String curr = "Bath";
	public AbstractMoney(double value,String curr){
		if(value > 0){
			this.value = value;
		}else
			this.value = 0.0;
		this.curr = curr;
	}
	public double getValue(){
		return value;
	}
	public String getCurrency(){
		return curr;
	}
	/**
	 * test if Object is valuable so then test equal by currency and value
	 */
	public boolean equals(Object arg){
		if(arg == null){
			return false;
		}else 
			return ((Valuable) arg).getCurrency() == curr && ((Valuable)  arg).getValue() == value;
	}
	/**
	 * test some currency of valuable obj is null  if not then it compare by get currency first 
	 */
	public int compareTo(Valuable c){
		if(!curr.equals( c.getCurrency() ) && curr != null && c.getCurrency() != null ){
			return curr.compareToIgnoreCase(c.getCurrency());
		}else if(value-c.getValue() < 0.0){
			return -1;
		}else if (value-c.getValue() > 0.0){
			return 1; 
		}else
			return 0;
	}
		

	
}
