package edu.aku.abdulsajid.nanm2022.models.DietaryFollowup;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;

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
}
