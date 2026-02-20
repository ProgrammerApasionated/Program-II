# 📁 ControlStructures
### Strengthening Logic Through Practice

This folder contains a wide set of exercises focused on **control structures**, one of the core pillars of programming in Java.

Here I work extensively with loops, conditionals, nested iterations, and pattern-based logic — all essential skills for both my **second-semester exam** and my long-term development as an engineer.

These exercises are not meant to be perfect or elegant.  
They exist because the only way to truly master logic is through **repetition**, breaking problems down, and writing code that forces step-by-step reasoning.

This folder represents exactly that:  
**practice, structure, and the gradual construction of real understanding.**

---

## 🧵 Cadenas — Working With Strings

These exercises helped me move from simple character handling to more structured string analysis.  
Java’s `String` class is stricter and less flexible than Python’s, so focused practice here has been essential.

### 1. `ContarDigitos.java`
Counts how many numeric characters appear in a given string.

**Concepts practiced:**
- Iterating through strings
- Using `Character.isDigit()`
- Building small utility methods
- Separating logic from input handling

---

### 2. `ContarRachasDigitos.java`
Counts how many **streaks of consecutive digits** appear in a string.

**Concepts practiced:**
- State tracking with boolean variables
- Detecting transitions (digit → non-digit)
- Modeling streaks and patterns in code

This exercise was especially useful for learning to think in terms of **patterns**, not just individual characters.

---

### 3. `EncontrarPatron.java`
Searches for a substring inside a larger string using a **manual comparison loop**.

**Concepts practiced:**
- Nested loops
- Manual pattern matching
- Boolean flags
- Avoiding shortcuts like `contains()` to understand the underlying logic

This type of reasoning frequently appears in exam problems.

---

### 4. `RachaMayusculas.java`
Finds the **longest streak of consecutive uppercase letters** in a string.

**Concepts practiced:**
- Streak detection
- Updating maximum values
- Character classification with `Character.isUpperCase()`

A solid exercise for learning how to track running values and reset counters correctly.

---

## 🔢 Matrices — Thinking in Two Dimensions

Working with matrices forces a deep understanding of nested loops, indexing, and structured iteration.  
These exercises are fundamental both for exams and for building algorithmic discipline.

### 1. `MatrizEncontrar.java`
Searches for a value inside a matrix and prints all its positions.

**Concepts practiced:**
- Nested loops
- Scanning 2D structures
- Boolean flags
- Handling multiple matches

---

### 2. `MatrizMax.java`
Finds the maximum value in each row of a matrix.

**Concepts practiced:**
- Row-based iteration
- Accumulator patterns
- Returning values from helper methods

---

### 3. `MatrizSuma.java`
Computes the sum of all elements in a matrix.

**Concepts practiced:**
- Full matrix traversal
- Summation logic
- Reusing structures from the `Estructuras/` folder

---

### 4. `MatrizTranspuesta.java`
Generates the **transpose** of a matrix and prints both versions.

**Concepts practiced:**
- Swapping indices
- Creating new matrices with reversed dimensions
- Separating logic into reusable methods

This exercise helped me understand how data structures can be transformed purely through indexing.

---

## ➿ Vectores — Algorithms in One Dimension

These exercises helped me build confidence with arrays, a core topic in Java and a recurring theme in exams.

### 1. `InsertarElemento.java`
Inserts a value into a **sorted vector** while keeping the order.

**Concepts practiced:**
- Finding insertion positions
- Creating new arrays
- Shifting elements
- Thinking algorithmically instead of relying on built-in utilities

---

### 2. `NoNegativos.java`
Creates a new vector containing only the **non-negative values**.

**Concepts practiced:**
- Filtering data
- Counting valid elements before allocation
- Two-pass algorithms (dimension → fill)

---

### 3. `NoRepetidos.java`
Removes all occurrences of a given value and checks whether the resulting vector is **alternating** (even/odd pattern).

**Concepts practiced:**
- Conditional filtering
- Building new vectors
- Boolean logic
- Combining multiple functions to solve a single problem

---

## 🎯 Why This Folder Matters

This folder is one of the most important parts of my second-semester preparation.

It contains exercises that force me to:
- Think in loops
- Recognize and model patterns
- Work confidently with arrays and matrices
- Break problems into smaller, manageable pieces
- Write clean, structured logic
- Prepare for exams where these exact skills are tested

Every file here represents **real practice** — not perfect code, but real learning.

---

## 🌱 A Continuous Learning Process

Like the rest of the repository, these exercises reflect my evolution:
from simple string checks to nested loops,  
from basic arrays to full matrix transformations.

They reinforce the idea that programming is built on **patterns, discipline, and repetition**.  
And with every exercise, I get a little closer to thinking like a real engineer.