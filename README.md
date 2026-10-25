# Strategy Pattern Studying Project - Navigation System

[![Java](https://img.shields.io/badge/Java-17-%23ED8B00?style=flat&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![AITU](https://img.shields.io/badge/Astana%20IT%20University-Software%20Engineering-blue)](https://astana-it.edu.kz/)

Individual assignment for **ShP-2216 - Software Design Patterns** course at Astana IT University.  
**Author:** Amanzhol Yerzhanov (Group SE-2526)

---

## 1. Project Overview
This project implements the **Strategy (Behavioral Design Pattern)** in Java. The chosen domain is **Navigation / Route Planning** (Option A). The application allows a `Navigator` context to calculate routes dynamically at runtime using interchangeable transportation strategies (`CarStrategy`, `BusStrategy`, `WalkStrategy`) without hardcoding conditional branching (`if-else` or `switch-case`) inside the core business logic.

---

## 2. UML Class Diagram

Ниже представлена графическая UML-диаграмма классов разработанной архитектуры:

[![UML Class Diagram](https://mermaid.ink/svg/pako:eNp1UdtugjAQ_ZXmPRbTlwbN0W6a1DSp7Udt0tO3hRUXrMCWw5v-fSUghh7mYeacOWf2zsG1NnDIWk_S3o3oO7I3bJp13Qp_c95kZ8U3z22lHh0Fp6G-gGZ105rF2L3VfWp_2y0aW-7r_jZ0w_j09QcT2c7BefA4bU09gS4k0cffX25_2q7vSztNlRvvjX_0N43u8p6p6uVlVvd9v4QZ1qGzK8P_Yp1W7FjZlQ6bN1t89n5eY207uXW37_tA0i_aXQ)](https://mermaid.live/edit#pako:eNp1UdtugjAQ_ZXmPRbTlwbN0W6a1DSp7Udt0tO3hRUXrMCWw5v-fSUghh7mYeacOWf2zsG1NnDIWk_S3o3oO7I3bJp13Qp_c95kZ8U3z22lHh0Fp6G-gGZ105rF2L3VfWp_2y0aW-7r_jZ0w_j09QcT2c7BefA4bU09gS4k0cffX25_2q7vSztNlRvvjX_0N43u8p6p6uVlVvd9v4QZ1qGzK8P_Yp1W7FjZlQ6bN1t89n5eY207uXW37_tA0i_aXQ)

---

## 3. Project Structure
```text
strategy-pattern-studying-project/
│
├── RouteStrategy.java     # Common Strategy interface
├── CarStrategy.java       # Concrete strategy for car navigation
├── BusStrategy.java       # Concrete strategy for bus navigation
├── WalkStrategy.java      # Concrete strategy for walking navigation
├── Navigator.java         # Context class holding the strategy reference
├── Main.java              # Client application entry point
└── Assignment_5_Strategy_Pattern_2026-2027.pdf # Assignment guidelines