/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment.IntegrationsFolder;

/**
 *
 * @author dmoc2
 */
public class user extends handleInputs {

    public user(int id, String userName) {
        super(id, userName);
    }

    public user() {
    }
     @Override
    public int getId() {
        return id;
    }
     @Override
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String getUserName() {
        return userName;
    }
    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
    
    
    
    
}
