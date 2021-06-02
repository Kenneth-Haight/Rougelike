import java.util.Random;

public class Weapons {
	String broadSword, longSword, greatSword, longBow, compositeBow, halberd, spear, battleAxe;
	
	public String changeWeapon(String primary) { //Changes weapon in hand
		switch(primary) {
		case "broadSword":
			return "broadSword";
		case "longSword":
			return "longSword";
		case "greatSword":
			return "greatSword";
		case "longBow":
			return "longBow";
		case "compositeBow":
			return "compositeBow";
		case "halberd":
			return "halberd";
		case "spear":
			return "spear";
		case "battleAxe":
			return "battleAxe";
		}
		return primary;
	}
	
	public int weaponHit(String weapon) {
		Random random = new Random();
		if (weapon.equals("broadSword")) {
			int range = 3;
			return (int) (random.nextInt(range-1)+1);
		}
		else if (weapon.equals("longSword")){
			int range = 6;
			return (int) (random.nextInt(range)+2);
		}
		else if (weapon.equals("greatSword")){
			int range = 9;
			return (int) (random.nextInt(range));
		}
		else if (weapon.equals("longBow")){
			int range = 5;
			return (int) (random.nextInt(range));
		}
		else if (weapon.equals("compositeBow")){
			int range = 10;
			return (int) (random.nextInt(range));
		}
		else if (weapon.equals("halberd")){
			int range = 7;
			return (int) (random.nextInt(range)+1);
		}
		else if (weapon.equals("spear")){
			int range = 6;
			return (int) (random.nextInt(range)+2);
		}
		else if (weapon.equals("battleAxe")){
			int range = 10;
			return (int) (random.nextInt(range)+1);
		}
		return 0;
	}
}
