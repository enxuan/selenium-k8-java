package lesson_06;

public class ArrayHelper {

    public int findMinNumber(int[] arr) {
        return -1;
    }

    public int findMaxNumber(int[] arr) {
        return -1;
    }
    
    public int[] sort(int[] arr) {
        sortasc(arr);
        return arr;
    }

    /*
    * @param sortType asc, desc
    * 
    **/
    public int[] sort(int[] arr, String sortType) {
        if (sortType.equals("asc")) {
            sortasc(arr);
        } else if (sortType.equals("desc")) {
            
        }
        return arr;
    }

    private void sortasc(int[] arr) {

    }
}
