package cv.opentrack.sandbox.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import cv.opentrack.sandbox.util.conf.Configuration;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

  private final static String separator = "-----------------------------------------------\n";
  public static final String CONFIG_PATH = "./conf/sandbox.properties";
  private Configuration config;
  private ServiceRegistration configReg;

  public Activator() {
    config = new Configuration(loadConfiguration());
  }
  
  @Override
  public void start(BundleContext bc) throws Exception {

    // load and register configuration
    Hashtable props = new Hashtable();
    props.put("description", "configuration");
    configReg = bc.registerService(config.getClass().getName(), config, props);
  }

  @Override
  public void stop(BundleContext context) throws Exception {
    // TODO nothing?
  }

  private Properties loadConfiguration() {
    Properties config = new Properties();

    // load user config
    try {
      InputStream is = new FileInputStream(new File(CONFIG_PATH));
      config.load(is);
      is.close();
      printProperties(config);
    } catch (IOException e) {
      System.err.println("WARNING: config file not found at " + CONFIG_PATH);
    }
    
    return config;
  }
  
  private void printProperties(Properties props) {
    System.out.print(separator + "User Configuration:" + separator);
    for (Iterator<Entry<Object,Object>> it = props.entrySet().iterator(); it.hasNext();) {
      Entry entry = it.next();
      String key = (String)entry.getKey();
      String value = (String)entry.getValue();
      System.out.println(key + " = " + value);
    }
    System.out.print(separator);
  }
}
