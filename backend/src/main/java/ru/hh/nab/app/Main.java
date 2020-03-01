package ru.hh.nab.app;

import ru.hh.nab.config.Config;

import ru.hh.nab.config.JerseyConfig;
import ru.hh.nab.starter.NabApplication;

public class Main {

  public static void main(String[] args) {
    if (args.length>0) {
      System.exit(0);
    }

    NabApplication.builder()
      .configureJersey(JerseyConfig.class).bindToRoot()
      .build().run(Config.class);
  }
}
