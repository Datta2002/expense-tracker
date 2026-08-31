# Console-Based Expense Tracker

A simple, console-based Expense Tracker application written in Java. This project demonstrates core **Java File Handling** concepts and is perfect for students learning how to perform CRUD (Create, Read, Update, Delete) operations using flat files (text files).

## Features

- **Add Expense (Create):** Append new expense records to a text file.
- **Display All Expenses (Read):** Read and parse all expenses from the file into memory.
- **Edit Expense (Update):** Modify an existing expense in memory and overwrite the file to save the new state.
- **Delete Expense (Delete):** Remove an expense from memory and overwrite the file to reflect the deletion.

## Technologies Used

- **Java**: Core programming language.
- **File I/O**: `BufferedReader`, `BufferedWriter`, `FileReader`, `FileWriter` used for data persistence.

## How to Run

1. Clone this repository to your local machine.
2. Compile the Java files in the `src` directory:
   ```bash
   javac src/*.java
   ```
3. Run the `ExpenseTracker` main class:
   ```bash
   java -cp src ExpenseTracker
   ```

## Learning File Handling

This project is structured to help beginners understand the differences between **appending** to a file and **overwriting** a file:
- When **Adding**, we open the file in append mode (`new FileWriter(file, true)`).
- When **Editing** or **Deleting**, we load all data into a Java `ArrayList`, modify it, and then overwrite the file (`new FileWriter(file)`).

## Project Structure

- `ExpenseData.java`: The model class representing a single expense.
- `ExpenseFileFormat.java`: Handles all reading and writing to `expense.txt`.
- `ExpenseService.java`: The business logic layer managing the in-memory list of expenses.
- `ExpenseTracker.java`: The main class containing the user interface menu loop.
