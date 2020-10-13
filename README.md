#### Тестовое задание для СберКорус

> Задание 1.
> 1) Написать функцию, которая принимает на вход дату рождения (в любом удобном виде) и возвращает есть ли пользователю 18 лет
> 2) Написать юнит-тесты на эту функцию
> 3) Результат выложить на GitHub
> 
> Задание 2.
> На странице любого поисковика google проверить на UI:
> 1) Поиск по: Названию, ФИО. (за валидный поиск берётся текущий вывод вашего поискового запроса).
> 2) При наведении мыши на поле ввода выводится соответствующая всплывающая подсказка(в google это слово «Поиск»).
> 3) После нажатия на лого в верхней левой части отображается пустая область результатов.


#### Запуск unit тестов
```
mvn test -Dsurefire.suiteXmlFiles=src/test/resources/suites/unit.xml
```

#### Запуск UI тестов
ChromeDriver 85 версии добавлен в /src/main/resources/drivers для Mac OS, Linux, Windows (https://chromedriver.chromium.org/downloads)
```
mvn test -Dsurefire.suiteXmlFiles=src/test/resources/suites/ui.xml
```