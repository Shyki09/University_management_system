package UM;
import java.awt.Image;
import javax.swing.*;


public class Splash extends JFrame implements Runnable {
              Thread t;
              Splash (){

                            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("./icons/first.jpg"));
                            Image i2 = i1.getImage().getScaledInstance(1000, 800, Image.SCALE_DEFAULT);
                            ImageIcon i3 = new ImageIcon(i2);
                            JLabel image = new JLabel(i3);
                            add(image);

                            t = new Thread(this);
                            t.start();

                            setLocation(450, 150);
                            setSize(1000, 800);
                            setVisible(true);
              }
              public void run(){
                            try {
                                          Thread.sleep(5000);
                                          setVisible(false);

                                          //Next Frame
                                          new Login();
                            } catch (Exception e) {
                                          // TODO: handle exception
                            }

              }
              public static void main(String[] args){
                            new Splash();
              }

}
