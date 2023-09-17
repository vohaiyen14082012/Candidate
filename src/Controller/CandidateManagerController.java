/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CandidateManagerModel;
import Model.Candidate;
import Model.ExperienceCandidate;
import Model.FresherCandidate;
import Model.InternCandidate;
import VIew.CandidateManagerView;

import java.util.ArrayList;

public class CandidateManagerController {
    private CandidateManagerModel model;
    private CandidateManagerView view;

    public CandidateManagerController(CandidateManagerModel model, CandidateManagerView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        int choice;
        do {
            choice = view.showMainMenu();
            switch (choice) {
                case 1:
                    ExperienceCandidate experienceCandidate = (ExperienceCandidate) view.createCandidate(0);
                    model.addExperienceCandidate(experienceCandidate);
                    break;
                case 2:
                    FresherCandidate fresherCandidate = (FresherCandidate) view.createCandidate(1);
                    model.addFresherCandidate(fresherCandidate);
                    break;
                case 3:
                    InternCandidate internCandidate = (InternCandidate) view.createCandidate(2);
                    model.addInternCandidate(internCandidate);
                    break;
                case 4:
                    String searchName = view.getSearchName();
                    int searchType = view.getSearchType();
                    ArrayList<Candidate> searchResult = searchCandidates(searchName, searchType);
                    view.displayCandidates(searchResult);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option (1-5).");
            }
        } while (choice != 5);
    }

    private ArrayList<Candidate> searchCandidates(String name, int candidateType) {
        ArrayList<Candidate> candidates = new ArrayList<>();

        // Implement candidate search logic based on name and type
        // Add matching candidates to the 'candidates' ArrayList
        ArrayList<ExperienceCandidate> experienceCandidates = model.getExperienceCandidates();
        ArrayList<FresherCandidate> fresherCandidates = model.getFresherCandidates();
        ArrayList<InternCandidate> internCandidates = model.getInternCandidates();

        for (Candidate candidate : experienceCandidates) {
            if ((candidate.getFirstName().toLowerCase().contains(name.toLowerCase()) ||
                    candidate.getLastName().toLowerCase().contains(name.toLowerCase())) &&
                    candidate.getCandidateType() == candidateType) {
                candidates.add(candidate);
            }
        }

        for (Candidate candidate : fresherCandidates) {
            if ((candidate.getFirstName().toLowerCase().contains(name.toLowerCase()) ||
                    candidate.getLastName().toLowerCase().contains(name.toLowerCase())) &&
                    candidate.getCandidateType() == candidateType) {
                candidates.add(candidate);
            }
        }

        for (Candidate candidate : internCandidates) {
            if ((candidate.getFirstName().toLowerCase().contains(name.toLowerCase()) ||
                    candidate.getLastName().toLowerCase().contains(name.toLowerCase())) &&
                    candidate.getCandidateType() == candidateType) {
                candidates.add(candidate);
            }
        }

        return candidates;
    }
}
