#!groovy
//package ut


import com.lesfurets.jenkins.unit.BasePipelineTest
//import com.lesfurets.jenkins.unit.MethodCall
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException

import static org.assertj.core.api.Assertions.assertThat

class TestHelloWorld extends BasePipelineTest {

  @Rule
  public ExpectedException thrown = ExpectedException.none()

  @Override
  @Before
  void setUp() throws Exception {
    scriptRoots += 'vars'
    super.setUp()
}

  @Test 
  void sanityCheck() {
//    def script = loadScript("..//sanity.groovy")
//    script.execute()
	runScript("sayHello.groovy")
	assertJobStatusSuccess()
    printCallStack()
}

@Test
  void testHello() {
    runScript("sayHello.groovy")
    assertJobStatusSuccess()
//    assertThat(helper.callStack.stream()
//        .filter { c -> c.methodName ==~ /echo/  }
//        .map(MethodCall.&callArgsToString)
//        .findAll { s -> s =~ /Hello.*/ })
//        .hasSize(1)
    printCallStack()
  }

} // class
