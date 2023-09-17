/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class ExperienceCandidate extends Candidate {
    private int expInYear;
    private String proSkill;

    public ExperienceCandidate(String candidateId, String firstName, String lastName, String birthDate, String address,
            String phone, String email, int expInYear, String proSkill) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, 0); // Candidate type for Experience
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }
}