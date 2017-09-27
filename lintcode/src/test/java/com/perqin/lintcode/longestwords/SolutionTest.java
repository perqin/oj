package com.perqin.lintcode.longestwords;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        final Solution solution = new Solution();
        final List<String> out1 = new ArrayList<>();
        out1.addAll(Collections.singletonList("internationalization"));
        assertTrue(sortAndCompare(out1, solution.longestWords(new String[]{
                "dog", "google", "facebook", "internationalization", "blabla"
        })));
        final List<String> out2 = new ArrayList<>();
        out2.addAll(Arrays.asList("like", "love", "hate"));
        assertTrue(sortAndCompare(out2, solution.longestWords(new String[]{
                "like", "love", "hate", "yes"
        })));
    }

    private boolean sortAndCompare(List<String> expected, List<String> tested) {
        if (expected.size() != tested.size()) return false;
        final List<String> e = new ArrayList<>(expected);
        final List<String> t = new ArrayList<>(tested);
        e.sort(Comparator.naturalOrder());
        t.sort(Comparator.naturalOrder());
        for (int i = 0; i < expected.size(); ++i) {
            if (!expected.get(i).equals(tested.get(i))) {
                return false;
            }
        }
        return true;
    }
}
