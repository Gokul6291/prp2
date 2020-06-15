import java.util.*;
public class New {
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int sum=0;
	while(n!=0)
	{
	int rem=n%10;
	n=n/10;
	sum=sum+rem;
	}
	System.out.println(sum);
	}
}
