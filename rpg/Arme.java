package rpg;

import java.util.Objects;

abstract class Arme{
	private int degat;

	public Arme(int degat) {
		this.degat = degat;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Arme arme = (Arme) o;
		return degat == arme.degat;
	}

	@Override
	public int hashCode() {
		return Objects.hash(degat);
	}

	public int getDegat() {
		return degat;
	}

	public void setDegat(int degat) {
		this.degat = degat;
	}

}