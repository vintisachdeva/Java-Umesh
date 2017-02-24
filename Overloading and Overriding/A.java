package javaclass;

class B

{
	B()
	{
		this(10);
		System.out.println("B Class Default Constructor");


	}
	B(int a)

	{

		System.out.println("B class Parameterized Constructor");


	}


}

class A extends B

{

	A()
	{
		System.out.println("A Class Default Constructor");
	}

	public static void main(String args[])
	{
		A obj=new A();		
	}
}

