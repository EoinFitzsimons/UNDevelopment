/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment;

/**
 *
 * @author Aepel
 */
public class SIDS {
    String Name;
    double average_age;
    int population;
    double sq_km;

    public SIDS(String Name, double average_age, int population, double sq_km) {
        this.Name = Name;
        this.average_age = average_age;
        this.population = population;
        this.sq_km = sq_km;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getAverage_age() {
        return average_age;
    }

    public void setAverage_age(double average_age) {
        this.average_age = average_age;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getSq_km() {
        return sq_km;
    }

    public void setSq_km(double sq_km) {
        this.sq_km = sq_km;
    }

    
    
    
    
}
