package ru.gb.oseminar.service;

import ru.gb.oseminar.data.User;

import java.time.LocalDate;

/**
 * SOLID refactoring
 * @param <T> -тип пользователя(студент или учитель)
 */
public class CreateUser <T extends User>{
    /**
     * Создание нового пользователя
     * @param user - новый пользователь типа Student или Teacher
     * @param firstName - Имя пользователя, String
     * @param secondName - Фамилия пользователя, String
     * @param patronymic - Отчество пользователя, String
     * @param dateOfBirth - Дата рождения, LocalDate
     * @return
     */
    public T CreateNewUser (T user, String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        user.setFirstName(firstName);
        user.setSecondName(secondName);
        user.setPatronymic(patronymic);
        user.setDateOfBirth(dateOfBirth);
        return user;
    }
}
