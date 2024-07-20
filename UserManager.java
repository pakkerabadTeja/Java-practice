import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private Map<String, String> usernamePasswordMap;
    private Map<String, String> emailPasswordMap;
    private Map<String, String> phoneNumberPinMap;

    public UserManager() {
        usernamePasswordMap = new HashMap<>();
        emailPasswordMap = new HashMap<>();
        phoneNumberPinMap = new HashMap<>();
        usernamePasswordMap.put("user1", "password1");
        emailPasswordMap.put("user1@example.com", "password1");
        phoneNumberPinMap.put("1234567890", "1234");
    }
    public boolean authenticate(String username, String password) {
        return usernamePasswordMap.containsKey(username) && usernamePasswordMap.get(username).equals(password);
    }
    public boolean authenticateByEmail(String email, String password) {
        return emailPasswordMap.containsKey(email) && emailPasswordMap.get(email).equals(password);
    }
    public boolean authenticateByPhoneNumber(String phoneNumber, String pin) {
        return phoneNumberPinMap.containsKey(phoneNumber) && phoneNumberPinMap.get(phoneNumber).equals(pin);
    }

    public void addUser(String username, String password) {
        usernamePasswordMap.put(username, password);
    }

    public void addUserByEmail(String email, String password) {
        emailPasswordMap.put(email, password);
    }

    public void addUserByPhoneNumber(String phoneNumber, String pin) {
        phoneNumberPinMap.put(phoneNumber, pin);
    }

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        
        System.out.println("Authentication by username and password: " + userManager.authenticate("user1", "password1"));
        System.out.println("Authentication by email and password: " + userManager.authenticateByEmail("user1@example.com", "password1"));
        System.out.println("Authentication by phone number and PIN: " + userManager.authenticateByPhoneNumber("1234567890", "1234"));
    }
}
