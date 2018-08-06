
public class Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b;
		b = false;
		
		System.out.println("b is " + b);
		
		b = true;
		System.out.println("b is " + b);
		
		if(b) System.out.println("This is executed"); 
		
		b = false;
		if(b) System.out.println("This is not executed");
		
		System.out.println("10>9 " + (10>9));

	}

}

// if(b) équivaut à if(b == true)