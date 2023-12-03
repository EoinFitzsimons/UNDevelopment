/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Aepel
 */

import javax.swing.*;
import java.awt.*;

public class PopulationTrends extends JFrame{
    
 
    private int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    public PopulationTrends() {
        setTitle("Line Chart Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LineChartPanel lineChartPanel = new LineChartPanel();
        add(lineChartPanel);

        setVisible(true);
    }

    class LineChartPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            int width = getWidth();
            int height = getHeight();

            // Draw x-axis
            g2d.drawLine(50, height - 50, width - 50, height - 50);

            // Draw y-axis
            g2d.drawLine(50, 50, 50, height - 50);

            // Plot the data points
            int xIncrement = (width - 100) / (data.length - 1);
            for (int i = 0; i < data.length; i++) {
                int x = 50 + i * xIncrement;
                int y = height - 50 - data[i];
                g2d.fillOval(x - 3, y - 3, 6, 6);

                // Connect the data points with lines
                if (i < data.length - 1) {
                    int nextX = 50 + (i + 1) * xIncrement;
                    int nextY = height - 50 - data[i + 1];
                    g2d.drawLine(x, y, nextX, nextY);
                }
            }
        }
    }
}