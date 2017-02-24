package javaclass;


class Overload
{
	
	void add()
	{
		int value1=10;
		int value2=20;
		int result = value1 + value2;
		System.out.println("Result is=" + result);
	}

	void add(int value1, int value2)
	{
		System.out.println(value1 + value2);
	}
	
	void add(float value1, float value2)
	{
		System.out.println(value1 + value2);
	}
	
	int add(long value1, int value2)
	{
		return 0;
	}
	
}

public class JavaOverloading {

	public static void main(String[] args) 
	{
		Overload overload = new Overload();
		overload.add();
		overload.add(10, 20);
		overload.add(10.1f, 20.0f);
		overload.add(2000l, 20);
	}
}
