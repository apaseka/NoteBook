package org.itstep.controller;

import org.itstep.entity.Notes;
import org.itstep.view.View;

import java.util.Scanner;

import static org.itstep.controller.RegexContainer.REGEX_LOGIN;
import static org.itstep.controller.RegexContainer.REGEX_NAME_LAT;
import static org.itstep.controller.RegexContainer.REGEX_NAME_UKR;
import static org.itstep.view.TextConstant.FIRST_NAME;
import static org.itstep.view.TextConstant.LOGIN_DATA;

public class InputNoteNoteBook {
    private View view;
    private Scanner sc;
    private String login;
    private String firstName;

    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    Exception exception = new RuntimeException();

    public void inputNote() {
        UtilityController utilityController = new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        this.firstName = utilityController.inputStringValueWithScanner(FIRST_NAME, str);
        this.login = utilityController.inputStringValueWithScanner(LOGIN_DATA, REGEX_LOGIN);
        Notes notes=new Notes(firstName,login);
        System.out.println(notes);
    }
}
