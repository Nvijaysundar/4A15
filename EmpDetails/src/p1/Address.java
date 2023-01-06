package p1;

class Address {
	String Hno,Stname,City;
	int pin;
	
	Address(String Hno,String Stname,String City,
					int pin)
	{
		this.Hno = Hno;
		this.Stname = Stname;
		this.City = City;
		this.pin = pin;
	}
	void getData() {
		System.out.println("Address: "+Hno+"\t"
							+Stname+"\t"+City+"\t"+pin);
	}
}
