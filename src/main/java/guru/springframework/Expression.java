package guru.springframework;

/**
 * Created by Rishabh on 04,Jan,2020
 */
public interface Expression {
    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);

    Expression times(int multiplier);
}
