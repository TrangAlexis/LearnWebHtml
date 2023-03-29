package freeDragon.armor;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Armors")
public class Armor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="name_armor")
	private String name_armor;
	
	
	public Armor() {
		
	}


	public Armor(String name_armor) {
		super();
		this.name_armor = name_armor;
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
