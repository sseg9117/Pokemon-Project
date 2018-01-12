package pokemon.view;

import pokemon.controller.PokemonController;

public class PokemonFrame
{
	public PokemonController appController;
	public PokemonFrame(PokemonController appController)
	{
		this.appController = appController;
	}
}