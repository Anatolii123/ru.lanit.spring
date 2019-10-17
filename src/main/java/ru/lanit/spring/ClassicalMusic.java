package ru.lanit.spring;

public class ClassicalMusic implements Music{

    private ClassicalMusic() {}

    @Override
    public String getSong() {
        return "Adirididirdjiday";
    }
}
