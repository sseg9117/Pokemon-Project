package pokemon.controller;


import java.util.ArrayList;
import java.util.List;

import pokemon.model.Charizard;
import pokemon.model.Charmander;
import pokemon.model.Dragonair;
import pokemon.model.Dragonite;
import pokemon.model.JIgglyPuff;
import pokemon.model.MrMime;
import pokemon.model.Pokemon;
import pokemon.view.PokemonFrame;

public class PokemonController
{
	private List<Pokemon> pokedex;
	private PokemonFrame appFrame;
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		appFrame = new PokemonFrame(this);
	}
	
	private void buildPokedex()
	{
		pokedex.add (new Charizard());
		pokedex.add (new Charmander());
		pokedex.add (new Dragonair());
		pokedex.add (new MrMime());
		pokedex.add (new Dragonite());
		pokedex.add (new JIgglyPuff());
	}
	public List<Pokemon> getPokedex()
	{

		return pokedex;
	}
	

	
	public boolean isValidInteger(String input)
	{
		return true;
		
	}
	
	public boolean isValidouble(String input)
	{
		return true;
	}

	public void start()
	{
		
	}
	
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for(int index = 0; index < pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();		
		}
		
		return names;
	}
	
	public void updateSelected(int selection, int heath, int attack, boolean evolve, double modify, String name)
	{
		Pokemon selected = pokedex.get(selection);
		
		selected.setAttaPoints(attack);
		selected.setCanEvolve(evolve);
		selected.setEnhancementModifier(modify);
		selected.setName(name);
		selected.setHealthPoints(heath);
		
		FileController.savePokemonToFile((ArrayList<Pokemon>) pokedex);
		
		
		
	}

}
