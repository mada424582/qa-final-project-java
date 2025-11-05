package com.madalina.homework;

public class TestConfigRunner {
    public static void main(String[] args) {
        BrowserConfig config1 = new BrowserConfig(BrowserType.CHROME, "15.0", true);
        BrowserConfig config2 = new BrowserConfig(BrowserType.EDGE, "14.0");
        BrowserConfig config3 = new BrowserConfig(BrowserType.FIREFOX);

        BrowserConfig config4 = BrowserConfig.createDefaultChromeConfig();

        System.out.println("Configuratii create:");
        config1.afiseazaConfig();
        config2.afiseazaConfig();
        config3.afiseazaConfig();

        config4.afiseazaConfig();
    }
}
