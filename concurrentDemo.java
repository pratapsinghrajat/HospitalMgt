import java.util.concurrent.*;
class concurrentDemo
{
	/*public static void main(String[] args) 
	{
	// Thread t= new Thread(new D("A"));
	// t.start();	

	//Executor e = Executors.newSingleThreadExecutor();     //for one thread is executed at a time //
	// Executor e =Executors.newCachedThreadPool();		//for all execution at a time alternly or in any order //
	// Executor e =Executors.newFixedThreadPool(2);
	ExecutorService e =Executors.newFixedThreadPool(3);

	e.execute(new D("B"));
	e.execute(new D("A"));
	e.submit(new D("C"));   // submit can return a value but not with execute()

	e.shutdown();// after shutdown() no new excution can be started as Executor is shutdown  .... it will stop to
																												// take any new task//
	//e.await(long ----,)

	//e.execute(new D("C"));   // RE but other thread will be executed //


	}*/




public static void main(String[] args) 
{
	try
	{
		ExecutorService e =Executors.newFixedThreadPool(3);
		Future <Integer> f1=e.submit(new D("B"));
		Future <Integer> f2=e.submit(new D("C"));
	  
		e.shutdown();
		e.awaitTermination(10,TimeUnit.SECONDS);

		System.out.println("Thread 1 = "+f1.get());
		System.out.println("Thread 2 = "+f2.get());
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

}
}



/*class D implements Runnable 
{
	String s;
	D(String s1)
	{
		s=s1;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
			System.out.println(s+" = "+ i);
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

	}*/




	class D implements Callable 
{
	String s;
	D(String s1)
	{
		s=s1;
	}
	public Integer call() throws Exception
	{
		int sum=0;
		for(int i=0;i<5;i++)
		{
			try
			{
			System.out.println(s+" = "+ i);
			Thread.sleep(1000);
			sum+=i;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		return sum;
	}
}