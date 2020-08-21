package proxy_designpattern;

public class FileDownloaderProxy implements Downloader {
    FileDownloader fileDownloader = new FileDownloader("aaa", true);



    @Override
    public void download() {
        fileDownloader.download();
    }
}
