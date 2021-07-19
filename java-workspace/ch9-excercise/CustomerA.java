public class Customer{	
		//variable diclaresion
	int id;	
	String phoneNo;
	String address;
	
	
	// constructor object declaretion
	
	//default constructor

	Customer(){		
	}
	
		// 2 perameter declaretion
	Customer(int id,String phoneNo){
		this.id=id;
		this.phoneNo=phoneNo;
		
	}	
// 3rd eta dea hoyni --------------------------------
	Customer(int id,String phoneNo,String address){
		this.id=id;
		this.phoneNo=phoneNo;
		this.address = address;
		
	}	
	// 4 perameter declaretion
	Customer(int id,String name,String phoneNo,String address){
		this.id=id;
		this.phoneNo=phoneNo;
		this.address=address;		
	}
	public static void main(String[]args){
		Customer cust=new Customer();
		System.out.println("==========dDefult Object============");
		System.out.println("Id: "+cust.id);		
		System.out.println("Phone No: "+cust.phoneNo);
		System.out.println("Address: "+cust.address);
		
		Customer cust1=new Customer(001,"01748542720");
		System.out.println("============Defult Object============");
		System.out.println("Id: "+cust1.id);		
		System.out.println("Phone No: "+cust1.phoneNo);
		System.out.println("Address: "+cust1.address);
		
		Customer cust2=new Customer(002,"1754865201","Dhaka");
		System.out.println("============Defult Object============");
		System.out.println("Id: "+cust2.id);		
		System.out.println("Phone No: "+cust2.phoneNo);
		System.out.println("Address: "+cust2.address);
	}	
}
