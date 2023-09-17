/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;

public class CandidateManagerModel {
    private ArrayList<ExperienceCandidate> experienceCandidates = new ArrayList<>();
    private ArrayList<FresherCandidate> fresherCandidates = new ArrayList<>();
    private ArrayList<InternCandidate> internCandidates = new ArrayList<>();

    public void addExperienceCandidate(ExperienceCandidate candidate) {
        experienceCandidates.add(candidate);
    }

    public void addFresherCandidate(FresherCandidate candidate) {
        fresherCandidates.add(candidate);
    }

    public void addInternCandidate(InternCandidate candidate) {
        internCandidates.add(candidate);
    }

    public ArrayList<ExperienceCandidate> getExperienceCandidates() {
        return experienceCandidates;
    }

    public ArrayList<FresherCandidate> getFresherCandidates() {
        return fresherCandidates;
    }

    public ArrayList<InternCandidate> getInternCandidates() {
        return internCandidates;
    }

    // Implement methods to search candidates and other operations
}
