import java.util.*;
class Numbers{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);	
	int n,i=1;
	System.out.println("Enter the number : ");
	n=s.nextInt();

	do{
		System.out.println(i);
		i++;
	}while(i<=n);		 
}
}

