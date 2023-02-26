import java.util.LinkedList;
import java.util.List;

public class WordsChecker {
    static String text;

    public WordsChecker(String text){
        this.text = text;
    }

    public boolean hasWord(String word){
        List<String> list = List.of(this.text.split("\\P{IsAlphabetic}+"));
        if (list.contains(word)){
            return true;
        } else return false;
    }
}
