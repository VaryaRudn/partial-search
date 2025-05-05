import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PartialSearchTest extends BaseTest {

    @Test
    public void testPartialSearch() {
        SearchPageHandler searchPageHandler = new SearchPageHandler();

        // Нажимаем на кнопку поиска, чтобы открыть поле поиска
        searchPageHandler.clickSearchButton();

        // Вводим частичное слово "Исто" в поле поиска
        searchPageHandler.enterSearchTerm("Исто");

        // Отправляем поиск
        searchPageHandler.submitSearch();

        // Проверяем, что результаты содержат введенную часть слова
        assertTrue(searchPageHandler.areResultsContaining("Исто"),
                "Результаты поиска должны содержать введенную часть слова 'Исто'.");
    }
}