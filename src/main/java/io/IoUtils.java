package io;

import java.io.*;

public class IoUtils {

    public static void main(String[] args) throws IOException {
        File f1 = new File();
        File copy = new File();
        InputStream is = new FileInputStream(f1);
        OutputStream os = new FileOutputStream(copy, true);
        int ptr = 0;
        byte[] buffer = new byte[8192];
        while ((ptr = is.read(buffer)) != -1){
            os.write(buffer, 0, ptr);
        }
        os.close();
        is.close();
    }
}
