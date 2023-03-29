package freeDragon.weapon;

import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class Versatile_Status {
	
	private boolean versatile=false;
	private Dice_Throw one_hand_dmgs=null;
	private Dice_Throw two_hands_dmgs=null;
	
	public Versatile_Status() {
		
	}

	public Versatile_Status(Dice_Throw one_hand_dmgs, Dice_Throw two_hands_dmgs) {
		super();
		this.versatile = true;
		this.one_hand_dmgs = one_hand_dmgs;
		this.two_hands_dmgs = two_hands_dmgs;
	}

	public boolean isVersatile() {
		return versatile;
	}

	public void setVersatile(boolean versatile) {
		this.versatile = versatile;
	}

	public Dice_Throw getOne_hand_dmgs() {
		return one_hand_dmgs;
	}

	public void setOne_hand_dmgs(Dice_Throw one_hand_dmgs) {
		this.one_hand_dmgs = one_hand_dmgs;
	}

	public Dice_Throw getTwo_hands_dmgs() {
		return two_hands_dmgs;
	}

	public void setTwo_hands_dmgs(Dice_Throw two_hands_dmgs) {
		this.two_hands_dmgs = two_hands_dmgs;
	}

	@Override
	public String toString() {
		return "Versatile ("+ two_hands_dmgs + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(one_hand_dmgs, two_hands_dmgs);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Versatile_Status other = (Versatile_Status) obj;
		return Objects.equals(one_hand_dmgs, other.one_hand_dmgs)
				&& Objects.equals(two_hands_dmgs, other.two_hands_dmgs);
	}
	
	
	
	

}
