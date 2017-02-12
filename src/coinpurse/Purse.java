package coinpurse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Purse {
	int capacity;
	int count;
	List <Coin> coinPurse;
	/**
	 * Purse contractor
	 * @param capacity fix capacity
	 */
	public Purse(int capacity){
		this.capacity = capacity;
		this.coinPurse = new ArrayList<Coin>(capacity);
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
		for (Coin x: this.coinPurse){
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
	public boolean insert(Coin c){
		if(count != capacity && c.getValue() > 0){
			coinPurse.add(c);
			Collections.sort(coinPurse);
			Collections.reverse(coinPurse);
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
	public Coin[] withdraw(double amount){
		List <Coin> withdw = new ArrayList<Coin>();
		List <Coin> coinPursebackup = new ArrayList<Coin>(coinPurse.size());
		for (Coin x : coinPurse){
			coinPursebackup.add(x);
		}
	    
	    
		for(int i = 0; i < coinPurse.size(); i++){
			withdw.add(coinPurse.get(i));
			amount = amount - coinPurse.get(i).getValue();
			coinPursebackup.remove(coinPurse.get(i));
			count--;
			if(amount < 0){
				withdw.remove(coinPurse.get(i));
				amount = amount + coinPurse.get(i).getValue();
				coinPursebackup.add(coinPurse.get(i));
				count++;
			}if(amount == 0){
				break;
			}
		}
		if (amount == 0){
			this.coinPurse = coinPursebackup;
			Coin[] withdwArr = new Coin[withdw.size()];
			return withdw.toArray(withdwArr);
			
		}else
			return null;
			
		
		
	}
	
	public String toString(){
		return count+" coin with value "+getBalance();
	}
	
	
}
