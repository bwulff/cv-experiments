package cv.opentrack.sandbox.util.conf;

import java.util.Properties;

public class Configuration {

  private Properties props;
  
  public Configuration(Properties props) {
    this.props = props;
  }

  public String get(String key) {
    String value = props.getProperty(key);
    if (value == null) {
      System.err.println("WARNING: Configuration key not found, returning empty String: " + key);
      return "";
    } else {
      return value;
    }
  }
}
