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
		return false;
		
	}
	
	public boolean isValidouble(String input)
	{
		return false;
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
}
