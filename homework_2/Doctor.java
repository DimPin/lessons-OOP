package homework_2;

import java.util.ArrayList;

public class Doctor {
    private String name;
    private String age;
    private String gender;
    int count_patients = 0;
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

    public int getCount_patients() {
        return count_patients;
    }

    public ArrayList<String> getName_patient() {
        return name_patient;
    }

    public void add_patient(String name) {
        count_patients++;
        name_patient.add(name);
    }
}
