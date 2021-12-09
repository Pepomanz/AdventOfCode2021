package test;

import com.company.Advent;
import org.junit.Assert;
import org.junit.Test;

public class AdventTest {
    private Advent advent = new Advent();

    @Test
    public void testAdvent1() {
        String input = "199\n" + "200\n" + "208\n" + "210\n" + "200\n" + "207\n" + "240\n" + "269\n" + "260\n" + "263";
        long result = advent.day1(input);
        Assert.assertEquals(7, result);
    }

    @Test
    public void testAdvent1WithExtra() {
        String input = "199\n" + "200\n" + "208\n" + "210\n" + "200\n" + "207\n" + "240\n" + "269\n" + "260\n" + "263";
        long result = advent.day1WithExtra(input);
        Assert.assertEquals(5, result);
    }
}
