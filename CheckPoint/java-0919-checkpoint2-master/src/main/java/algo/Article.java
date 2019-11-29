package algo;

public class Article {

    /**
     * @param author : article author, if *null* it's initialized as John Doe
     * @param title : article title, if empty or *null* it's initialized as "Title undefined"
     * The article is initialized with an empty content
     */
    public Article(Person author, String title) {
    }

    /**
     * @return the article content
     */
    public String getContent() {
        return null;
    }

    /**
     * @param content : replace the article content
     */
    public void setContent(String content) {
    }

    /**
     * @param newContent : the newContent is added to the article existing content
     */
    public void addContent(String newContent) {
    }

    /**
     * @return -The article's title- then -a space- then -by- then -a space- the -person firstname and lastname-
     *      * then -a new line- then - the article content
     *
     * e.g: "An article by Some Dude\nSome content"
     */
    @Override
    public String toString() {
        return null;
    }
}

