/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment.IntegrationsFolder;

/**
 *
 * @author dmoc2
 */
public class handleInputs {
    
    protected double choice;
    protected double lives;
    protected String userName;

    public handleInputs() {
    }

    public double getChoice() {
        return choice;
    }

    public void setChoice(double choice) {
        this.choice = choice;
    }

    public double getLives() {
        return lives;
    }

    public void setLives(double lives) {
        this.lives = lives;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public void enterName()
    {//open enter name
        undevelopment.IntegrationsUI tets = new undevelopment.IntegrationsUI();
        
       userName =  undevelopment.IntegrationsUI.nameField.getText();
        
    }//close enter name
    
}
