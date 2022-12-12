/*Derick Waugh
 * Mod 11
 * Dec 2022
 */

import java.util.*;
public class dwaughMod11 
public static int[] locateLargest(double[][] a);
/* public static int [] locateLargest (double [][] arrayParam) */
public static int[] locateLargest(double[][] arrayParam) {
  int[] location = new int[2];
  double max = arrayParam[0][0];
  for (int i = 0; i < arrayParam.length; i++) {
    for (int j = 0; j < arrayParam[i].length; j++) {
      if (arrayParam[i][j] > max) {
        max = arrayParam[i][j];
        location[0] = i;
        location[1] = j;
      }
    }
  }
  return location;
}
/* public static int [] locateLargest (int [][] arrayParam) */
public static int[] locateLargest(int[][] arrayParam) {
  int[] location = new int[2];
  int max = arrayParam[0][0];
  for (int i = 0; i < arrayParam.length; i++) {
    for (int j = 0; j < arrayParam[i].length; j++) {
      if (arrayParam[i][j] > max) {
        max = arrayParam[i][j];
        location[0] = i;
        location[1] = j;
      }
    }
  }
  return location;
}
/* Then, write methods using the following headers that returns the location of the smallest element in the array passed to the method returning a one-dimensional array that contains two location elements. */
public static int[] locateSmallest(double[][] a)
/* public static int [] locateSmallest (double [][] arrayParam) */
public static int[] locateSmallest(double[][] arrayParam) {
  int[] location = new int[2];
  double min = arrayParam[0][0];
  for (int i = 0; i < arrayParam.length; i++) {
    for (int j = 0; j < arrayParam[i].length; j++) {
      if (arrayParam[i][j] < min) {
        min = arrayParam[i][j];
        location[0] = i;
        location[1] = j;
      }
    }
  }
  return location;
}
/* public static int [] locateSmallest (int [][] arrayParam) */
public static int[] locateSmallest(int[][] arrayParam) {
  int[] location = new int[2];
  int min = arrayParam[0][0];
  for (int i = 0; i < arrayParam.length; i++) {
    for (int j = 0; j < arrayParam[i].length; j++) {
      if (arrayParam[i][j] < min) {
        min = arrayParam[i][j];
        location[0] = i;
        location[1] = j;
      }
    }
  }
  return location;
}