package tacos.repositories;

import org.springframework.data.repository.CrudRepository;
import tacos.beans.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
