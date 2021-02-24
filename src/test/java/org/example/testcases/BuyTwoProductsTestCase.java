package org.example.testcases;

import org.example.framework.supports.BaseTest;
import org.example.framework.webdrivers.DriverManager;
import org.example.tasks.AddProductsTask;
import org.example.tasks.AuthenticationTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class BuyTwoProductsTestCase extends BaseTest {

    private final WebDriver driver = DriverManager.getDriver();
    private final AddProductsTask addProductsTask = new AddProductsTask(driver);
    private final AuthenticationTask authenticationTask = new AuthenticationTask(driver);

    @Test
    public void test() throws InterruptedException {
        addProductsTask.adicionaCarrinhoProdutos();
        authenticationTask.authenticationAccount("email", "password");

        Thread.sleep(5000);
    }

}
