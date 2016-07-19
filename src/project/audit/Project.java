/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.audit;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Greenie
 */
public class Project implements Serializable {

    static List<String> projectName = new ArrayList<>();
    List<Integer> projectBudget = new ArrayList<>();
    List<String> projectWebsite = new ArrayList<>();
    List<String> projectCollaborators = new ArrayList<>();
    List<String> projectDescription = new ArrayList<>();
    
    public static void saveArray() {
        for(int i = 1; i<= projectName.size(); i++) {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("ProjectNames.pa"));
            os.writeObject(projectName);
            os.close();
        }
    }S
}
