package pokemon.model;

public abstract class Pokemon
{
		
	private int healthPoints;
	private int attaPoints;
	private double enhancementModifier;
	private int number;
	private String name;
	private boolean canEvolve;
		
	public Pokemon (int number, String name)
	{
		this.name = name;
		this.setNumber(number);
	}
	
	public final String[] getPokemonTypes()
	{
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String[types.length];
		
		for(int index = 0; index < types.length; index++)
		{
			String currentInterface = types[index].getCanonicalName();
			currentInterface = currentInterface.replace(this.getClass().getPackage().getName() + ".", "");
			pokeTypes[index] = currentInterface;
		}
		
		return pokeTypes;		
	}
	
	public String toString()
	{
		String description = "Hi, Iam a " + name + ", and my HP is " + healthPoints;
		return description;
	}
	
	public String getPokmonInformation()
	{
		String pokemonInfo = "This pokemon of type:" + this.getClass().getSimpleName();
		return pokemonInfo;
	}

}
