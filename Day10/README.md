# ⏳ Day 10 – Pascal's Triangle II (LeetCode) | #10Days1Topic10Que

Welcome to Day 10 of my **#10Days1Topic10Que** LeetCode challenge!  
Today’s focus was on computing a specific **row** of Pascal’s Triangle — a problem that blends **combinatorics** with **space-optimized array logic**.

---

## 📌 Problem: [Pascal's Triangle II – LeetCode](https://leetcode.com/problems/pascals-triangle-ii/)

### 🔹 Description:  
Given an integer `rowIndex`, return the `rowIndex`-th (0-indexed) row of **Pascal’s Triangle**.

> Each number in a row is derived from:  
> `row[i] = row[i - 1] * (rowIndex - i + 1) / i`

---

## 🧠 Approaches:

### ✅ Combinatorics-Based Row Generation (Optimized)
- Use a single list to store the result.
- Begin with `1`, and for each index `i`, use the formula to compute the next value.
- Avoids building the full triangle (space-efficient).
- Handles large values using `long` during computation.

---

## 💻 Code File

- `Pascals_Triangle_II.java` – Java implementation using a 1D list and mathematical formula for efficient row computation.

---

## 🧠 Concepts Used

- 1D Array / List  
- Iterative Combinatorics  
- Binomial Coefficients  
- Optimized Array Building  
- Space-Efficient Computation

---

## 📅 Challenge Tracker

Part of **#10Days1Topic10Que**:  
🔢 Topic – Arrays | 🔁 Day 10/10 | 🧩 Problem 10/10

---

#LeetCode #DSA #Java #PascalTriangleII #ArrayQuestions #BinomialCoefficients #CodingChallenge #LearningInPublic #10DaysChallenge #ProblemSolving #CodeNewbie #WomenWhoCode
