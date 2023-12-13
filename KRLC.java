import java.awt.*;

import javax.swing.*;

public class KRLC {
	private static 	JFrame frame = new JFrame("Korean Restaurant's Locator in Cebu City");
	private static	JPanel panel = new JPanel();
	private static	JLabel label;
	private static 	JLabel label1;
	private static 	JComboBox<String> comboBox;
	
	
	String[] locations = {"Adlaon", "Agsungot", "Apas", "Babag", "Bacayan", "Banilad",
                		  "Basak Pardo", "Basak San Nicolas", "Binaliw", "Bonbon",
                		  "Budla-an", "Buhisan", "Bulacao", "Buot-Taup Pardo", "Busay",
                		  "Calamba", "Cambinocot", "Camputhaw", "Capitol Site", "Carreta",
                		  "Central", "Cogon Pardo", "Cogon Ramos", "Day-as", "Duljo", 
                		  "Ermita", "Guadalupe", "Guba", "Hippodromo", "Inayawan",
                		  "Kalubihan", "Kalunasan", "Kamagayan", "Kasambagan", "Kinasang-an Pardo",
                		  "Labangon", "Lahug", "Lorega", "Lusaran", "Luz", "Mabini", "Mabolo",
                		  "Malubog", "Mambaling", "Pahina Central", "Pahina San Nicolas",
                		  "Pamutan", "Pardo", "Pari-an", "Paril", "Pasil", "Pit-os",
                		  "Pulangbato", "Pung-ol-Sibunga", "Punta Princesa", "Quiot Pardo",
                		  "Sambag I", "Sambag II", "San Antonio", "San Jose",
                		  "San Nicolas Central", "San Roque(Ciudad)", "Santa Cruz",
                		  "Sapangdaku", "Sawang Calero", "Sinsin", "Sirao", "Suba Poblacion",
                		  "Sudlon I", "Sudlon II", "Tabunan", "Tagbao", "Talamban", "Taptap",
                		  "Tejero", "Tinago", "Tisa", "To-ong Pardo", "T. Padilla", "Zapatera"};
	
		
	KRLC() {
		frame.setSize(750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(panel);
		
		panel.setLayout(null);
		
		label = new JLabel("Location:");
		label.setFont(new Font(null,Font.PLAIN,17));
		label.setBounds(20, 50, 80, 50);
		panel.add(label);
		
		label1 = new JLabel("Restaurants");
		label1.setBounds(250, 50, 100, 50);
		label1.setFont(new Font(null,Font.PLAIN,17));
		panel.add(label1);
		
		comboBox = new JComboBox<>(locations);
		comboBox.setFont(new Font(null,Font.PLAIN,15));
		comboBox.setBounds(90, 60, 90, 30);
		panel.add(comboBox);
		
		frame.setVisible(true);
	}
	

		
	
	
	
	
}
