package edu.aku.abdulsajid.nanm2022.models.DietaryFollowup;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

import edu.aku.abdulsajid.nanm2022.contracts.TableContracts;

@Entity(tableName = TableContracts.FoodScaleTable.TABLE_NAME)
public class FoodScale implements Serializable {

    public FoodScale() {
    }

    @PrimaryKey
    @ColumnInfo(name = TableContracts.FoodScaleTable.COLUMN_FOOD_SCALE_ID)
    private int foodScaleId;

    @ColumnInfo(name = TableContracts.FoodScaleTable.COLUMN_TITLE)
    private String title;

    public int getFoodScaleId() {
        return foodScaleId;
    }

    public void setFoodScaleId(int foodScaleId) {
        this.foodScaleId = foodScaleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
