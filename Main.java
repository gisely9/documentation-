public class Main {
	
	
public static int  Fibonacci(int n) {
	
	if (n<=1)
	{
		return 1;
		
	}
	
	else {
		return fibonacci(n-1)+fibonacci(n-2);
	}
	}

public static int fibonacci(int n) {
	if(n<=1)
	{
		return 1;
	}
	
	int r=0 , p=1 , pp=1, i;
	for(i=2; i<=n; i++)
	{
		r= p + pp;
		pp= p;
		p = r;
	}
	
	return r;
}
	
    public static void  main(String[] args) {
    	
    	int i , n = 40;
    	System.out.print("n\tIterative\tRecursive\n");
    	System.out.print("==\t=========\t=========\n");
    	long start_time, end_time;
    	int difference , difference2;
    	for(i=20;i<=n;i++) 
    		
    	{
    		
    	start_time = System.nanoTime();
    	fibonacci(i);
    	end_time = System.nanoTime();
    	difference = (int)((end_time-start_time) /1e6);
    	start_time = System.nanoTime();
    	fibonacci(i);
    	end_time = System.nanoTime();
    	difference2 = (int)((end_time - start_time)/ 1e6);
    	System.out.print(i+"\t\t"+difference+"\t\t\t"+difference2 + "\t\n");
    	
    	}
    }
    
		

	}


