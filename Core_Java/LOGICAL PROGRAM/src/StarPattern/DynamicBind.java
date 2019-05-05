package StarPattern;
abstract class Demo
{
	abstract void drow();
}

class DemoImpl extends Demo
{


@Override
void drow() {
System.out.println("I m from DemoImpl");
	
}
}

public class DynamicBind {
   public static void main(String args[])
	{
	// TODO Auto-generated method stub


	Demo d=new DemoImpl(); 
	d.drow();
   }
}