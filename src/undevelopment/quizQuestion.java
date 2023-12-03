/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment;

/**
 *
 * @author Aepel
 */
public class quizQuestion {
    
    String SIDSCountry;
    String question;
    boolean answer;

    public quizQuestion(String SIDSCountry, String question, boolean answer) {
        this.SIDSCountry = SIDSCountry;
        this.question = question;
        this.answer = answer;
    }

    public String getSIDSCountry() {
        return SIDSCountry;
    }

    public void setSIDSCountry(String SIDSCountry) {
        this.SIDSCountry = SIDSCountry;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
    
    
}
