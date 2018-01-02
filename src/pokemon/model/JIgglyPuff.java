package pokemon.model;

public class JIgglyPuff extends Pokemon implements Fairy
{

	public JIgglyPuff(int number, String name)
	{
		super(39, "JigglyPuff");
		setup();
	}

	public String sayMrMime()
	{

		return null;
	}

	public String sayJiggly()
	{

		return "JigglyPuff";
	}

	public int attack(int attackDamage)
	{
		int damage = 1000;
		return damage;
	}

	public int Float(int height)
	{
		int height1 = 100;
		return height1;
		
	}

	public int Twinkle(int twinkleBrightness)
	{
		int brightness = 10000;
		return brightness;
	}
	protected void setup()
	{
		this.setAttaPoints(234);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(123);
	}
}
