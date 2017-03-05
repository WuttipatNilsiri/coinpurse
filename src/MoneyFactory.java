

public abstract class MoneyFactory {
	static String country;
	private static MoneyFactory factory = null;
	MoneyFactory(){
		
	}
	/**
	 * get factory that depend on country
	 * @return moneyFactory
	 */
	public static MoneyFactory getInstance(){
		if(factory == null) {
			if(country == null || country == "thai"){
				factory = new ThaiMoneyFactory();
			}else if (country == null || country == "malay"){
				factory = new MalayMoneyFactory();
			}
			
	      }
	      return factory;	
	}
	/**
	 * createMoney by double
	 * @param value
	 * @return valuable 
	 */
	public abstract Valuable createMoney(double value);
	/**
	 * createMoney by string
	 * @param value
	 * @return valuable 
	 */
	public Valuable createMoney(String value){
		Valuable var = null;
		double varDouble = Double.parseDouble(value);
		if (varDouble >= 20 ){
			var = new Banknote(varDouble);
		}else if ( varDouble > 0){
			var = new Coin(varDouble);
		}
		return var;
	}
	/**
	 * set country
	 * @param countrys
	 */
	public static void setMoneyFactory(String countrys){
		country = countrys;
	}
}
