# Strategy Pattern Studying Project - Navigation System

Individual assignment for **ShP-2216 - Software Design Patterns** course at Astana IT University.  
**Author:** Amanzhol Yerzhanov (Group SE-2526)

---

## 1. Project Overview
This project implements the **Strategy (Behavioral Design Pattern)** in Java. The chosen domain is **Navigation / Route Planning** (Option A). The application allows a `Navigator` context to calculate routes dynamically at runtime using interchangeable transportation strategies (`CarStrategy`, `BusStrategy`, etc.) without hardcoding conditional branching (`if-else` or `switch-case`) inside the core business logic.

---

## 2. UML Class Diagram Structure

| Class / Interface | Type | Core Methods & Fields | Description |
| :--- | :--- | :--- | :--- |
| **`RouteStrategy`** | Interface | `String buildRoute(String start, String destination)` | Common interface declaring the algorithm execution method for all strategies. |
| **`CarStrategy`** | Concrete Strategy | `buildRoute(String start, String destination)` | Implements route planning specifically optimized for automobiles (fastest highways, toll roads). |
| **`BusStrategy`** | Concrete Strategy | `buildRoute(String start, String destination)` | Implements route planning via public transport (bus stops, timetables). |
| **`Navigator`** | Context | `- RouteStrategy strategy`<br>`+ setStrategy(RouteStrategy strategy)`<br>`+ calculateRoute(String start, String destination)` | Maintains a reference to a strategy object and delegates the route computation task to it. Supports runtime switching. |
| **`Main`** | Client | `+ main(String[] args)` | Instantiates strategies, configures the `Navigator` context, and demonstrates runtime switching and execution. |

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