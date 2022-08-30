package tests

import pages.HomePage
import pages.SearchResultsPage
import org.openqa.selenium.Keys

class VerifyURL extends TestCaseBase {

    def "Verify the home URL"() {

        println("Start [Verify URL]")

        given:
        to HomePage

        assert currentUrl == "https://www.amsmeteors.org/"

        println("End [Verify URL].")

    }
}
