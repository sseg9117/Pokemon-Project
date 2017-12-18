package pokemon.model;

public class Dragonite extends Pokemon implements Dragon
{

	public Dragonite(int number, String name)
	{
		super(number, name);
	}

	public int useDragonDance(int effectGiven)
	{
		int works = 10;
		return works;
	}

	public int hitByFire(int fireDamage)
	{
		int burned = 0;
		return burned;
	}

	public String sayDragonite()
	{
		return " Dragonite" ;
	}

	public String sayDragonair()
	{
		return null;
	}

	public int useBlizzard(int damageDone)
	{
		return 0;
	}

}
