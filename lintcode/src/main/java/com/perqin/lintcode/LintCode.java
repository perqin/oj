package com.perqin.lintcode;

public class LintCode {
  public static void main(String[] args) {
    testKthLargestElement();
    testFindMinimumInRotatedSortedArray();
  }

  private static void testKthLargestElement() {
    com.perqin.lintcode.kthlargestelement.Solution solution = new  com.perqin.lintcode.kthlargestelement.Solution();
    solution.kthLargestElement(3, new int[]{ 9,3,2,4,8 });
  }
  
  private static void testFindMinimumInRotatedSortedArray() {
    ph("FindMinimumInRotatedSortedArray");
    com.perqin.lintcode.findminimuminrotatedsortedarray.Solution solution = new com.perqin.lintcode.findminimuminrotatedsortedarray.Solution();
    pf();
  }

  /**
   * Print header for each test
   */
  private static void ph(String title) {
    System.out.println("================================ " + title + " ================================");
  }

  /**
   * Print footer for each test
   */
  private static void pf() {
    System.out.println();
    System.out.println();
  }
}