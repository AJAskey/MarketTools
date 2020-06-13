package net.ajaskey.market.tools.options;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import net.ajaskey.common.Utils;

public class OptionAllCombos {

  public static void main(String[] args) throws FileNotFoundException {
    Utils.makeDir("out");
    Utils.makeDir("out/options");

    final String ext[] = { "csv" };
    List<File> files = Utils.getDirTree("out/options", ext);
    for (final File f : files) {
      final Path p = f.toPath();
      try {
        Files.deleteIfExists(p);
      } catch (final IOException e) {
        e.printStackTrace();
      }
    }

    files.clear();
    final String extd[] = { "dat" };
    files = Utils.getDirTree("data/options", extd);

    for (final File f : files) {
      System.out.println(f.getName());
      final String name = Utils.getFileBaseName(f).replace("-options", "");
      OptionFindCombos.process(name, "CALL", "S");
      OptionFindCombos.process(name, "PUT", "S");
      try {
        Thread.sleep(1000);
      } catch (final InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }

  }

}
