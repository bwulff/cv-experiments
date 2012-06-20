package cv.opentrack.sandbox.util.display;

import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DisplayWindow {

  private BufferedImage image;
  private JFrame frame = new JFrame();
  private JLabel label = new JLabel();

  public DisplayWindow(String title, BufferedImage image) {
    frame.setTitle(title);
    setImage(image);
    initComponents();
  }

  private void initComponents() {
    frame.setSize((int) image.getWidth(), (int) image.getHeight());
    frame.getContentPane().add(label);
    frame.setResizable(false);
  }
  
  public void setTitle(String title) {
    frame.setTitle(title);
  }

  public String getTitle() {
    return frame.getTitle();
  }
  
  public void setImage(BufferedImage image) {
    this.image = image;
    frame.setSize((int) image.getWidth(), (int) image.getHeight());
  }
  
  public BufferedImage getImage() {
    return image;
  }

  public void show() {
    frame.setVisible(true);
  }

  public void hide() {
    frame.setVisible(false);
  }
}
