package pokemon.model;

public class Dragonite extends Dragonair implements Dragon
{

	public Dragonite(int number, String name)
	{
		super(149, "Dragonite");
		setup();
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
	protected void setup()
	{
		this.setAttaPoints(234);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(123);
	}
}
