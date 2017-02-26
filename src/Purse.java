package coinpurse;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

public  class Purse {
	int capacity;
	int count;
	List <Valuable> ValuablePurse;
	/**
	 * Purse contractor
	 * @param capacity fix capacity
	 */
	public Purse(int capacity){
		this.capacity = capacity;
		this.ValuablePurse = new ArrayList<Valuable>(capacity);
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
		for (Valuable x: this.ValuablePurse){
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
		if(count != capacity && c.getValue() > 0){
			
			ValuablePurse.add(c);
			Collections.sort(ValuablePurse);
			Collections.reverse(ValuablePurse);
			count++;
			return true;
		}else if (c.getValue() <= 0){
			return false;
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
		List <Valuable> coinPursebackup = new ArrayList<Valuable>(ValuablePurse.size());
		for (Valuable x : ValuablePurse){
			coinPursebackup.add(x);
		}
	    
	    
		for(int i = 0; i < ValuablePurse.size(); i++){
			withdw.add(ValuablePurse.get(i));
			amount = amount - ValuablePurse.get(i).getValue();
			coinPursebackup.remove(ValuablePurse.get(i));
			count--;
			if(amount < 0){
				withdw.remove(ValuablePurse.get(i));
				amount = amount + ValuablePurse.get(i).getValue();
				coinPursebackup.add(ValuablePurse.get(i));
				count++;
			}if(amount == 0){
				break;
			}
		}
		if (amount == 0){
			this.ValuablePurse = coinPursebackup;
			Valuable[] withdwArr = new Valuable[withdw.size()];
			return withdw.toArray(withdwArr);
			
		}else
			return null;
			
		
		
	}
	
	public String toString(){
		
		return count+" Val with value "+getBalance();
	}
	
	
}
