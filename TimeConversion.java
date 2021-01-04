package converters;

public class TimeConversion{
	public double conv_tim;
	public double tim;
	public int ch;
	public TimeConversion(){}
	public TimeConversion(double tim,int ch){
		this.tim = tim;
		this.ch = ch;
	}
	public double conversion(){
		switch(this.ch){
			case 1: this.conv_tim = this.tim*60;
				break;
			case 2: this.conv_tim = this.tim*60*60;
				break;
			case 3: this.conv_tim = this.tim/60;
				break;
			case 4: this.conv_tim = this.tim/(60*60);
				break;
		}
		return(conv_tim);
	}
}
