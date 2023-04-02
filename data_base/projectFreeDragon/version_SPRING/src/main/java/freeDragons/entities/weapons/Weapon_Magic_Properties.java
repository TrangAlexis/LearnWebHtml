package freeDragons.entities.weapons;

import java.util.Objects;

import javax.persistence.Lob;

public class Weapon_Magic_Properties {
	@Lob
	private String description_magic_properties;
	
	public Weapon_Magic_Properties() {
		
	}

	public Weapon_Magic_Properties(String description_magic_properties) {
		super();
		this.description_magic_properties = description_magic_properties;
	}

	public String getDescription_magic_properties() {
		return description_magic_properties;
	}

	public void setDescription_magic_properties(String description_magic_properties) {
		this.description_magic_properties = description_magic_properties;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description_magic_properties);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Weapon_Magic_Properties other = (Weapon_Magic_Properties) obj;
		return Objects.equals(description_magic_properties, other.description_magic_properties);
	}
	
	
}
