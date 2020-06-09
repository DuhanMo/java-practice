package com.kh.io.subStream.buffered.run;

import com.kh.io.subStream.buffered.model.dao.TestBufferedStream;

public class Run {
    public static void main(String[] args) {
        TestBufferedStream tb = new TestBufferedStream();
//        tb.fileSave();
        tb.fileRead();

    }
}
