package Array;
// Question : Sort the Array 0 and 1

// Given an integer array A that contains only integers 0 and 1. Write a function to sort this array. Find a solution which scans the array only once. Don't use extra array. You need to change in the given array itself. So no need to return or print anything.

// Input format :

// Sample Input :

// 7

// 0 1 1 0 1 0 1

// Sample Output :

// 0 0 0 1 1 1 1

// Question: 

//  Dutch National Flag Problem Also Called Sort Color Problem : (https://leetcode.com/problems/sort-colors/)

// According to the Wiki The Dutch national flag problem (DNF) is a programming problem proposed by Edsger. The flag of the NeitherLands consists of three colors: red, white and blue. Given balls of these three colors arranged randomly in a line (the actual number of balls does not matter), the task is to arrange them such that all balls of the same color are together and their collective color groups are in the correct order.

// Given an integer array containing only 0s, 1s and 2s. Write a solution to sort this array using one scan only. You need to change in the given array itself. So no need to return or print anything.

// Input format :

// Line 1 : Integer n (Array Size)

// Line 2 : Array elements (separated by space)

// Sample Input:

// 7

// 0 1 2 0 2 0 1

// Sample Output:

// 0 0 0 1 1 2 2

// Question : Rotate an Array (https://leetcode.com/problems/rotate-array/)

// Given an array, rotate the array to the right by k steps, where k is non-negative.
// Input: nums = [1,2,3,4,5,6,7], k = 3 Output: [5,6,7,1,2,3,4] Explanation: rotate 1 steps to the right: [7,1,2,3,4,5,6] rotate 2 steps to the right: [6,7,1,2,3,4,5] rotate 3 steps to the right: [5,6,7,1,2,3,4]
public class Sort01array {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 0, 1 };
        int i = 0;
        int j = arr.length - 1;
        int holdOfi = -1;
        int holdOfj = -1;
        while (i <= j) {
            if (arr[i] == 1) {
                holdOfi = i;
            }
            if (arr[j] == 0) {
                holdOfj = j;
            }
            if (holdOfi != -1 && holdOfj != -1) {
                int temp = arr[holdOfi];
                arr[holdOfi] = arr[holdOfj];
                arr[holdOfj] = temp;
                holdOfi = -1;
                holdOfj = -1;
            }
            i++;
            j--;
        }
        for (int e : arr) {
            System.out.println(e);
        }

    }
}
