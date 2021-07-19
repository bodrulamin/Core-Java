class Student{
    int id;
    String name;
    String address;

    Student(){
    }




    Student(int id, String name){
	this.id = id;
	this.name = name;
    }



    Student(int id, String name, String address){
	this.id = id;
	this.name = name;
	this.address = address;
    }


    public void displayMessage(){
	System.out.println("Hi Sakib");

    }

    public static void main(String[] args){
	// variable declaration
	System.out.println("Hi Sakib");

	System.out.println("==============Default object==================");
	Student std = new Student();
	System.out.println("Id: " + std.id);
	System.out.println("name: " + std.name);
	System.out.println("Address: " + std.address);

	System.out.println("==============1st object==================");
	Student std1 = new Student(1,"Rakib");
	System.out.println("Id: " + std1.id);
	System.out.println("name: " + std1.name);
	System.out.println("Address: " + std1.address);



	System.out.println("==============2nd object==================");
	Student std2 = new Student(1,"Rakib","Dhaka");
	System.out.println("Id: " + std2.id);
	System.out.println("name: " + std2.name);
	System.out.println("Address: " + std2.address);




    }	

}

