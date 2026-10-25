# Strategy Pattern Studying Project - Navigation System

Individual assignment for **ShP-2216 - Software Design Patterns** course at Astana IT University.  
**Author:** Amanzhol Yerzhanov (Group SE-2526)

---

## 1. Project Overview
This project implements the **Strategy (Behavioral Design Pattern)** in Java. The chosen domain is **Navigation / Route Planning** (Option A). The application allows a `Navigator` context to calculate routes dynamically at runtime using interchangeable transportation strategies (`CarStrategy`, `BusStrategy`, etc.) without hardcoding conditional branching (`if-else` or `switch-case`) inside the core business logic.

---

## 2. UML Class Diagram Structure

classDiagram
    class RouteStrategy {
        <<interface>>
        +buildRoute(String start, String destination) String
    }

    class CarStrategy {
        +buildRoute(String start, String destination) String
    }

    class BusStrategy {
        +buildRoute(String start, String destination) String
    }

    class WalkStrategy {
        +buildRoute(String start, String destination) String
    }

    class Navigator {
        -RouteStrategy strategy
        +Navigator(RouteStrategy strategy)
        +setStrategy(RouteStrategy strategy)
        +calculateRoute(String start, String destination) String
    }

    class Main {
        +main(String[] args)
    }

    RouteStrategy <|.. CarStrategy : implements
    RouteStrategy <|.. BusStrategy : implements
    RouteStrategy <|.. WalkStrategy : implements
    Navigator o--> RouteStrategy : uses
    Main --> Navigator : creates
    Main --> CarStrategy : instantiates
    Main --> BusStrategy : instantiates

---

## 3. Project Structure
```text
strategy-pattern-studying-project/
│
├── RouteStrategy.java     # Common Strategy interface
├── CarStrategy.java       # Concrete strategy for car navigation
├── BusStrategy.java       # Concrete strategy for bus navigation
├── Navigator.java         # Context class holding the strategy reference
├── Main.java              # Client application entry point
└── Assignment_5_Strategy_Pattern_2026-2027.pdf # Assignment guidelines