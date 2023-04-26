package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.User;
import ru.gb.oseminar.data.UserComparator;

import java.util.List;

/**
 * Класс создан для реализации SOLID
 * Выполняет сортировку списка типа User
 */
public class SortGroup <T extends User>{
    /**
     * @param userList - список студентов, List &lt User &gt
     * @return
     */
    public List<T> SortStudentsGroup(List<T> userList){
        userList.sort(new UserComparator<T>());
        return userList;
    }
}
