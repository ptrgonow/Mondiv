module mondiv.mondiv.server.main {
    
    // JDK
    requires java.base;
    requires java.net.http;
    requires java.sql;
    requires java.naming;
    requires java.desktop;
    requires java.management;
    
    // Jakarta EE
    requires jakarta.persistence;
    requires jakarta.annotation;
    
    requires java.compiler;
    
    // Spring
    requires spring.core;
    requires spring.context;
    requires spring.beans;
    requires spring.web;
    requires spring.webmvc;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.boot.actuator;
    requires spring.boot.actuator.autoconfigure;
    requires spring.boot.starter.web;
    requires spring.boot.starter.jdbc;
    requires spring.boot.starter.data.jpa;
    requires spring.data.commons;
    requires spring.tx;
    requires spring.aspects;
    
    // Logging
    requires org.slf4j;
    requires io.github.cdimascio.dotenv.java;
    
    requires org.hibernate.orm.core;
    requires com.fasterxml.jackson.annotation;
    
    exports com.mondiv.global.config;
    exports com.mondiv.global.properties;
    exports com.mondiv.external.controller;
    exports com.mondiv.internal;
    
    opens com.mondiv.global.config;
    opens com.mondiv.global.properties;
    opens com.mondiv.external.controller;
    opens com.mondiv.internal;
}
