package org.elsiklab

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(EditScaffoldsService)
class EditScaffoldsServiceSpec extends Specification {

    def setup() {
        
    }

    def cleanup() {
    }

    void "test getting reversals"() {
        service.getReversals
    }
}
