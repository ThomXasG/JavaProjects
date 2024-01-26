package ec.edu.charge.strategy.implement;

public interface IAuthenticationStrategy {
    public Principal authenticate(String username, String password);
}
