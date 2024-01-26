package ec.edu.charge.strategy.providers;

import ec.edu.charge.strategy.implement.IAuthenticationStrategy;
import ec.edu.charge.strategy.implement.Principal;
import ec.edu.charge.strategy.utils.OnMemoryDataBase;
import ec.edu.charge.strategy.utils.User;

public class OnMemoryAuthenticationProvider implements IAuthenticationStrategy {
    @Override
    public Principal authenticate(String username, String password) {
        User user = OnMemoryDataBase.findUserByName(username);

        if (user != null && user.getPassword().equals(password)) {
            return new Principal(user.getUserName(), user.getRol());
        }

        return null;
    }
}
