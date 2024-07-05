# DIAGONAL  DIFFERENCE

You are given a square matrix of integers. Your task is to find the absolute difference between the sums of its diagonals.

Consider a square matrix, arr, of size n x n, where n is the number of rows and columns in the matrix. The primary diagonal is the set of elements where the row index is equal to the column index (i.e., arr[i][i]). The secondary diagonal is the set of elements where the row index plus the column index is equal to n-1 (i.e., arr[i][n-1-i]).

Your goal is to calcualte the absolute difference between the sums of the primary diagonal and the secondary diagonal. 

Specifically find:
    |sum(primary diagonal) - sum(secondary diagonal)|

