package _05_for_loops._2_badgers;
public class BadgerThingy {


	public static void main(String[] args) {

		String Badger= " Badger,";
		String Mushroom= " Mushroom,";
		String Snake= " A Snake!";		


		for (int repeats=0; repeats<2; repeats++) {
			for(int badger=0; badger<12; badger++){
				System.out.print(Badger);

			}
			System.out.println();
			for(int mushroom=0; mushroom<2; mushroom++){
				
				System.out.print(Mushroom);
			}
			System.out.println();
			System.out.println();
		}
	
	
		System.out.print(Snake);

	
	}

	
}