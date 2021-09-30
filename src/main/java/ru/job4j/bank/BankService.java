package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковского сервиса
 * @author Данил
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение задания осуществляется в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя и добавляет в систему
     * Если в системе уже есть этот пользователь, то нового добавлять не нужно
     * @param user пользователь которого добавляем в очередь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     *Удаляет пользователя из системы
     * @param passport паспорт по которому метод поймет, кого нужно удалить
     */
    public  void removeUser(String passport) {
        User user = findByPassport(passport);
        if (user != null) {
            users.remove(user);
        }
    }

    /**
     * Метод должен добавить новый счет к пользователю
     * @param passport паспорт, по которому метод найдет нужного пользователя
     * @param account счет который нужно добавить
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     * @param passport паспорт, по которому метод найдет нужного пользователя
     * @return возвращает нужного пользователя
     */
    public User findByPassport(String passport) {
        User user = null;
        for (User u : users.keySet()) {
            if (u.getPassport().equals(passport)) {
                user = u;
                break;
            }
        }
        return user;
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     * @param passport паспорт, по которому метод найдет нужного пользователя
     * @param requisite счет, который нужно найти в списке счетов пользователя
     * @return возвращает нужный счет
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account account = null;
        if (user != null) {
            for (Account a : users.get(user)) {
                if (a.getRequisite().equals(requisite)) {
                    account = a;
                    break;
                }
            }
        }
        return account;
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой счёт
     * Если операция перевод не совершится, то метод вернет false
     * @param srcPassport номер паспорта отправителя
     * @param srcRequisite счет отправителя
     * @param destPassport номер паспорта получаетя
     * @param destRequisite счет получателя
     * @param amount сумма, которую нужно перевести
     * @return возвращает булево значение об успешности выполнения операции
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && dest != null && src.getBalance() >= amount) {
            src.setBalance(src.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}