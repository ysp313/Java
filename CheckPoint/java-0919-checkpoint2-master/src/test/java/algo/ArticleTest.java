package algo;

import junit.framework.TestCase;
import org.junit.Test;

public class ArticleTest extends TestCase {

    @Test
    public void testTrue() throws Exception {
        assertEquals(true, true);
    }

    // Tests for algo.Person class

    @Test
    public void testSomePerson() throws Exception {
        Person guy = new Person("William", "Munny");
        assertEquals("William Munny", guy.toString());
    }

    @Test
    public void testNullPerson() throws Exception {
        Person guy = new Person(null, null);
        assertEquals("John Doe", guy.toString());
    }

    @Test
    public void testEmptyPerson() throws Exception {
        Person guy = new Person("", "");
        assertEquals("John Doe", guy.toString());
    }

    @Test
    public void testHalfEmptyPerson() throws Exception {
        Person guy = new Person("William", "");
        assertEquals("William Doe", guy.toString());
    }

    @Test
    public void testEmptyHalfPerson() throws Exception {
        Person guy = new Person("", "Munny");
        assertEquals("John Munny", guy.toString());
    }

    // Tests for algo.Article class

    @Test
    public void testSomeArticle() throws Exception {
        Person guy = new Person("John Perry", "Perry Barlow");
        Article paper = new Article(guy, "A Declaration of the Independence of Cyberspace");
        paper.setContent("Governments of the Industrial World, you weary giants of flesh and steel, I come from Cyberspace, the new home of Mind. On behalf of the future, I ask you of the past to leave us alone. You are not welcome among us. You have no sovereignty where we gather.");
        assertEquals("A Declaration of the Independence of Cyberspace by John Perry Perry Barlow\nGovernments of the Industrial World, you weary giants of flesh and steel, I come from Cyberspace, the new home of Mind. On behalf of the future, I ask you of the past to leave us alone. You are not welcome among us. You have no sovereignty where we gather.", paper.toString());
    }

    @Test
    public void testChangingArticle() throws Exception {
        Person guy = new Person("John Perry", "Perry Barlow");
        Article paper = new Article(guy, "A Declaration of the Independence of Cyberspace");
        paper.setContent("Governments of the Industrial World, you weary giants of flesh and steel, I come from Cyberspace, the new home of Mind. On behalf of the future, I ask you of the past to leave us alone.");
        paper.addContent(" You are not welcome among us. You have no sovereignty where we gather.");
        assertEquals("A Declaration of the Independence of Cyberspace by John Perry Perry Barlow\nGovernments of the Industrial World, you weary giants of flesh and steel, I come from Cyberspace, the new home of Mind. On behalf of the future, I ask you of the past to leave us alone. You are not welcome among us. You have no sovereignty where we gather.", paper.toString());
    }

    @Test
    public void testArticleWithoutAuthor() throws Exception {
        Article paper = new Article(null, "A Declaration of the Independence of Cyberspace");
        assertEquals("A Declaration of the Independence of Cyberspace by John Doe\n", paper.toString());
    }

    @Test
    public void testArticleWithoutTitle() throws Exception {
        Article paper = new Article(null, "");
        assertEquals("Title undefined by John Doe\n", paper.toString());
    }

    @Test
    public void testArticleWithNullTitle() throws Exception {
        Article paper = new Article(null, null);
        assertEquals("Title undefined by John Doe\n", paper.toString());
    }


}
