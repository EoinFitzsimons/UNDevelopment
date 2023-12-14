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
public class handleInputs implements Serializable {
    
    protected String id; //intialize id
   
    protected String userName; //intialize userName

    public handleInputs(String id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public handleInputs() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String details(){ //will help display the details of the user
        return ""+id+"\t"+userName;
    }
    
    
}
