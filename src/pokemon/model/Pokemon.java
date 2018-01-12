package pokemon.model;

import java.util.ArrayList;

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
		String [] types = null;
		ArrayList<String> parentType = new ArrayList<String>();
		Class<?> currentClass = this.getClass();
		
		while(currentClass.getSuperclass() != null)
		{
			Class<?> [] pokemonTypes = currentClass.getInterfaces();
			types = new String[pokemonTypes.length];		
			{
				for(int index = 0; index < types.length; index++)
				{
					String currentInterface = pokemonTypes[index].getCanonicalName();
					currentInterface = currentInterface.replace(this.getClass().getPackage().getName() + ".", "");
					if(!parentType.contains(currentInterface))
					{
						parentType.add(currentInterface);
					}
					
					currentClass = currentClass.getSuperclass();
				}
			}
		}		
		types = new String [parentType.size()];
		
		for(int index = 0; index < parentType.size(); index++)
		{
			types[index] = parentType.get(index);
		}
		return types;		
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

	/**
	 * @return the healthPoints
	 */
	public int getHealthPoints()
	{
		return healthPoints;
	}

	/**
	 * @param healthPoints the healthPoints to set
	 */
	public void setHealthPoints(int healthPoints)
	{
		this.healthPoints = healthPoints;
	}

	/**
	 * @return the attaPoints
	 */
	public int getAttaPoints()
	{
		return attaPoints;
	}

	/**
	 * @param attaPoints the attaPoints to set
	 */
	public void setAttaPoints(int attaPoints)
	{
		this.attaPoints = attaPoints;
	}

	/**
	 * @return the enhancementModifier
	 */
	public double getEnhancementModifier()
	{
		return enhancementModifier;
	}

	/**
	 * @param enhancementModifier the enhancementModifier to set
	 */
	public void setEnhancementModifier(double enhancementModifier)
	{
		this.enhancementModifier = enhancementModifier;
	}

	/**
	 * @return the number
	 */
	public int getNumber()
	{
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number)
	{
		this.number = number;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the canEvolve
	 */
	public boolean isCanEvolve()
	{
		return canEvolve;
	}

	/**
	 * @param canEvolve the canEvolve to set
	 */
	public void setCanEvolve(boolean canEvolve)
	{
		this.canEvolve = canEvolve;
	}

}
