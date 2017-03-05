

public class Banknote extends AbstractMoney{
	
	long serialNum =1000000;
	/**
	 * initail bank with value
	 * @param val value
	 */
	public Banknote (double val){
		super(val, "bath");
	}
	/**
	 * initail bank with value currency and serial
	 * @param val value
	 * @param curr currency
	 * @param serialNum
	 */
	public Banknote (double val , String curr , long serialNum){
		super(val,"bath");
		this.serialNum=serialNum;
	}
	/**
	 * initail bank with value and currency
	 * @param val
	 * @param curr
	 */
	public Banknote (double val , String curr ){
		super(val,curr);	
	}
	/**
	 * get serial
	 * @return serialNum;
	 */
	public long getSerial(){
		return serialNum;
	}
	/**
	 * convert to string that contain value currency and serial
	 */
	public String toString(){
		return super.value+"-"+curr+ " banknote "+serialNum;
	}
	
	
}
