package ru.lanit.spring;

import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music{

    private ClassicalMusic() {}

    @Override
    public String getSong() {
        return "Adirididirdjiday";
    }
}
