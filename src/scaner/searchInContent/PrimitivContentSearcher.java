package scaner.searchInContent;

public class PrimitivContentSearcher implements ContentSearcher {

    @Override
    public boolean search(String toSearchIn, String searchBy) {
        return toSearchIn.toLowerCase().contains(searchBy.toLowerCase());
    }
}
