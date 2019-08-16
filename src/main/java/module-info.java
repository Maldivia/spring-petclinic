module spring.petclinic {
    requires jdk.unsupported;
    requires java.instrument;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires java.persistence;
    requires java.validation;
    requires spring.beans;
    requires spring.core;
    requires spring.context;
    requires spring.web;
    requires spring.webmvc;
    requires spring.data.jpa;
    requires spring.data.commons;
    requires spring.tx;
    requires cache.api;
    requires java.xml.bind;
    requires java.sql;
    requires net.bytebuddy;

    exports org.springframework.samples.petclinic;
    exports org.springframework.samples.petclinic.system;

    opens petclinic;
    opens petclinic.db.hsqldb;
    opens petclinic.db.mysql;
    opens petclinic.messages;
    opens petclinic.templates;
    opens petclinic.templates.fragments;
    opens petclinic.templates.owners;
    opens petclinic.templates.pets;
    opens petclinic.templates.vets;
    opens petclinic.staticx.resources.fonts;
    opens petclinic.staticx.resources.images;
    opens petclinic.staticx.resources.css;

    opens org.springframework.samples.petclinic;
    opens org.springframework.samples.petclinic.model;
    opens org.springframework.samples.petclinic.owner;
    opens org.springframework.samples.petclinic.system;
    opens org.springframework.samples.petclinic.vet;
    opens org.springframework.samples.petclinic.visit;
}
