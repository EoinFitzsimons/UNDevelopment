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
public class HandleInputs implements Serializable {
    
    protected String id;
   
    protected String userName;

    public HandleInputs(String id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public HandleInputs() {
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

    public String details(){
        return ""+id+"\t"+userName;
    }
    
    
}
