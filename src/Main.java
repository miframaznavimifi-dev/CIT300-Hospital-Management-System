public class Main {
    public static void main(String[] args) {

        PatientBST bst = new PatientBST();

        // Insert some patients
        bst.insert(new Patient(103, "Kasun Perera", 34, "0771234567", "Fracture"));
        bst.insert(new Patient(101, "Nimali Silva", 28, "0777654321", "Fever"));
        bst.insert(new Patient(105, "Ruwan Fernando", 45, "0712345678", "Chest Pain"));
        bst.insert(new Patient(102, "Amaya Jayasuriya", 22, "0765432198", "Asthma"));

        System.out.println("=== All Patients (In-order Traversal) ===");
        bst.inorderTraversal();

        System.out.println("=== Search Patient ID 105 ===");
        Patient found = bst.search(105);
        if (found != null) {
            found.display();
        } else {
            System.out.println("Patient not found.");
        }

        System.out.println("=== Delete Patient ID 101 ===");
        bst.delete(101);

        System.out.println("=== All Patients After Deletion ===");
        bst.inorderTraversal();
     
                System.out.println("\n=== Emergency Queue Test ===");
        EmergencyQueue queue = new EmergencyQueue();

        queue.enqueue(new Patient(201, "Sunil Bandara", 30, "0711111111", "Broken Arm"));
        queue.enqueue(new Patient(202, "Priya Kumar", 25, "0722222222", "High Fever"));
        queue.enqueue(new Patient(203, "Chamara Silva", 40, "0733333333", "Stomach Pain"));

        System.out.println("\n--- Waiting Patients ---");
        queue.display();

        System.out.println("\n--- Treating next patient ---");
        queue.dequeue();

        System.out.println("\n--- Waiting Patients After Dequeue ---");
        queue.display();

                System.out.println("\n=== Treatment History Stack Test ===");
        TreatmentStack stack = new TreatmentStack();

        stack.push(new Patient(301, "Ishara Gunasekara", 35, "0744444444", "Minor Burn"));
        stack.push(new Patient(302, "Dilani Rathnayake", 29, "0755555555", "Sprained Ankle"));
        stack.push(new Patient(303, "Nuwan Perera", 50, "0766666666", "Migraine"));

        System.out.println("\n--- Treatment Records ---");
        stack.display();

        System.out.println("\n--- Removing most recent treatment record ---");
        stack.pop();

        System.out.println("\n--- Treatment Records After Pop ---");
        stack.display();
                System.out.println("\n=== Patient Visit History Test ===");
        VisitLinkedList visitHistory = new VisitLinkedList();

        visitHistory.addVisit(new Visit(1, "2025-01-10", "Dr. Perera", "Common Cold", "Rest and fluids"));
        visitHistory.addVisit(new Visit(2, "2025-03-22", "Dr. Fernando", "Fracture", "Cast applied"));
        visitHistory.addVisit(new Visit(3, "2025-06-15", "Dr. Silva", "Fever", "Antibiotics prescribed"));

        System.out.println("\n--- Full Visit History ---");
        visitHistory.display();

        System.out.println("\n--- Search Visit ID 2 ---");
        Visit foundVisit = visitHistory.searchVisit(2);
        if (foundVisit != null) {
            foundVisit.display();
        } else {
            System.out.println("Visit not found.");
        }

        System.out.println("\n--- Removing Visit ID 1 ---");
        visitHistory.removeVisit(1);

        System.out.println("\n--- Visit History After Removal ---");
        visitHistory.display();
    }
}