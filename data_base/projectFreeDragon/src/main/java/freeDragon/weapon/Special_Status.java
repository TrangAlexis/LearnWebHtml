package freeDragon.weapon;

import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class Special_Status {
	private boolean special_weapon=false;
	private String special_description="";
	
	public Special_Status() {
		
	}

	public Special_Status(String special_description) {
		super();
		this.special_description = special_description;
	}

	public boolean isSpecial_weapon() {
		return special_weapon;
	}

	public void setSpecial_weapon(boolean special_weapon) {
		this.special_weapon = special_weapon;
	}

	public String getSpecial_description() {
		return special_description;
	}

	public void setSpecial_description(String special_description) {
		this.special_description = special_description;
	}

	@Override
	public String toString() {
		return "Special_Weapon [special_weapon=" + special_weapon + ", special_description=" + special_description
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(special_description);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Special_Status other = (Special_Status) obj;
		return Objects.equals(special_description, other.special_description);
	}
	
	

}
