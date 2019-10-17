package ru.lanit.spring;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "OOO MOYA OBORONAAAA";
    }
}
