/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{       
        private Square water;
        private Triangle ground;
        private Person swimmer;
        private Circle bubble;
        
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        water = new Square();
        water.changeColor("blue");
        water.moveHorizontal(-400);
        water.moveVertical(-50);
        water.changeSize(1000);
        water.makeVisible();
        
        ground = new Triangle();
        ground.changeColor("green");
        ground.changeSize(50,1000);
        ground.moveVertical(110);
        ground.moveHorizontal(250);
        ground.makeVisible();
        
        swimmer = new Person();
        swimmer.makeVisible();
        
        bubble = new Circle();
        bubble.changeColor("white");
        bubble.makeVisible();
        bubble.changeSize(10);
        bubble.moveHorizontal(60);
        bubble.moveVertical(55);
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (water != null)   // only if it's painted already...
        {
            water.changeColor("black");
            ground.changeColor("white");
            swimmer.changeColor("white");
            bubble.changeColor("white");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (water != null)   // only if it's painted already...
        {
            water.changeColor("blue");
            ground.changeColor("green");
            swimmer.changeColor("black");
            bubble.changeColor("white");
        }
    }
}
