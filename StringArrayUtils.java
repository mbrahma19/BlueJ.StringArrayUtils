
import java.util.Arrays; 

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean result = false;
            for(String str : array){
                if(str.equals(value)){
                    result = true;
                }
            }
        return result;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];
            int j = (array.length- 1);
            for(int i=0; i < array.length;i++){
                result[i] = array[j];
                j--;
            }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean result = false;
        String[] rev = reverse(array);
        
        String revStr = Arrays.toString(rev);
        String arrStr = Arrays.toString(array);
        
            if(arrStr.equals(revStr) == true){
                result = true;
            }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean result = true;
        String arrStr = Arrays.toString(array).toLowerCase();
        String[] req = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z"};
            for(String str : req){
                if(arrStr.contains(str) == false){
                    result = false;
                }
            }
        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
            for(String str : array){
                if(str.equals(value) == true){
                    counter++;
                }
            }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int numReduce = getNumberOfOccurrences(array,valueToRemove);
        String[] resultArray = new String[(array.length-numReduce)];
        int i = 0;
        for(String str : array){
            if(str!=valueToRemove){
                resultArray[i] = str;
                i++;
            }
        }
        
        return resultArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String prevStr = array[0];
        String concat = array[0];
        
        for(int i = 1; i < array.length; i++){
            if(prevStr.equals(array[i]) == false){
                concat = concat + " " + array[i];
            }
            prevStr = array[i];
        }
        String[] resultArr = concat.split(" ",0);
        
        return resultArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String prevStr = array[0];
        String concat = array[0];
        
        for(int i = 1; i < array.length; i++){
            if(prevStr.equals(array[i]) == false){
                concat = concat + " " + array[i];
            }
            else{
                concat = concat + array[i];
            }
            prevStr = array[i];
        }
        String[] resultArr = concat.split(" ",0);
        
        return resultArr;
    }


}
