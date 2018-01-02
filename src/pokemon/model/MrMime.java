package pokemon.model;

public class MrMime extends Pokemon implements Fairy
{

	private static final boolean false = false;
	public MrMime(int number, String name)
	{
		super(122, "MrMime");
		setup();
	}

	public String sayMrMime()
	{
		return " mr mime ";
	}

	public String sayJiggly()
	{
		return null;
	}

	public int attack(int attackDamage)
	{
		int damage = 100000;
		return damage;
	}

	public int Float(int height)
	{
		return 0;
	}

	public int Twinkle(int twinkleBrightness)
	{
		int brightness = 10000;
		return brightness;
	}
	protected void setup()
	{
		this.setAttaPoints(234);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(123);
	}
	
}
