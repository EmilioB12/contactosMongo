package com.example.application.views.detalle;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Detalle")
@Route(value = "detalle", layout = MainLayout.class)
@Uses(Icon.class)
public class DetalleView extends Composite<VerticalLayout> {

    public DetalleView() {
        FormLayout formLayout2Col = new FormLayout();
        H4 h4 = new H4();
        H4 h42 = new H4();
        H4 h43 = new H4();
        H4 h44 = new H4();
        H4 h45 = new H4();
        H4 h46 = new H4();
        H4 h47 = new H4();
        H4 h48 = new H4();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        formLayout2Col.setWidth("100%");
        h4.setText("Nombre:");
        h4.setWidth("max-content");
        h42.setText("Heading");
        h42.setWidth("max-content");
        h43.setText("Teléfono:");
        h43.setWidth("max-content");
        h44.setText("Heading");
        h44.setWidth("max-content");
        h45.setText("Correo:");
        h45.setWidth("max-content");
        h46.setText("Heading");
        h46.setWidth("max-content");
        h47.setText("Cédula:");
        h47.setWidth("max-content");
        h48.setText("Heading");
        h48.setWidth("max-content");
        getContent().add(formLayout2Col);
        formLayout2Col.add(h4);
        formLayout2Col.add(h42);
        formLayout2Col.add(h43);
        formLayout2Col.add(h44);
        formLayout2Col.add(h45);
        formLayout2Col.add(h46);
        formLayout2Col.add(h47);
        formLayout2Col.add(h48);
    }
}
