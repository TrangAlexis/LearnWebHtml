package freeDragons.entities.armors;

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

import freeDragons.entities.miscallineous.Cost;

@Entity
@Table(name = "Armors")
public class Armor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "typeArmor")
	@Enumerated(EnumType.STRING)
	private Type_Armor typeArmor;
	@Column(name = "nameArmor")
	private String nameArmor;
	@Column(name = "frenchName")
	private String frenchName;
	@Column(name = "cost")
	@Embedded
	private Cost cost;
	@Column(name = "basicAC")
	private Integer basicAC;
	@Column(name = "addDexModifier")
	private boolean addDexModifier=false;
	@Column(name = "maxDexBonus")
	private Integer maxDexBonus=null;
	@Column(name = "requieredStrength")
	private Integer requieredStrength=null;
	@Column(name = "stealthDisadventage")
	private boolean stealthDisadventage=false;
	@Column(name = "weight")
	private Integer weight;

	public Armor() {

	}

	public Armor(Type_Armor typeArmor, String nameArmor, String frenchName, Cost cost, Integer basicAC,
			boolean addDexModifier, Integer maxDexBonus, Integer requieredStrength, boolean stealthDisadventage,
			Integer weight) {
		super();
		this.typeArmor = typeArmor;
		this.nameArmor = nameArmor;
		this.frenchName = frenchName;
		this.cost = cost;
		this.basicAC = basicAC;
		this.addDexModifier = addDexModifier;
		this.maxDexBonus = maxDexBonus;
		this.requieredStrength = requieredStrength;
		this.stealthDisadventage = stealthDisadventage;
		this.weight = weight;
	}

	public Type_Armor getType_armor() {
		return typeArmor;
	}

	public void setType_armor(Type_Armor typeArmor) {
		this.typeArmor = typeArmor;
	}

	public String getFrench_name() {
		return frenchName;
	}

	public void setFrench_name(String frenchName) {
		this.frenchName = frenchName;
	}

	public Cost getCost() {
		return cost;
	}

	public void setCost(Cost cost) {
		this.cost = cost;
	}

	public Integer getBasic_AC() {
		return basicAC;
	}

	public void setBasic_AC(Integer basicAC) {
		this.basicAC = basicAC;
	}

	public boolean isAdd_dex_modifier() {
		return addDexModifier;
	}

	public void setAdd_dex_modifier(boolean addDexModifier) {
		this.addDexModifier = addDexModifier;
	}

	public Integer getMax_dex_bonus() {
		return maxDexBonus;
	}

	public void setMax_dex_bonus(Integer maxDexBonus) {
		this.maxDexBonus = maxDexBonus;
	}

	public Integer getRequiered_strength() {
		return requieredStrength;
	}

	public void setRequiered_strength(Integer requieredStrength) {
		this.requieredStrength = requieredStrength;
	}

	public boolean isStealth_disadventage() {
		return stealthDisadventage;
	}

	public void setStealth_disadventage(boolean stealthDisadventage) {
		this.stealthDisadventage = stealthDisadventage;
	}

	public Integer getWieght() {
		return weight;
	}

	public void setWieght(Integer weight) {
		this.weight = weight;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName_armor() {
		return nameArmor;
	}

	public void setName_armor(String nameArmor) {
		this.nameArmor = nameArmor;
	}

	@Override
	public String toString() {
		return "Armor [id=" + id + ", nameArmor=" + nameArmor + "]";
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
