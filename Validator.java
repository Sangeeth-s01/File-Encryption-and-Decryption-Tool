package util;

import java.io.File;

public class Validator {

    public static void validateFile(File f) {
        if (f == null || !f.exists() || !f.isFile())
            throw new IllegalArgumentException("Invalid file path");
    }
}
