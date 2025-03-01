package com.trabalhoandroid.agendadecontatos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.trabalhoandroid.agendadecontatos.ui.theme.AgendaDeContatosTheme
import com.trabalhoandroid.agendadecontatos.views.AtualizarContatos
import com.trabalhoandroid.agendadecontatos.views.ListaContatos
import com.trabalhoandroid.agendadecontatos.views.SalvarContatos

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AgendaDeContatosTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "listaContatos"
                ) {
                    composable("listaContatos") {
                        ListaContatos(navController)

                    }
                    composable("salvarContatos") {
                        SalvarContatos(navController)

                    }
                    composable("atualizarContatos") {
                        AtualizarContatos(navController)
                    }
                }
            }
        }
    }
}

