package klasik.group.usercmdapi.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordEncoderImpl implements PasswordEncoder {
    @Override
    public String hashPassword(String password) {
        var encoded = new BCryptPasswordEncoder(12);
        var hashedPass = encoded.encode(password);

        return hashedPass;
    }
}
