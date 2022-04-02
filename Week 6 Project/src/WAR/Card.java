package WAR;

public class Card {
	
	private int value;
	private String name;
	
	public Card(int value, String name) {
		this.setValue(value);
		this.setName(name);
	}
	
	public void describe() {
		System.out.println("The " + getValue() + " of " + getName());
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
