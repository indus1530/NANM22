package edu.aku.abdulsajid.nanm2022.models.DietaryFollowup;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

import edu.aku.abdulsajid.nanm2022.contracts.TableContracts;

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

    public Food Hydrate(Food food) throws JSONException {

        this.foodId = food.foodId;
        this.foodName = food.foodName;
        this.measuringUnit = food.measuringUnit;

        return this;
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.FoodTable.COLUMN_FOOD_ID, this.foodId);
        json.put(TableContracts.FoodTable.COLUMN_FOOD_NAME, this.foodName);
        json.put(TableContracts.FoodTable.COLUMN_MEASURING_UNIT, this.measuringUnit);
        return json;
    }
}
