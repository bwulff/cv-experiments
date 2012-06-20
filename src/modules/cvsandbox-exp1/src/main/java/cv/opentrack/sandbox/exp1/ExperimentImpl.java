package cv.opentrack.sandbox.exp1;

import cv.opentrack.sandbox.util.conf.Configuration;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.osgi.service.component.ComponentContext;

@Component(name="cv.opentrack.sandbox.exp1",immediate=true)
@Service()
public class ExperimentImpl implements Experiment {

  @Reference
  private Configuration config;
  
  protected void activate(ComponentContext cc) throws Exception {
  }
  
  protected void deactivate(ComponentContext cc) throws Exception {
  }
  
}
