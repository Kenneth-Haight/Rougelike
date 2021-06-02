import java.util.Scanner;
import java.util.Random;

public class Main {
	private static Scanner input; //Sets input to global to allow it to be used in any method

	public static void main(String[] args) {
		input = new Scanner(System.in);
		Random random = new Random();

		//Initialize variables used 
		int playerHealth = 0; 
		int coins = 0;
		int items[];
		String primary = "";
		String name = "";

		int numEncounters = 0; // Counts the number of monsters the player has encountered

		System.out.print("Welcome to Dungeon Crawl! Ready to play? y/n: "); //Start game
		char play = input.next().charAt(0);
		systemStart(play);

		System.out.println("Available classes:");
		System.out.println("Tank");
		System.out.println("Assassin");

		while (true) { //Repeat until player chooses a valid class to play as
			System.out.print("Choose what type of hero you want: ");
			String type = input.next();

			if (type.equals("Tank")) { //Tank class
				playerHealth = getHealth(1);
				Inventory Tank = new Inventory();
				Tank.setInventory("Tank");
				coins = Tank.getCoins();
				primary = Tank.getWeapon();
				items = Tank.getItems();
				System.out.print("Choose your name: ");
				name = input.next();
				break;
			} else if (type.equals("Assassin")) { //Assassin class
				playerHealth = getHealth(2);
				Inventory Assassin = new Inventory();
				Assassin.setInventory("Assassin");
				coins = Assassin.getCoins();
				primary = Assassin.getWeapon();
				items = Assassin.getItems();
				System.out.print("Choose your name: ");
				name = input.next();
				break;
			}
		}

		System.out.println();

		int encounterRange = random.nextInt(15 - 5) + 5; //Sets up how many encounters will be made
		encounter: while (numEncounters < encounterRange) { //Repeats until all encounters are complete or player dies
			Monsters enemy = new Monsters();
			String monster = enemyEncounter();

			System.out.println("You came across a "+monster+"!");
			int enemyHealth = enemy.monsterHealth(monster);

			while (true) {
				System.out.println("What would you like to do? ");
				while (true) {
					System.out.println("Attack: 0          Defend: 1          Use Item: 2");
					int choice = input.nextInt();
					if (choice == 0) {
						playerAttack(primary, monster, name, enemyHealth, coins, false);
					} else if (choice == 1) {
						System.out.println("Defend is still in progress");
						break;
					} else if (choice == 2) {
						System.out.println("You have " + items[0] + " health potions, " + items[1]
								+ " strength potions and " + items[2] + " other.");
						if (items[0] > 0)
							System.out.print("Enter 1 to use a health potion ");
						if (items[1] > 0)
							System.out.print("Enter 2 to use a strength potion ");
						if (items[2] > 0)
							System.out.print("Enter 3 to use a misc item ");
						int in = input.nextInt();
						if (in == 1)
							items[0] -= 1;
						playerHealth += getPotionHealth();
						if (in == 2)
							items[1] -= 1;
							playerAttack(primary, monster, name, enemyHealth, coins, true);
						if (in != 1 && in != 2 && in!= 3)
							break;
						break;
					} else {
						System.out.println("That is not an option.");
					}

					int hit = enemy.monsterDamage(monster);
					playerHealth -= hit;
					System.out.println(monster + " hit " + name + " doing " + hit + " damage!");
					System.out.println("You have " + playerHealth + " left.");
					if (playerHealth <= 0) {
						System.out.println(name + " is dead!");
						break encounter;
					}
				}
				System.out.println();
				numEncounters++;
			}
		}
	}

	public static void systemStart(char play) {// Starts game
		if (play == 'n') {
			System.exit(0);
		}

	}

	public static int getHealth(int type) { // Returns health of specific class
		switch (type) {
		case 1:
			return 100;
		case 2:
			return 75;
		}
		return type;
	}

	public static int getPotionHealth() { //Returns the amount a health potion heals for
		return 25;
	}

	public static String enemyEncounter() { // Determines what enemy the player will fight
		Random random = new Random();
		int chance = random.nextInt(4);
		switch (chance) {
		case 0:
			return "goblinMelee";
		case 1:
			return "orc";
		case 2:
			return "goblinArcher";
		case 3:
			return "dragon";
		}
		return null;
	}

	public static void playerAttack(String primary, String monster, String name, int enemyHealth, int coins, boolean potion) { //Executes the player attack and checks if the player used a strength potion, if true it will multiply damage by 1.5
		Weapons weapon = new Weapons();
		int hit = weapon.weaponHit(primary);
		if(potion == true)
			hit = (weapon.weaponHit(primary) * 2);
		Monsters method = new Monsters();

		enemyHealth = monsterHit(enemyHealth, hit);
		System.out.println(name + " hit " + monster + " doing " + hit + " damage with " + primary);
		System.out.println("The " + monster + " has " + enemyHealth + " left.");

		if (enemyHealth <= 0) {// Executes when the monster is killed
			System.out.println("The " + monster + " is dead!");

			int droppedCoin = method.corpseCoins();
			String droppedItem = method.corpseItem();

			System.out.println("The " + monster + " had " + droppedCoin);
			coins += droppedCoin;
			System.out.println("You now have " + coins + " coins");

			System.out.println("The " + monster + " also had " + droppedItem);
			if (!droppedItem.equals("nothing")) {
				System.out.println("Would you like to swap weapons? y/n: ");
				String answer = input.next();
				if (answer.equals("y"))
					primary = weapon.changeWeapon(droppedItem);
			}
		}
		System.out.println();
	}

	public int playerHit(int health, int damage) { // Returns the health after the player gets hit with an attack
		if (health - damage <= 0)
			return 0;
		return health - damage;
	}

	public static int monsterHit(int health, int damage) { // Returns the health after the monster gets hit with an
															// attack
		if (health - damage <= 0)
			return 0;
		return health - damage;
	}
}
