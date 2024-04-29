// package weeks;



class MyException extends Exception {
	int iteration;
	MyException(int i) {
		this.iteration = i;
	}
}
public class w10q1_Exception {

	public static void main(String[] args) {
		 try {
			 loop();
		 } catch(MyException e) {
			 System.out.println("iteration occured at "+e.iteration);
		 }

	}
	public static void  loop() throws MyException {
		int n=10;
		for(int i=0; i<n; i++) {
			try {
				int result = n/i;
			} catch(ArithmeticException e) {
				System.out.println("Cannot divide by zero");
				System.out.println(i);
			}
		}
	}

}
