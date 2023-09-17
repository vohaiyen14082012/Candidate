/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class FresherCandidate extends Candidate {
    private String graduationDate;
    private String graduationRank;
    private String education;

    public FresherCandidate(String candidateId, String firstName, String lastName, String birthDate, String address,
            String phone, String email, String graduationDate, String graduationRank, String education) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, 1); // Candidate type for Fresher
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public String getEducation() {
        return education;
    }
}
