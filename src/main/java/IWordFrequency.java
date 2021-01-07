import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

public interface IWordFrequency {
    Map<Integer, Double> findWordLengthFrequencyMethod(File file) throws FileNotFoundException;
    void printWordCount(Map<Integer, Double> map, String title) throws FileNotFoundException;
}
