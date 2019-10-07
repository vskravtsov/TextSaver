package com.kiev.prog;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@SaveTo(path = "C:\\Users\\16079\\Documents\\text.txt")
public class TextContainer {
    private String text = "abcdefghijklmnop";

    @Saver
    public void save(String path) {
        try (PrintWriter pw = new PrintWriter(new File(path))) {
            pw.println(this.text);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
