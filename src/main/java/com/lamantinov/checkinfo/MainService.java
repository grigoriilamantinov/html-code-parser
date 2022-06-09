package com.lamantinov.checkinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class MainService {
    final Parser parser;

    public MainService(
        @Autowired Parser parser
    ) {
        this.parser = parser;
    }

    public MainDTO getTemperature() {
        return parser.parsTemperature();
    }

    public Map<String, String> getStonks() {
        return parser.parsStonks();
    }

    public List<String> getNews() {
        return parser.parsNews().getNews();
    }
}
