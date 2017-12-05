package com.company.demo.web.screens;

import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;
import eu.michaelvogt.vaadin.attribute.CaptionAttribute;

import javax.inject.Inject;
import java.util.Map;

public class ExtAppMainWindow extends AppMainWindow {
    @Inject
    private Label customLabel;
    @Inject
    private TextField textField;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);


        com.vaadin.ui.Label vLabel = customLabel.unwrap(com.vaadin.ui.Label.class);
        com.vaadin.ui.TextField vTextField = textField.unwrap(com.vaadin.ui.TextField.class);

        CaptionAttribute comboLabeled = new CaptionAttribute(vLabel);
        comboLabeled.extend(vTextField);
    }
}