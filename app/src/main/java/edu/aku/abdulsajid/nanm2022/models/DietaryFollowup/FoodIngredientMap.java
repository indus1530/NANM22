package edu.aku.abdulsajid.nanm2022.models.DietaryFollowup;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

import edu.aku.abdulsajid.nanm2022.contracts.TableContracts;

/*@Entity(primaryKeys = {"foodId", "ingredientId"},
        foreignKeys = {
                @ForeignKey(entity = Food.class, parentColumns = "foodId",
                        childColumns = "foodId",
                        onDelete = ForeignKey.CASCADE,
                        onUpdate = ForeignKey.CASCADE),
                @ForeignKey(entity = Ingredient.class, parentColumns = "ingredientId",
                        childColumns = "ingredientId",
                        onDelete = ForeignKey.CASCADE,
                        onUpdate = ForeignKey.CASCADE)},
        indices = {@Index(value = "ingredientId")})*/
@Entity
public class FoodIngredientMap implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private int foodId;

    private int ingredientId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }


    public FoodIngredientMap Hydrate(FoodIngredientMap foodIngredientMap) throws JSONException {

        this.foodId = foodIngredientMap.foodId;
        this.ingredientId = foodIngredientMap.ingredientId;

        return this;
    }


    public FoodIngredientMap sync(JSONObject json) throws JSONException {
        json.put(TableContracts.FoodIngredientMapTable.COLUMN_FOOD_ID, this.foodId);
        json.put(TableContracts.FoodIngredientMapTable.COLUMN_INGREDIENT_ID, this.ingredientId);
        return this;
    }
}
