package com.eci.myproject;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.mockito.Mockito;
import com.eci.myproject.pages.LoginPage;
import static org.mockito.Mockito.*;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    /**
     * Prueba el escenario de login exitoso.
     * Verifica que los métodos de la clase LoginPage se llamen correctamente
     * con las credenciales válidas.
     */
    public void testSuccessfulLogin() {
        WebDriver driver = Mockito.mock(WebDriver.class);
        WebElement usernameInput = Mockito.mock(WebElement.class);
        WebElement passwordInput = Mockito.mock(WebElement.class);
        WebElement loginButton = Mockito.mock(WebElement.class);
        WebElement flashMessage = Mockito.mock(WebElement.class);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameInput(usernameInput); // Usa los setters
        loginPage.setPasswordInput(passwordInput);
        loginPage.setLoginButton(loginButton);
        loginPage.setFlashMessage(flashMessage);

        loginPage.enterUsername("testuser");
        loginPage.enterPassword("password123");
        loginPage.clickLoginButton();

        verify(usernameInput).sendKeys("testuser");
        verify(passwordInput).sendKeys("password123");
        verify(loginButton).click();
    }

    /**
     * Prueba el escenario de login fallido.
     * Verifica que los métodos de la clase LoginPage se llamen correctamente
     * con las credenciales inválidas.
     */
    public void testFailedLogin() {
        WebDriver driver = Mockito.mock(WebDriver.class);
        WebElement usernameInput = Mockito.mock(WebElement.class);
        WebElement passwordInput = Mockito.mock(WebElement.class);
        WebElement loginButton = Mockito.mock(WebElement.class);
        WebElement flashMessage = Mockito.mock(WebElement.class);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameInput(usernameInput);
        loginPage.setPasswordInput(passwordInput);
        loginPage.setLoginButton(loginButton);
        loginPage.setFlashMessage(flashMessage);

        loginPage.enterUsername("invaliduser");
        loginPage.enterPassword("wrongpassword");
        loginPage.clickLoginButton();

        verify(usernameInput).sendKeys("invaliduser");
        verify(passwordInput).sendKeys("wrongpassword");
        verify(loginButton).click();
    }


    /**
     * Prueba la obtención del mensaje de error (flash message).
     * Verifica que el método getFlashMessage() devuelva el mensaje esperado.
     */
    public void testFlashMessage() {
        WebDriver driver = Mockito.mock(WebDriver.class);
        WebElement usernameInput = Mockito.mock(WebElement.class);
        WebElement passwordInput = Mockito.mock(WebElement.class);
        WebElement loginButton = Mockito.mock(WebElement.class);
        WebElement flashMessage = Mockito.mock(WebElement.class);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameInput(usernameInput);
        loginPage.setPasswordInput(passwordInput);
        loginPage.setLoginButton(loginButton);
        loginPage.setFlashMessage(flashMessage);

        when(flashMessage.getText()).thenReturn("Invalid credentials"); // Simula el mensaje de error

        String message = loginPage.getFlashMessage();

        assertEquals("Invalid credentials", message);
    }

    /**
     * Prueba el escenario de login con campos vacíos.
     * Verifica que los métodos de la clase LoginPage se llamen correctamente
     * con campos vacíos.
     */
    public void testEmptyFieldsLogin() {
        WebDriver driver = Mockito.mock(WebDriver.class);
        WebElement usernameInput = Mockito.mock(WebElement.class);
        WebElement passwordInput = Mockito.mock(WebElement.class);
        WebElement loginButton = Mockito.mock(WebElement.class);
        WebElement flashMessage = Mockito.mock(WebElement.class);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameInput(usernameInput);
        loginPage.setPasswordInput(passwordInput);
        loginPage.setLoginButton(loginButton);
        loginPage.setFlashMessage(flashMessage);

        loginPage.enterUsername("");
        loginPage.enterPassword("");
        loginPage.clickLoginButton();

        verify(usernameInput).sendKeys("");
        verify(passwordInput).sendKeys("");
        verify(loginButton).click();
    }

    /**
     * Prueba el escenario de login con un nombre de usuario incorrecto.
     * Verifica que los métodos de la clase LoginPage se llamen correctamente
     * con un nombre de usuario incorrecto.
     */
    public void testIncorrectUsername() {
        WebDriver driver = Mockito.mock(WebDriver.class);
        WebElement usernameInput = Mockito.mock(WebElement.class);
        WebElement passwordInput = Mockito.mock(WebElement.class);
        WebElement loginButton = Mockito.mock(WebElement.class);
        WebElement flashMessage = Mockito.mock(WebElement.class);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameInput(usernameInput);
        loginPage.setPasswordInput(passwordInput);
        loginPage.setLoginButton(loginButton);
        loginPage.setFlashMessage(flashMessage);

        loginPage.enterUsername("wronguser");
        loginPage.enterPassword("password123");
        loginPage.clickLoginButton();

        verify(usernameInput).sendKeys("wronguser");
        verify(passwordInput).sendKeys("password123");
        verify(loginButton).click();
    }

    /**
     * Prueba el escenario de login con una contraseña incorrecta.
     * Verifica que los métodos de la clase LoginPage se llamen correctamente
     * con una contraseña incorrecta.
     */
    public void testIncorrectPassword() {
        WebDriver driver = Mockito.mock(WebDriver.class);
        WebElement usernameInput = Mockito.mock(WebElement.class);
        WebElement passwordInput = Mockito.mock(WebElement.class);
        WebElement loginButton = Mockito.mock(WebElement.class);
        WebElement flashMessage = Mockito.mock(WebElement.class);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameInput(usernameInput);
        loginPage.setPasswordInput(passwordInput);
        loginPage.setLoginButton(loginButton);
        loginPage.setFlashMessage(flashMessage);

        loginPage.enterUsername("testuser");
        loginPage.enterPassword("wrongpass");
        loginPage.clickLoginButton();

        verify(usernameInput).sendKeys("testuser");
        verify(passwordInput).sendKeys("wrongpass");
        verify(loginButton).click();
    }
}