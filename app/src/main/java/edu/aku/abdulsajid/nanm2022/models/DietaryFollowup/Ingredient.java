package edu.aku.abdulsajid.nanm2022.models.DietaryFollowup;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Ingredient implements Serializable {

    @PrimaryKey
    private int ingredientId;
    private String ingredientName;
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
}
