/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author rafim
 */
public class MedicationTracker extends Medication {
    private int timesPerDay;
    private String intakeInstructions;

    public MedicationTracker(String medicationName, String dosage, int timesPerDay, String[] intakeInstructions) {
        super(medicationName, dosage);
        this.timesPerDay = timesPerDay;
        this.intakeInstructions = " ";
    }

    public int getTimesPerDay() {
        return timesPerDay;
    }

    public void setTimesPerDay(int timesPerDay) {
        this.timesPerDay = timesPerDay;
    }

    public String getIntakeInstructions() {
        return intakeInstructions;
    }

    public void setIntakeInstructions(String intakeInstructions) {
        this.intakeInstructions = intakeInstructions;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    
}

