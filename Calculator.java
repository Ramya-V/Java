import java.util.*;
class Calculator{
public static void main(String args[]){
	int a,b,c,choice;
 	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number 1 :");
	a=s.nextInt();
	System.out.println("Enter the number 2 :");
	b=s.nextInt();
	System.out.println("The Operations are :\n1.+\n2.-\n3.*\n4./\n");
	System.out.println("Enter the Option: ");
	choice=s.nextInt(); 	

	switch(choice){
	
	case 1:
		c=a+b;
		System.out.println("The result is "+c);
		break;
	case 2:
		c=a-b;
		System.out.println("The result is "+c);
		break;
	case 3:
		c=a*b;
		System.out.println("The result is "+c);
		break;
	case 4:
		c=a/b;
		System.out.println("The result is " +c);
		break;
	default:
		System.out.println("invalid");
		break;
	}
}
}
