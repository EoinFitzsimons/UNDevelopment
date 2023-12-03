/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment;

/**
 *
 * @author eoin0
 */
public class Clues extends CrosswordWords{
    private String clue;
    private char hint;

    public Clues(String clue, char hint, String id) {
        super(id);
        this.clue = clue;
        this.hint = hint;
    }

    public char getHint() {
        return hint;
    }

    public void setHint(char hint) {
        this.hint = hint;
    }

    public String getClue() {
        return clue;
    }

    public void setClue(String clue) {
        this.clue = clue;
    }
}
