public class VisitLinkedList {

    // Node class for the linked list
    private class Node {
        Visit visit;
        Node next;

        Node(Visit visit) {
            this.visit = visit;
            this.next = null;
        }
    }

    private Node head;

    public VisitLinkedList() {
        head = null;
    }

    // Add a new visit to the patient's history (add at the end)
    public void addVisit(Visit visit) {
        Node newNode = new Node(visit);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Visit ID " + visit.getVisitId() + " added to history.");
    }

    // Remove a visit by Visit ID
    public void removeVisit(int visitId) {
        if (head == null) {
            System.out.println("No visit history found.");
            return;
        }

        // If head itself needs to be removed
        if (head.visit.getVisitId() == visitId) {
            head = head.next;
            System.out.println("Visit ID " + visitId + " removed from history.");
            return;
        }

        Node current = head;
        while (current.next != null && current.next.visit.getVisitId() != visitId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Visit ID " + visitId + " not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Visit ID " + visitId + " removed from history.");
        }
    }

    // Search for a visit by Visit ID
    public Visit searchVisit(int visitId) {
        Node current = head;
        while (current != null) {
            if (current.visit.getVisitId() == visitId) {
                return current.visit;
            }
            current = current.next;
        }
        return null;
    }

    // Display the patient's visit history
    public void display() {
        if (head == null) {
            System.out.println("No visit history found.");
            return;
        }

        System.out.println("=== Patient Visit History ===");
        Node current = head;
        while (current != null) {
            current.visit.display();
            current = current.next;
        }
    }
}