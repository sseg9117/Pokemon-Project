package pokemon.model;

public class Charizard extends Pokemon implements Fire
{
	public Charizard(int number, String name)
	{
		super(number, name);
	}
	
	public String sayCharizard()
	{
		return "Charizard";
	}
	
	public int breathFire(int burnDamage)
	{
		int burn1 = 90;
		return burn1;
	}
	
	public int hurtByWater(int waterHurtDamage)
	{
		int hurt = 5;
		return hurt;
	}

	public int throwFire(int burnDamage)
	{
		return 0;
	}

	public String sayCharmander()
	{
		return null;
	}
	
	
}
