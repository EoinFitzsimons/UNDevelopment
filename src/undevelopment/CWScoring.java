/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment;

import java.io.Serializable;

/**
 *
 * @author eoin0
 */
public class CWScoring implements Serializable{
    protected int score;
    protected double time;
    protected String user;

    public CWScoring(int score, double time, String user) {
        this.score = score;
        this.time = time;
        this.user = user;
    }

    public CWScoring() {
    }

    public int getScore() {
        return score;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
    
    @Override
    public String toString() {
        return "Hello " + user + ", your score is " + score + ", you took " + time + " seconds.";
    }
    
}
