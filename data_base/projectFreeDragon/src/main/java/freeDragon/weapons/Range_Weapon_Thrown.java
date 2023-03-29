package freeDragon.weapons;

import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class Range_Weapon_Thrown {
	private Integer thrown_normal_range=null;
	private Integer thrown_max_range=null;
	
	public Range_Weapon_Thrown() {
		
	}

	public Range_Weapon_Thrown(Integer thrown_normal_range, Integer thrown_max_range) {
		super();
		this.thrown_normal_range = thrown_normal_range;
		this.thrown_max_range = thrown_max_range;
	}

	public Integer getThrown_normal_range() {
		return thrown_normal_range;
	}

	public void setThrown_normal_range(Integer thrown_normal_range) {
		this.thrown_normal_range = thrown_normal_range;
	}

	public Integer getThrown_max_range() {
		return thrown_max_range;
	}

	public void setThrown_max_range(Integer thrown_max_range) {
		this.thrown_max_range = thrown_max_range;
	}

	@Override
	public int hashCode() {
		return Objects.hash(thrown_max_range, thrown_normal_range);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Range_Weapon_Thrown other = (Range_Weapon_Thrown) obj;
		return Objects.equals(thrown_max_range, other.thrown_max_range)
				&& Objects.equals(thrown_normal_range, other.thrown_normal_range);
	}


	
	
	
	
	
}
