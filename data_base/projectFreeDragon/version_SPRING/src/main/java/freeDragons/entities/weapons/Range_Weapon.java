package freeDragons.entities.weapons;

import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class Range_Weapon {
	private Integer normal_range=null;
	private Integer max_range=null;
	
	public Range_Weapon() {
		
	}

	public Range_Weapon(Integer normal_range, Integer max_range) {
		super();
		this.normal_range = normal_range;
		this.max_range = max_range;
	}

	public Integer getNormal_range() {
		return normal_range;
	}

	public void setNormal_range(Integer normal_range) {
		this.normal_range = normal_range;
	}

	public Integer getMax_range() {
		return max_range;
	}

	public void setMax_range(Integer max_range) {
		this.max_range = max_range;
	}

	@Override
	public String toString() {
		return "Range_Weapon [normal_range=" + normal_range + ", max_range=" + max_range + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(max_range, normal_range);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Range_Weapon other = (Range_Weapon) obj;
		return Objects.equals(max_range, other.max_range) && Objects.equals(normal_range, other.normal_range);
	}
	
	
	

}
