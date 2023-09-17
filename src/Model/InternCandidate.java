/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
public class InternCandidate extends Candidate {
    private String majors;
    private String semester;
    private String universityName;

    public InternCandidate(String candidateId, String firstName, String lastName, String birthDate, String address,
            String phone, String email, String majors, String semester, String universityName) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, 2); // Candidate type for Intern
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public String getSemester() {
        return semester;
    }

    public String getUniversityName() {
        return universityName;
    }
}