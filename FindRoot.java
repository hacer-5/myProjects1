package FindRoot;

import java.util.Scanner;

public class FindRoot {

	public static void main(String[] args) {
		 Scanner scan= new Scanner(System.in);
	        System.out.println("enter a value:");
	        int a =scan.nextInt();
	        System.out.println("enter b value:");
	        int b=scan.nextInt();
	        System.out.println("enter c value:");
	        int c=scan.nextInt();
	        double root1,root2;
	        double delta;
	        double m=b*b;
	        double n=4*a;
	        double k=n*c;
	        delta=m-k;
	        System.out.println("delta equals:"+delta);
	        if(delta>=0) {
	        	
	        	root1=(-b+Math.sqrt(delta))/2*a;
	        	root2=(-b-Math.sqrt(delta))/2*a;
	        	System.out.println(root1);
	        	System.out.println(root2);
	        	
	        }else {
	        	System.out.println("do not have reel roots");
	        	
	        }
	        
	       
	}
	}


