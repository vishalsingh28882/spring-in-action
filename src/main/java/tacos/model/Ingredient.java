package tacos.model;

import lombok.Data;

@Data
public class Ingredient {
    private final String Id;
    private final String name;
    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
