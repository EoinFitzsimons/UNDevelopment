/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment.IntegrationsFolder;

import java.io.Serializable;

/**
 *
 * @author dmoc2
 */
public class user extends handleInputs implements Serializable {

    
    private String score;

    public user(String score, int id, String userName) {
        super(id, userName);
        this.score = score;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public user() {
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String details() {
        return super.details() + " Score: "+score;
    }
    
    
    
    

    

    
    
    
    
    
    
    
    
}