package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class GetConsecutiveDuplicatesTest {



    @SuppressWarnings("deprecation")

    //Hey, I fixed the tests. The expected and actual arguments were in the wrong spot.
    @Test
    public void testRemoveConsecutiveDuplicates1() {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
        String[] expected = {"aba", "baa", "bab", "bba", "bbb"};
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void testRemoveConsecutiveDuplicates2() {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "zzz", "bba", "bba", "bba", "bbb", "bbb"};
        String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
        String[] expected = {"aba", "baa", "bab", "bba", "zzz", "bba", "bbb"};
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testRemoveConsecutiveDuplicates3() {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "zzz", "bba", "bba", "bba", "aba", "bbb"};
        String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
        String[] expected = {"aba", "baa", "bab", "bba", "zzz", "bba", "aba", "bbb"};
        Assert.assertEquals(expected, actual);
    }

}
