package edu.aku.abdulsajid.nanm2022.models.DietaryFollowup;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverter;

import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;

@Entity
public class PatientFood implements Serializable {

    @PrimaryKey
    private int patientFoodId;
    private int serialNo;    // For help in the backend DB
    private int patientId;
    private int foodId;
    private int foodTimeId;
    private float quantity;

    /**
     * food_change_status:
     * 0 = No change
     * 1 = Something's changed
     * 2 = New Food Item
     **/
    private int foodChangeStatus;

    /**
     * This is used when the user didn't take meal on the particular time
     */
    private int notReported;

    /**
     * Item that is not in our db
     * i.e Not a standard item
     */
    private String other;
    private String createdDate;

    @Ignore
    private List<FoodChange> foodChangeList;

    // For personal use
    @Ignore
    private String foodName;

    public int getPatientFoodId() {
        return patientFoodId;
    }

    public void setPatientFoodId(int patientFoodId) {
        this.patientFoodId = patientFoodId;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
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

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public int getFoodChangeStatus() {
        return foodChangeStatus;
    }

    public void setFoodChangeStatus(int foodChangeStatus) {
        this.foodChangeStatus = foodChangeStatus;
    }

    public int getNotReported() {
        return notReported;
    }

    public void setNotReported(int notReported) {
        this.notReported = notReported;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public List<FoodChange> getFoodChangeList() {
        return foodChangeList;
    }

    public void setFoodChangeList(List<FoodChange> foodChangeList) {
        this.foodChangeList = foodChangeList;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public static class DataConverter implements Serializable {

        @TypeConverter
        public String fromOptionValuesList(List<PatientFood> machines) {
            if (machines == null) {
                return (null);
            }
            Gson gson = new Gson();
            Type type = new com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken<List<PatientFood>>() {
            }.getType();
            return gson.toJson(machines, type);
        }

        @TypeConverter
        public List<PatientFood> toOptionValuesList(String json) {
            if (json == null) {
                return (null);
            }
            Gson gson = new Gson();
            Type type = new TypeToken<List<PatientFood>>() {
            }.getType();
            return gson.fromJson(json, type);
        }
    }
}
