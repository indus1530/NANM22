package edu.aku.abdulsajid.nanm2022.models.DietaryFollowup;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;

/*@Entity(foreignKeys = {
        @ForeignKey(entity = PatientFood.class, parentColumns = "patientFoodId",
                childColumns = "patientFoodId",
                onDelete = ForeignKey.CASCADE,
                onUpdate = ForeignKey.CASCADE)},
        indices = {@Index(value = "patientFoodId")})*/
@Entity
public class FoodChange implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int foodChangeId;

    private int patientId;

    private int foodId;

    private int foodTimeId;

    private int ingredientId;

    /**
     * ingr_change_status:
     * 1 = Add Ingredient
     * -1 = Delete Ingredient
     * 2 = New Ingredient Item
     **/
    private int ingrChangeStatus;

    /**
     * Item that is not in our db
     * i.e Not a standard item
     */
    private String other;

    private String createdDate;

    public int getFoodChangeId() {
        return foodChangeId;
    }

    public void setFoodChangeId(int foodChangeId) {
        this.foodChangeId = foodChangeId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public int getFoodTimeId() {
        return foodTimeId;
    }

    public void setFoodTimeId(int foodTimeId) {
        this.foodTimeId = foodTimeId;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public int getIngrChangeStatus() {
        return ingrChangeStatus;
    }

    public void setIngrChangeStatus(int ingrChangeStatus) {
        this.ingrChangeStatus = ingrChangeStatus;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public static class DataConverter implements Serializable {

        @TypeConverter
        public String fromOptionValuesList(List<FoodChange> machines) {
            if (machines == null) {
                return (null);
            }
            Gson gson = new Gson();
            Type type = new com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken<List<FoodChange>>() {
            }.getType();
            return gson.toJson(machines, type);
        }

        @TypeConverter
        public List<FoodChange> toOptionValuesList(String json) {
            if (json == null) {
                return (null);
            }
            Gson gson = new Gson();
            Type type = new TypeToken<List<edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.PatientFood>>() {
            }.getType();
            return gson.fromJson(json, type);
        }
    }
}
