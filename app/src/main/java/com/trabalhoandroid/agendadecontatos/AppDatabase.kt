package com.trabalhoandroid.agendadecontatos;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.trabalhoandroid.agendadecontatos.model.Contato;

@Database(entities = { Contato.class},version = 1)
abstract class AppDatabase extends RoomDatabase {
    


}
