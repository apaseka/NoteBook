package org.itstep.controller;

public interface RegexContainer {
    // Cyrillic name
    String REGEX_NAME_UKR = "[А-Я-ЩЬЮЯҐІЇЄ]{1}([а-я-щьюяґіїє']){3,20}$";
    // Latin name
    String REGEX_NAME_LAT = "[A-Z]{1}[a-z]{2,20}$";
    String REGEX_LOGIN = "[A-Za-z0-9_-]{8,20}$";
}