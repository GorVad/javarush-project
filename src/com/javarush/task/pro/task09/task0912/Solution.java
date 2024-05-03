package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        String protocolType = new String();
        String[] possibleProtocolList = new String[]{"http", "https"};
        for (int i = 0; i < possibleProtocolList.length; i++) {
            if (url.startsWith(possibleProtocolList[i]))
                protocolType = possibleProtocolList[i];
        }
        if (protocolType.isEmpty())
            protocolType = "неизвестный";
        return protocolType;
    }

    public static String checkDomain(String url) {
        String domainType = new String();
        String[] possibleDomainList = new String[]{"com", "net", "org", "ru"};
        for (int i = 0; i < possibleDomainList.length; i++) {
            if (url.endsWith(possibleDomainList[i]))
                domainType = possibleDomainList[i];
        }
        if (domainType.isEmpty())
            domainType = "неизвестный";
        return domainType;
    }
}

