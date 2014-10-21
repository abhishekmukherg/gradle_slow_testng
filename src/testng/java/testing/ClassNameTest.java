package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by amukherjee on 10/21/14.
 */
public class ClassNameTest
{

    @Test
    public void testThings() {
        Assert.assertEquals(new a1.b1.c1.Z1().classNum, 1);
        Assert.fail("Failing to make sure tests run");
    }
}
