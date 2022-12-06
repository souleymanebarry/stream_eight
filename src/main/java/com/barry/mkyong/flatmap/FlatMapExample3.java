package com.barry.mkyong.flatmap;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapExample3 {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/java/com/barry/mkyong/flatmap/test.txt");

        try(Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8);){
            Stream<String> words = lines.flatMap(line -> Arrays.stream(line.split(" ")));
            long noOfWords = words.count();

            System.out.println(noOfWords);  // 16
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
