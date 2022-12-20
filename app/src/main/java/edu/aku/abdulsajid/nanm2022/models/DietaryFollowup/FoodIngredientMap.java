package edu.aku.abdulsajid.nanm2022.models.DietaryFollowup;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

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


}
