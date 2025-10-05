package concepts.flexible.constructors;

public class Square extends Rectangle {
    //From now on, the rule is: Any code may precede the call to super(...) or this(...) –
    // as long as it doesn’t read from uninitialized instance fields.
    public Square(Color color, int area) {
        if (area < 0) throw new IllegalArgumentException("Invalid Area!");
        var sideLength = Math.sqrt(area);
        super();
    }
}
