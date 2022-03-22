package lb4;

import java.io.File;

public interface ReaderIF {
    public void setFile(File file);
    public String getLine();
    public void close();
}
