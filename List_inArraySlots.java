/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    private int[] intElements;
    private double[] doubleElements;
    private String[] stringElements;
    private int filledElements; // the number of elements in this list
    
    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */
    private int[] typeOfElements;
    private static final int INITIAL_CAPACITY = 10;
    private final int INT = 0;
    private final int DOUBLE = 1;
    private final int STRING = 2;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        intElements = new int[INITIAL_CAPACITY];
	doubleElements = new double[INITIAL_CAPACITY];
	stringElements = new String[INITIAL_CAPACITY];
	typeOfElements = new int[INITIAL_CAPACITY];
	//filledElements is already set to 0, default value
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
	return filledElements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
        int output = "[ ";
	for(int index = 0; index < filledElements; index++) {
	    if (typeOfElements[index] == INT)
	        output += intElements[index];
	    if (typeOfElements[index] == DOUBLE)
		output += doubleElements[index];
	    if (typeOfElements[index] == STRING)
		output += stringElements[index];
	    output += ", ";
	}
        return output + "]";	
    }


    /**
      Appends @value to the end of this list.

      @return true, in keepi:w
      ng with conventions yet to be discussed
     */
     // public boolean add( int type   // same meaning as in typeOfElements
                       // , int intValue
                       // , double doubleValue
                       // , String stringValue
                       // ) {
     // }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
     // private void expand() {
        // System.out.println( "expand... (for debugging)");
           // /* S.O.P. rules for debugging:
              // Working methods should be silent. But during
              // development, the programmer must verify that
              // this method is called when that is appropriate.
              // So test using the println(), then comment it out.
              // */
     // }
}
