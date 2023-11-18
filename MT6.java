import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WebCrawler implements Runnable {
    private String website;

    public WebCrawler(String website) {
        this.website = website;
    }

    public void run() {
        // Code to crawl the specified website
        System.out.println("Crawling website: " + website);
    }
}

 class ConcurrentWebCrawler {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        String[] websites = {"https://example1.com", "https://example2.com", "https://example3.com"};

        for (String website : websites) {
            executorService.submit(new WebCrawler(website));
        }

        executorService.shutdown();
    }
}
