import java.io.File;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class FileFinder {
    public List<String> BFSkinda(String path) {
        if (path == null || path.isBlank()) {
            throw new IllegalArgumentException("No path found");
        }
        File dir = new File(path);
        if (!dir.exists()) {
            throw new IllegalArgumentException("No directory");
        }
        Deque<File> stack = new LinkedList<>();
        List<String> filePaths = new ArrayList<>();
        stack.push(dir);
        while (!stack.isEmpty()) {
            File currentFile = stack.pop();
            if (currentFile.isDirectory()) {
                File[] files = currentFile.listFiles();
                if (files != null) {
                    for (File file : files) {
                        stack.push(file);
                    }
                }
            } else if (currentFile.isFile()) {
                filePaths.add(currentFile.getAbsolutePath());
            }
        }
        return filePaths;
    }
}
