package algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindIndexOfFirstOccurrenceInStringTest {

    @Test
    public void test1() {
        FindIndexOfFirstOccurrenceInString findIndexOfFirstOccurrenceInString = new FindIndexOfFirstOccurrenceInString();
        assertEquals(0, findIndexOfFirstOccurrenceInString.strStr("sadbutsad", "sad"));
    }

}
