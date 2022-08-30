package tests

import pages.HomePage
import pages.SearchResultsPage
import pages.ArticlePage
import org.openqa.selenium.Keys

class VerifyResults extends TestCaseBase {

    def "Verify Search for an Article"() {

        println("Start [Verify Search for an Article]")

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

        when:
        waitFor() {
            articles().getAt(0).click()
        }

        then:
        at ArticlePage

        println("Article date ["+calendar.text()+"]");
        println("Article author ["+author.text()+"]");

        assert calendar.text().contains("JUL\n25\n2022")
        assert author.text().contains("Robert Lunsford")

        println("End [Verify Search for an Article].")

    }
}
