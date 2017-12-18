package pokemon.model;

public class Dragonite extends Pokemon implements Dragon
{

	public Dragonite(int number, String name)
	{
		super(number, name);
	}

	public int useDragonDance(int damageDone)
	{
		int moveDamage = 85;
		return moveDamage;
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
