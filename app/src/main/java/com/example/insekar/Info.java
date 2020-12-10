package com.example.insekar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.insekar.Model.GetData;
import com.example.insekar.Rest.ApiService;
import com.example.insekar.Rest.ApiUrl;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Info extends AppCompatActivity {

    private TextView tv_data1,tv_data2,tv_data3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        tv_data1 =  (TextView) findViewById(R.id.tv_data1);
        tv_data2 =  (TextView) findViewById(R.id.tv_data2);
        tv_data3 =  (TextView) findViewById(R.id.tv_data3);

        getData();
    }

    private void getData () {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiUrl.URL_ROOT_HTTP)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService apiService = retrofit.create(ApiService.class);
        Call<GetData> call = apiService.getData();

        call.enqueue(new Callback<GetData>() {
            @Override
            public void onResponse(Call<GetData> call, Response<GetData> response) {

                if (response.isSuccessful()) {

                    tv_data1.setText(response.body().getJumlahKasus().toString());
                    tv_data2.setText(response.body().getSembuh().toString());
                    tv_data3.setText(response.body().getMeninggal().toString());

                } else {

                }
            }

            @Override
            public void onFailure(Call<GetData> call, Throwable t) {
                Toast.makeText(Info.this, "Sorry, please try again... server Down..", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
