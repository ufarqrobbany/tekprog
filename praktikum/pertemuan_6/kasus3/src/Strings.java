// ******************************************************************
// String.java
//
// Demonstrates the selection sort on an array of strings.
// ******************************************************************

import java.util.Scanner;

public class Strings {
  // ----------------------------------------------------------------
  // Reads in an array of integers, sorts them,
  // then prints them in sorted order.
  // ----------------------------------------------------------------
  public static void main(String[] args) {
    String[] stringList;
    int size;

    Scanner scan = new Scanner(System.in);

    System.out.println("\nHow many strings do you want to sort? ");
    size = scan.nextInt();
    stringList = new String[size];

    System.out.println("\nEnter the strings...");
    for (int i = 0; i < size; i++)
      stringList[i] = scan.next();
    Sorting.insertionSort(stringList);

    System.out.println("\nYour numbers in sorted oreder...");
    for (int i = 0; i < size; i++)
      System.out.print(stringList[i] + " ");
    System.out.println();

    scan.close();
  }
}