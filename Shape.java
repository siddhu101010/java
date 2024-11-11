class Shape {
    // Attributes
    int length;
    int breadth;
    int side;
    // Constructor for square
    public Shape(int side) {
    this.side = side;
    System.out.println("It is a square");
    }
    // Constructor for rectangle
    public Shape(int length, int breadth) {
    this.length = length;
   
    this.breadth = breadth;
    System.out.println("It is a rectangle");
    }
    // Method to calculate area of a square
    public int calculateArea(int side) {
    return side * side;
    }
    // Overloaded method to calculate area of a rectangle
    public int calculateArea(int length, int breadth) {
    return length * breadth;
    }
    public static void main(String[] args) {
    // Creating a Shape instance for a square
    Shape square = new Shape(5);
    int squareArea = square.calculateArea(5);
    System.out.println("Area of square: " + squareArea);
    // Creating a Shape instance for a rectangle
    Shape rectangle = new Shape(4, 6);
    int rectangleArea = rectangle.calculateArea(4, 6);
    System.out.println("Area of rectangle: " + rectangleArea);
    }
   }