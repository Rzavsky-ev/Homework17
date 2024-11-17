import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;
import exceptions.WrongСonfirmPasswordException;

public class Main {

    public static void dataEntry(String login, String password, String confirmPassword) {
        Examination examination = new Examination();
        try {
            examination.сheckingСorrectnessOfLogin(login);
        } catch (WrongLoginException e) {
            System.out.println("Неверный логин.");
        }
        try {
            examination.checkingСorrectnessOfPassword(password, confirmPassword);
        } catch (WrongPasswordException e) {
            System.out.println("Неверный пароль.");
        } catch (WrongСonfirmPasswordException e) {
            System.out.println("Неверное подтверждение пароля.");
        }
    }

    public static void main(String[] args) {
        dataEntry("erds_tr56", "xnn_t4", "xnn_t4");
    }
}