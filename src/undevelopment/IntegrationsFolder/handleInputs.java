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
    
    protected int id;
    protected double choice;
    protected double lives;
    protected String userName;

    public handleInputs() {
    }

    public handleInputs(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
    
}
