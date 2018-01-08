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
	private JComboBox pokemonDropdown;
	
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

	private void setLayout(SpringLayout appLayout2)
	{
		
	}
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		appLayout = new SpringLayout();
		
		evolvableBox = new JCheckBox();
		nameField= new JTextField("name");
		numberField = new JTextField("##");
		attackField = new JTextField("ap");
		healthField = new JTextField("hp");
		modifierField = new JTextField("mod");
		
		iconLabel = new JLabel("pokemon", new ImageIcon(getClass().getResource("/pokemon/view/images/PokemonLogo.png")), JLabel.CENTER);
				
		nameLabel = new JLabel("name");
		evolvableLabel = new JLabel("evolvable");
		numberLabel = new JLabel("number");
		attackLabel = new JLabel("attack");
		modifierLabel = new JLabel("modifier");
		pokemonDropdown = new JComboBox();
		clearButton = new JButton("clear");
		saveButton = new JButton("save");
		
		discriptionArea = new JTextArea(4,10);
		typeArea = new JTextArea(4,15);
		
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
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttaPoints()+ "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");				
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
}
