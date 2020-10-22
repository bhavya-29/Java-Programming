class Professor extends Employee{
	private double da,hra,pf,net_sal,gross_sal,club_fund; //Basic Pay(BP),Dearness Allowance(DA),Provident Fund(PF)
	private String bp;
	public Professor(){}
	
	public Professor(String emp_name,String emp_id,String address,String mail_id,String mob_no,String bp){
		super(emp_name,emp_id,address,mail_id,mob_no);
		this.bp=bp;
	}
	
	public void calculatesal(){
		double bp1 =Double.parseDouble(bp);
		this.da=(0.97*bp1);
		this.hra=(0.10*bp1);
		this.pf=(0.12*bp1);
		this.club_fund=(0.1*bp1);
		this.gross_sal=(bp1+da+hra);
		this.net_sal=(gross_sal-pf-club_fund);
	}
		
	
	public void display(){
		System.out.println("*************************************************************************");
		System.out.println("PAY SLIP DETAILS OF "+emp_name);
		super.displayEmployee();
		System.out.println("Basic Pay  : Rs."+bp);
		System.out.println("Dearness Allowance(DA) : "+da);
		System.out.println("House rent allowance (HRA) : "+hra);
		System.out.println("Provident Fund(PF) : "+pf);
		System.out.println("Club Fund : "+club_fund);
		System.out.println("Gross Salary : "+gross_sal);
		System.out.println("Net Salary : "+net_sal);
		System.out.println("************************************************************************");
	}

}
