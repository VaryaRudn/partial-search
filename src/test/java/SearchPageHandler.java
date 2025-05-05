import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;

public class SearchPageHandler extends BaseTest {

    private By searchButton = By.cssSelector("button.search__button");
    private By searchInput = By.cssSelector("input.search__input");
    private By resultItems = By.xpath("//div[contains(@class, 'search-result-item__text')]");

    public void clickSearchButton() {
        $(searchButton).click(); // Нажимаем на кнопку поиска
    }

    public void enterSearchTerm(String term) {
        $(searchInput).setValue(term); // Вводим текст в поле поиска
        System.out.println("Введенный текст: " + term); // Отладочный вывод
    }

    public void submitSearch() {
        $(searchInput).pressEnter();
    }

    public boolean areResultsContaining(String term) {
        // Ждем, пока элементы результатов появятся
        $$(resultItems).shouldHave(sizeGreaterThan(0));
        return $$(resultItems).stream().anyMatch(item -> item.getText().contains(term));
    }

}