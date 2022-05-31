import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

import java.util.ArrayList;


public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    // @Test
    // public void getLink() throws IOException{
    //     Path fileName = Path.of("/Users/pedrocastaneda/Documents/GitHub/markdown-parser/test-file.md");
    //     String markdown = Files.readString(fileName);
    //     ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
    //     ArrayList<String> expectedLinks = new ArrayList<>();

    //     expectedLinks.add("https://something.com");
    //     expectedLinks.add("some-thing.html");

    //     assertEquals(expectedLinks, actualLinks);
    // }

    // @Test
    // public void getLink2() throws IOException{
    //     Path fileName = Path.of("/Users/pedrocastaneda/Documents/GitHub/markdown-parser/test-file2.md");
    //     String markdown = Files.readString(fileName);
    //     ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
    //     ArrayList<String> expectedLinks = new ArrayList<>();
        
    //     expectedLinks.add("https://something.com");
    //     expectedLinks.add("some-page.html");


    //     assertEquals(expectedLinks, actualLinks);
    // }

    // @Test
    // public void getLink3() throws IOException{
    //     Path fileName = Path.of("/Users/pedrocastaneda/Documents/GitHub/markdown-parser/test-file3.md");
    //     String markdown = Files.readString(fileName);
    //     ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
    //     ArrayList<String> expectedLinks = new ArrayList<>();

    //     expectedLinks.add("https://something.com");
    //     expectedLinks.add("some-thing.html");

    //     actualLinks.add("https://something.com");
    //     actualLinks.add("some-thing.html");

    //     assertEquals(expectedLinks, actualLinks);
    // }

    // @Test
    // public void getLink4() throws IOException{
    //     Path fileName = Path.of("/Users/pedrocastaneda/Documents/GitHub/markdown-parser/test-file4.md");
    //     String markdown = Files.readString(fileName);
    //     ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
    //     ArrayList<String> expectedLinks = new ArrayList<>();

    //     expectedLinks.add("https://something.com");
    //     expectedLinks.add("some-thing.html");

    //     actualLinks.add("https://something.com");
    //     actualLinks.add("some-thing.html");

    //     assertEquals(expectedLinks, actualLinks);
    // }

    // @Test
    // public void getLink5() throws IOException{
    //     Path fileName = Path.of("/Users/pedrocastaneda/Documents/GitHub/markdown-parser/test-file5.md");
    //     String markdown = Files.readString(fileName);
    //     ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
    //     ArrayList<String> expectedLinks = new ArrayList<>();

    //     expectedLinks.add("https://something.com");
    //     expectedLinks.add("some-thing.html");

    //     actualLinks.add("https://something.com");
    //     actualLinks.add("some-thing.html");

    //     assertEquals(expectedLinks, actualLinks);
    // }

    // @Test
    // public void getLink6() throws IOException{
    //     Path fileName = Path.of("/Users/pedrocastaneda/Documents/GitHub/markdown-parser/test-file6.md");
    //     String markdown = Files.readString(fileName);
    //     ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
    //     ArrayList<String> expectedLinks = new ArrayList<>();


    //     expectedLinks.add("https://something.com");
    //     expectedLinks.add("some-thing.html");

    //     actualLinks.add("https://something.com");
    //     actualLinks.add("some-thing.html");
    //     assertEquals(expectedLinks, actualLinks);
    // }

    // @Test
    // public void getLink7() throws IOException{
    //     Path fileName = Path.of("/Users/pedrocastaneda/Documents/GitHub/markdown-parser/test-file7.md");
    //     String markdown = Files.readString(fileName);
    //     ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
    //     ArrayList<String> expectedLinks = new ArrayList<>();

    //     expectedLinks.add("https://something.com");
    //     expectedLinks.add("some-thing.html");

    //     actualLinks.add("https://something.com");
    //     actualLinks.add("some-thing.html");

    //     assertEquals(expectedLinks, actualLinks);
    // }

    // @Test
    // public void getLink8() throws IOException{
    //     Path fileName = Path.of("/Users/pedrocastaneda/Documents/GitHub/markdown-parser/test-file8.md");
    //     String markdown = Files.readString(fileName);
    //     ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
    //     ArrayList<String> expectedLinks = new ArrayList<>();

    //     expectedLinks.add("https://something.com");
    //     expectedLinks.add("some-thing.html");

    //     actualLinks.add("https://something.com");
    //     actualLinks.add("some-thing.html");

        
    // }

    @Test
    public void snip1() throws IOException{

        assertEquals(List.of("'google.com", "google.com", "ucsd.edu"), MarkdownParse.getLinks(Files.readString(Path.of("Snippet1.md"))));
    }

    @Test
    public void snip2() throws IOException{
        assertEquals(List.of("b.com", "a.com(())", "example.com"), MarkdownParse.getLinks(Files.readString(Path.of("Snippet2.md"))));
    }

    @Test
    public void snip3() throws IOException{

        assertEquals(List.of("\n https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/scedule \n"), MarkdownParse.getLinks(Files.readString(Path.of("Snippet3.md"))));
    }
}
