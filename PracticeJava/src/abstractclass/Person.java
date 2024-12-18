package abstractclass;

//abstract class
public abstract class Person implements TestInterfaceForAbstract{

	private String name;
	private String gender;

	public Person(String nm, String gen) {
		this.name = nm;
		this.gender = gen;
	}

	// abstract method
	public abstract void work();

	@Override
	public String toString() {
		return "Name=" + this.name + "::Gender=" + this.gender;
	}

	public void changeName(String newName) {
		this.name = newName;
	}
}
