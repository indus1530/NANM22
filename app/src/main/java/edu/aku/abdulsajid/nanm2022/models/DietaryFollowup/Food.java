package edu.aku.abdulsajid.nanm2022.models.DietaryFollowup;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Food implements Serializable {

    @PrimaryKey
    private int foodId;

    private String foodName;

    /**
     * measuring_unit:
     * 1 = Count
     * 2 = Plate/Portion
     **/
    private int measuringUnit;

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getMeasuringUnit() {
        return measuringUnit;
    }

    public void setMeasuringUnit(int measuringUnit) {
        this.measuringUnit = measuringUnit;
    }
}
