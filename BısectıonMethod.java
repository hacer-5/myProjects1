package numerıcal;

public class BısectıonMethod 
{

	public static void main(String[] args) 
	{
		double fx1=0;
		double fx2=1;
		double a1=fx1;
		double a2=fx2;
		int n=1;
		
		int ıterasyonNumber=0;
		double error=0.02;

		if(func(fx1)*func(fx2)<0)
		{
			 
			while (!((a2-a1)/Math.pow(2, n)<error))
			{
				
				n++;
				ıterasyonNumber++;
			
		  double midPoint=(fx1+fx2)/2;
		 
	
		  if(func(fx1)*func(midPoint)<0)
		  {
			  fx2=midPoint;
		  }
		  else {
			fx1=midPoint;
		}
		  
			}
			System.out.println("aralık: "+  "["+fx1+","+fx2+"]");
			
			System.out.println("midpoint : "+ (fx1+fx2)/2);
			System.out.println("iterasyon sayısı: "+ (ıterasyonNumber+1));
			
			
		}
	

	}
	public static double func(double x)
	{
		return Math.pow(x, 3) - 7 * Math.pow(x, 2) + 14 * x - 6;
	}

}
