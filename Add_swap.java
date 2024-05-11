package Switch_Case;
import java.util.*;
public class Add_swap 
{
	public static void main(String[] args) 
{
	int a,b,ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of a & b");
	a=sc.nextInt();
	b=sc.nextInt();
   do
   {
System.out.println("1:addition of 2 numbers\n2:swap of 2 numbers\n3:max from 2 numbers\n4:min from 2 numbers");		
	System.out.println("5:exit");
	System.out.println("enter u r choice");
	ch=sc.nextInt();
	switch(ch)
	{
	case 1: System.out.println("add="+(a+b)) ;break;
	case 2:
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = "+a+"  b = "+b);

	break;		
	case 3:
		if(a>b)
		{
		 System.out.println(a+" is max");
		}
		else if(b>a)
		{
			 System.out.println(b+" is max");
		}
		else 
		{
			System.out.println("euquals");
		}			
		break;
	case 4:
		if(b<a)
		{
		 System.out.println(b+" is min");
		}
		else if(a<b)
		{
			 System.out.println(a+" is min");
		}
		else 
		{
			System.out.println("euquals");
		}			
		break;
	case 5: System.exit(0);break;
	default:System.out.println("invalid choice");
	}
   }while(ch<=5);
 
}

}
