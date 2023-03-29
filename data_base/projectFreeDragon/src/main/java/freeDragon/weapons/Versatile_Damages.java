package freeDragon.weapons;

import java.util.Objects;

public class Versatile_Damages {
	
	private Integer versatile_number_dice=null;
	private Integer versatile_type_dice=null;
	
	public Versatile_Damages() {
		
	}

	public Versatile_Damages(Integer versatile_number_dice, Integer versatile_type_dice) {
		super();
		this.versatile_number_dice = versatile_number_dice;
		this.versatile_type_dice = versatile_type_dice;
	}

	public Integer getVersatile_number_dice() {
		return versatile_number_dice;
	}

	public void setVersatile_number_dice(Integer versatile_number_dice) {
		this.versatile_number_dice = versatile_number_dice;
	}

	public Integer getVersatile_type_dice() {
		return versatile_type_dice;
	}

	public void setVersatile_type_dice(Integer versatile_type_dice) {
		this.versatile_type_dice = versatile_type_dice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(versatile_number_dice, versatile_type_dice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Versatile_Damages other = (Versatile_Damages) obj;
		return Objects.equals(versatile_number_dice, other.versatile_number_dice)
				&& Objects.equals(versatile_type_dice, other.versatile_type_dice);
	}
	
	
}
