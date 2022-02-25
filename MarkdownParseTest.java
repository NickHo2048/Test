import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1+1);
    }

    public String readFile(String file) throws IOException {
        Path fileName = Path.of(file);
        String contents = Files.readString(fileName);

        return contents;
    }

    @Test
    public void getLinks() throws IOException{
       // Path fileName = Path.of("./test-file.md");
	   // String contents = Files.readString(fileName);
        //assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void getLinks1() throws IOException{
       // Path fileName = Path.of("./test2-file.md");
	   // String contents = Files.readString(fileName);
        //assertEquals( List.of("link.com"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void getLinks2() throws IOException{
        //Path fileName = Path.of("./test3-file.md");
	   // String contents = Files.readString(fileName);
       // assertEquals(List.of("link.com"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void getLinks3() throws IOException{
       // Path fileName = Path.of("./test4-file.md");
	    //String contents = Files.readString(fileName);
        //assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    @Test
    public void testSnippet1() throws IOException
    {
        String contents = readFile("snippet-1.md");
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> Reallinks = new ArrayList<>(List.of("url.com","'google.com'","google.com","ucsd.edu"));
        assertArrayEquals(Reallinks.toArray(),links.toArray());
    }

    @Test
    public void testSnippet2() throws IOException
    {
        String contents = readFile("snippet-2.md");
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> Reallinks = new ArrayList<>(List.of("a.com","b.com","a.com(())","example.com"));
        assertArrayEquals(Reallinks.toArray(),links.toArray());
    }

    @Test
    public void testSnippet3() throws IOException
    {
        String contents = readFile("snippet-3.md");
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> Reallinks = new ArrayList<>(List.of("https://www.twitter.com","https://ucsd-cse15l-w22.github.io/","https://cse.ucsd.edu/"));
        assertArrayEquals(Reallinks.toArray(),links.toArray());
    }
}

