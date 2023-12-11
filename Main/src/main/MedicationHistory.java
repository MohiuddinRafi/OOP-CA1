/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author rafim
 */
public class MedicationHistory {
    
     private String history;
    private int totalMedicationsTaken;

    // Constructor
    public MedicationHistory() {
        this.history = " ";
        this.totalMedicationsTaken = 0;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public int getTotalMedicationsTaken() {
        return totalMedicationsTaken;
    }

    public void setTotalMedicationsTaken(int totalMedicationsTaken) {
        this.totalMedicationsTaken = totalMedicationsTaken;
    }

    
}
