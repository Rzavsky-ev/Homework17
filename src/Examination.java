import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;
import exceptions.WrongСonfirmPasswordException;

public class Examination {

    private int maxLength = 20;
    private String allowedСharacters =
            "1234567890_qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";

    private boolean lengthCheck(String string) {
        return string.length() <= maxLength;
    }

    private boolean characterСheck(String string) {
        boolean flag = false;
        for (char checkedSymbol : string.toCharArray()) {
            flag = false;
            for (char symbol : allowedСharacters.toCharArray()) {
                if (checkedSymbol == symbol) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return flag;
            }
        }
        return flag;
    }

    public void сheckingСorrectnessOfLogin(String login) {
        if (!lengthCheck(login) || !characterСheck(login) || login.isEmpty()) {
            throw new WrongLoginException();
        }
    }

    public void checkingСorrectnessOfPassword(String password, String confirmPassword) {
        if (!lengthCheck(password) || !characterСheck(password) || password.isEmpty()) {
            throw new WrongPasswordException();
        } else {
            if (!password.equals(confirmPassword)) {
                throw new WrongСonfirmPasswordException();
            }
        }
    }
}
