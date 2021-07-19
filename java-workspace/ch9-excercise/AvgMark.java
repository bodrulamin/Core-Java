class AvgMark{
    public static void main(String[] args){

	Student mehedi =new  Student("Mehedi Hasan" , 5666);

	mehedi.roll = 41848;
	mehedi.bangla = 50;
	mehedi.math = 60;
	mehedi.english = 70;
	mehedi.printDetails();
	mehedi.printAvg();

	Student munajir = new Student();
	munajir.name = "Munajir Khan";
	munajir.roll = 5458;
	munajir.bangla = 50;
	munajir.math = 60;
	munajir.english = 80;

	munajir.printDetails();

	munajir.printAvg();



    }	

}

class Student{
    int roll;
    String name;
    int bangla;
    int math;
    int english;
    // constructor method jeti object
    public Student(){
    }


    public Student(String n, int r){
	this.name = "MD. " + n;
	this.roll = r;
    }

    public void printDetails(){
	System.out.println("=============================");
	System.out.println("Name : " + name + " Roll : " + roll);
	System.out.println("=============================");
    }

    public void printAvg(){
	int sum = bangla + math + english;
	double avg = sum/3;
	System.out.println("Avg is : " + avg);

    }




}

// students class, name, roll, avg();
