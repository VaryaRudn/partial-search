import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaseTest {
    @BeforeEach
    public void setUp() {
        // Открываем нужный сайт
        Selenide.open("https://severstal.com/rus/");
    }

    @AfterEach
    public void tearDown() {
        // Закрываем браузер после теста
        Selenide.closeWebDriver();
    }
}