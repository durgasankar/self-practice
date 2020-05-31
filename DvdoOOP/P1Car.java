package DvdoOOP;

public class P1Car {
	
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	
	public void setModel(String model) {
		String validmodel = model.toLowerCase();
		if(validmodel.equals("ford") || validmodel.equals("maruti")) {
			this.model = model;

		}else
			this.model = "unknown";
		
		
	}
	public String getModel() {
		return this.model;
	}

}
