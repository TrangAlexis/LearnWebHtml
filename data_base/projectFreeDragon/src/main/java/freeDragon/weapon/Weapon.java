package freeDragon.weapon;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import freeDragon.miscallineous.DamageType;

@Entity
@Table(name="Weapons")
public class Weapon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="weapon_type")
	private String weapon_type;
	@Column(name="name_weapon")
	private String name_weapon;
	@Column(name="french_name")
	private String french_version;
	@Embedded
	private Dice_Throw damages;
	@Column(name = "damage_type")
	@Enumerated(EnumType.STRING)
	private DamageType damage_type;
	@Column(name="weight")
	private int weight;
	@Column(name="finess")
	private boolean finesse;
	@Column(name="heavy")
	private boolean heavy;
	@Column(name="light")
	private boolean light;
	@Column(name="loading")
	private boolean loading;
	@Column(name="range_weapon")
	private String range_weapon;
	@Column(name="reach")
	private boolean reach;
	@Column(name="special")
	private String special;
	@Column(name="thrown")
	private String thrown;
	@Column(name="two_handed")
	private boolean two_handed;
	@Column(name="versatile")
	private String versatile;
	
	public Weapon() {
		
	}
	
	

	public Weapon(String weapon_type, String name_weapon, String french_version, Dice_Throw damages,
			DamageType damage_type, int weight, boolean finesse, boolean heavy, boolean light, boolean loading,
			String range_weapon, boolean reach, String special, String thrown, boolean two_handed, String versatile) {
		super();
		this.weapon_type = weapon_type;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWeapon_type() {
		return weapon_type;
	}

	public void setWeapon_type(String weapon_type) {
		this.weapon_type = weapon_type;
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

	public String getRange_weapon() {
		return range_weapon;
	}

	public void setRange_weapon(String range_weapon) {
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

	public String getThrown() {
		return thrown;
	}

	public void setThrown(String thrown) {
		this.thrown = thrown;
	}

	public boolean isTwo_handed() {
		return two_handed;
	}

	public void setTwo_handed(boolean two_handed) {
		this.two_handed = two_handed;
	}

	public String getVersatile() {
		return versatile;
	}

	public void setVersatile(String versatile) {
		this.versatile = versatile;
	}

	@Override
	public String toString() {
		return "Weapon [id=" + id + ", weapon_type=" + weapon_type + ", name_weapon=" + name_weapon
				+ ", french_version=" + french_version + ", damages=" + damages + ", weight=" + weight + ", finesse="
				+ finesse + ", heavy=" + heavy + ", light=" + light + ", loading=" + loading + ", range_weapon="
				+ range_weapon + ", reach=" + reach + ", special=" + special + ", thrown=" + thrown + ", two_handed="
				+ two_handed + ", versatile=" + versatile + "]";
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
