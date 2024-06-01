package NullObjectDesignPattern;

public class VechicleFactory {
    // to return vechicle Object

    static Vechicle getVechicleObject(String typeOfVechicle) {
        if ("Car".equals(typeOfVechicle)) {
            return new Car();
        }
        return new NullObject();
    }
}
