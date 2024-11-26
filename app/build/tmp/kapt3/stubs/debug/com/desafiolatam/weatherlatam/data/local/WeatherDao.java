package com.desafiolatam.weatherlatam.data.local;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006H\'J\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\n\u001a\u00020\u000bH\'J\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/desafiolatam/weatherlatam/data/local/WeatherDao;", "", "clearAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherData", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/desafiolatam/weatherlatam/data/local/WeatherEntity;", "getWeatherDataById", "id", "", "insertData", "weatherEntity", "(Lcom/desafiolatam/weatherlatam/data/local/WeatherEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCityName", "app_debug"})
public abstract interface WeatherDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM weather")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.desafiolatam.weatherlatam.data.local.WeatherEntity>> getWeatherData();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM weather WHERE id =:id")
    public abstract kotlinx.coroutines.flow.Flow<com.desafiolatam.weatherlatam.data.local.WeatherEntity> getWeatherDataById(int id);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertData(@org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatam.data.local.WeatherEntity weatherEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Update(onConflict = 5)
    public abstract java.lang.Object updateCityName(@org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatam.data.local.WeatherEntity weatherEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM weather")
    public abstract java.lang.Object clearAll(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}