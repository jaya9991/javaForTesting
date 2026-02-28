package loops;

	
	
	public class MagicPotion {

		static int i;

		public static void main(String[] args) {

		MagicPotion magic = new MagicPotion();
		magic.makePotion();

		}

		public void makePotion() {

			for (i = 1; i < 5; i++) {

				System.out.println("Magic ingredient  " + i + " added VOILAAAAAA");

			}

			System.out.println("MAGIC POTION IS READY!!!!");

		}

	}



