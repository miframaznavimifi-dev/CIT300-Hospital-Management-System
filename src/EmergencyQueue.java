import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {

    private Queue<Patient> queue;

    public EmergencyQueue() {
        queue = new LinkedList<>();
    }

    // Enqueue - add a patient to the waiting queue
    public void enqueue(Patient patient) {
        queue.add(patient);
        System.out.println("Patient " + patient.getName() + " added to the waiting queue.");
    }

    // Dequeue - remove the next patient for treatment
    public Patient dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No patients waiting.");
            return null;
        }
        Patient patient = queue.poll();
        System.out.println("Patient " + patient.getName() + " is now being treated.");
        return patient;
    }

    // Display all patients currently waiting
    public void display() {
        if (isEmpty()) {
            System.out.println("No patients currently waiting.");
            return;
        }

        System.out.println("=== Patients Waiting in Emergency Queue ===");
        for (Patient patient : queue) {
            patient.display();
        }
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}