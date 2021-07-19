class Customer{
    int custId;
    String custName;
    String custPhone;
    String address;

    Customer(){
    }




    Customer(int custId, String custName){
	this.custId = custId;
	this.custName = custName;
    }



    Customer(int custId, String custName, String address){
	this.custId = custId;
	this.custName = custName;
	this.address = address;
    }

    Customer(int custId, String custName,String custPhone, String address){
	this.custId = custId;
	this.custName = custName;
	this.custPhone = custPhone;
	this.address = address;


    }


    public void displayCustomerInfo(){
	System.out.println("Id: " + custId);
	System.out.println("custName: " + custName);
	System.out.println("Cust phone : " + custPhone );
	System.out.println("Address: " + address);


    }

    public static void main(String[] args){
	Customer c = new Customer();
	c.custId = 1263898;
	c.custName = "Bodrul Amin";
	c.custPhone = "01725717136";
	c.address = "Jhenaidah";

	c.displayCustomerInfo();


	System.out.println();


	Customer y = new Customer(1264858,"Yakub Ali","01585656545","Barisal");
	y.displayCustomerInfo();
	
    }	

}

