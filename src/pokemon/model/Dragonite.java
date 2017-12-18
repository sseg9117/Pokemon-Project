package pokemon.model;

public class Dragonite extends Pokemon implements Dragon
{

	public Dragonite(int number, String name)
	{
		super(number, name);
	}

	public int useBlizzard(int damageDone)
	{
		return 0;
	}

	public int hitByFire(int fireDamage)
	{
		return 0;
	}

	public String sayDragonite()
	{
		return " Dragonite" ;
	}

}
