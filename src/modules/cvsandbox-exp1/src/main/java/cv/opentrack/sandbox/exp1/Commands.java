package cv.opentrack.sandbox.exp1;

import cv.opentrack.sandbox.util.command.CommandService;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;

@Component(name="cv.opentrack.sandbox.exp1.commands",immediate=true)
@Service()
@Properties({
@Property(name="osgi.command.scope",value="ex1"),
@Property(name="osgi.command.function",value={"hello","bye"})
})
public class Commands implements CommandService {
  
  public void hello(String[] args) {
    System.out.println("Hello!");
  }
  
  public void bye(String[] args) {
    System.out.println("Bye!");
  }
  
}
