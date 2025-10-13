module mondiv.server {
    
    // ----- requires -----
    requires java.base;
    requires java.net.http;
    requires java.sql;
    requires jakarta.persistence;
    requires jakarta.annotation;
    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires spring.web;
    requires spring.webmvc;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires org.slf4j;
    requires io.github.cdimascio.dotenv.java;
    
    // ----- requires static -----
    requires static lombok;
    
    // ----- exports -----
    exports com.mondiv.global.config;
    exports com.mondiv.global.properties;
    exports com.mondiv.external.controller;
    
    // ----- opens (reflection) -----
    opens com.mondiv.global.config to spring.core, spring.beans, spring.context, spring.web, spring.boot, com.fasterxml.jackson.databind;
    opens com.mondiv.external.controller to spring.core, spring.beans, spring.context, spring.web, spring.boot, com.fasterxml.jackson.databind;
    opens com.mondiv.global.properties to spring.core, spring.beans, spring.context, spring.boot, com.fasterxml.jackson.databind;
}
