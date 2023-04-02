package freeDragon.armors;

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

import freeDragon.miscallineous.Cost;

@Entity
@Table(name = "Armors")
public class Armor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "type_armor")
	@Enumerated(EnumType.STRING)
	private Type_Armor type_armor;
	@Column(name = "name_armor")
	private String name_armor;
	@Column(name = "french_name")
	private String french_name;
	@Column(name = "cost")
	@Embedded
	private Cost cost;
	@Column(name = "basic_AC")
	private Integer basic_AC;
	@Column(name = "add_dex_modifier")
	private boolean add_dex_modifier=false;
	@Column(name = "max_dex_bonus")
	private Integer max_dex_bonus=null;
	@Column(name = "requiered_strength")
	private Integer requiered_strength=null;
	@Column(name = "stealth_disadventage")
	private boolean stealth_disadventage=false;
	@Column(name = "weight")
	private Integer weight;

	public Armor() {

	}

	public Armor(Type_Armor type_armor, String name_armor, String french_name, Cost cost, Integer basic_AC,
			boolean add_dex_modifier, Integer max_dex_bonus, Integer requiered_strength, boolean stealth_disadventage,
			Integer weight) {
		super();
		this.type_armor = type_armor;
		this.name_armor = name_armor;
		this.french_name = french_name;
		this.cost = cost;
		this.basic_AC = basic_AC;
		this.add_dex_modifier = add_dex_modifier;
		this.max_dex_bonus = max_dex_bonus;
		this.requiered_strength = requiered_strength;
		this.stealth_disadventage = stealth_disadventage;
		this.weight = weight;
	}

	public Type_Armor getType_armor() {
		return type_armor;
	}

	public void setType_armor(Type_Armor type_armor) {
		this.type_armor = type_armor;
	}

	public String getFrench_name() {
		return french_name;
	}

	public void setFrench_name(String french_name) {
		this.french_name = french_name;
	}

	public Cost getCost() {
		return cost;
	}

	public void setCost(Cost cost) {
		this.cost = cost;
	}

	public Integer getBasic_AC() {
		return basic_AC;
	}

	public void setBasic_AC(Integer basic_AC) {
		this.basic_AC = basic_AC;
	}

	public boolean isAdd_dex_modifier() {
		return add_dex_modifier;
	}

	public void setAdd_dex_modifier(boolean add_dex_modifier) {
		this.add_dex_modifier = add_dex_modifier;
	}

	public Integer getMax_dex_bonus() {
		return max_dex_bonus;
	}

	public void setMax_dex_bonus(Integer max_dex_bonus) {
		this.max_dex_bonus = max_dex_bonus;
	}

	public Integer getRequiered_strength() {
		return requiered_strength;
	}

	public void setRequiered_strength(Integer requiered_strength) {
		this.requiered_strength = requiered_strength;
	}

	public boolean isStealth_disadventage() {
		return stealth_disadventage;
	}

	public void setStealth_disadventage(boolean stealth_disadventage) {
		this.stealth_disadventage = stealth_disadventage;
	}

	public Integer getWieght() {
		return weight;
	}

	public void setWieght(Integer weight) {
		this.weight = weight;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName_armor() {
		return name_armor;
	}

	public void setName_armor(String name_armor) {
		this.name_armor = name_armor;
	}

	@Override
	public String toString() {
		return "Armor [id=" + id + ", name_armor=" + name_armor + "]";
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
		Armor other = (Armor) obj;
		return Objects.equals(id, other.id);
	}

}
