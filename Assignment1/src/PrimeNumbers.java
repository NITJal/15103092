import java.util.*;
public class PrimeNumbers {

	public static void main(String [] args)
	{
		int i=0,k=0;
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		System.out.println("Prime numbers till "+i+" is");
		for(int j=2;j<=i;j++)
		{
			int check=0;
			for(k=2;k<=j/2;k++)
			{
				if(j%k==0)
					check=1;
			}
			if(check==0)
			System.out.println(j);
			
		}
	}

}
