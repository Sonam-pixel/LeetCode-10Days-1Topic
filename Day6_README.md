# ⏳ Day 6 – Plus One (LeetCode) | #10Days1Topic10Que

Welcome to Day 6 of my **#10Days1Topic10Que** LeetCode challenge!  
Today’s focus was on **adding one to a large integer represented as an array of digits**, while managing carryovers and edge cases efficiently.

---

## 📌 Problem: [Plus One – LeetCode](https://leetcode.com/problems/plus-one/)

### 🔹 Description:  
You are given a **large integer** represented as an **array of digits**, where each element is a single digit.  
Return the array representing the integer plus one.

> The array does **not** contain leading zeroes.  
> The most significant digit is at the beginning of the array.

---

## 🧠 Approaches:

### ✅ Right-to-Left Iteration + Carry Handling
- Traverse the array from the end.
- If the current digit is less than 9, increment it and return the array.
- If the digit is 9, set it to 0 and continue to the left.
- If all digits are 9, create a new array with an extra leading `1`.

---

## 💻 Code File

-`Plus One.java` – Java implementation that handles carry propagation and edge case.

---

## 🧠 Concepts Used

- Array Traversal (Right to Left)  
- Carry Propagation Logic  
- Edge Case Handling (e.g., all 9s)  
- No Conversion to Integer (Avoiding Overflow)  

---

## 📅 Challenge Tracker

Part of **#10Days1Topic10Que**:  
🔢 Topic – Arrays | 🔁 Day 6/10 | 🧩 Problem 6/10

---

#LeetCode #DSA #Java #ArrayManipulation #ProblemSolving #CodingChallenge #CarryHandling #LearningInPublic #10DaysChallenge
