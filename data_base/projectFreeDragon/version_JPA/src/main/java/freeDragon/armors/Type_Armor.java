package freeDragon.armors;

public enum Type_Armor {
	light("light"),medium("medium"),heavy("heavy"),shield("shield");
	private String name;
	
	private Type_Armor(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	

}
