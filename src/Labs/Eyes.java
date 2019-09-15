import java.awt.Point;
import java.awt.Graphics;
import java.awt.Color;

public class Eyes
{
  /*
    Define objects that paint a pair of cartoon eyes
    at a fixed position but with moveable pupils.
    
    constructors:
    -------------
    Eyes()
    Eyes(midpoint)
    Eyes(midpoint, eyeradius, pupilradius)
    Eyes(midpoint, eyeradius, pupilradius, eyecolor, pupilcolor)
    Eyes(midpoint, eyeradius, pupilradius, eyecolor, pupilcolor,
    eyeseparation)
    
    Public Methods:
    ---------------
    track(graphics, point) -- track point by moving my pupils
    */
  
  protected int eyeRadius     = 30;
  protected int pupilRadius   = 10;
  protected Color eyeColor    = Color.white;
  protected Color pupilColor  = Color.black;
  protected int eyeSeparation = 3;
  
  protected Point leftEyeCenter, rightEyeCenter;
  protected Point leftPupilCenter, rightPupilCenter;
  
  public Eyes()
  {
    /*
      Create a pair of eyes
      with the default eyeRadius, pupilRadius,
      eyeColor, pupilColor, eyeSeparation,
      leftEyeCenter, and rightEyeCenter.
      */
    
    Point eyeMidpoint =
      new Point(2 * eyeRadius + eyeSeparation, eyeRadius);
    setupEyes(eyeMidpoint, eyeRadius, eyeSeparation);
  }
  
  public Eyes(Point eyeMidpoint)
  {
    /*
      Create a pair of eyes
      with the default eyeRadius, pupilRadius,
      eyeColor, pupilColor, and eyeSeparation.
      */
    
    setupEyes(eyeMidpoint, eyeRadius, eyeSeparation);
  }
  
  public Eyes(Point eyeMidpoint, int eyeRadius, int pupilRadius)
  {
    /*
      Create a pair of eyes
      with the default eyeColor, pupilColor,
      and eyeSeparation.
      */
    
    this.eyeRadius = eyeRadius;
    this.pupilRadius = pupilRadius;
    
    setupEyes(eyeMidpoint, eyeRadius, eyeSeparation);
  }
  
  public Eyes(Point eyeMidpoint, int eyeRadius, int pupilRadius,
	      Color eyeColor, Color pupilColor)
  {
    /*
      Create a pair of eyes with the default eyeSeparation.
      */
    
    this.eyeColor = eyeColor;
    this.pupilColor = pupilColor;
    this.eyeRadius = eyeRadius;
    this.pupilRadius = pupilRadius;
    
    setupEyes(eyeMidpoint, eyeRadius, eyeSeparation);
  }
  
  public Eyes(Point eyeMidpoint, int eyeSeparation,
	      int eyeRadius, int pupilRadius,
	      Color eyeColor, Color pupilColor)
  {
    /*
      Create a pair of eyes.
      */
    
    this.eyeColor = eyeColor;
    this.pupilColor = pupilColor;
    this.eyeRadius = eyeRadius;
    this.pupilRadius = pupilRadius;
    this.eyeSeparation = eyeSeparation;
    
    setupEyes(eyeMidpoint, eyeRadius, eyeSeparation);
  }
  
  public void track(Graphics graphicsContext, Point point)
  {
    /*
      Draw my eyes paying attention to point.
      
      This method assumes eyeColor, pupilColor,
      eyeRadius, pupilRadius, leftEyeCenter,
      RightEyeCenter, leftPupilCenter, and RightPupilCenter
      are all global.
      */
    
    //compute my new pupil centers
    leftPupilCenter =
      computeGaze(point, leftEyeCenter, eyeRadius,
		  pupilRadius);
    rightPupilCenter =
      computeGaze(point, rightEyeCenter, eyeRadius,
		  pupilRadius);
    
    //draw my sclera
    drawFilledCircle(graphicsContext, eyeColor,
		     leftEyeCenter, eyeRadius);
    drawFilledCircle(graphicsContext, eyeColor,
		     rightEyeCenter, eyeRadius);
    
    //draw my pupils
    drawFilledCircle(graphicsContext, pupilColor,
		     leftPupilCenter, pupilRadius);
    drawFilledCircle(graphicsContext, pupilColor,
		     rightPupilCenter, pupilRadius);
  }
  
  protected void drawFilledCircle(Graphics graphicsContext,
				  Color color, Point center, int radius)
  {
    /*
      Draw a filled circle centered at center with radius radius.
      */
    
    graphicsContext.setColor(color);
    graphicsContext.fillOval(center.x - radius,
			     center.y - radius, 2 * radius, 2 * radius);
  }
  
  protected Point computeGaze(Point point, Point eyeCenter,
			      int eyeRadius, int pupilRadius)
  {
    /*
      Compute one of my pupil's locations
      to track the given point.
      */
    
    //compute the distance between the point
                         //and the eye's center
    int xDistance = point.x - eyeCenter.x;
    int yDistance = point.y - eyeCenter.y;
    double distance =
      Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    
    //compute the offsets to add to the eye's center
    //to find the new pupil's center
    int xOffset =
      (int) (xDistance * (eyeRadius - pupilRadius) / distance);
    int yOffset =
      (int) (yDistance * (eyeRadius - pupilRadius) / distance);
    
    Point newPupilCenter =
      new Point(eyeCenter.x + xOffset, eyeCenter.y + yOffset);
    
    return newPupilCenter;
  }
  
  private final void setupEyes(Point eyeMidpoint, int eyeRadius,
			       int eyeSeparation)
  {
    /*
      Setup eye positions.
      */
    
    leftEyeCenter =
      new Point(eyeMidpoint.x - eyeSeparation - eyeRadius,
		eyeMidpoint.y);
    rightEyeCenter =
      new Point(eyeMidpoint.x + eyeSeparation + eyeRadius,
		eyeMidpoint.y);
  }
}

