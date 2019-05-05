import java.util.ArrayList;

public class InsertionSort {
    private static void insert1( ArrayList<String> list, int alreadyInserted){
        String valueToInsert = list.get(alreadyInserted);
	           for( int index = alreadyInserted;
                    index > 0 && list.get(index).compareTo( valueToInsert) < 0;
                    list.set(index , list.get(--index)));

               if( list.get(0).compareTo(valueToInsert) > 0)
                    list.set(0 , valueToInsert);
    }

    public static void insertionSort( ArrayList<String> list) {
        for( int index = 1; index < list.size(); index++){
            insert1( list, index);
            System.out.println( "    dbg: "
				+ "after inserting element " + index
				+ " elements: " + list
				);
        }
    }
}
