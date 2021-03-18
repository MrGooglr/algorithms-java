<div align="center">
    <h1>Data Structures and Algorithms using Java</h1>
</div>

## Hello and welcome
Some points that are needed to understand are: 
1. Java Version used is 14.0.1.
1. Data Structure is used which seems better as per the algorithm that we are going to implement.
1. Time Complexity analysis has been done and documented.


## Stable Vs. Unstable Sort Alogrithms

When we have duplicate values in the Data that we are sorting then the concept of Stable or Unstable comes in picture. The question that comes is ***"When we do the sorting, is the original position of the duplicate elements be preserved in sorted data?"***

Those algorithms that preserve the order after sorting are the ***Stable*** while others are ***Unstable***.

> Stable sorting algos are preferable.

==============================================

## Slight explaination over algos:

1. *Bubble Sort* : Simple swapping of elements till we bubble up the largest/smallest element from the array of elements.
1. *Selection Sort* : Iteration used to select the largest/smallest element in array and swapping happens at the last only.
1. *Insertion Sort* : The whole array is divided in sorted and unsorted part and we keep interting largest/smallest element from unsorted partion to sorted partition.
1. *Shell Sort* : Is alternate version of *insertion sort* / Goal is to reduce shifting. Named over its inventor "Donald Shell". This algo do some work till gap value > 1 and after that it is same as *Insertion sort*.
   The major part though is to choose Gap Value. and that depends on the situation.
