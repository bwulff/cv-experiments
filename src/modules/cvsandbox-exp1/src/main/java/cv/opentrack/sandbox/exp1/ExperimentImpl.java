package cv.opentrack.sandbox.exp1;

import cv.opentrack.sandbox.util.conf.Configuration;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.osgi.service.component.ComponentContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(name="cv.opentrack.sandbox.exp1",immediate=true)
@Service()
public class ExperimentImpl implements Experiment {
  
  Logger log = LoggerFactory.getLogger("Experiment 1");

  @Reference
  private Configuration config;
  
  protected void activate(ComponentContext cc) throws Exception {
    log.info("activated");
  }
  
  protected void deactivate(ComponentContext cc) throws Exception {
  }
  
}