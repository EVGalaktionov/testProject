package com.javalesson.exceptions;

import java.io.Closeable;
import java.io.FileNotFoundException;


public interface SelfClosable extends Closeable {
    @Override
    void close() throws FileNotFoundException;
}
