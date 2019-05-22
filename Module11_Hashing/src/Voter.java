import java.util.Objects;

public class Voter {
	
	private int id;
	private String name;
	
	public Voter(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Voter voter = (Voter) o;
		return id == voter.id &&
				Objects.equals(name, voter.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		return name + " (" + id + ")";
	}
	

	
	
}
