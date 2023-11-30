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

    public Clues(String clue, char hint, int id, int legnth, boolean isVertical) {
        super(id, legnth, isVertical);
        this.clue = clue;
        this.hint = hint;
    }



    public String getClue() {
        return clue;
    }

    public void setClue(String clue) {
        this.clue = clue;
    }
}
