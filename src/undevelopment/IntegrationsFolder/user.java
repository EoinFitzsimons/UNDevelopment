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
public class User extends HandleInputs implements Serializable {

    
    private String score;

    /**
     *
     * @param score
     * @param id
     * @param userName
     */
    public User(String score, String id, String userName) {
        super(id, userName);
        this.score = score;
    }

    /**
     *
     * @return
     */
    public String getScore() {
        return score;
    }

    /**
     *
     * @param score
     */
    public void setScore(String score) {
        this.score = score;
    }

    /**
     *
     * @return
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     */
    public User() {
    }

    /**
     *
     * @return
     */
    @Override
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @param userName
     */
    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *
     * @return
     */
    @Override
    public String details() {
        return super.details() + "\t  "+score;
    }
    
    
    
    

    

    
    
    
    
    
    
    
    
}
