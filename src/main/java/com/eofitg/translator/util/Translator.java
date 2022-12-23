package com.eofitg.translator.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Translator {
    private static URL init(String text) throws MalformedURLException {
        String apiPrefix = "http://fanyi.youdao.com/translate?&doctype=json&type=AUTO&i=";
        return new URL(apiPrefix + text);
    }
    public static String get(String text) throws IOException {
        URL url = init(text);
        InputStream is = url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        String json = br.readLine();

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(json);
        JsonNode translateResult = jsonNode.get("translateResult").get(0).get(0).get("tgt");
        return translateResult.toString();
    }

}
