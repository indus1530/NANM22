package edu.aku.abdulsajid.nanm2022.models.DietaryFollowup;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

import edu.aku.abdulsajid.nanm2022.contracts.TableContracts;

@Entity
public class FoodTime implements Serializable {

    @PrimaryKey
    private int foodTimeId;
    private String title;

    // For local use
    @Ignore
    private boolean isSelected; // For item selection status

    public int getFoodTimeId() {
        return foodTimeId;
    }

    public void setFoodTimeId(int foodTimeId) {
        this.foodTimeId = foodTimeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }


    public FoodTime Hydrate(FoodTime foodTime) throws JSONException {

        this.foodTimeId = foodTime.foodTimeId;
        this.title = foodTime.title;

        return this;
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.FoodTimeTable.COLUMN_FOODTIME_ID, this.foodTimeId);
        json.put(TableContracts.FoodTimeTable.COLUMN_TITLE, this.title);
        return json;
    }
}
