package pages

import geb.Page
import org.openqa.selenium.By

class AMSPages {}

class HomePage extends Page {

    static at = { waitFor(30) {homeButton.isDisplayed()} }

    static content = {
        headerLink    { $(By.cssSelector("div[id='logo'] > a")) }
        homeButton    { $(By.cssSelector("li[id='menu-item-5391'] > a")) }
        newsButton    { $(By.cssSelector("li[id='menu-item-5392'] > a")) }
        meteorsButton  { $(By.cssSelector("li[id='menu-item-5406'] > a")) }
        searchInput    { $(By.cssSelector("input[id='search-input']")) }

        articles { $(By.cssSelector("article")) }

        fbButton     { $(By.cssSelector("div[id='header-top-right'] > a:nth-child(1)")) }
        twitButton   { $(By.cssSelector("div[id='header-top-right'] > a:nth-child(2)")) }
        xmlMapButton { $(By.cssSelector("div[id='header-top-right'] > a:nth-child(3)")) }
    }

}

class SearchResultsPage extends Page {

    static at = { waitFor(30) {titleBar.isDisplayed()} }

    static content = {
        titleBar   { $(By.cssSelector("h1[class='title']")) }
        report     { $(By.cssSelector("div[class='sidebar-widget']")) }
        articles   { $(By.cssSelector("div[class='col-md-4'] > article")) }
    }
}

class CalendarPage extends Page {

    static at = { waitFor(30) {author.isDisplayed()} }

    static content = {
        calenderWidget      { $(By.cssSelector("article > div > div > time")) }
        calendar            { $(By.cssSelector("article > div > div > time")) }
        author              { $(By.cssSelector("a[rel='author']")) }
    }
}

class ArticlePage extends Page {

    static at = { waitFor(30) {author.isDisplayed()} }

    static content = {
        calenderWidget      { $(By.cssSelector("article > div > div > time")) }
        calendar            { $(By.cssSelector("article > div > div > time")) }
        author              { $(By.cssSelector("a[rel='author']")) }
    }
}

class NewsPage extends Page {

    static at = { waitFor(30) {tabContainer.isDisplayed()} }

    static content = {
        tabContainer    { $(By.id("tabs-container")) }
    }
}
