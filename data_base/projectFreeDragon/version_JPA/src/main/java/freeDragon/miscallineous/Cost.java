package freeDragon.miscallineous;

import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class Cost {
	private Integer copper_coins;
	private Integer silver_coins;
	private Integer electrum_coins;
	private Integer gold_coins;
	private Integer platinum_coins;
	
	public Cost() {
		
	}

	

	public Cost(Integer copper_coins, Integer silver_coins, Integer electrum_coins, Integer gold_coins,
			Integer platinum_coins) {
		super();
		this.copper_coins = copper_coins;
		this.silver_coins = silver_coins;
		this.electrum_coins = electrum_coins;
		this.gold_coins = gold_coins;
		this.platinum_coins = platinum_coins;
	}



	public Integer getCopper_coins() {
		return copper_coins;
	}

	public void setCopper_coins(Integer copper_coins) {
		this.copper_coins = copper_coins;
	}

	public Integer getSilver_coins() {
		return silver_coins;
	}

	public void setSilver_coins(Integer silver_coins) {
		this.silver_coins = silver_coins;
	}

	public Integer getElectrum_coins() {
		return electrum_coins;
	}

	public void setElectrum_coins(Integer electrum_coins) {
		this.electrum_coins = electrum_coins;
	}

	public Integer getGold_coins() {
		return gold_coins;
	}

	public void setGold_coins(Integer gold_coins) {
		this.gold_coins = gold_coins;
	}

	public Integer getPlatinum_coins() {
		return platinum_coins;
	}

	public void setPlatinum_coins(Integer platinum_coins) {
		this.platinum_coins = platinum_coins;
	}

	@Override
	public int hashCode() {
		return Objects.hash(copper_coins, electrum_coins, gold_coins, platinum_coins, silver_coins);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cost other = (Cost) obj;
		return Objects.equals(copper_coins, other.copper_coins) && Objects.equals(electrum_coins, other.electrum_coins)
				&& Objects.equals(gold_coins, other.gold_coins) && Objects.equals(platinum_coins, other.platinum_coins)
				&& Objects.equals(silver_coins, other.silver_coins);
	}
	
	
}
