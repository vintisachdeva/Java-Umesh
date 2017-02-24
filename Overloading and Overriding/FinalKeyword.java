package javaclass;

final class Final{	// cannot be inherited
	
	final void show() // cannot override
	{	
		System.out.println("Show final data");
	}
}

class Result extends Final{

	@Override
	void show()
	{
		System.out.println("This is my new show of Result");
	}
	
}
public class FinalKeyword {

	public static void main(String[] args) {

		final int value = 1;	// final->constant-> cannot be changed at runtime
		
		System.out.println(value++);
		
	}

}
