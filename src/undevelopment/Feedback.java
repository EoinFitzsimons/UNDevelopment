/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment;

import java.io.Serializable;

/**
 *Feedback.java
 * 15.12.23
 * @author Conor Judge
 */
public class Feedback implements Serializable{
    private String input;
    
    public Feedback(String name){
        this.input = name;
    }

    public String getName() {
        return input;
    }

    public void setName(String name) {
        this.input = input;
    }
    
    @Override
    public String toString() {
        return input;
    }
}
