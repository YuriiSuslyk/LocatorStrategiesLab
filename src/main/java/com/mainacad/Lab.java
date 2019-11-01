package com.mainacad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Lab
{
    public static void main( String[] args )
    {
        //Создаём системную переменную которая содержит путь к драйверу
        System.setProperty("webdriver.chrome.driver","src/main/java/com/mainacad/drivers/chromedriver.exe");

        //Создаём вебдрайвер
        WebDriver driver = new ChromeDriver();

        //Открываем тестовую страницу
        driver.get("https://www.toolsqa.com/automation-practice-form/");

        //TODO: Вывести в консоль текст Инфо сообщения
        WebElement e = driver.findElement(By.cssSelector("p:nth-child(3) em "));
        System.out.println(e.getText());
        //TODO: Вывести в консоль текст заголовка формы ("Practice Automation Form")
        WebElement e1 = driver.findElement(By.cssSelector(".page-title-head h1"));
        System.out.println(e1.getText());
        //TODO: Кликнуть линк Partial Link Test

        //TODO: Заполнить поле First name:

        //TODO: Заполнить поле Last name:

        //TODO: Выбрать пол

        //TODO: Выбрать количество лет опыта

        //TODO: Заполнить поле дата

        //TODO: Выбрать несколько Automation Tool

        //TODO: Выбрать континент из выпадающего списка

        //TODO: Выбрать несколько вариантов из списка Selenium Commands

        //TODO: Кликнуть на кнопку Button

        //TODO: Вывести в консоль текст лейбла Text1

        //TODO: Вывести в консоль текст лейбла Text2

        //TODO: Закрыть браузер

        driver.quit();
    }
}
