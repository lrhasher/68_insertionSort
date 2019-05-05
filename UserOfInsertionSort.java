/**
  Exercise constructing  an OrderedList
  from unordered data.
 */
import java.util.ArrayList;  // shortcut
public class UserOfInsertionSort {

    public static void main(String[] commandLine) {
        System.out.println();

        // create the data to be sorted into OL_iAS
        ArrayList<String> sortMe =
           new ArrayList<String>();
        sortMe.add( "F");
        sortMe.add( "A");
        sortMe.add( "C");
        sortMe.add( "G");
        sortMe.add( "P");
        sortMe.add( "B");
        System.out.println(
            "unordered data: " + sortMe
          + System.lineSeparator());

        InsertionSort.insertionSort(sortMe);

        System.out.println("constructed:  " + sortMe);
    }
}
