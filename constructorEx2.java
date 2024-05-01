class SGGS{
	static int x=786;
	int y= 2024;
	{
		System.out.println("init block:" + this);
	}
	SGGS(){
		System.out.println("Inside Constructor:SGGS()::"this);
	}
	static public void main(String args[]){
		SGGS sggs1= new SGGS;
		System.out.println(sggs1);
		SGGS sggs2 = new SGGS;
		System.out.println (sggs2);
	}
	public string toString(){
		return "Hi";
	}
	}
