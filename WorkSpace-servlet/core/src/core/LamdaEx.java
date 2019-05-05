package core;

public class LamdaEx
{

public static void main(String[] args) {
	



	Runnable r=()->{
		for(int i=0;i<10;i++)
		{

    	System.out.println("hello");
		}
};

Thread t1=new Thread(r);
t1.start();


}
}