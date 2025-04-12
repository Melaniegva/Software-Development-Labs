# Lab 1 – Introduction to Inheritance in Java

## 👩🏻‍💻 Overview

This lab introduces the concept of **inheritance** in Java through a class hierarchy involving `Automobile` and its subclass `SUV`. The lab emphasizes object-oriented principles like **constructor chaining**, **method overriding**, and **data encapsulation**.

## Files Included

- `Automobile.java`: A base class that defines the core attributes of a vehicle (make, model, year, number of wheels), along with a `getinfo()` method to display these attributes.
- `SUV.java`: A subclass of `Automobile` that extends the base class with additional attributes (`numpass` and `cargospc`) and overrides the `getinfo()` method to display both inherited and new information.

## Key Concepts

- **Inheritance**: `SUV` inherits from `Automobile`, demonstrating how to reuse and extend functionality.
- **Method Overriding**: `getinfo()` in `SUV` overrides the base version to display subclass-specific details.
- **Constructor Chaining**: The `SUV` constructor calls `super(...)` to initialize the inherited fields.

## Sample Output

The programmer is: Melanie Guevara Make: Chrysler Model: 911 ST Year: 2025 Number of Wheels: 4 Passangers: 6 Cargo space: 6.7


## Programmer

Melanie Guevara
