package com.example.application.views.nuevocontacto;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Nuevo Contacto")
@Route(value = "nuevoContacto2", layout = MainLayout.class)
@Uses(Icon.class)
public class NuevoContactoView extends Composite<VerticalLayout> {

    public NuevoContactoView() {
        FormLayout formLayout3Col = new FormLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        FormLayout formLayout3Col2 = new FormLayout();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        FormLayout formLayout3Col3 = new FormLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        formLayout3Col.setWidth("100%");
        formLayout3Col.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        textField.setLabel("Nombre");
        textField.setWidth("min-content");
        textField2.setLabel("Teléfono");
        textField2.setWidth("min-content");
        formLayout3Col2.setWidth("100%");
        formLayout3Col2.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        textField3.setLabel("Correo");
        textField3.setWidth("min-content");
        textField4.setLabel("Cédula");
        textField4.setWidth("min-content");
        formLayout3Col3.setWidth("100%");
        formLayout3Col3.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        buttonPrimary.setText("Guardar");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Cancelar");
        buttonSecondary.setWidth("min-content");
        getContent().add(formLayout3Col);
        formLayout3Col.add(textField);
        formLayout3Col.add(textField2);
        getContent().add(formLayout3Col2);
        formLayout3Col2.add(textField3);
        formLayout3Col2.add(textField4);
        getContent().add(formLayout3Col3);
        formLayout3Col3.add(buttonPrimary);
        formLayout3Col3.add(buttonSecondary);
    }
}
