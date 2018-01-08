package pokemon.model;

public class Charmander extends Charizard implements Fire
{	
	public Charmander()
	{
		super(4, "Charmander");
		setup();
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
	protected void setup()
	{
		this.setAttaPoints(234);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(123);
	}
}
