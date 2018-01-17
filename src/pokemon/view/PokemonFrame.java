package pokemon.view;

import java.awt.Panel;

import pokemon.controller.PokemonController;

public class PokemonFrame
{
	public PokemonController appController;
	public PokemonFrame(PokemonController appController)
	{
		super();
		this.appController = appController;
		setupFrame();
	}
	private void setupFrame()
	{
		this.setSize(500,500);
		this.setTitle("Pokedex");
		this.setContentPane();
		this.setResizable(false);
		this.setVisible(true);
	}
	private void setContentPane()
	{

	}
	private void setVisible(boolean b)
	{
		
	}
	private void setResizable(boolean b)
	{
		
	}
	private void setTitle(String string)
	{
		
	}
	private void setSize(int i, int j)
	{
		
	}
	
}
