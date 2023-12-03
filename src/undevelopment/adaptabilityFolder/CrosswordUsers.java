/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment.adaptabilityFolder;

/**
 *
 * @author dmoc2
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import undevelopment.CWScoring;
import static undevelopment.UNDevelopmentMainMenuGUI.cwsTA;
public class CrosswordUsers {
    
    private ArrayList<CWScoring> cwlist = new ArrayList<>();
    
    public void update()
    {//open update method
           // TODO add your handling code here:
        File f; // Declarations
        FileInputStream fs;
        ObjectInputStream os;

        try {
            f = new File("cws.dat");
            if (f.exists() && f.length() > 0) { // Check if file exists and is not empty
                fs = new FileInputStream(f);
                os = new ObjectInputStream(fs);
                cwlist = (ArrayList<CWScoring>) os.readObject();
                os.close();

                for (int i = 0; i < cwlist.size(); i++) {
                    CWScoring e = cwlist.get(i);
                   undevelopment.UNDevelopmentMainMenuGUI.cwsTA.append(e.toString() + "\n");
                }
            } else {
                System.out.println("File is empty or does not exist."); // It was not working before this, glad that's fixed it, must have been reading the last entry before it was cleared but I have more tests. Woooohoooo it workssss
                
            }
        } catch (IOException e) {
            System.out.println("Error reading from file " + e);
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found error " + c);
        }
    }//close update method
    
    
     private void deleteFileContents(String fileName) {
        FileWriter f; //declarations

        try {
            f = new FileWriter(fileName, false); // a secret append option is now set to false
            f.write(""); // Overwrite the file with an empty string
            f.close();
        } catch (IOException e) {
            // Handle the exception if the file cannot be cleared
            System.out.println("There is an error "+e);
        }
    }
     
     public void delete()
     {
         cwsTA.setText("");
        String fileName = "cws.dat"; // Replace with your file name
        deleteFileContents(fileName);
     }
    
    
    
}
