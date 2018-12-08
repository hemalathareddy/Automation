package collecprog;
/*
 * *fibnoci seriess :
 * 
 * A series of number wit the sum of preceeding two numbers
 * 
 * 1,1,2,3,5,8,13
 * output:beforepreceed1
preceed0
1
beforepreceed0
preceed1
1
beforepreceed1
preceed1
2
beforepreceed1
preceed2
3
beforepreceed2
preceed3
5
beforepreceed3
preceed5
8
beforepreceed5
preceed8
13
beforepreceed8
preceed13
21
beforepreceed13
preceed21
34
beforepreceed21
preceed34
55

 * 
 *
 */
public class fibnocci {
	
	public static void main(String [] args)
	{
		int sum=0,beforepreceed=0,preceed=1;
		int count=0;
		while(count <10)
			
		{
			
			beforepreceed=preceed;
			preceed=sum;
			sum=beforepreceed+preceed;
			
			System.out.println("beforepreceed"+beforepreceed);
			System.out.println("preceed"+preceed);
			
			System.out.println(sum);
			count++;
			
			
		}
		
		
	}

}
