
---

# 📚 Westminster Library Management System

### *Java Console + GUI Application*

---

##  Overview

The **Westminster Library Management System** is a Java application designed for managing Books, DVDs, and Magazines within a library environment. It demonstrates key Object-Oriented Programming concepts and includes both a **console-based menu** and a **graphical user interface (GUI)** using Java Swing.

The system supports adding, displaying, editing, and counting library items.

---

##  Project Structure

```
librarycentre_package/
│
├── Item.java
├── Book.java
├── DVD.java
├── Magazine.java
├── PublicationFrequency.java
│
├── LibraryManager.java
├── WestminsterLibraryManager.java
│
├── ItemTableModel.java
├── ItemTableGUI.java
│
├── LibraryCentre_MockLabBasedPractical.java
└── WestminsterLibraryManagerTest.java  (JUnit)
```

---

##  Features

### ✔ Item Management

* Add **Books**, **DVDs**, or **Magazines**
* Stores title, ISBN, publication year, and item-specific fields
* Uses an `ArrayList<Item>` for storage

### ✔ Edit Feature

* Edit the **title** of an item by entering its ISBN
* Displays:

    * Current title
    * Publication year
    * Item type (Book/DVD/Magazine)

### ✔ Sorting

* Items are automatically sorted by **publication year**
* Implemented using `Comparable<Item>` in `Item.java`

### ✔ GUI (Swing-Based)

* Uses `JTable` with custom `ItemTableModel`
* Displays **Type** column (BOOK / DVD / MAGAZINE)
* “Info” button shows:

    * Total number of Books
    * Total number of DVDs
    * Total number of Magazines

### ✔ Persistence

* Demonstrates saving/loading objects with:

    * `ObjectOutputStream`
    * `ObjectInputStream`

### ✔ Unit Testing

* JUnit test ensures correct behavior of `addItemToList()` method.

---

## 💡 OOP Concepts Applied

| Concept                  | Usage                                  |
| ------------------------ | -------------------------------------- |
| **Inheritance**          | Book, DVD, Magazine extend Item        |
| **Encapsulation**        | Private variables with getters/setters |
| **Polymorphism**         | `instanceof`, overridden methods       |
| **Abstraction**          | LibraryManager interface               |
| **Comparable Interface** | Sorting items by publication year      |

---

## 🧩 Console Menu

```
-- WESTMINSTER LIBRARY MANAGER CONSOLE MENU --
0. Exit & Save
1. Add a new item
2. Display the list of items
3. Open GUI
4. Edit an item title
```

---

## 🖥 Running the Project

### ▶ Using NetBeans

1. Open the project in NetBeans
2. Run:

   ```
   LibraryCentre_MockLabBasedPractical.java
   ```
3. The console menu appears
4. To open the GUI → Select option **3**

### Requirements

* Java JDK 8+
* NetBeans / IntelliJ / Eclipse
* JUnit 4 or 5

---

## 🧪 Unit Testing (JUnit)

A JUnit test (`WestminsterLibraryManagerTest.java`) checks:

### ✔ When space is available:

* Item successfully added
* List size increases
* Item exists in the list

### ✔ When item list is full:

* Additional items are NOT added
* List size does not increase

Test ensures the behavior of:

```
addItemToList(Item item)
```

---

## 📊 GUI Preview

![Screenshot 2025-12-03 at 10.34.35 AM.png](screenshots/Screenshot%202025-12-03%20at%2010.34.35%20AM.png)

---

## 📄 Example Console Output

```
BOOK - Title: Java Basics, ISBN=1234, publication year=2020, author: Smith
DVD  - Title: Avengers, ISBN=7890, publication year=2019, genre: Action, director: Whedon
MAGAZINE - ISBN No: 5555, Title: TechToday, Issue Number: 34, Publication Frequency: MONTHLY, Editor: Alice
```

---

