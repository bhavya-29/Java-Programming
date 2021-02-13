package converters;
public class DistanceConversion{
	public double conv_dist,dis;
	public int ch;
	public DistanceConversion(){}
	public DistanceConversion(double dis,int ch){
		this.dis = dis;
		this.ch = ch;
	}
	public double conversion(){
		switch(this.ch){
			case 1 : this.conv_dist = this.dis*1000;
				break;
			case 2 : this.conv_dist = this.dis/1000;
				break;
			case 3 : this.conv_dist = this.dis*0.621;
				break;
			case 4 : this.conv_dist = this.dis/0.621;
				break;
		}
		return(conv_dist);
	}
}