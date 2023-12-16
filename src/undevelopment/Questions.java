/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment;

import java.util.ArrayList;

/**
 *Questions.java
 * 15/12/23
 * @author Conor Judge
 */


//please note that this class is not being utilised as I could not get it to run without errors before the deadline.
//The funcitonality of this class is being execited in AwarenessGUI


public class Questions {
    // ArrayList to store questions
    private ArrayList<String> questions;
    
    // ArrayList to store options
    private ArrayList<ArrayList<String>> options;

    // Constructor to initialize questions and options
    public Questions() {
        
        questions = new ArrayList<>();
        options = new ArrayList<>();
        
        
        // Add questions about climate change to the ArrayList
        questions.add("What is the main greenhouse gas responsible for global warming?");
        questions.add("Which human activity contributes the most to deforestation?");
        questions.add("What is the primary cause of ocean acidification?");
        questions.add("What is the largest source of carbon dioxide emissions?");
        questions.add("What is the impact of melting ice caps on sea levels?");
        questions.add("What is the main cause of ozone depletion?");
        questions.add("What is the primary greenhouse gas emitted by agriculture?");
        questions.add("What is the main cause of air pollution in cities?");
        questions.add("What is the primary cause of water pollution in rivers and lakes?");
        questions.add("What is the main cause of soil erosion?");

        // Adding options to the ArrayList for each question
        ArrayList<String> options1 = new ArrayList<>();
        options1.add("Carbon dioxide");
        options1.add("Methane");
        options1.add("Nitrous oxide");
        options1.add("Water vapor");
        options1.add("Carbon dioxide");
        options.add(options1);

        ArrayList<String> options2 = new ArrayList<>();
        options2.add("Agriculture");
        options2.add("Mining");
        options2.add("Urbanization");
        options2.add("Logging");
        options2.add("Logging");
        options.add(options2);

        ArrayList<String> options3 = new ArrayList<>();
        options3.add("Burning fossil fuels");
        options3.add("Industrial pollution");
        options3.add("Deforestation");
        options3.add("Ocean pollution");
        options3.add("Burning fossil fuels");
        options.add(options3);

        ArrayList<String> options4 = new ArrayList<>();
        options4.add("Transportation");
        options4.add("Power generation");
        options4.add("Agriculture");
        options4.add("Industrial processes");
        options4.add("Power generation");
        options.add(options4);

        ArrayList<String> options5 = new ArrayList<>();
        options5.add("Rising sea levels");
        options5.add("Increased rainfall");
        options5.add("Decreased ocean salinity");
        options5.add("Stronger hurricanes");
        options5.add("Rising sea levels");
        options.add(options5);

        ArrayList<String> options6 = new ArrayList<>();
        options6.add("Chlorofluorocarbons (CFCs)");
        options6.add("Carbon monoxide");
        options6.add("Sulfur dioxide");
        options6.add("Methane");
        options6.add("Chlorofluorocarbons (CFCs)");
        options.add(options6);

        ArrayList<String> options7 = new ArrayList<>();
        options7.add("Carbon dioxide");
        options7.add("Methane");
        options7.add("Nitrous oxide");
        options7.add("Carbon monoxide");
        options7.add("Carbon dioxide");
        options.add(options7);

        ArrayList<String> options8 = new ArrayList<>();
        options8.add("Global warming");
        options8.add("Climate change");
        options8.add("Greenhouse effect");
        options8.add("Ozone depletion");
        options8.add("Global warming");
        options.add(options8);

        ArrayList<String> options9 = new ArrayList<>();
        options9.add("Recycling");
        options9.add("Composting");
        options9.add("Incineration");
        options9.add("Landfill");
        options9.add("Recycling");
        options.add(options9);

        ArrayList<String> options10 = new ArrayList<>();
        options10.add("China");
        options10.add("United States");
        options10.add("India");
        options10.add("Russia");
        options10.add("China");
        options.add(options10);

    }
    
    private void validateOptions() {
    int expectedOptions = 4;

    for (ArrayList<String> optionList : options) {
       if (optionList.size() != expectedOptions) {
         throw new IllegalArgumentException("Number of options for each question should be " + expectedOptions);
            }
        }
    }

    

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public ArrayList<String> getOptions(int index) {
        if (index >= 0 && index < options.size()) {
            return options.get(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }
}