/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment;

/**
 *
 * @author eoin0
 */
public class CrosswordWords {
    protected int id, length;
    protected boolean isVertical;

    public CrosswordWords(int id, int length, boolean isVertical) {
        this.id = id;
        this.length = length;
        this.isVertical = isVertical;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
