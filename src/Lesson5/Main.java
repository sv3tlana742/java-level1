package Lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(
                "Иванов Петер Васильевич", "Веб-разработчик", "IPV.email.ru",
                "+79215679234", 98000, 35
        );
        employees[1] = new Employee(
                "Петров Василий Иванович", "Аналитик", "PetIv.email.ru",
                "+79834560273", 80000, 30
        );
        employees[2] = new Employee(
                "Васильев Иван Петрович", "Тестировщик ПО", "VIP.email.ru",
                "+77348356753", 50000, 28
        );
        employees[3] = new Employee(
                "Кузнецова Ирина Владимировна", "Главный бухгалтер", "ChAcc.email.ru",
                "+79327356189", 120000, 45
        );
        employees[4] = new Employee(
                "Сидорова Ольга Петровна", "Кассир", "Kass.email.ru",
                "+79230657418", 30000, 48
        );

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.info();
            }
        }
    }
}
