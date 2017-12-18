package pokemon.model;

public class MrMime extends Pokemon implements Fairy
{

	public MrMime(int number, String name)
	{
		super(number, name);
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
	
	
}
