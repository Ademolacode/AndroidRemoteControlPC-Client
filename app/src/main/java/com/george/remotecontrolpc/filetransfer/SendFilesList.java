package com.george.remotecontrolpc.filetransfer;

import java.io.ObjectOutputStream;
import java.util.ArrayList;

import file.AvatarFile;

/**
 * Created by george on 23/1/18.
 */

public class SendFilesList {

    public void sendFilesList(final ArrayList<AvatarFile> myFiles, final ObjectOutputStream out) {
        new Thread() {
            public void run() {
                try {
                    out.writeObject(myFiles);
                    out.flush();
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
