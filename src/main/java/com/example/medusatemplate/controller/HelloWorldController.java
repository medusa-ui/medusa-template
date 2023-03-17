package com.example.medusatemplate.controller;

import io.getmedusa.medusa.core.annotation.UIEventPage;
import io.getmedusa.medusa.core.attributes.Attribute;
import io.getmedusa.medusa.core.session.Session;

import java.util.List;

import static io.getmedusa.medusa.core.attributes.Attribute.$$;

@UIEventPage(path = "/", file = "/pages/hello-world")
public class HelloWorldController {

    public List<Attribute> setupAttributes() {
        return $$("counter", 0);
    }

    public List<Attribute> updateCounter(int amount, Session session) {
        final int counter = session.getAttribute("counter");
        return $$("counter", counter + amount);
    }

}