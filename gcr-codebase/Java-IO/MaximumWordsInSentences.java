
public class MaximumWordsInSentences {

    public static int mostWordsFound(String[] sentences) {

        int max = 0;

        for (String sentence : sentences) {

            int words = sentence.split(" ").length;

            max = Math.max(max, words);
        }

        return max;
    }

    public static void main(String[] args) {

        String[] sentences = {
                "alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"
        };

        System.out.println(mostWordsFound(sentences));
    }
}