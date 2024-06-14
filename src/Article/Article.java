package Article;

import java.util.ArrayList;

public class Article {

    private String heading;
    private String body;
    private String author;

    public Article(String heading, String body, String author){
        this.heading = heading;
        this.body = body;
        this.author = author;
    }

    public String getLongestWord(){
        String[] bodySplitter = body.split(" ");
        String longestWord = "";
        for(String word : bodySplitter){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }
            return longestWord;
    }

    public ArrayList<String> getWords(){
        String[] bodyList = body.split(" ");
        ArrayList<String> bodyListWithoutDuplicates = new ArrayList<>();

        for(String word : bodyList) {
            if(!bodyListWithoutDuplicates.contains(word.toLowerCase())){
                bodyListWithoutDuplicates.add(word);
            }
        }
        return bodyListWithoutDuplicates;
    }

    //------------------------------------------------------------------------------------------------------------------
}
