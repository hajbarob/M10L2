package scaner.searchInContent;

public class ContentSearcherTest {

    public static void main(String[] args) {
        ContentSearcher searcher = new PrimitivContentSearcher();

        System.out.println("searcher.search(\"fo la go\", \"go\") = " + searcher.search("fo la go", "go"));
        System.out.println("searcher.search(\"fo la go\", \"to\") = " + searcher.search("fo la go", "to"));
    }
}
