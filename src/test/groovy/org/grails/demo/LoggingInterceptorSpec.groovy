package org.grails.demo

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class LoggingInterceptorSpec extends Specification implements InterceptorUnitTest<LoggingInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test logging interceptor matching"() {
        given:
        def model
        def controller = (HelloController)mockController(HelloController)

        when:
        withInterceptors([controller: "hello"]) {
            model = controller.index()
        }

        then:
        model.name == "Grails"
    }
}
