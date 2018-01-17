package pokemon.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import pokemon.model.Pokemon;

public class FileController
{
	public static void savePokemonToFile(ArrayList<Pokemon> pokedex)
	{
		File saveFile = new File("Saved Pokedex.text");
		try
		{
			PrintWriter writeToDisk = new PrintWriter(saveFile);
			
			for (int index = 0; index < pokedex.size(); index++)
			{
				String name = pokedex.get(index).getName();
				int number = pokedex.get(index).getNumber();
				int attack = pokedex.get(index).getAttaPoints();
				int health = pokedex.get(index).getHealthPoints();
				boolean evolve = pokedex.get(index).isCanEvolve();
				double modify = pokedex.get(index).getEnhancementModifier();
				
				String row = name + "," + number + "," + health + "," + attack + "," + modify + "," + evolve;
				
				writeToDisk.println(row);
			}
			writeToDisk.close();
		}
		catch (FileNotFoundException error)
		{
			System.out.println("There was an error:"+ error.getMessage());
		}
	}
	
	public static String readPokemonFromFile()
	{
		String contents = "";
		String path = "SavedPokedex.txt";
		try
		{
			Scanner fileScanner = new Scanner(new File(path));
			while (fileScanner.hasNextLine())
			{
				String row = fileScanner.nextLine();
				contents += row + "\n";
			}
			fileScanner.close();	
		}
		catch (FileNotFoundException error)
		{
			System.out.println("There was an error:" + error.getMessage());
		}
		
		return contents;
	}
}
