package Exe1;

/**
 * Created by Amos on 28-Aug-16.
 */
public class WordCount {
    public static void main(String[] arg){
        int count = 0;
        String originalPhrase = "Say what again! I dare you... I double dare you motherfucker!";
        String phrase = originalPhrase;

        // Remove Punctuation
        String punctuation ="!.,/-";
        for(int i = 0; i < punctuation.length(); i++){
            phrase = phrase.replace(punctuation.substring(i, i),"");
        }

        // Split phrase and count words
        String phraseSplit[] = phrase.split(" ");
        for (String part : phraseSplit) {
            if(!(part.equals(""))) {
                count ++;
            }
        }

        // Print Phrase and word count
        System.out.print(String.format("The phrase:\n \"%s\"\n It has a word count of %d ", originalPhrase, count));

    }
}
