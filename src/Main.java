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
    }
}