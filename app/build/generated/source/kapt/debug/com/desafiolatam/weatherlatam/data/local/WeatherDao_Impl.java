package com.desafiolatam.weatherlatam.data.local;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class WeatherDao_Impl implements WeatherDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WeatherEntity> __insertionAdapterOfWeatherEntity;

  private final EntityDeletionOrUpdateAdapter<WeatherEntity> __updateAdapterOfWeatherEntity;

  private final SharedSQLiteStatement __preparedStmtOfClearAll;

  public WeatherDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWeatherEntity = new EntityInsertionAdapter<WeatherEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `weather` (`id`,`currentTemp`,`maxTemp`,`minTemp`,`pressure`,`humidity`,`windSpeed`,`sunrise`,`sunset`,`cityName`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final WeatherEntity entity) {
        statement.bindLong(1, entity.getId());
        statement.bindDouble(2, entity.getCurrentTemp());
        statement.bindDouble(3, entity.getMaxTemp());
        statement.bindDouble(4, entity.getMinTemp());
        statement.bindDouble(5, entity.getPressure());
        statement.bindDouble(6, entity.getHumidity());
        statement.bindDouble(7, entity.getWindSpeed());
        statement.bindLong(8, entity.getSunrise());
        statement.bindLong(9, entity.getSunset());
        if (entity.getCityName() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getCityName());
        }
      }
    };
    this.__updateAdapterOfWeatherEntity = new EntityDeletionOrUpdateAdapter<WeatherEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR IGNORE `weather` SET `id` = ?,`currentTemp` = ?,`maxTemp` = ?,`minTemp` = ?,`pressure` = ?,`humidity` = ?,`windSpeed` = ?,`sunrise` = ?,`sunset` = ?,`cityName` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final WeatherEntity entity) {
        statement.bindLong(1, entity.getId());
        statement.bindDouble(2, entity.getCurrentTemp());
        statement.bindDouble(3, entity.getMaxTemp());
        statement.bindDouble(4, entity.getMinTemp());
        statement.bindDouble(5, entity.getPressure());
        statement.bindDouble(6, entity.getHumidity());
        statement.bindDouble(7, entity.getWindSpeed());
        statement.bindLong(8, entity.getSunrise());
        statement.bindLong(9, entity.getSunset());
        if (entity.getCityName() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getCityName());
        }
        statement.bindLong(11, entity.getId());
      }
    };
    this.__preparedStmtOfClearAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM weather";
        return _query;
      }
    };
  }

  @Override
  public Object insertData(final WeatherEntity weatherEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWeatherEntity.insert(weatherEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateCityName(final WeatherEntity weatherEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfWeatherEntity.handle(weatherEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object clearAll(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearAll.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfClearAll.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<WeatherEntity>> getWeatherData() {
    final String _sql = "SELECT * FROM weather";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"weather"}, new Callable<List<WeatherEntity>>() {
      @Override
      @Nullable
      public List<WeatherEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCurrentTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "currentTemp");
          final int _cursorIndexOfMaxTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "maxTemp");
          final int _cursorIndexOfMinTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "minTemp");
          final int _cursorIndexOfPressure = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure");
          final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
          final int _cursorIndexOfWindSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "windSpeed");
          final int _cursorIndexOfSunrise = CursorUtil.getColumnIndexOrThrow(_cursor, "sunrise");
          final int _cursorIndexOfSunset = CursorUtil.getColumnIndexOrThrow(_cursor, "sunset");
          final int _cursorIndexOfCityName = CursorUtil.getColumnIndexOrThrow(_cursor, "cityName");
          final List<WeatherEntity> _result = new ArrayList<WeatherEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final WeatherEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final double _tmpCurrentTemp;
            _tmpCurrentTemp = _cursor.getDouble(_cursorIndexOfCurrentTemp);
            final double _tmpMaxTemp;
            _tmpMaxTemp = _cursor.getDouble(_cursorIndexOfMaxTemp);
            final double _tmpMinTemp;
            _tmpMinTemp = _cursor.getDouble(_cursorIndexOfMinTemp);
            final double _tmpPressure;
            _tmpPressure = _cursor.getDouble(_cursorIndexOfPressure);
            final double _tmpHumidity;
            _tmpHumidity = _cursor.getDouble(_cursorIndexOfHumidity);
            final double _tmpWindSpeed;
            _tmpWindSpeed = _cursor.getDouble(_cursorIndexOfWindSpeed);
            final long _tmpSunrise;
            _tmpSunrise = _cursor.getLong(_cursorIndexOfSunrise);
            final long _tmpSunset;
            _tmpSunset = _cursor.getLong(_cursorIndexOfSunset);
            final String _tmpCityName;
            if (_cursor.isNull(_cursorIndexOfCityName)) {
              _tmpCityName = null;
            } else {
              _tmpCityName = _cursor.getString(_cursorIndexOfCityName);
            }
            _item = new WeatherEntity(_tmpId,_tmpCurrentTemp,_tmpMaxTemp,_tmpMinTemp,_tmpPressure,_tmpHumidity,_tmpWindSpeed,_tmpSunrise,_tmpSunset,_tmpCityName);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<WeatherEntity> getWeatherDataById(final int id) {
    final String _sql = "SELECT * FROM weather WHERE id =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"weather"}, new Callable<WeatherEntity>() {
      @Override
      @Nullable
      public WeatherEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCurrentTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "currentTemp");
          final int _cursorIndexOfMaxTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "maxTemp");
          final int _cursorIndexOfMinTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "minTemp");
          final int _cursorIndexOfPressure = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure");
          final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
          final int _cursorIndexOfWindSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "windSpeed");
          final int _cursorIndexOfSunrise = CursorUtil.getColumnIndexOrThrow(_cursor, "sunrise");
          final int _cursorIndexOfSunset = CursorUtil.getColumnIndexOrThrow(_cursor, "sunset");
          final int _cursorIndexOfCityName = CursorUtil.getColumnIndexOrThrow(_cursor, "cityName");
          final WeatherEntity _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final double _tmpCurrentTemp;
            _tmpCurrentTemp = _cursor.getDouble(_cursorIndexOfCurrentTemp);
            final double _tmpMaxTemp;
            _tmpMaxTemp = _cursor.getDouble(_cursorIndexOfMaxTemp);
            final double _tmpMinTemp;
            _tmpMinTemp = _cursor.getDouble(_cursorIndexOfMinTemp);
            final double _tmpPressure;
            _tmpPressure = _cursor.getDouble(_cursorIndexOfPressure);
            final double _tmpHumidity;
            _tmpHumidity = _cursor.getDouble(_cursorIndexOfHumidity);
            final double _tmpWindSpeed;
            _tmpWindSpeed = _cursor.getDouble(_cursorIndexOfWindSpeed);
            final long _tmpSunrise;
            _tmpSunrise = _cursor.getLong(_cursorIndexOfSunrise);
            final long _tmpSunset;
            _tmpSunset = _cursor.getLong(_cursorIndexOfSunset);
            final String _tmpCityName;
            if (_cursor.isNull(_cursorIndexOfCityName)) {
              _tmpCityName = null;
            } else {
              _tmpCityName = _cursor.getString(_cursorIndexOfCityName);
            }
            _result = new WeatherEntity(_tmpId,_tmpCurrentTemp,_tmpMaxTemp,_tmpMinTemp,_tmpPressure,_tmpHumidity,_tmpWindSpeed,_tmpSunrise,_tmpSunset,_tmpCityName);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
