package klasik.group.usercore.models;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    READ_PRIVILAGE,RITE_PRIVILEGE;

    @Override
    public String getAuthority() {
        return name();
    }
}
