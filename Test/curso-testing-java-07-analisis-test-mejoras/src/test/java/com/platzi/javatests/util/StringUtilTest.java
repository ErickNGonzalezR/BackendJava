package  com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Description: repeat this class  helps us to test function whit junit
 * */
public class StringUtilTest {

    /**
     * Description: This function helps us for do test
     * Assert.assertEquals(); is the function of class junit, that helps us tests
     * first test: expected.
     * second test: actual.
     * For each test we must place @Test
     * */
    @Test
    public void repeat_string_once() {
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("hola", -1);
    }
}