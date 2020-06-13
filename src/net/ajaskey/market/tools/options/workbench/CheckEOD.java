package net.ajaskey.market.tools.options.workbench;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckEOD {

  public static void main(String[] args) throws IOException {

    final Option opt = new Option();

    System.out.printf("Enter code:%n%n");

    final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    final String code = reader.readLine();

    opt.processJson(code);

    System.out.println(opt.response.substring(0, 100));

    System.out.println(opt.optList.size());

  }

}
