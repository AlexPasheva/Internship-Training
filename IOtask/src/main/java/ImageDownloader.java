import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ImageDownloader {

    private void downloadImage(String url, String pathName) {
        try(InputStream inputStream = new URL(url).openStream()) {
            Files.copy(inputStream, Paths.get(pathName + ".jpeg"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
