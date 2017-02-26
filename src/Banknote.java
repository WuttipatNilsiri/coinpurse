package coinpurse;

public class Banknote extends AbstractMoney{
	
	long serialNum =1000000;
	public Banknote (double val){
		super(val, "bath");
	}
	public Banknote (double val , String curr , long serialNum){
		super(val,"bath");
		this.serialNum=serialNum;
	}
	public Banknote (double val , String curr ){
		super(val,curr);	
	}
	public long getSerial(){
		return serialNum;
	}
	public String toString(){
		return super.value+"-"+curr+ " banknote "+serialNum;
	}
	
	
}
