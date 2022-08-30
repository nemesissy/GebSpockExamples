package tests

import geb.navigator.Navigator
import geb.spock.GebSpec
import pages.HomePage
import spock.lang.Shared

class TestCaseBase extends GebSpec {

    @Shared String userName = null

    def setupSpec() {
        println("setting base url to [https://www.amsmeteors.org/")
        browser.setBaseUrl("https://www.amsmeteors.org/")

    }

    def searchForSomething(String n) {

    }

    def sleepForNSeconds(int n) {
        def originalMilliseconds = System.currentTimeMillis()
        waitFor(n + 1, 0.5) {
            (System.currentTimeMillis() - originalMilliseconds) > (n * 1000)
        }
    }

}
