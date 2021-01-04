package converters;
class CurrencyConversion{
	public double amt;
	public double money;
	public int choice;
	public CurrencyConversion(){}
	public CurrencyConversion(double money,int choice){
		this.money = money;
		this.choice=choice;
	}
	public double conversion(){
		switch(this.choice){
			case 1 :this.amt = this.money*73.38;
				break;
			case 2 : this.amt = this.money*89.82;
				break;
			case 3 : this.amt = this.money*0.71;
				break;
			case 4 : this.amt = this.money/73.38;
				break;
			case 5 : this.amt = this.money/89.82;
				break;
			case 6 : this.amt = this.money/0.71;
				break;
		}
		return(amt);
	}
}  