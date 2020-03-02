/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /**  Method to test keepOnlyBlue  */
  public static void testKeepOnlyBlue()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.keepOnlyBlue();
      beach.explore();
  }
  
  /** Method to test negate */
  public static void testNegate()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.negate();
      caterpillar.explore();
    }
    
  /** Method to test grayscale */
  public static void testGrayscale()
  {
      Picture temple = new Picture("snowman.jpg");
      temple.explore();
      temple.grayscale();
      temple.explore();
    }
    
  
  /** Method to test right to left */
  public static void testMirrorVerticalRightToLeft()
  {
      Picture c = new Picture("caterpillar.jpg");
      c.explore();
      c.mirrorVerticalRightToLeft();
      c.explore();
    }
    
      /** Method to test horizontal mirroring */
  public static void testMirrorHorizontal()
  {
      Picture t= new Picture("temple.jpg");
      t.explore();
      t.mirrorHorizontal();
      t.explore();
    }
    
    /** Method to test horizontal mirroring bottom to top*/
    public static void testMirrorHorizontalBotToTop()
    {
      Picture t= new Picture("temple.jpg");
      t.explore();
      t.mirrorHorizontalBotToTop();
      t.explore();
    }
    
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
      Picture s = new Picture("snowman.jpg");
      s.explore();
      s.mirrorArms();
      s.explore();
    }
  
  public static void testMirrorGull()
  {
      Picture sea = new Picture("seagull.jpg");
      sea.explore();
      sea.mirrorGull();
      sea.explore();
    }
    
  public static void testCopy()
  {
      Picture o = new Picture("caterpillar.jpg");
      o.explore();
      Picture s = new Picture("seagull.jpg");
      s.copy(o, 100, 300, 100, 300);
      s.explore();
    }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    Picture b = new Picture("butterfly1.jpg");
    Picture s = new Picture("swan.jpg");
    Picture m = new Picture("moon-surface.jpg");
    b.explore();
    s.explore();
    m.explore();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorVerticalRightToLeft();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}