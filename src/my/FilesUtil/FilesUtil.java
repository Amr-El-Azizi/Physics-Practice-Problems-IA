/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.FilesUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.nio.charset.StandardCharsets;

public class FilesUtil {
  public static String readTextFile(String fileName) throws IOException {
    String content = new String(Files.readAllBytes(Paths.get(fileName)));
    return content;
  }
  
  public static List<String> readTextFileByLines(String fileName) throws IOException {
    List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.US_ASCII);
    return lines;
  }
  
  public static void writeToTextFile(String fileName, String content) throws IOException {
    Files.write(Paths.get(fileName), content.getBytes(), StandardOpenOption.CREATE);
  }
  
} 

