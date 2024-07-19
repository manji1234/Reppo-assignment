package workouts;

public class InheritanceSalary3 extends InheritanceSalary2
{
	double total;
public void tot()
{
	total=bp+hra-pf-deduction+bonus;
	System.out.println("total : " + total);
	
}
	public static void main(String[] args)
	{
		InheritanceSalary3 obj=new InheritanceSalary3();
		obj.disp();
		obj.show();
		obj.tot();

	}

}
