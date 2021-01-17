package klasik.group.usercmdapi.security;

public interface PasswordEncoder {
    String hashPassword(String password);
}
