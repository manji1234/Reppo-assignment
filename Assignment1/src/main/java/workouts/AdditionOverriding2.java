package workouts;

public class AdditionOverriding2 extends AdditionOverriding1
{
	public int show()
	{
		super.show();
		if(c%10==0)
		{
			System.out.println("Addetion number is divisible by 10");
		}
		else
		{
			System.out.println("It is not divisible");
		}
		return c;
	}
	
	public static void main(String[] args) 
	{
		AdditionOverriding2 obj=new AdditionOverriding2();
		System.out.println(obj.show());

	}

}
