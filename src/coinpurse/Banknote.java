package coinpurse;

public  class Banknote implements Valuable{
	
	String curr = "Bath";
	long serialNum =1000000;
	double val;
	public Banknote (double val){
		this.val = val;
		
	}
	public Banknote (double val , String curr , long serialNum){
		this.val=val;
		this.curr=curr;
		this.serialNum=serialNum;
		
	}
	public Banknote (double val , String curr ){
		this.val=val;
		this.curr=curr;
		
	}
	public double getValue(){
		return val;
	}
	public String getCurrency(){
		return curr;
	}
	public long getSerial(){
		return serialNum;
	}
	public boolean equals(Object obj){
		if(obj.getClass().equals(this.getClass())){
			Banknote objCast = (Banknote) obj;
			return objCast.getCurrency() == curr && objCast.getValue() == val;
			
		}else
			return false;
			
	}
	public String toString(){
		return val+"-"+curr+ " banknote "+serialNum;
	}
	public int compareTo(Valuable b){
		if(this.val-b.getValue() < 0.0){
			  return -1;
		  }else if(this.val-b.getValue() > 0.0){
			  return 1;
		  }else 
			  return this.curr.compareToIgnoreCase(b.getCurrency());
	}
	@Override
	public boolean equals() {
		// TODO Auto-generated method stub
		return false;
	}
}
