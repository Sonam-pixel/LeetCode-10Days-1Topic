# ⏳ Day 7 – Merge Sorted Array (LeetCode) | #10Days1Topic10Que

Welcome to Day 7 of my **#10Days1Topic10Que** LeetCode challenge!  
Today’s focus was on **merging two sorted arrays in-place** without using extra space — an essential array manipulation technique.

---

## 📌 Problem: [Merge Sorted Array – LeetCode](https://leetcode.com/problems/merge-sorted-array/)

### 🔹 Description:  
You are given two integer arrays `nums1` and `nums2`, sorted in **non-decreasing order**, and two integers `m` and `n` representing the number of elements in `nums1` and `nums2` respectively.  
Merge `nums2` into `nums1` as one sorted array, **in-place**.

> `nums1` has a length of `m + n`, with the last `n` elements set to 0 and should be ignored.  
> Merge the arrays without returning anything — modify `nums1` directly.

---

## 🧠 Approaches:

### ✅ Two-Pointer from End (Optimal)
- Start two pointers at the ends of the initialized portions of `nums1` and `nums2`.
- Place the larger of the two elements at the end of `nums1`.
- Move backward and repeat until all elements are merged.
- No extra space used, all operations done in-place.

---

## 💻 Code File

- `Merge Sorted Array.java` – Java implementation using two-pointer technique from the end.

---

## 🧠 Concepts Used

- Two-Pointer Technique  
- In-place Array Manipulation  
- Edge Case Handling (e.g., empty arrays)  
- Efficient Memory Use (No Extra Array)

---

## 📅 Challenge Tracker

Part of **#10Days1Topic10Que**:  
🔢 Topic – Arrays | 🔁 Day 7/10 | 🧩 Problem 7/10

---

#LeetCode #DSA #Java #ArrayMerging #TwoPointerApproach #InPlaceAlgorithms #CodingChallenge #LearningInPublic #10DaysChallenge #ProblemSolving
