/* To Calculate angle between hour and min hand of an analog clock */
import java.util.Scanner;
public class Angle {
	public static void main(String[] args) 
	{
		String time;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a time");
      	time =in.nextLine();
      	int l=time.length();
      	int n=time.indexOf (':');
      	if (n!=-1)
		{
			try
			{
				String hr=time.substring(0,n);
				String min=(time.substring(n+1,l));
      			int hour = Integer.parseInt(hr);
      			int minute = Integer.parseInt(min);
      			if (((hour>=0) && (hour<=12)) && ((minute>=0) && (minute<60)))
      			{
					System.out.println("Minimum angle between the hour and min hand at " +hr+":"+min+" is ="+ handleAngle(hour,minute));  
				}
				else
				{
					System.out.println("Enter time in correct format (hh:mm). Where, 0<=hh<=12 and 0<=mm<=60");
				}
			}
			catch (NumberFormatException e) 
				{
      				System.out.println("Enter time in correct format (hh:mm). Where, 0<=hh<=12 and 0<=mm<=60");
				}
		}
		else
		{
			System.out.println("Enter time in correct format (hh:mm). Where, 0<=hh<=12 and 0<=mm<=60");
		}
	}
	private static int handleAngle(int h, int m) 
	{
        int h_angle=(int)((h*60+m)*0.5);
        int angle=(m*6)-h_angle;
		if (angle<0) angle=-angle;
  		return Math.min(360-angle,angle);	
    }
}