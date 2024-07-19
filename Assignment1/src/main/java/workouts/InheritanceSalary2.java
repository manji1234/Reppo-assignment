package workouts;

public class InheritanceSalary2 extends InheritanceSalary1
{
	double hra,pf;
public void show()
{
	 hra=bp*0.05;
	 pf=bp*0.20;
	 System.out.println("hra :"+ hra);
	 System.out.println("pf :" + pf);
}
}
