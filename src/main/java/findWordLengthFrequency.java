import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import static jdk.nashorn.internal.objects.NativeMath.round;


public class findWordLengthFrequency implements IWordFrequency {
    public Map<Integer, Double> findWordLengthFrequencyMethod(File file) throws FileNotFoundException {
        Scanner s = new Scanner(file,"UTF-8");
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> word_count = new ArrayList<>();
        Map<Integer, Double> wordLength = new HashMap<>();
        while (s.hasNext()){
            words.add(s.next());
        }
        s.close();
        for(String i : words)
        {
            String resultString1 = i.replaceAll("\\p{Punct}", "");
            word_count.add(resultString1.length());
        }
        Collections.sort(word_count);
        for (int i = 0; i < Collections.max(word_count); i++) {
            if (!wordLength.containsKey(i)) {
                double a = Collections.frequency(word_count, i);
                double percentage = a / word_count.size();
                wordLength.put(i, percentage);
            }
        }
        return wordLength;
    }
    public void printWordCount(Map<Integer, Double> map, String title) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File(title + ".txt"));
        pw.println("FileName: " + title + " Histogram");
        pw.println("Contents:");
        pw.println("WordLength Freq");
        for (int word : map.keySet())
        {
            Double word_count = map.get(word);
            pw.println(word + " " + word_count);
        }
        pw.close();
    }
}
