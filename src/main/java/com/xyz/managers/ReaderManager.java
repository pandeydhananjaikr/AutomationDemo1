package com.xyz.managers;

import com.xyz.fileReaders.FileReaders;

public class ReaderManager {
    private static ReaderManager readerManager = new ReaderManager();
    private static FileReaders fileReaders;

    private ReaderManager(){
    }

    public static ReaderManager getInstance(){
        return readerManager;
    }

    public FileReaders getFileReaders(){
        return (fileReaders==null) ? new FileReaders(): fileReaders;
    }
}
