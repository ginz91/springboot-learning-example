package demo.springboot.web;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * {@link HelloWorldController}
 * Create by ginz on 18/04/15
 */
public class HelloWorldControllerTest {

  @Test
  public void testSayHello() {
    assertEquals("Hello,World!",new HelloWorldController().sayHello());
  }
}
