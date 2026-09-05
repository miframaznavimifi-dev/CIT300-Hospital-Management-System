# Mini Hospital Emergency Management System

## Overview
This project is a Mini Hospital Emergency Management System developed in Java as part of the CIT300 - Data Structures and Algorithms Mid Assignment. The system simulates patient registration, emergency treatment requests, treatment completion, and patient visit history using core data structures.

## Data Structures Used

### 1. Binary Search Tree (BST) - Patient Records
Stores patient records using Patient ID as the key. Supports insertion, search, deletion, and in-order traversal to display patients in ascending order of Patient ID.

### 2. Queue - Emergency Patient Queue
Manages patients waiting in the emergency unit using FIFO (First-In, First-Out) principle. Supports enqueue, dequeue, and display of waiting patients, with empty queue handling.

### 3. Stack - Treatment History
Stores completed treatment records using LIFO (Last-In, First-Out) principle. Supports push, pop, and display of treatment records, with empty stack handling.

### 4. Singly Linked List - Patient Visit History
Maintains each patient's previous hospital visit history. Supports adding, removing, searching, and displaying visit records.

## Project Structure
- src/Patient.java - Patient data model
- src/PatientBST.java - BST implementation for patient records
- src/EmergencyQueue.java - Queue implementation for emergency patients
- src/TreatmentStack.java - Stack implementation for treatment history
- src/Visit.java - Visit data model
- src/VisitLinkedList.java - Singly Linked List for visit history
- src/Main.java - Main class to run and test the system

## How to Run
1. Clone this repository
2. Open the project folder in VS Code (with Java Extension Pack installed) or any Java IDE
3. Run `Main.java` to see the demonstration of all data structures

## Author
Developed by MMF. Mifra as part of CIT300 - Data Structures and Algorithms coursework.