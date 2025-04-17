# Lab 2 – Abstract Classes and Polymorphism

## 👩🏻‍💻 Overview

This lab focuses on abstract classes, inheritance, and polymorphism by modeling a student system with different types of students (Undergraduate and Graduate). It demonstrates how shared behaviors and unique traits can be represented using abstract base classes and subclass-specific implementations.

## Files Included

- `Student.java`: An abstract class that defines common properties and methods for all students. It includes abstract methods `setTuition()` and `setClassification()` which must be implemented by all subclasses.
- `UndergraduateStudent.java`: A concrete subclass of `Student` that sets tuition and classification for undergraduate students.
- `GraduateStudent.java`: A concrete subclass of `Student` that sets tuition and classification for graduate students.
- `Lab2.java`: Contains the `main` method, where arrays of both student types are created and displayed using polymorphic behavior.

## Key Concepts

- **Abstract Classes**: `Student` is an abstract class that cannot be instantiated directly.
- **Method Overriding**: Each student type provides its own implementation of `setTuition()` and `setClassification()`.
- **Polymorphism**: Arrays of `Student` objects can store instances of both `UndergraduateStudent` and `GraduateStudent`.
- **Encapsulation**: Private fields with public getters/setters to manage data access.

## Sample Output
Undergraduate Students: Student ID: 111, Name: Lambert, Tuition: 4000.0 per year, Student Class is: Undergraduate Student ID: 122, Name: Lembeck, Tuition: 4000.0 per year, Student Class is: Undergraduate

Graduate Students: Student ID: 222, Name: Charlie, Tuition: 6000.0 per year, Student Class is: Graduate Student ID: 333, Name: Shaggy, Tuition: 6000.0 per year, Student Class is: Graduate 


## Programmer
Melanie Guevara
