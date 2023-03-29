package freeDragon.weapons;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import freeDragon.miscallineous.Cost;
import freeDragon.miscallineous.Damage_Type;
import freeDragon.miscallineous.Dice_Throw;

@Entity
@Table(name="Weapons")
public class Weapon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="simple_martial")
	private String simple_martial;
	@Column(name="melee_ranged")
	private String melee_ranged;
	@Column(name="name_weapon")
	private String name_weapon;
	@Column(name="french_name")
	private String french_version;
	@Column(name="cost")
	@Embedded
	private Cost cost;
	@Embedded
	@AttributeOverride(name = "number_of_dice", column = @Column(name = "damages_dice_number"))
	@AttributeOverride(name = "dice_type", column = @Column(name = "damages_dice_type"))
	private Dice_Throw damages;
	@Column(name = "damage_type")
	@Enumerated(EnumType.STRING)
	private Damage_Type damage_type;
	@Column(name="silver_plated")
	private boolean silver_plated=false;
	@Column(name="magical")
	private boolean magical=false;
	@Column(name="weight")
	private int weight;
	@Column(name="finess")
	private boolean finesse=false;
	@Column(name="heavy")
	private boolean heavy=false;
	@Column(name="light")
	private boolean light=false;
	@Column(name="loading")
	private boolean loading=false;
	@Embedded
	private Range_Weapon range_weapon = new Range_Weapon();
	@Column(name="reach")
	private boolean reach=false;
	@Column(name="special")
	private String special;
	@Embedded
	private Range_Weapon_Thrown thrown = new Range_Weapon_Thrown();
	@Column(name="two_handed")
	private boolean two_handed=false;
	@Embedded
	@AttributeOverride(name = "number_of_dice", column = @Column(name = "versatile_damages_dice_number"))
	@AttributeOverride(name = "dice_type", column = @Column(name = "versatile_damages_dice_type"))
	private Dice_Throw versatile;
	
	
	
	public Weapon() {
		
	}
	
	

	public Weapon(String simple_martial, String melee_ranged, String name_weapon, String french_version, Cost cost,
			Dice_Throw damages, Damage_Type damage_type, boolean silver_plated, boolean magical, int weight,
			boolean finesse, boolean heavy, boolean light, boolean loading, boolean reach, String special,
			Range_Weapon_Thrown thrown, boolean two_handed, Dice_Throw versatile) {
		super();
		this.simple_martial = simple_martial;
		this.melee_ranged = melee_ranged;
		this.name_weapon = name_weapon;
		this.french_version = french_version;
		this.cost = cost;
		this.damages = damages;
		this.damage_type = damage_type;
		this.silver_plated = silver_plated;
		this.magical = magical;
		this.weight = weight;
		this.finesse = finesse;
		this.heavy = heavy;
		this.light = light;
		this.loading = loading;
		this.reach = reach;
		this.special = special;
		this.thrown = thrown;
		this.two_handed = two_handed;
		this.versatile = versatile;
	}



	public Weapon(String simple_martial, String melee_ranged, String name_weapon, String french_version,
			Dice_Throw damages, Damage_Type damage_type, int weight, boolean finesse, boolean heavy, boolean light,
			boolean loading, Range_Weapon range_weapon, boolean reach, String special, Range_Weapon_Thrown thrown, boolean two_handed,
			Dice_Throw versatile) {
		super();
		this.simple_martial = simple_martial;
		this.melee_ranged = melee_ranged;
		this.name_weapon = name_weapon;
		this.french_version = french_version;
		this.damages = damages;
		this.damage_type = damage_type;
		this.weight = weight;
		this.finesse = finesse;
		this.heavy = heavy;
		this.light = light;
		this.loading = loading;
		this.range_weapon = range_weapon;
		this.reach = reach;
		this.special = special;
		this.thrown = thrown;
		this.two_handed = two_handed;
		this.versatile = versatile;
	}
	
	


	public Weapon(String simple_martial, String melee_ranged, String name_weapon, String french_version,
			Dice_Throw damages, Damage_Type damage_type, boolean silver_plated, boolean magical, int weight,
			boolean finesse, boolean heavy, boolean light, boolean loading, boolean reach, String special,
			Range_Weapon_Thrown thrown, boolean two_handed, Dice_Throw versatile) {
		super();
		this.simple_martial = simple_martial;
		this.melee_ranged = melee_ranged;
		this.name_weapon = name_weapon;
		this.french_version = french_version;
		this.damages = damages;
		this.damage_type = damage_type;
		this.silver_plated = silver_plated;
		this.magical = magical;
		this.weight = weight;
		this.finesse = finesse;
		this.heavy = heavy;
		this.light = light;
		this.loading = loading;
		this.reach = reach;
		this.special = special;
		this.thrown = thrown;
		this.two_handed = two_handed;
		this.versatile = versatile;
	}

	public Weapon(String simple_martial, String melee_ranged, String name_weapon, String french_version,
			Dice_Throw damages, Damage_Type damage_type, boolean silver_plated, boolean magical, int weight,
			boolean finesse, boolean heavy, boolean light, boolean loading, Range_Weapon range_weapon, boolean reach,
			String special, boolean two_handed, Dice_Throw versatile) {
		super();
		this.simple_martial = simple_martial;
		this.melee_ranged = melee_ranged;
		this.name_weapon = name_weapon;
		this.french_version = french_version;
		this.damages = damages;
		this.damage_type = damage_type;
		this.silver_plated = silver_plated;
		this.magical = magical;
		this.weight = weight;
		this.finesse = finesse;
		this.heavy = heavy;
		this.light = light;
		this.loading = loading;
		this.range_weapon = range_weapon;
		this.reach = reach;
		this.special = special;
		this.two_handed = two_handed;
		this.versatile = versatile;
	}

	public Weapon(String simple_martial, String melee_ranged, String name_weapon, String french_version,
			Dice_Throw damages, Damage_Type damage_type, boolean silver_plated, boolean magical, int weight,
			boolean finesse, boolean heavy, boolean light, boolean loading, boolean reach, String special,
			boolean two_handed, Dice_Throw versatile) {
		super();
		this.simple_martial = simple_martial;
		this.melee_ranged = melee_ranged;
		this.name_weapon = name_weapon;
		this.french_version = french_version;
		this.damages = damages;
		this.damage_type = damage_type;
		this.silver_plated = silver_plated;
		this.magical = magical;
		this.weight = weight;
		this.finesse = finesse;
		this.heavy = heavy;
		this.light = light;
		this.loading = loading;
		this.reach = reach;
		this.special = special;
		this.two_handed = two_handed;
		this.versatile = versatile;
	}
	
	
	public boolean isSilver_plated() {
		return silver_plated;
	}

	public void setSilver_plated(boolean silver_plated) {
		this.silver_plated = silver_plated;
	}

	public boolean isMagical() {
		return magical;
	}

	public void setMagical(boolean magical) {
		this.magical = magical;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getSimple_martial() {
		return simple_martial;
	}

	public void setSimple_martial(String simple_martial) {
		this.simple_martial = simple_martial;
	}

	public String getMelee_ranged() {
		return melee_ranged;
	}

	public void setMelee_ranged(String melee_ranged) {
		this.melee_ranged = melee_ranged;
	}

	public Damage_Type getDamage_type() {
		return damage_type;
	}

	public void setDamage_type(Damage_Type damage_type) {
		this.damage_type = damage_type;
	}

	public String getName_weapon() {
		return name_weapon;
	}

	public void setName_weapon(String name_weapon) {
		this.name_weapon = name_weapon;
	}

	public String getFrench_version() {
		return french_version;
	}

	public void setFrench_version(String french_version) {
		this.french_version = french_version;
	}

	public Dice_Throw getDamages() {
		return damages;
	}

	public void setDamages(Dice_Throw damages) {
		this.damages = damages;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isFinesse() {
		return finesse;
	}

	public void setFinesse(boolean finesse) {
		this.finesse = finesse;
	}

	public boolean isHeavy() {
		return heavy;
	}

	public void setHeavy(boolean heavy) {
		this.heavy = heavy;
	}

	public boolean isLight() {
		return light;
	}

	public void setLight(boolean light) {
		this.light = light;
	}

	public boolean isLoading() {
		return loading;
	}

	public void setLoading(boolean loading) {
		this.loading = loading;
	}

	public Range_Weapon getRange_weapon() {
		return range_weapon;
	}

	public void setRange_weapon(Range_Weapon range_weapon) {
		this.range_weapon = range_weapon;
	}

	public boolean isReach() {
		return reach;
	}

	public void setReach(boolean reach) {
		this.reach = reach;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}



	public Range_Weapon_Thrown getThrown() {
		return thrown;
	}

	public void setThrown(Range_Weapon_Thrown thrown) {
		this.thrown = thrown;
	}

	public boolean isTwo_handed() {
		return two_handed;
	}

	public void setTwo_handed(boolean two_handed) {
		this.two_handed = two_handed;
	}

	public Dice_Throw getVersatile() {
		return versatile;
	}

	public void setVersatile(Dice_Throw versatile) {
		this.versatile = versatile;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Weapon other = (Weapon) obj;
		return Objects.equals(id, other.id);
	}

	
	
	

	
	
	
	
}
