
public class Inventory {
	int coins = 0;
	int items[] = {0, 0, 0}; //element 0 is health potions, element 1 is strength potions and element 2 is misc
	String weapon = "";
	
	public void setInventory(String type) {
		if(type.equals("Tank")){
			coins = 50;
			weapon = "longSword";
			items[1] = 1;
		}
		else {
			coins = 49;
			weapon = "broadSword";
			items[0] = 1;
		}
	}
	
	public String getWeapon() {
		return weapon;
	}
	
	public int getCoins() {
		return coins;
	}
	
	public int setCoins(int x) {
		return coins + x;
	}
	
	public int[] getItems() {
		return items;
	}
}
