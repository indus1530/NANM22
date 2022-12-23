package edu.aku.abdulsajid.nanm2022.room.DietaryFood;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RoomWarnings;
import androidx.room.Update;

import java.util.List;

import edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.Food;
import edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.FoodChange;
import edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.FoodIngredientMap;
import edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.FoodTime;
import edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.Ingredient;
import edu.aku.abdulsajid.nanm2022.models.DietaryFollowup.PatientFood;

public class DietaryFoodDao {

    @Dao
    public interface BaseDao<T> {

        @Insert(onConflict = REPLACE)
        long add(T obj);

        @Insert(onConflict = REPLACE)
        void addAll(List<T> list);

        @Update
        void update(T obj);

        @Update
        void updateAll(List<T> list);

        @Delete
        void delete(T obj);

    }

    @Dao
    public interface FoodDao extends BaseDao<Food> {

        @Query("SELECT * FROM food")
        List<Food> getAll();

        @Insert(onConflict = REPLACE)
        void addAll(List<Food> data);

        @Query("SELECT * FROM food WHERE foodId= :id")
        Food getById(int id);

        @Query("DELETE FROM food")
        void deleteAll();

    }

    @Dao
    public interface IngredientDao extends BaseDao<Ingredient> {

        @Query("SELECT * FROM ingredient")
        List<Ingredient> getAll();

        @Insert(onConflict = REPLACE)
        void addAll(List<Ingredient> data);

        @Query("SELECT * FROM ingredient WHERE ingredientId= :id")
        Ingredient getById(int id);

        @Query("SELECT * FROM ingredient WHERE ingredientName= :name")
        Ingredient getByName(String name);

        @Query("DELETE FROM ingredient")
        void deleteAll();
    }

    @Dao
    public interface FoodIngredientMapDao extends BaseDao<FoodIngredientMap> {

        @Query("SELECT * FROM FoodIngredientMap")
        List<FoodIngredientMap> getAll();

        @Insert(onConflict = REPLACE)
        void addAll(List<FoodIngredientMap> data);

//        @Query("SELECT * FROM foodingrjt WHERE foodIngrJTId= :id")
//        FoodIngrJT getById(int id);

        @Query("DELETE FROM FoodIngredientMap")
        void deleteAll();

//        @Transaction
//        @Query("SELECT * FROM food")
//        List<FoodIngredientMap.FoodWithIngredients> getFoodWithIngredients();

        //        @Query("SELECT * FROM ingredient WHERE ingredientId IN " +
//                "(SELECT ingredientId from foodingredientmap WHERE foodId = :foodId)")
        @SuppressWarnings(RoomWarnings.CURSOR_MISMATCH)
        @Query("SELECT * FROM ingredient LEFT JOIN foodingredientmap " +
                "ON ingredient.ingredientId = foodingredientmap.ingredientId WHERE foodId = :foodId")
        List<Ingredient> getAllIngrByFoodId(int foodId);
    }

    @Dao
    public interface FoodTimeDao extends BaseDao<FoodTime> {

        @Query("SELECT * FROM foodtime")
        List<FoodTime> getAll();

        @Insert(onConflict = REPLACE)
        void addAll(List<FoodTime> data);

        @Query("SELECT * FROM foodtime WHERE foodTimeId= :id")
        FoodTime getById(int id);

        @Query("DELETE FROM foodtime")
        void deleteAll();
    }

    @Dao
    public interface PatientFoodDao extends BaseDao<PatientFood> {

        @Query("SELECT * FROM patientfood")
        List<PatientFood> getAll();

        @Insert(onConflict = REPLACE)
        void addAll(List<PatientFood> data);

        @Query("SELECT * FROM patientfood WHERE patientFoodId= :id")
        PatientFood getById(int id);

        @Query("DELETE FROM patientfood")
        void deleteAll();

        @Query("SELECT * FROM patientfood WHERE patientId= :id")
        List<PatientFood> getAllByPatientId(int id);

        @Query("SELECT * FROM patientfood WHERE patientId= :patientId AND foodTimeId = :foodTimeId")
        List<PatientFood> getAllByPatientAndTimeId(int patientId, int foodTimeId);

        @Query("SELECT * FROM patientfood WHERE patientId= :patientId AND foodId = :foodId AND foodTimeId = :foodTimeId")
        PatientFood getByPatientAndFoodAndTimeId(int patientId, int foodId, int foodTimeId);

//        @Transaction
//        @Query("SELECT * FROM patient WHERE patientId = :patientId")
//        Relation.Patient_PatientFood getAllFoodByPatientId(int patientId);

    }

    @Dao
    public interface FoodChangeDao extends BaseDao<FoodChange> {

        @Query("SELECT * FROM foodchange")
        List<FoodChange> getAll();

        @Insert(onConflict = REPLACE)
        void addAll(List<FoodChange> data);

        @Query("SELECT * FROM foodchange WHERE foodChangeId= :id")
        FoodChange getById(int id);

//        @Query("SELECT * FROM foodchange WHERE patientFoodId= :id")
//        List<FoodChange> getByPatientFoodId(int id);

        @Query("SELECT * FROM foodchange WHERE patientId= :patientId AND foodId = :foodId AND foodTimeId = :foodTimeId")
        List<FoodChange> getAllByPatientAndFoodAndTimeId(int patientId, int foodId, int foodTimeId);

        @Query("DELETE FROM foodchange WHERE patientId= :patientId AND foodId = :foodId AND foodTimeId = :foodTimeId")
        void deleteAllByPatientAndFoodAndTimeId(int patientId, int foodId, int foodTimeId);

        @Query("DELETE FROM foodchange")
        void deleteAll();

    }

}
