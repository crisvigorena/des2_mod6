package com.desafiolatam.weatherlatam.data.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\f\u00a2\u0006\u0002\u0010\u001aJ\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0015H\u00c6\u0003J\t\u00104\u001a\u00020\fH\u00c6\u0003J\t\u00105\u001a\u00020\fH\u00c6\u0003J\t\u00106\u001a\u00020\bH\u00c6\u0003J\t\u00107\u001a\u00020\fH\u00c6\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\bH\u00c6\u0003J\t\u0010:\u001a\u00020\nH\u00c6\u0003J\t\u0010;\u001a\u00020\fH\u00c6\u0003J\t\u0010<\u001a\u00020\u000eH\u00c6\u0003J\t\u0010=\u001a\u00020\u0010H\u00c6\u0003J\t\u0010>\u001a\u00020\u0012H\u00c6\u0003J\t\u0010?\u001a\u00020\fH\u00c6\u0003J\u009b\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\fH\u00c6\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020EH\u00d6\u0001J\t\u0010F\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0019\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0013\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u0017\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0018\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0016\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101\u00a8\u0006G"}, d2 = {"Lcom/desafiolatam/weatherlatam/data/local/WeatherWrapper;", "", "coord", "Lcom/desafiolatam/weatherlatam/data/local/Coord;", "weather", "", "Lcom/desafiolatam/weatherlatam/data/local/Weather;", "base", "", "main", "Lcom/desafiolatam/weatherlatam/data/local/Main;", "visibility", "", "wind", "Lcom/desafiolatam/weatherlatam/data/local/Wind;", "rain", "Lcom/desafiolatam/weatherlatam/data/local/Rain;", "clouds", "Lcom/desafiolatam/weatherlatam/data/local/Clouds;", "dt", "sys", "Lcom/desafiolatam/weatherlatam/data/local/Sys;", "timezone", "id", "name", "cod", "(Lcom/desafiolatam/weatherlatam/data/local/Coord;Ljava/util/List;Ljava/lang/String;Lcom/desafiolatam/weatherlatam/data/local/Main;JLcom/desafiolatam/weatherlatam/data/local/Wind;Lcom/desafiolatam/weatherlatam/data/local/Rain;Lcom/desafiolatam/weatherlatam/data/local/Clouds;JLcom/desafiolatam/weatherlatam/data/local/Sys;JJLjava/lang/String;J)V", "getBase", "()Ljava/lang/String;", "getClouds", "()Lcom/desafiolatam/weatherlatam/data/local/Clouds;", "getCod", "()J", "getCoord", "()Lcom/desafiolatam/weatherlatam/data/local/Coord;", "getDt", "getId", "getMain", "()Lcom/desafiolatam/weatherlatam/data/local/Main;", "getName", "getRain", "()Lcom/desafiolatam/weatherlatam/data/local/Rain;", "getSys", "()Lcom/desafiolatam/weatherlatam/data/local/Sys;", "getTimezone", "getVisibility", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/desafiolatam/weatherlatam/data/local/Wind;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class WeatherWrapper {
    @org.jetbrains.annotations.NotNull
    private final com.desafiolatam.weatherlatam.data.local.Coord coord = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.desafiolatam.weatherlatam.data.local.Weather> weather = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String base = null;
    @org.jetbrains.annotations.NotNull
    private final com.desafiolatam.weatherlatam.data.local.Main main = null;
    private final long visibility = 0L;
    @org.jetbrains.annotations.NotNull
    private final com.desafiolatam.weatherlatam.data.local.Wind wind = null;
    @org.jetbrains.annotations.NotNull
    private final com.desafiolatam.weatherlatam.data.local.Rain rain = null;
    @org.jetbrains.annotations.NotNull
    private final com.desafiolatam.weatherlatam.data.local.Clouds clouds = null;
    private final long dt = 0L;
    @org.jetbrains.annotations.NotNull
    private final com.desafiolatam.weatherlatam.data.local.Sys sys = null;
    private final long timezone = 0L;
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    private final long cod = 0L;
    
    @org.jetbrains.annotations.NotNull
    public final com.desafiolatam.weatherlatam.data.local.WeatherWrapper copy(@org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatam.data.local.Coord coord, @org.jetbrains.annotations.NotNull
    java.util.List<com.desafiolatam.weatherlatam.data.local.Weather> weather, @org.jetbrains.annotations.NotNull
    java.lang.String base, @org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatam.data.local.Main main, long visibility, @org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatam.data.local.Wind wind, @org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatam.data.local.Rain rain, @org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatam.data.local.Clouds clouds, long dt, @org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatam.data.local.Sys sys, long timezone, long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, long cod) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public WeatherWrapper(@org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatam.data.local.Coord coord, @org.jetbrains.annotations.NotNull
    java.util.List<com.desafiolatam.weatherlatam.data.local.Weather> weather, @org.jetbrains.annotations.NotNull
    java.lang.String base, @org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatam.data.local.Main main, long visibility, @org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatam.data.local.Wind wind, @org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatam.data.local.Rain rain, @org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatam.data.local.Clouds clouds, long dt, @org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatam.data.local.Sys sys, long timezone, long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, long cod) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.desafiolatam.weatherlatam.data.local.Coord component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.desafiolatam.weatherlatam.data.local.Coord getCoord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.desafiolatam.weatherlatam.data.local.Weather> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.desafiolatam.weatherlatam.data.local.Weather> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.desafiolatam.weatherlatam.data.local.Main component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.desafiolatam.weatherlatam.data.local.Main getMain() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getVisibility() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.desafiolatam.weatherlatam.data.local.Wind component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.desafiolatam.weatherlatam.data.local.Wind getWind() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.desafiolatam.weatherlatam.data.local.Rain component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.desafiolatam.weatherlatam.data.local.Rain getRain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.desafiolatam.weatherlatam.data.local.Clouds component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.desafiolatam.weatherlatam.data.local.Clouds getClouds() {
        return null;
    }
    
    public final long component9() {
        return 0L;
    }
    
    public final long getDt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.desafiolatam.weatherlatam.data.local.Sys component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.desafiolatam.weatherlatam.data.local.Sys getSys() {
        return null;
    }
    
    public final long component11() {
        return 0L;
    }
    
    public final long getTimezone() {
        return 0L;
    }
    
    public final long component12() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final long component14() {
        return 0L;
    }
    
    public final long getCod() {
        return 0L;
    }
}