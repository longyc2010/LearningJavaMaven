package com.stevens.java.buffer;

import java.nio.ByteBuffer;

public class TestDirectByteBuffer {
    public static void main(String[] args) throws Exception {
        while(true) {
            ByteBuffer buffer = ByteBuffer.allocateDirect(10 * 1024 * 1024 );
        }
    }
}
