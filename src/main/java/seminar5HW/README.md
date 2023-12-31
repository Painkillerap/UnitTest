### Урок 5. Другие виды тестирования
#### *Задание 1.
*Представьте, что вы работаете над разработкой простого приложения для записной книжки, которое позволяет пользователям добавлять, редактировать и удалять контакты.
Ваша задача - придумать как можно больше различных тестов (юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения. Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет.

1. Unit-тест "testAddContact" - проверка добавления нового контакта в записную книжку.
2. Unit-тест "testEditContact" - проверка редактирования существующего контакта в записной книжке.
3. Unit-тест "testDeleteContact" - проверка удаления контакта из записной книжки.
4. Unit-тест "testGetAllContacts" - проверка получения всех контактов из записной книжки.
5. Unit-тест "testGetContactById" - проверка получения контакта по его id из записной книжки.
6. Интеграционный тест "testAddContactToDatabase" - проверка добавления нового контакта в базу данных.
7. Интеграционный тест "testEditContactInDatabase" - проверка редактирования существующего контакта в базе данных.
8. Интеграционный тест "testDeleteContactFromDatabase" - проверка удаления контакта из базы данных.
9. Интеграционный тест "testGetAllContactsFromDatabase" - проверка получения всех контактов из базы данных.
10. Интеграционный тест "testGetContactByIdFromDatabase" - проверка получения контакта по его id из базы данных.
11. Сквозной тест "testAddEditDeleteContact" - проверка добавления, редактирования и удаления контакта в записной книжке и базе данных.
12. Сквозной тест "testGetAllContactsFromUI" - проверка отображения всех контактов в пользовательском интерфейсе.

#### *Задание 2.
Ниже список тестовых сценариев. Ваша задача - определить тип каждого теста (юнит-тест, интеграционный тест, сквозной тест)
и объяснить, почему вы так решили.
* Проверка того, что функция addContact корректно добавляет новый контакт в список контактов.
* Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов.
* Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление.

**Ответ:**

1. Проверка того, что функция addContact корректно добавляет новый контакт в список контактов.
   >Данный функционал логично организовать в рамках одного модуля, поэтому в данном случае это юнит-тест.
2. Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов.
   >Так как задействован пользовательский интерфейс и отображение в нем же результата добавления контакта
   > можно сказать что это сквозной тест.
3. Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление.
   >Интеграционный тест, так как проверяется полный цикл работы с контактом, включая добавление, редактирование и удаление.
