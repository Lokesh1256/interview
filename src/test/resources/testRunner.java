@CucumberOptions(  
  plugin = {"pretty","json:target/report/cucumber2.json"},  
    
  features = {"src/test/resources/features"},  
  glue = {"com/interview/stepDefinitions"}  
) 
public class testRunner extends AbstractTestNGCucumberTest {

}
