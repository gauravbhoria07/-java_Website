// Searchable.java
public interface Searchable {
    void search(String keyword);
}

// Document.java
public class Document implements Searchable {
    @Override
    public void search(String keyword) {
        // implementation for searching in a document
    }
}

// WebPage.java
public class WebPage implements Searchable {
    @Override
    public void search(String keyword) {
        // implementation for searching in a web page
    }
}
