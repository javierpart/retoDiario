import java.util.ArrayList;
import java.util.List;

public class Util {

    public static List<Integer> stringToArray( String cadena){
        char[] elements = cadena.toCharArray();
        List<Integer> result = new ArrayList<Integer>();
        Integer number;

        for (char c : elements){
            number = getInteger(c);
            result.add(number);
        }
        return result;
    }

    public static Integer getInteger(char c){
        // if char is a int returns int if not returns throws error
        try{
            return Integer.parseInt(String.valueOf(c));
        }catch (Exception e){
            throw new RuntimeException("Error: " +e.getMessage());
        }
    }
}
