package com.madalina.homework;

public class BrowserConfig {
    private BrowserType browserType;
    private String version;
    private boolean isHeadless;

    //Constructor
    public BrowserConfig (BrowserType browserType, String version, boolean isHeadless){
        this.browserType = browserType;
        this.version = version;
        this.isHeadless = isHeadless;
    }
    //Constructor 2
    public BrowserConfig (BrowserType browserType, String version){
        this(browserType, version, false);
    }
    //Constructor 3
    public BrowserConfig (BrowserType browserType){
        this(browserType, "latest");
    }

    public static BrowserConfig createDefaultChromeConfig(){
        return new BrowserConfig(BrowserType.CHROME, "latest", true);
    }
    public void afiseazaConfig(){
        System.out.println("Browser: " + " " + browserType + " " + "versiunea:" + version + " " +
                "headless: " + isHeadless);
    }
}
