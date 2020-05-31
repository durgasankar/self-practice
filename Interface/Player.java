package Interface;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable {
	private String name;
	private int hitPoint;
	private int Strength;
	private String weapon;
	
	public Player(String name, int hitPoint, String weapon) {
		this.name = name;
		this.hitPoint = hitPoint;
		this.weapon = weapon;
		this.Strength = Strength;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitPoint() {
		return hitPoint;
	}

	public void setHitPoint(int hitPoint) {
		this.hitPoint = hitPoint;
	}

	public int getStrength() {
		return Strength;
	}

	public void setStrength(int strength) {
		Strength = strength;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", hitPoint=" 
				+ hitPoint + ", Strength=" + Strength +
				", weapon=" + weapon + "]";
	}

	@Override
	public List<String> write() {
		List<String> values = new ArrayList<String>();
		values.add(name);
		values.add(1+""+this.hitPoint);
		values.add(2+""+this.Strength);
		values.add(weapon);
		return values;
	}

	@Override
	public void read(List<String> savedValues) {
		if(savedValues != null && savedValues.size() > 0) {
			this.name = savedValues.get(0);
			this.hitPoint = Integer.parseInt(savedValues.get(1));
			this.Strength = Integer.parseInt(savedValues.get(2));
			this.weapon = savedValues.get(3);
		}
		
	}
	
	
	

}
