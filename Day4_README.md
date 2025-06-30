# ⏳ Day 4 – Remove Element (LeetCode) | #10Days1Topic10Que

Welcome to Day 4 of my **#10Days1Topic10Que** LeetCode challenge!  
Today’s focus was on efficiently removing all instances of a specific value **in-place** from an array.

---

## 📌 Problem: [Remove Element – LeetCode](https://leetcode.com/problems/remove-element/)

### 🔹 Description:
Given an array `nums` and a value `val`, remove all instances of that value in-place and return the new length.  
You must do this using **O(1) extra memory**, and the order of elements can be changed.

> You don’t need to consider elements beyond the returned length.

---

## 🧠 Approaches:

### ✅ Two-Pointer Technique (Overwrite Style)
- Use one pointer to iterate and another (`count`) to overwrite valid elements.
- Whenever `nums[i] != val`, assign it to `nums[count]` and increment `count`.
- Return `count` as the new length.

---

## 💻 Code File

- `Remove Element.java` – Java implementation using the two-pointer overwrite method for in-place removal.

---

## 🧠 Concepts Used

- Two Pointer Technique  
- In-Place Modification  
- Conditional Filtering  
- Space-Optimized Updates

---

## 📅 Challenge Tracker

Part of **#10Days1Topic10Que**:  
🔢 Topic – Arrays | 🔁 Day 4/10 | 🧩 Problem 4/10

---

#LeetCode #DSA #Java #ArrayManipulation #TwoPointers #ProblemSolving #CodingChallenge #LearningInPublic #10DaysChallenge
