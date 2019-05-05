package pack1;

public abstract class Demo2 {
	abstract void sum();
	abstract void show();
}
abstract class DemoAdapter extends Demo2
{

	@Override
	void sum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	     void show() {
		// TODO Auto-generated method stub
		
	}
}
	
	class DemoImpl extends DemoAdapter
	{
		 void show() {
				System.out.println("Hi I m DemoImpl");				
			}
	}
	class DemoApp
	{
		public static void main(String[] args) {
		 DemoAdapter ad=new DemoImpl();
		 ad.show();
		}
	}

