package freeDragon.weapon;

import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class Thrown_Status {
	
	private boolean thrown=false;
	private Range_Weapon range=null;
	
	public Thrown_Status() {
		
	}

	public Thrown_Status(Range_Weapon range) {
		super();
		this.thrown = true;
		this.range = range;
	}

	public boolean isThrown() {
		return thrown;
	}

	public void setThrown(boolean thrown) {
		this.thrown = thrown;
	}

	public Range_Weapon getRange() {
		return range;
	}

	public void setRange(Range_Weapon range) {
		this.range = range;
	}

	
	
	@Override
	public String toString() {
		return "Thrown (range "+range.getNormal_range()+"/"+range.getMax_range()+")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(range);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Thrown_Status other = (Thrown_Status) obj;
		return Objects.equals(range, other.range);
	}
	
	
	
	
	
}
