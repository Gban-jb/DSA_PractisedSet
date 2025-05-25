# Spiral Matrix Traversal

## 🌀 Problem Statement

Print the elements of a 2D matrix in **spiral order** using **boundaries and simulation**.

---

## 📌 Description

This Java program simulates a spiral walk around a matrix using four boundaries:
- `top`, `bottom`, `left`, `right`

The movement pattern is:
1. ➡ Right across the top row
2. ⬇ Down the rightmost column
3. ⬅ Left across the bottom row
4. ⬆ Up the leftmost column

This continues until all elements are covered.

---

## ✅ Example

### Input:
```java
int[][] matrix = {
  {1, 2, 3, 4},
  {5, 6, 7, 8},
  {9,10,11,12},
  {13,14,15,16}
};
Output:
csharp
Copy
Edit
The Spiral Matrix is: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
