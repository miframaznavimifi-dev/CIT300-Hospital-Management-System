import java.util.Stack;
import java.util.EmptyStackException;

public class TreatmentStack {

    private Stack<Patient> treatmentHistory;

    public TreatmentStack() {
        treatmentHistory = new Stack<>();
    }

    // Push - add a completed treatment record
    public void push(Patient patient) {
        treatmentHistory.push(patient);
        System.out.println("Treatment completed for " + patient.getName() + " - record added.");
    }

    // Pop - remove the most recently completed treatment record
    public Patient pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No treatment records to remove.");
            return null;
        }
        Patient patient = treatmentHistory.pop();
        System.out.println("Removed most recent treatment record: " + patient.getName());
        return patient;
    }

    // Display treatment records (most recent first)
    public void display() {
        if (isEmpty()) {
            System.out.println("No treatment records found.");
            return;
        }

        System.out.println("=== Treatment History (Most Recent First) ===");
        for (int i = treatmentHistory.size() - 1; i >= 0; i--) {
            treatmentHistory.get(i).display();
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return treatmentHistory.isEmpty();
    }
}