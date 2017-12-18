package pokemon.model;

public class Dragonair extends Pokemon implements Dragon
{

	public Dragonair(int number, String name)
	{
		super(number, name);
	}
	
	public String sayDragonair()
	{
		return " Dragonair ";
	}
	
	public int hitByFire(int fireDamage)
	{
		int burnDamage = 0;
		return burnDamage;	
	}
	
	public int useBlizzard(int damageDone)
	{
		int damage = 90;
		return damage;
	}

	public String sayDragonite()
	{
		return null;
	}
}