package de.gesellix.jmockit.demo;

import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(RobolectricTestRunner.class)
public class JMockitWithRobolectricTest {

  @Test
  public void testNoJMockitUsage() {
    Assert.fail("won't reach this code");
  }
}
