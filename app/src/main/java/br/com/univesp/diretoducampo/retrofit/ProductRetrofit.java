package br.com.univesp.diretoducampo.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProductRetrofit {

    private final ProductService productService;
    private static final String baseUrl = "https://diretoducampo.herokuapp.com/";
<<<<<<< HEAD
=======
    //private static final String baseUrl = "https://localhost/";
>>>>>>> 32c20913177a35967715ed59445a629d0d1f81db

    public ProductRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        productService = retrofit.create(ProductService.class);
    }

    public ProductService getProductService() {
        return productService;
    }

}
