package freeDragons.entities.miscallineous;

public enum Damage_Type {
	acid("acid"),bludgeoning("bludgeoning"),cold("cold"),fire("fire"),force("force"),
	lightning("lightning"),necrotic("necrotic"), piercing("piercing"),poison("poison"),
	psychic("psychic"),radiant("radiant"),slashing("slashing"),thunder("thunder"); 
	
	
	private String name;

	
	private Damage_Type(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	
}
