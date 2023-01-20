import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

public class Sun extends AstroBody
{

  public Sun(double distance, double angle, double diameter, String col)
  {
    this.distance = distance;
    this.angle = angle;
    this.diameter = diameter;
    this.col = col;
  }

  public void addSun()
  {
    ss.drawSolarObject(distance, angle, diameter, col);
  }
}
