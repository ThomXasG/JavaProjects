package ec.edu.charge.strategy.implement;

public class AuthenticationContext {
    private IAuthenticationStrategy authenticationStrategy;

    public void setAuthenticationStrategy(IAuthenticationStrategy strategy) {
        authenticationStrategy = strategy;
    }

    public Principal authenticate(String userName, String password) {
        if (authenticationStrategy == null) {
            throw new RuntimeException("Estrategia de autentificacion no definida");
        }

        return authenticationStrategy.authenticate(userName, password);
    }
}
