package src;

import java.util.ArrayList;

public class Doctor {
    private String name;
    private String age;
    private String gender;
    int countPatients = 0;
    ArrayList<String> name_patient = new ArrayList<>();

    public Doctor(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getCountPatients() {
        return countPatients;
    }

    public ArrayList<String> getNamePatient() {
        return name_patient;
    }

    public void addPatient(String name) {
        countPatients++;
        name_patient.add(name);
    }
}
