package org.kodnest.SpringFrameWork.AutoWiring;

public class Person {
	Mobile mob;
	Mobile mob2;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Mobile mob) {
		super();
		this.mob = mob;
	}

	public Mobile getMob() {
		return mob;
	}

	public void setMob(Mobile mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Person [mob=" + mob + "]";
	}

}
