import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.ArrayList;


public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLink() throws IOException{
        Path fileName = Path.of("/Users/pedrocastaneda/Documents/GitHub/markdown-parser/test-file.md");
        String markdown = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
        ArrayList<String> expectedLinks = new ArrayList<>();

        expectedLinks.add("https://something.com");
        expectedLinks.add("some-thing.html");
        assertEquals(expectedLinks, actualLinks);
    }

    @Test
    public void getLink2() throws IOException{
        Path fileName = Path.of("/Users/pedrocastaneda/Documents/GitHub/markdown-parser/test-file2.md");
        String markdown = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
        ArrayList<String> expectedLinks = new ArrayList<>();
        
        expectedLinks.add("https://something.com");
        expectedLinks.add("some.html");
        assertEquals(expectedLinks, actualLinks);
    }

    @Test
    public void getLink3() throws IOException{
        Path fileName = Path.of("/Users/pedrocastaneda/Documents/GitHub/markdown-parser/test-file3.md");
        String markdown = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
        ArrayList<String> expectedLinks = new ArrayList<>();

        expectedLinks.add("https://something.com");
        expectedLinks.add("some.html");

        assertEquals(expectedLinks, actualLinks);
    }

    @Test
    public void getLink4() throws IOException{
        Path fileName = Path.of("/Users/pedrocastaneda/Documents/GitHub/markdown-parser/test-file4.md");
        String markdown = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
        ArrayList<String> expectedLinks = new ArrayList<>();


        assertEquals(expectedLinks, actualLinks);
    }

    @Test
    public void getLink5() throws IOException{
        Path fileName = Path.of("/Users/pedrocastaneda/Documents/GitHub/markdown-parser/test-file5.md");
        String markdown = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
        ArrayList<String> expectedLinks = new ArrayList<>();


        expectedLinks.add("page.com");
        assertEquals(expectedLinks, actualLinks);
    }

    @Test
    public void getLink6() throws IOException{
        Path fileName = Path.of("/Users/pedrocastaneda/Documents/GitHub/markdown-parser/test-file6.md");
        String markdown = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
        ArrayList<String> expectedLinks = new ArrayList<>();


        assertEquals(expectedLinks, actualLinks);
    }

    @Test
    public void getLink7() throws IOException{
        Path fileName = Path.of("/Users/pedrocastaneda/Documents/GitHub/markdown-parser/test-file7.md");
        String markdown = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
        ArrayList<String> expectedLinks = new ArrayList<>();

        assertEquals(expectedLinks, actualLinks);
    }

    @Test
    public void getLink8() throws IOException{
        Path fileName = Path.of("/Users/pedrocastaneda/Documents/GitHub/markdown-parser/test-file8.md");
        String markdown = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
        ArrayList<String> expectedLinks = new ArrayList<>();


        assertEquals(expectedLinks, actualLinks);
    }
}