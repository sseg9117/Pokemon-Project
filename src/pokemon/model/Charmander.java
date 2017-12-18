package pokemon.model;

public class Charmander extends Pokemon implements Fire
{	
	public Charmander(int number, String name)
	{
		super(number, name);
	}
	
	public int hurtByWater(int waterHurtDamage)
	{
		int hurt = 5;
		return hurt;
	}
	
	public int throwFire(int burnDamage)
	{
		int burn1 = 10;
		return burn1;
	}
	
	public String sayCharmander()
	{
		return " Charmander ";
	}

	public int breathFire(int burnDamage)
	{
		return 0;
	}

}
