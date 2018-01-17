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

	private JTextArea descriptionArea;
	private JTextArea typeArea;

	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;

	private JPanel firstType;
	private JPanel secondType;

	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;

		appLayout = new SpringLayout();

		evolvableBox = new JCheckBox();
		nameField = new JTextField("name");
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 5, SpringLayout.NORTH, this);
		numberField = new JTextField("#");
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 0, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 125, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, numberField, 156, SpringLayout.EAST, this);
		attackField = new JTextField("attack");
		healthField = new JTextField("hp");
		modifierField = new JTextField("mod");
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 14, SpringLayout.EAST, healthField);

		iconLabel = new JLabel("Pokemon", new ImageIcon(getClass().getResource("/pokemon.view.images.Pokeball.png")), JLabel.CENTER);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel, 10, SpringLayout.WEST, this);

		nameLabel = new JLabel("name");
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 0, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 16, SpringLayout.EAST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 15, SpringLayout.NORTH, this);
		evolvableLabel = new JLabel("evolvable");
		appLayout.putConstraint(SpringLayout.WEST, evolvableBox, 6, SpringLayout.EAST, evolvableLabel);
		numberLabel = new JLabel("number");
		attackLabel = new JLabel("attack");
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 0, SpringLayout.WEST, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 11, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, -104, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, -5, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 6, SpringLayout.EAST, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 6, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, attackLabel);
		healthLabel = new JLabel("health");
		appLayout.putConstraint(SpringLayout.NORTH, healthField, -5, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 16, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 6, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, attackLabel);
		modifierLabel = new JLabel("modifier");
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, -5, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 6, SpringLayout.SOUTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 6, SpringLayout.SOUTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, attackLabel);
		pokedexDropdown = new JComboBox();
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 11, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 97, SpringLayout.EAST, iconLabel);
		clearButton = new JButton("clear");
		appLayout.putConstraint(SpringLayout.SOUTH, clearButton, -10, SpringLayout.SOUTH, this);
		saveButton = new JButton("save");
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 323, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, clearButton, -27, SpringLayout.WEST, saveButton);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, clearButton);

		descriptionArea = new JTextArea(5, 10);
		appLayout.putConstraint(SpringLayout.WEST, descriptionArea, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, descriptionArea, 0, SpringLayout.SOUTH, clearButton);
		appLayout.putConstraint(SpringLayout.EAST, descriptionArea, 162, SpringLayout.WEST, this);
		typeArea = new JTextArea(4, 15);
		appLayout.putConstraint(SpringLayout.SOUTH, typeArea, -6, SpringLayout.NORTH, clearButton);
		appLayout.putConstraint(SpringLayout.EAST, typeArea, 0, SpringLayout.EAST, healthField);

		firstType = new JPanel();
		secondType = new JPanel();

		setupComboBox();
		updateTypePanels();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(appLayout);

		this.setBackground(Color.CYAN);
		this.add(iconLabel);
		this.add(attackLabel);
		this.add(attackField);
		this.add(healthLabel);
		this.add(healthField);
		this.add(modifierLabel);
		this.add(modifierField);
		this.add(nameLabel);
		this.add(nameField);
		this.add(numberLabel);
		this.add(numberField);
		this.add(evolvableLabel);
		this.add(evolvableBox);
		this.add(pokedexDropdown);
		this.add(clearButton);
		this.add(saveButton);

		this.add(descriptionArea);
		this.add(typeArea);
	}

	public void setupLayout()
	{
	}

	public void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage(); 
				updateTypePanels();
				repaint();
			}
		});
		
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if (appController.isValidInteger(attackField.getText()) && appController.isValidInteger(healthField.getText()) && appController.isValidouble(modifierField.getText()))
				{
					int selected = pokedexDropdown.getSelectedIndex();
					int healh = Integer.parseInt(healthField.getText());
					int attack = Integer.parseInt(attackField.getText());
					double modifier = Double.parseDouble(modifierField.getText());
					String name = nameField.getText();
					boolean evolvable = evolvableBox.isSelected();
							
					//Send to the Controller to modify the Pokemon
					appController.updateSelected(selected, healh, attack, evolvable, modifier, name);
				}
			}
		});
	}
	public void updateTypePanels()
	{
		String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();

		if (types[0].equals("Fire"))
		{
			firstType.setBackground(Color.RED);
		} else if (types[0].equals("Dragon"))
		{
			firstType.setBackground(Color.BLUE);
		} else if (types[0].equals("Fariy"))
		{
			firstType.setBackground(Color.PINK);
		}

	}

	private void updatePokedexInfo(int index)
	{
		// update basic fields
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText("#" + appController.getPokedex().get(index).getNumber());
		attackField.setText(appController.getPokedex().get(index).getAttaPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");

		// Update text areas
		descriptionArea.setText(appController.getPokedex().get(index).toString());
		typeArea.setText("");

		for (String current : appController.getPokedex().get(index).getPokemonTypes())
		{
			typeArea.append(current + "\n");
		}
	}

	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}

	private void updateImage()
	{
		String path = "/pokemon/view/images/";
		String defaultName = "PokemonLogo";
		String name = pokedexDropdown.getSelectedItem().toString();
		String extension = ".png";
		ImageIcon pokemonIcon;

		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		} catch (NullPointerException missingImageFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		iconLabel.setIcon(pokemonIcon);
	}

}