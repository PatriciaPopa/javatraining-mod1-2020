package enum_demo;

public class Artifact {
	private Origin origin;
	private Category category;
	private State state;

	public Artifact(Origin origin, Category category, State state) {
		super();
		this.origin = origin;
		this.category = category;
		this.state = state;
	}

	public Origin getOrigin() {
		return origin;
	}

	public void setOrigin(Origin origin) {
		this.origin = origin;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Artifact [origin=" + origin + ", category=" + category + ", state=" + state + "]";
	}
}

enum Origin{
	EGYPTIAN, ROMAN, GREEK, AZTEC
}

enum Category{
	JEWEL, RELIGIOUS_OBJECT, VASE, UNKNOWN
}

enum State{
	VERY_GOOD(4), GOOD(3), BAD(2), VERY_BAD(1);

	private final int mark;

	private State(int mark) {
		this.mark = mark;
	}

	public int getMark() {
		return mark;
	}
}
