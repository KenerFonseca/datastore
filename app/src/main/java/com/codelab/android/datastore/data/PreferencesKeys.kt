package com.codelab.android.datastore.data

import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey

object PreferencesKeys { //Se definen las claves de preferencias
    val SHOW_COMPLETED = booleanPreferencesKey("show_completed")
    val SORT_ORDER = stringPreferencesKey("sort_order")
}
//show_complet para mostrar tareas completadas
//shoe order para ordenar tareas
