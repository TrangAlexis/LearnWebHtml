package freeDragons.entities.weapons;

import java.util.Objects;

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

import freeDragons.entities.miscallineous.Cost;
import freeDragons.entities.miscallineous.Damage_Type;
import freeDragons.entities.miscallineous.Dice_Throw;

@Entity
@Table(name="Weapons")
public class Weapon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="simpleMartial")
	private String simpleMartial;
	@Column(name="meleeRanged")
	private String meleeRanged;
	@Column(name="nameWeapon")
	private String nameWeapon;
	@Column(name="french_name")
	private String frenchVersion;
	@Column(name="cost")
	@Embedded
	private Cost cost;
	@Embedded
	@AttributeOverride(name = "number_of_dice", column = @Column(name = "damages_dice_number"))
	@AttributeOverride(name = "dice_type", column = @Column(name = "damages_dice_type"))
	private Dice_Throw damages;
	@Column(name = "damageType")
	@Enumerated(EnumType.STRING)
	private Damage_Type damageType;
	@Column(name="silverPlated")
	private boolean silverPlated=false;
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
	private Range_Weapon rangeWeapon = new Range_Weapon();
	@Column(name="reach")
	private boolean reach=false;
	@Column(name="special")
	private String special;
	@Embedded
	private Range_Weapon_Thrown thrown = new Range_Weapon_Thrown();
	@Column(name="twoHanded")
	private boolean twoHanded=false;
	@Embedded
	@AttributeOverride(name = "number_of_dice", column = @Column(name = "versatile_damages_dice_number"))
	@AttributeOverride(name = "dice_type", column = @Column(name = "versatile_damages_dice_type"))
	private Dice_Throw versatile;
	
	
	
	public Weapon() {
		
	}
	
	
	public Weapon(String nameWeapon) {
		this.nameWeapon=nameWeapon;
	}
	

	public Weapon(String simpleMartial, String meleeRanged, String nameWeapon, String frenchVersion, Cost cost,
			Dice_Throw damages, Damage_Type damageType, boolean silverPlated, boolean magical, int weight,
			boolean finesse, boolean heavy, boolean light, boolean loading, boolean reach, String special,
			Range_Weapon_Thrown thrown, boolean twoHanded, Dice_Throw versatile) {
		super();
		this.simpleMartial = simpleMartial;
		this.meleeRanged = meleeRanged;
		this.nameWeapon = nameWeapon;
		this.frenchVersion = frenchVersion;
		this.cost = cost;
		this.damages = damages;
		this.damageType = damageType;
		this.silverPlated = silverPlated;
		this.magical = magical;
		this.weight = weight;
		this.finesse = finesse;
		this.heavy = heavy;
		this.light = light;
		this.loading = loading;
		this.reach = reach;
		this.special = special;
		this.thrown = thrown;
		this.twoHanded = twoHanded;
		this.versatile = versatile;
	}



	public Weapon(String simpleMartial, String meleeRanged, String nameWeapon, String frenchVersion,
			Dice_Throw damages, Damage_Type damageType, int weight, boolean finesse, boolean heavy, boolean light,
			boolean loading, Range_Weapon rangeWeapon, boolean reach, String special, Range_Weapon_Thrown thrown, boolean twoHanded,
			Dice_Throw versatile) {
		super();
		this.simpleMartial = simpleMartial;
		this.meleeRanged = meleeRanged;
		this.nameWeapon = nameWeapon;
		this.frenchVersion = frenchVersion;
		this.damages = damages;
		this.damageType = damageType;
		this.weight = weight;
		this.finesse = finesse;
		this.heavy = heavy;
		this.light = light;
		this.loading = loading;
		this.rangeWeapon = rangeWeapon;
		this.reach = reach;
		this.special = special;
		this.thrown = thrown;
		this.twoHanded = twoHanded;
		this.versatile = versatile;
	}
	
	


	public Weapon(String simpleMartial, String meleeRanged, String nameWeapon, String frenchVersion,
			Dice_Throw damages, Damage_Type damageType, boolean silverPlated, boolean magical, int weight,
			boolean finesse, boolean heavy, boolean light, boolean loading, boolean reach, String special,
			Range_Weapon_Thrown thrown, boolean twoHanded, Dice_Throw versatile) {
		super();
		this.simpleMartial = simpleMartial;
		this.meleeRanged = meleeRanged;
		this.nameWeapon = nameWeapon;
		this.frenchVersion = frenchVersion;
		this.damages = damages;
		this.damageType = damageType;
		this.silverPlated = silverPlated;
		this.magical = magical;
		this.weight = weight;
		this.finesse = finesse;
		this.heavy = heavy;
		this.light = light;
		this.loading = loading;
		this.reach = reach;
		this.special = special;
		this.thrown = thrown;
		this.twoHanded = twoHanded;
		this.versatile = versatile;
	}

	public Weapon(String simpleMartial, String meleeRanged, String nameWeapon, String frenchVersion,
			Dice_Throw damages, Damage_Type damageType, boolean silverPlated, boolean magical, int weight,
			boolean finesse, boolean heavy, boolean light, boolean loading, Range_Weapon rangeWeapon, boolean reach,
			String special, boolean twoHanded, Dice_Throw versatile) {
		super();
		this.simpleMartial = simpleMartial;
		this.meleeRanged = meleeRanged;
		this.nameWeapon = nameWeapon;
		this.frenchVersion = frenchVersion;
		this.damages = damages;
		this.damageType = damageType;
		this.silverPlated = silverPlated;
		this.magical = magical;
		this.weight = weight;
		this.finesse = finesse;
		this.heavy = heavy;
		this.light = light;
		this.loading = loading;
		this.rangeWeapon = rangeWeapon;
		this.reach = reach;
		this.special = special;
		this.twoHanded = twoHanded;
		this.versatile = versatile;
	}

	public Weapon(String simpleMartial, String meleeRanged, String nameWeapon, String frenchVersion,
			Dice_Throw damages, Damage_Type damageType, boolean silverPlated, boolean magical, int weight,
			boolean finesse, boolean heavy, boolean light, boolean loading, boolean reach, String special,
			boolean twoHanded, Dice_Throw versatile) {
		super();
		this.simpleMartial = simpleMartial;
		this.meleeRanged = meleeRanged;
		this.nameWeapon = nameWeapon;
		this.frenchVersion = frenchVersion;
		this.damages = damages;
		this.damageType = damageType;
		this.silverPlated = silverPlated;
		this.magical = magical;
		this.weight = weight;
		this.finesse = finesse;
		this.heavy = heavy;
		this.light = light;
		this.loading = loading;
		this.reach = reach;
		this.special = special;
		this.twoHanded = twoHanded;
		this.versatile = versatile;
	}
	
	
	public boolean isSilver_plated() {
		return silverPlated;
	}

	public void setSilver_plated(boolean silverPlated) {
		this.silverPlated = silverPlated;
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
		return simpleMartial;
	}

	public void setSimple_martial(String simpleMartial) {
		this.simpleMartial = simpleMartial;
	}

	public String getMelee_ranged() {
		return meleeRanged;
	}

	public void setMelee_ranged(String meleeRanged) {
		this.meleeRanged = meleeRanged;
	}

	public Damage_Type getDamage_type() {
		return damageType;
	}

	public void setDamage_type(Damage_Type damageType) {
		this.damageType = damageType;
	}

	public String getName_weapon() {
		return nameWeapon;
	}

	public void setName_weapon(String nameWeapon) {
		this.nameWeapon = nameWeapon;
	}

	public String getFrench_version() {
		return frenchVersion;
	}

	public void setFrench_version(String frenchVersion) {
		this.frenchVersion = frenchVersion;
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
		return rangeWeapon;
	}

	public void setRange_weapon(Range_Weapon rangeWeapon) {
		this.rangeWeapon = rangeWeapon;
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
		return twoHanded;
	}

	public void setTwo_handed(boolean twoHanded) {
		this.twoHanded = twoHanded;
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
