package Exe1;

/**
 * Created by Amos on 28-Aug-16.
 */
public class WordCount {
    public static void main(String[] arg){
        String phrase = "Say what again! I dare you... I double dare you motherfucker!";
        String punctuation ="!.,/-";
        for(int i = 0; i < punctuation.length(); i++){
            phrase = phrase.replace(punctuation.charAt(i),' ');
        }
        String phraseSplit[] = phrase.split(" ");
        for (String part : phraseSplit) {
            if(! part == )
            System.out.println(part);
        }
    }
}
lizzi1996@hotmail.com