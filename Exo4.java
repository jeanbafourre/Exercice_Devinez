
public class Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		num = 100;
		for (int i = 0; i<100; i++ ) {
			if (i*i >= num) break; 				// "break" veut dire "Sors de la boucle quand la condition n'est plus respectée et rejoins ce qui est en dehors de la boucle".
			System.out.print(i + " ");
		}
		System.out.print("loop complete");
	}

}
