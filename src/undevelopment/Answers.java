/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment;

/**
 *
 * @author eoin0
 */
public class Answers extends CrosswordWords{
    private String guess,answer;
    private boolean isCorrect;

    public Answers(String guess, String answer, boolean isCorrect, String id) {
        super(id);
        this.guess = guess;
        this.answer = answer;
        this.isCorrect = isCorrect;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }
    
    
}
