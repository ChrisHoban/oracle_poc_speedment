module mymodule {
    requires com.fasterxml.jackson.core;
    requires com.oracle.ojdbc;
    requires com.speedment.enterprise.connectors.oracle;
    requires com.speedment.enterprise.plugins.json;
    requires com.speedment.enterprise.plugins.spring.runtime;
    requires com.speedment.runtime.application;
    requires com.speedment.runtime.join;
    requires java.annotation;
    requires spring.beans;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.context;
    requires spring.core;
    requires spring.web;
    requires spring.webmvc;
    requires springfox.assembly;
    requires springfox.spring.web;
    requires springfox.swagger2;
    requires swagger.annotations;
}