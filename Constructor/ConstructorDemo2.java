
  public class ConstructorDemo2 { 
	  public static void main(String[] args) { 
	  Box box = new Box(10,50,100); //System.out.println("박스의 길이 = "+box.getLength());
	  box.print();
	  } 
  }
  
  class Box{ private int width, height, length;
  
  public Box(int width, int height, int length) { this.width = width;
  this.height = height; this.length = length; }
  
  public int getWidth() { return width; }
  
  public int getHeight() { return height; }
  
  public int getLength() { return length; }
  
  public void print() { System.out.printf("너비 = %d, 길이 = %d, 높이 = %d",
  this.width, this.length, this.height); }
  
  }
 