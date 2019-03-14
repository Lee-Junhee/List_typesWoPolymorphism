public class Element {
    public int type;
    private final int INT = 0;
    private final int DOUBLE = 1;
    private final int STRING = 2;

    public int intElement;
    public double doubleElement;
    public String StringElement;

    public Element(int typeValue, int intValue, double doubleValue, String stringValue){
        type = typeValue;
        intElement = intValue;
        doubleElement = doubleValue;
        StringElement = stringValue;
    }

    public String toString() {
	String output = "";
	if (type == INT)
	    output += intElement;
	else if (type == DOUBLE)
	    output += doubleElement;
	else
	    output += StringElement;
	return output;
    }
}
