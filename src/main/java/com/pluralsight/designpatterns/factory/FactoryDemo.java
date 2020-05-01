package com.pluralsight.designpatterns.factory;

import javax.xml.parsers.DocumentBuilderFactory;

public class FactoryDemo {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite("blog");
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite("shop");
        System.out.println(site.getPages());
    }
}
