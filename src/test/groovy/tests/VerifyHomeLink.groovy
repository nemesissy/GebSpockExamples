package tests

import pages.HomePage

class VerifyHomeLink extends TestCaseBase {

    def "Verify Home Link"() {

        println("Start [verify home link]")

        given:
        to HomePage

        when:
        waitFor() {
            homeButton().click()
        }

        then:
        at HomePage

        when:
        waitFor() {
            meteorsButton().displayed
        }

        then:
        println("End [verify home link].")

    }
}
