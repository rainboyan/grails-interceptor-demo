package org.grails.demo

class LoggingInterceptor {
    LoggingInterceptor() {
        matchAll()
    }

    boolean before() { 
        println "Start ${controllerName}"
        true
    }

    boolean after() {
        println "After ${controllerName}"
        model.name = "Grails"
        true
    }

    void afterView() {
        // no-op
    }
}
