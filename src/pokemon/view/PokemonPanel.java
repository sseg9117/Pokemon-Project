package pokemon.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import pokemon.controller.PokemonController;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea discriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox<?> pokemonDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		
		this.setBackground(Color.GRAY);
		this.add(iconLabel);
		this.add(attackLabel);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierLabel);
		this.add(modifierField);
		this.add(nameLabel);
		this.add(nameField);
		this.add(numberLabel);
		this.add(numberField);
		this.add(evolvableLabel);
		this.add(evolvableBox);
		this.add(pokemonDropdown);
		this.add(clearButton);
		this.add(saveButton);
		
		this.add(discriptionArea);
		this.add(typeArea);
	}

	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		appLayout = new SpringLayout();
		
		evolvableBox = new JCheckBox();
		nameField= new JTextField("name");
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 78, SpringLayout.NORTH, this);
		numberField = new JTextField("##");
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 29, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, nameField);
		attackField = new JTextField("ap");
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, nameField);
		healthField = new JTextField("hp");
		modifierField = new JTextField("mod");
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 6, SpringLayout.EAST, evolvableBox);
		
		iconLabel = new JLabel("pokemon", new ImageIcon(getClass().getResource("/pokemon/view/images/PokemonLogo.png")), JLabel.CENTER);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, -5, SpringLayout.NORTH, iconLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 23, SpringLayout.EAST, iconLabel);
				
		nameLabel = new JLabel("name");
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -201, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 6, SpringLayout.EAST, nameLabel);
		evolvableLabel = new JLabel("evolvable");
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 167, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, evolvableBox, 6, SpringLayout.EAST, evolvableLabel);
		numberLabel = new JLabel("number");
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 111, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, -5, SpringLayout.NORTH, numberLabel);
		attackLabel = new JLabel("attack");
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 15, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel, 0, SpringLayout.WEST, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 11, SpringLayout.SOUTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 0, SpringLayout.WEST, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, -5, SpringLayout.NORTH, attackLabel);
		modifierLabel = new JLabel("modifier");
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, -5, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, modifierLabel, -6, SpringLayout.NORTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.EAST, modifierLabel, 0, SpringLayout.EAST, attackField);
		pokemonDropdown = new JComboBox<Object>();
		appLayout.putConstraint(SpringLayout.NORTH, pokemonDropdown, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pokemonDropdown, 199, SpringLayout.WEST, this);
		clearButton = new JButton("clear");
		saveButton = new JButton("save");
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, 0, SpringLayout.NORTH, saveButton);
		appLayout.putConstraint(SpringLayout.EAST, clearButton, -3, SpringLayout.WEST, saveButton);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, -23, SpringLayout.EAST, this);
		
		discriptionArea = new JTextArea(4,10);
		appLayout.putConstraint(SpringLayout.SOUTH, discriptionArea, 0, SpringLayout.SOUTH, iconLabel);
		appLayout.putConstraint(SpringLayout.EAST, discriptionArea, -30, SpringLayout.EAST, this);
		typeArea = new JTextArea(4,15);
		appLayout.putConstraint(SpringLayout.SOUTH, typeArea, 0, SpringLayout.SOUTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.EAST, typeArea, 0, SpringLayout.EAST, saveButton);
		
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
		
		setupComboBox();
		setupTypePanel();
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupTypePanel()
	{
		
	}

	private void setupListeners()
	{
		pokemonDropdown.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent selection)
			{
				int selectedPokemonIndex = pokemonDropdown.getSelectedIndex();
				updatePokemonInfo(selectedPokemonIndex);
				updateImage();
				updateTypePanels();
				repaint();
			}
		});
	}

	private void setupLayout()
	{

		
	}

	private void updatePokemonInfo(int index)
	{
		//
		nameField.setText(appController.getPokedex().get(index).getName());;
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttaPoints()+ "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");	
		
		
		//Update text area
		discriptionArea.setText(appController.getPokedex().get(index).toString());
		typeArea.setText("");
		
		for (String current : appController.getPokedex().get(index).getPokemonTypes())
		{
			typeArea.append(current +"\n");
		}
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokemonDropdown.setModel(pokemonModel);
	}
	
	private void updateTypePanels()
	{
		String [] types = appController.getPokedex().get(pokemonDropdown.getSelectedIndex()).getPokemonTypes();
		
	//change this to match your 3 minimum types in your pokedex.
	if (types[0].equals("Dragon"))
	{
		firstType.setBackground(Color.BLUE);
	}
	else if (types[0].equals("Fairy"))
	{
		firstType.setBackground(Color.PINK);
	}
	else if (types[0].equals("Fire"))
	{
		firstType.setBackground(Color.RED);
	}
	else 
	{
		firstType.setBackground(Color.WHITE);
	}
	
	if (types.length > 1)
	{
		if (types[1].equals("Fairy"))
		{
			secondType.setBackground(Color.MAGENTA);
		}
		
		if (types.length == 3)
		{
		
		}
	}
  }
	private void updateImage()
	{
		String path = "/pokemon/view/images/";
		String defaultName = "PokemonLogo";
		String name = pokemonDropdown.getSelectedItem().toString();
		String extension = ".png";
		ImageIcon pokemonIcon;
		
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingImageFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName +extension));
		}
		
		iconLabel.setIcon(pokemonIcon);
	}
}
