package com.perqin.lintcode.kthlargestelement;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void kthLargestElement() {
        Solution solution = new Solution();
        assertEquals(4, solution.kthLargestElement(3, new int[]{ 9,3,2,4,8 }));
        assertEquals(1, solution.kthLargestElement(10, new int[]{ 1,2,3,4,5,6,8,9,10,7 }));
        assertEquals(10904, solution.kthLargestElement(105, new int[]{
                595240, 373125, 463748, 417209, 209393, 747977, 864346, 419023, 925673, 307640,
                597868, 833339, 130763, 814627, 766415, 79576, 459038, 990103, 944521, 708820,
                473246, 499960, 742286, 758503, 270229, 991199, 770718, 529265, 498975, 721068,
                727348, 29619, 712557, 724373, 823743, 318203, 290432, 476213, 412181, 869308,
                496482, 793858, 676162, 165869, 160511, 260864, 502521, 611678, 786798, 356560,
                916620, 922168, 89350, 857183, 964051, 979979, 916565, 186532, 905289, 653307,
                351329, 195491, 866281, 183964, 650765, 675046, 661642, 578936, 78684, 50105,
                688326, 648786, 645823, 652329, 961553, 381367, 506439, 77735, 707959, 373271,
                316194, 185079, 686945, 342608, 980794, 78777, 687520, 27772, 711098, 661265,
                167824, 688245, 286419, 400823, 198119, 35400, 916784, 81169, 874377, 377128,
                922531, 866135, 319912, 867697, 10904
        }));
    }
}
