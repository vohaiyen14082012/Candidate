/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controller.CandidateManagerController;
import Model.CandidateManagerModel;
import VIew.CandidateManagerView;

public class Main {
    public static void main(String[] args) {
        CandidateManagerModel model = new CandidateManagerModel();
        CandidateManagerView view = new CandidateManagerView();
        CandidateManagerController controller = new CandidateManagerController(model, view);
        controller.run();
    }
}