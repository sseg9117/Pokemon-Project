package pokemon.model;

public class Dragonair extends Pokemon implements Dragon,Fairy
{

	public Dragonair(int number, String name)
	{
		super(148, "Dragonair");
		
		setup();
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

	public int useDragonDance(int damageDone)
	{
		return 0;
	}

	public String sayMrMime()
	{
		return null;
	}

	public String sayJiggly()
	{
		return null;
	}

	public int Float(int height)
	{
		return 0;
	}

	public int Twinkle(int twinkleBrightness)
	{
		return 0;
	}

	public int attack(int attackDamage)
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