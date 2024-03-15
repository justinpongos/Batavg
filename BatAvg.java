
public class BatAvg {
	public static void main(String[]args) {
	
	double[] batting = new double[9];
	
	for (int index = 0; index < batting.length; index++) {
		batting[index] = ((int)(Math.random() * 501) / 1000.00);
		}//end for fill loop
	
	for (int index = 0; index < batting.length; index++) {
		System.out.println(batting[index]);
		}//end for
	
	double max = 0;
	
	for (int index = 0; index < batting.length; index++) {
		
		if (index == batting.length - 1) {
			System.out.println("the maximum batting average is " + max);
			}//end if
		if(max<batting[index]) {
			max = batting[index];
			}//end if
		}//end for
	}//end main
}//end class
