
public class Exo1 {

	public static void main(String[] args) {
		
		int iresult, irem; // je déclare les deux variables "iresult" et "irem", de MÊME type "int" sur la même ligne.
		double dresult, drem; // je déclare les deux variables "dresult" et "drem", de MÊME type "double" sur la même ligne.
		iresult = 10 / 3; // J'attribue l'opération "10 % 3" à la variable "iresult" 
		irem = 10 % 3; // J'attribue le modulo "10 % 3" à la variable "irem" 
		dresult = 10.0 / 3.0; // J'attribue l'opération "10.0 / 3.0" à la variable "dresult"
		drem = 10.0 % 3.0; // J'attribue le modulo "10.0 % 3.0" à la variable "drem"
		
		// Je demande à ma console d'afficher 
		System.out.println("Result and remainder of 10 / 3: " + iresult +" " + irem);
		
		System.out.println("Result and remainder of 10.0 / 3.0: " + dresult +" " + drem);
		
		
		

	}

}
