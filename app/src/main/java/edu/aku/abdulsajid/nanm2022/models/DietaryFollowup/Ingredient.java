package edu.aku.abdulsajid.nanm2022.models.DietaryFollowup;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

import edu.aku.abdulsajid.nanm2022.contracts.TableContracts;

@Entity
public class Ingredient implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = TableContracts.IngredientTable.COLUMN_INGREDIENT_ID)
    private int ingredientId;
    @ColumnInfo(name = TableContracts.IngredientTable.COLUMN_INGREDIENT_NAME)
    private String ingredientName;
    @ColumnInfo(name = TableContracts.IngredientTable.COLUMN_ENERGY_COUNT)
    private double energyCount;

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public double getEnergyCount() {
        return energyCount;
    }

    public void setEnergyCount(double energyCount) {
        this.energyCount = energyCount;
    }


    public Ingredient Hydrate(Ingredient ingredient) throws JSONException {

        this.ingredientId = ingredient.ingredientId;
        this.ingredientName = ingredient.ingredientName;
        this.energyCount = ingredient.energyCount;

        return this;
    }


    public Ingredient sync(JSONObject json) throws JSONException {
        json.put(TableContracts.IngredientTable.COLUMN_INGREDIENT_ID, this.ingredientId);
        json.put(TableContracts.IngredientTable.COLUMN_INGREDIENT_NAME, this.ingredientName);
        json.put(TableContracts.IngredientTable.COLUMN_ENERGY_COUNT, this.energyCount);
        return this;
    }
}
