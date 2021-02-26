package me.nathans212.TestServer.actions;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class copyFolder {
    public void copy(String Source, String destination){
        File srcDir = new File(Source);

        File destDir = new File(destination);

        try {
            FileUtils.copyDirectory(srcDir, destDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
