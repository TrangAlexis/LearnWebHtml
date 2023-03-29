package freeDragon.miscallineous;

import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class Dice_Throw {
	private Integer number_of_dice;
	private	Integer dice_type;
	
	
	public Dice_Throw() {
		
	}
	
	public Dice_Throw(Integer number_of_dice ,Integer dice_type) {
		super();
		this.number_of_dice = number_of_dice;
		this.dice_type = dice_type;
		
	}

	public Integer getDice_type() {
		return dice_type;
	}

	public void setDice_type(Integer dice_type) {
		this.dice_type = dice_type;
	}

	public Integer getNumber_of_dice() {
		return number_of_dice;
	}

	public void setNumber_of_dice(Integer number_of_dice) {
		this.number_of_dice = number_of_dice;
	}

	@Override
	public String toString() {
		return number_of_dice + "d" + dice_type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dice_type, number_of_dice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dice_Throw other = (Dice_Throw) obj;
		return Objects.equals(dice_type, other.dice_type) && Objects.equals(number_of_dice, other.number_of_dice);
	}
	
	
	
	
}
