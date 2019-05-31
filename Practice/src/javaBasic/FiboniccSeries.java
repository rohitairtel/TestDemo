/**
 * 
 */
package javaBasic;

/**
 * @author A1SKIVA4
 *
 */
public class FiboniccSeries {
	
	public static void main(String []args) {
		
		int count = 8;
		int num1 =0;
		int num2 =1;
		int sumOfTwoNum ;
		
		for(int i = 0; i<=count;++i) {
			
			System.out.println("Total count is:"+ count);
			
			System.out.println(num1);
			
			sumOfTwoNum = num1 + num2;
			num1=num2;
			num2 = sumOfTwoNum;
			
			
		}
		
		
	}

}
