package com.barry.mkyong.streamio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamIO {

    public static void main(String[] args) {

        String path = "c:\\projects\\app.log";

        // auto close
        try (Stream<String> lines = Files.lines(Paths.get(path))) {

            String content = lines.collect(Collectors.joining(System.lineSeparator()));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
