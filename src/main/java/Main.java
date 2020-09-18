//Daniel Bashary
//for question 2: The only thing that I can tell is that it seems as if Shakespeare uses bigger words a lot more often.

import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        findWordLengthFrequency Word_Length = new findWordLengthFrequency();
        File A_Tale_of_Two_Cities = new File("C:\\Users\\Daniel Bashary\\IdeaProjects\\author-fingerprint-basharyd\\src\\A Tale of Two Cities.txt");
        File Great_Expectations = new File("C:\\Users\\Daniel Bashary\\IdeaProjects\\author-fingerprint-basharyd\\src\\Great Expectations.txt");
        File Hamlet = new File("C:\\Users\\Daniel Bashary\\IdeaProjects\\author-fingerprint-basharyd\\src\\Hamlet.txt");
        File Macbeth = new File("C:\\Users\\Daniel Bashary\\IdeaProjects\\author-fingerprint-basharyd\\src\\Macbeth.txt");
        Word_Length.printWordCount(Word_Length.findWordLengthFrequencyMethod(A_Tale_of_Two_Cities), "A Tale of Two Cities");
        Word_Length.printWordCount(Word_Length.findWordLengthFrequencyMethod(Great_Expectations), "Great Expectations");
        Word_Length.printWordCount(Word_Length.findWordLengthFrequencyMethod(Hamlet), "Hamlet");
        Word_Length.printWordCount(Word_Length.findWordLengthFrequencyMethod(Macbeth), "Macbeth");
    }
}