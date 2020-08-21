package proxy_designpattern;

public class FileDownloader implements Downloader{
    String url;
    boolean URLConnection;

    public FileDownloader(String url, boolean URLConnection) {
        this.url = url;
        this.URLConnection = URLConnection;
    }

    @Override
    public void download() {
        if(this.URLConnection)
            System.out.println("download successfull at url = " + this.url);
        else
            System.out.println("Error, connect is not successfull");
    }
}
