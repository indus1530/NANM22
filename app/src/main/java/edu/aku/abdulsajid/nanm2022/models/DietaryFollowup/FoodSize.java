package edu.aku.abdulsajid.nanm2022.models.DietaryFollowup;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;

import edu.aku.abdulsajid.nanm2022.contracts.TableContracts;

@Entity(tableName = TableContracts.FoodSizeTable.TABLE_NAME)
public class FoodSize {

    public FoodSize() {
    }

    @PrimaryKey(autoGenerate = true)
    private int Id;

    @ColumnInfo(name = TableContracts.FoodSizeTable.COLUMN_FOOD_SIZE_ID)
    private int foodSizeId;

    @ColumnInfo(name = TableContracts.FoodSizeTable.COLUMN_FOOD_SCALE_ID)
    private int foodScaleId;

    @ColumnInfo(name = TableContracts.FoodSizeTable.COLUMN_TITLE)
    private String title;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public int getFoodSizeId() {
        return foodSizeId;
    }

    public void setFoodSizeId(int foodSizeId) {
        this.foodSizeId = foodSizeId;
    }

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


    public static class DataConverter implements Serializable {

        @TypeConverter
        public String fromOptionValuesList(List<FoodSize> data) {
            if (data == null) {
                return (null);
            }
            Gson gson = new Gson();
            Type type = new TypeToken<List<FoodSize>>() {
            }.getType();
            return gson.toJson(data, type);
        }

        @TypeConverter
        public List<FoodSize> toOptionValuesList(String json) {
            if (json == null) {
                return (null);
            }
            Gson gson = new Gson();
            Type type = new TypeToken<List<FoodSize>>() {
            }.getType();
            return gson.fromJson(json, type);
        }
    }
}
