#language: ru

@Android
  @testTag1

Функционал: Интерфейс

  Сценарий: Проверка взаимодействия с полями на странице авторизации
    Дано открывается приложение
    Тогда отображается элемент "Текст Расписание Занятий"
    И нажимается элемент "Кнопка Авторизации"
    И отображается элемент "Текст Введите логин"
    Тогда ввести в поле "Инпут для логина" значение "testLogin1!"
    И ввести в поле "Инпут для пароля" значение "testPassw1!"