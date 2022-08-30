package tests

import pages.HomePage
import pages.SearchResultsPage
import org.openqa.selenium.Keys

class VerifySearch extends TestCaseBase {

    def "Verify Search Results"() {

        println("Start [Verify Search Results]")

        given:
        to HomePage

        when:
        waitFor() {
            searchInput().click()
            searchInput() << "fireball"
            searchInput() << Keys.ENTER
        }

        then:
        at SearchResultsPage

        println("Number of Articles currently on the page ["+articles.size()+"]");

        assert articles.size() == 21

        println("End [Verify Search Results].")

    }
}
