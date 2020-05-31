package InnerClass;

import java.util.ArrayList;

public class GearBox {
	private ArrayList<Gear> gears;
	private int maxGear;
	private int currentGear;
	private boolean clutchIn;
	public GearBox(int maxGears) {
		this.maxGear = maxGears;
		gears = new ArrayList<Gear>();
		this.currentGear = currentGear;
		this.maxGear = maxGears;
		for(int i=0; i<=gears.size(); i++) {
			addGear(i,i*5.3);
		}
	}
	public void clutchOperation(boolean in) {
		this.clutchIn =in;
	}
	private void addGear(int Number, double ratio) {
		if(Number > 0 && Number <= maxGear) {
			gears.add(new Gear(Number,ratio));
		}
	}
	public void changeGear(int newGear) {
		if(clutchIn && (newGear < this.gears.size() && newGear >= 0)) {
			System.out.println("gear "+newGear+" selected.");
		}else {
			System.out.println("gear changing unsuccessful");
		}
	}
	public double wheelSpeed(int revolutions) {
		if(clutchIn) {
			System.out.println("problem");
			return 0.0;
		}else {
			return revolutions * gears.get(currentGear).getRatio();
		}
	}


	public class Gear {
		private int gearNumber;
		private double ratio;
		public Gear(int gearNumber, double ratio) {
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}
		public double driveSpeed(int revolution) {
			return revolution*(this.ratio);
		}
		public double getRatio() {
			return ratio;
		}
		public void setRatio(double ratio) {
			this.ratio = ratio;
		}
		
		
	}

}
