
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

public  class Purse {
	private int capacity;
	private int count;
	List <Valuable> valuablePurse;
	/**
	 * Purse contractor
	 * @param capacity fix capacity
	 */
	public Purse(int capacity){
		this.capacity = capacity;
		this.valuablePurse = new ArrayList<Valuable>(capacity);
		count = 0;
		
	}
	/**
	 * 
	 * @return count amount of coin
	 */
	public int count(){
		return count;
	}
	/**
	 * calculate balance
	 * @return sum value of all coin in purse
	 */
	public double getBalance(){
		double sum = 0;
		for (Valuable x: this.valuablePurse){
			sum = sum + x.getValue();
		}
		return sum;
	}
	
	public int getCapacity(){
		return capacity;
	}
	/**
	 * 
	 * @return true if amount of coin = capacity else is false
	 */
	public boolean isFull(){
		return count == capacity;
	}
	/**
	 * add coin to purse
	 * @param c Coin that want to insert 
	 * @returns true if adding is success
	 */
	public boolean insert(Valuable c){
		if(isFull() && c.getValue() > 0){
			
			valuablePurse.add(c);
			Collections.sort(valuablePurse);
			Collections.reverse(valuablePurse);
			count++;
			return true;
		}else 
			return false;
	}
	/**
	 * 
	 * @param amount that want to withdraw
	 * @return array of coin that withdrawable
	 */
	public Valuable[] withdraw(double amount){
		List <Valuable> withdw = new ArrayList<Valuable>();
		List <Valuable> coinPursebackup = new ArrayList<Valuable>(valuablePurse.size());
		for (Valuable x : valuablePurse){
			coinPursebackup.add(x);
		}
		for(int i = 0; i < valuablePurse.size(); i++){
			withdw.add(valuablePurse.get(i));
			amount = amount - valuablePurse.get(i).getValue();
			coinPursebackup.remove(valuablePurse.get(i));
			count--;
			if(amount < 0){
				withdw.remove(valuablePurse.get(i));
				amount = amount + valuablePurse.get(i).getValue();
				coinPursebackup.add(valuablePurse.get(i));
				count++;
			}if(amount == 0){
				break;
			}
		}
		if (amount == 0){
			this.valuablePurse = coinPursebackup;
			Valuable[] withdwArr = new Valuable[withdw.size()];
			return withdw.toArray(withdwArr);
			
		}else
			return null;
			
		
		
	}
	
	public String toString(){
		
		return count+" Val with value "+getBalance();
	}
	
	
}
