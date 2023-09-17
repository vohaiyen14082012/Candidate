/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIew;
import Model.Candidate;
import Model.ExperienceCandidate;
import Model.FresherCandidate;
import Model.InternCandidate;
import java.util.ArrayList;
import java.util.Scanner;

public class CandidateManagerView {
    private Scanner scanner = new Scanner(System.in);

    public int showMainMenu() {
        System.out.println("CANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Internship");
        System.out.println("4. Searching");
        System.out.println("5. Exit");
        System.out.print("Please choose an option (1-5): ");
        return scanner.nextInt();
    }

    public Candidate createCandidate(int candidateType) {
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Candidate ID: ");
        String candidateId = scanner.nextLine();
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Birth Date (yyyy): ");
        String birthDate = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        if (candidateType == 0) { // Experience Candidate
            System.out.print("Enter Years of Experience: ");
            int expInYear = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Professional Skill: ");
            String proSkill = scanner.nextLine();
            return new ExperienceCandidate(candidateId, firstName, lastName, birthDate, address, phone, email, expInYear, proSkill);
        } else if (candidateType == 1) { // Fresher Candidate
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Graduation Date (yyyy-mm-dd): ");
            String graduationDate = scanner.nextLine();
            System.out.print("Enter Graduation Rank (Excellence/Good/Fair/Poor): ");
            String graduationRank = scanner.nextLine();
            System.out.print("Enter University Name: ");
            String education = scanner.nextLine();
            return new FresherCandidate(candidateId, firstName, lastName, birthDate, address, phone, email, graduationDate, graduationRank, education);
        } else { // Intern Candidate
            System.out.print("Enter Majors: ");
            String majors = scanner.nextLine();
            System.out.print("Enter Semester: ");
            String semester = scanner.nextLine();
            System.out.print("Enter University Name: ");
            String universityName = scanner.nextLine();
            return new InternCandidate(candidateId, firstName, lastName, birthDate, address, phone, email, majors, semester, universityName);
        }
    }

    public void displayCandidates(ArrayList<Candidate> candidates) {
        if (candidates.isEmpty()) {
            System.out.println("No candidates found.");
            return;
        }

        for (Candidate candidate : candidates) {
            System.out.println("=================================");
            System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            System.out.println("Birth Date: " + candidate.getBirthDate());
            System.out.println("Address: " + candidate.getAddress());
            System.out.println("Phone: " + candidate.getPhone());
            System.out.println("Email: " + candidate.getEmail());
            System.out.println("Candidate Type: " + candidate.getCandidateType());
        }
    }

    public String getSearchName() {
        scanner.nextLine(); // Consume newline
        System.out.print("Input Candidate name (First name or Last name): ");
        return scanner.nextLine();
    }

    public int getSearchType() {
        System.out.print("Input type of candidate (0: Experience, 1: Fresher, 2: Intern): ");
        return scanner.nextInt();
    }
}
