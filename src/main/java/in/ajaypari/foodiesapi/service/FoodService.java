package in.ajaypari.foodiesapi.service;

import in.ajaypari.foodiesapi.io.FoodRequest;
import in.ajaypari.foodiesapi.io.FoodResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FoodService {

    String uploadFile(MultipartFile file);

    FoodResponse addFood(FoodRequest request, MultipartFile file);

    List<FoodResponse> readFoods();

    FoodResponse readFood(String id);

    boolean deleteFile(String filename);

   void deleteFood(String id);

}
