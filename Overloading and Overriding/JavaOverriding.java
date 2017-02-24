package javaclass;


class Vehicle
{
	
	void sound(){
		System.out.println("Vehicle sound");
	}
		
}

class Car extends Vehicle
{
	
	@Override
	void sound(){
		System.out.println("Car sound");
	}
}

class Bus extends Vehicle{
	
	@Override
	void sound()
	{	
		super.sound();// always denote parent
		System.out.println("Bus sound");	//functionality changes--> runtime
	}
	
}



public class JavaOverriding 
{

	public static void main(String args[])
	{
		Bus bus = new Bus();
		bus.sound();
	}
}
