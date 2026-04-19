/*5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the
countries on console whenever the countries are selected on the list.*/


package Swings;


	
	import java.util.HashMap;
	import java.util.List;
	import javax.swing.*;

	public class CountryCapitalList extends JFrame {

	    private JList<String> countryList;
	    private HashMap<String, String> capitalMap;

	    CountryCapitalList(){

	        DefaultListModel<String> listModel = new DefaultListModel<>();

	        listModel.addElement("USA");
	        listModel.addElement("India");
	        listModel.addElement("Vietnam");
	        listModel.addElement("Canada");
	        listModel.addElement("Denmark");
	        listModel.addElement("France");
	        listModel.addElement("Great Britain");
	        listModel.addElement("Japan");
	        listModel.addElement("Africa");
	        listModel.addElement("Greenland");
	        listModel.addElement("Singapore");

	        capitalMap = new HashMap<>();
	        capitalMap.put("USA","Washington D.C.");
	        capitalMap.put("India","New Delhi");
	        capitalMap.put("Vietnam","Hanoi");
	        capitalMap.put("Canada","Ottawa");
	        capitalMap.put("Denmark","Copenhagen");
	        capitalMap.put("France","Paris");
	        capitalMap.put("Great Britain","London");
	        capitalMap.put("Japan","Tokyo");
	        capitalMap.put("Africa","No Single Capital");
	        capitalMap.put("Greenland","Nuuk");
	        capitalMap.put("Singapore","Singapore");

	        countryList = new JList<>(listModel);

	        countryList.addListSelectionListener(e -> {
	            if (!e.getValueIsAdjusting()) {
	                List<String> selected = countryList.getSelectedValuesList();
	                for(String country : selected){
	                    System.out.println(country + " -> " + capitalMap.get(country));
	                }
	            }
	        });

	        add(new JScrollPane(countryList));

	        setTitle("Country Capital List");
	        setSize(250,250);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new CountryCapitalList();
	    }
	}


