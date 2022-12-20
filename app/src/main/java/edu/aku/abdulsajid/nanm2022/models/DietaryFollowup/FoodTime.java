package edu.aku.abdulsajid.nanm2022.models.DietaryFollowup;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

import edu.aku.abdulsajid.nanm2022.contracts.TableContracts;

@Entity(tableName = TableContracts.FoodTimeTable.TABLE_NAME)
public class FoodTime implements Serializable {

    @PrimaryKey
    @ColumnInfo(name = TableContracts.FoodTimeTable.COLUMN_FOODTIME_ID)
    private int foodTimeId;
    @ColumnInfo(name = TableContracts.FoodTimeTable.COLUMN_TITLE)
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


    public FoodTime()
    {

    }

    public FoodTime Hydrate(FoodTime foodTime) throws JSONException {

        this.foodTimeId = foodTime.foodTimeId;
        this.title = foodTime.title;

        return this;
    }


    public FoodTime sync(JSONObject json) throws JSONException {
        this.foodTimeId = json.getInt(TableContracts.FoodTimeTable.COLUMN_FOODTIME_ID);
        this.title = json.getString(TableContracts.FoodTimeTable.COLUMN_TITLE);
        return this;
    }
}
