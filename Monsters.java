import java.util.Random;

public class Monsters {
	
	public int monsterHealth(String x) {
		switch(x) {
		case "goblinMelee":
			return 20;
		case "orc":
			return 30;
		case "goblinArcher":
			return 20;
		case "dragon":
			return 75;
		case "boss":
			return 100;
		}
		return 0;
	}
	
	public int monsterDamage(String x) {
		switch(x) {
		case "goblinMelee":
			return 3;
		case "orc":
			return 5;
		case "goblinArcher":
			return 6;
		case "dragon":
			return 10;
		case "boss":
			return 15;
		}
		return 0;
	}
	
	public int corpseCoins() {
		Random num = new Random();
		return num.nextInt(51);
	}
	
	public String corpseItem() {
		Random num = new Random();
		int loot = num.nextInt(100);
		if(loot <= 100 && loot > 80)
			return "nothing";
		else if(loot <= 80 && loot > 70)
			return "broadSword";
		else if(loot <= 70 && loot > 60)
			return "longSword";
		else if(loot <= 60 && loot > 50)
			return "greatSword";
		else if(loot <= 50 && loot > 40)
			return "longBow";
		else if(loot <= 40 && loot > 30)
			return "compositeBow";
		else if(loot <= 30 && loot > 20)
			return "halberd";
		else if(loot <= 20 && loot > 10)
			return "spear";
		else if(loot <= 10 && loot >= 0)
			return "battleAxe";
		return null;
		}
	}
