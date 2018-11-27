package com.mycompany.mainapp;

import static javax.xml.XMLConstants.XML_NS_PREFIX;

import com.mycompany.greetings.EnglishGreeting;

public class HelloModules {

    public static void main( String[] args ){
        System.out.println("Hello Modules!");
        System.out.println("The XML namespace prefix is: " + XML_NS_PREFIX);

        System.out.println(EnglishGreeting.hello() + " Colin");
        System.out.println(EnglishGreeting.hi() + " Colin");
        System.out.println(EnglishGreeting.yo() + " Colin");
    }
}
