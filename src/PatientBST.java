public class PatientBST {

    // Node class for BST
    private class Node {
        Patient patient;
        Node left, right;

        Node(Patient patient) {
            this.patient = patient;
            left = null;
            right = null;
        }
    }

    private Node root;

    public PatientBST() {
        root = null;
    }

    // Insert a new patient
    public void insert(Patient patient) {
        root = insertRec(root, patient);
    }

    private Node insertRec(Node root, Patient patient) {
        if (root == null) {
            root = new Node(patient);
            return root;
        }

        if (patient.getPatientId() < root.patient.getPatientId()) {
            root.left = insertRec(root.left, patient);
        } else if (patient.getPatientId() > root.patient.getPatientId()) {
            root.right = insertRec(root.right, patient);
        } else {
            System.out.println("Patient ID " + patient.getPatientId() + " already exists.");
        }

        return root;
    }

    // Search for a patient by ID
    public Patient search(int patientId) {
        return searchRec(root, patientId);
    }

    private Patient searchRec(Node root, int patientId) {
        if (root == null) {
            return null;
        }

        if (patientId == root.patient.getPatientId()) {
            return root.patient;
        }

        if (patientId < root.patient.getPatientId()) {
            return searchRec(root.left, patientId);
        } else {
            return searchRec(root.right, patientId);
        }
    }

    // Delete a patient by ID
    public void delete(int patientId) {
        root = deleteRec(root, patientId);
    }

    private Node deleteRec(Node root, int patientId) {
        if (root == null) {
            System.out.println("Patient ID " + patientId + " not found.");
            return null;
        }

        if (patientId < root.patient.getPatientId()) {
            root.left = deleteRec(root.left, patientId);
        } else if (patientId > root.patient.getPatientId()) {
            root.right = deleteRec(root.right, patientId);
        } else {
            // Node found - handle deletion cases

            // Case 1: No children
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children - find inorder successor (smallest in right subtree)
            Node successor = findMin(root.right);
            root.patient = successor.patient;
            root.right = deleteRec(root.right, successor.patient.getPatientId());
        }

        return root;
    }

    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // In-order traversal - displays patients in ascending order of Patient ID
    public void inorderTraversal() {
        if (root == null) {
            System.out.println("No patient records found.");
            return;
        }
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            root.patient.display();
            inorderRec(root.right);
        }
    }
}