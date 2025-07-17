package com.trabalhoandroid.agendadecontatos.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.trabalhoandroid.agendadecontatos.AppDatabase
import com.trabalhoandroid.agendadecontatos.dao.ContatoDao
import com.trabalhoandroid.agendadecontatos.itemlista.ContatoItem
import com.trabalhoandroid.agendadecontatos.model.Contato
import com.trabalhoandroid.agendadecontatos.ui.theme.Purple40
import com.trabalhoandroid.agendadecontatos.ui.theme.Purple400
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

private lateinit var contatoDao: ContatoDao

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "MutableCollectionMutableState",
    "CoroutineCreationDuringComposition"
)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListaContatos(navController: NavController) {

    val listaContatos by remember {mutableStateOf<MutableList<Contato>>(mutableListOf())}
    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    scope.launch(Dispatchers.IO){
        contatoDao = AppDatabase.getInstance(context).contatoDao()
        val contato = contatoDao.getContatos()

        for (contatos in contato){
            listaContatos.add(contatos)
        }

    }
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Purple400),
                title = {
                    Text(
                        text = "Lista de Contatos",
                        color = Color.White
                    )
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navController.navigate("salvarContatos")
                },
                containerColor = Purple40
            ) {
                Icon(
                    imageVector = Icons.Rounded.Add,
                    contentDescription = "Adicionar",
                    tint = Color.White
                )
            }
        }
    ) {paddingValues->

        Column(
            modifier = Modifier.fillMaxSize().padding(paddingValues)
        ){
            LazyColumn{
                itemsIndexed(listaContatos){_,contato ->
                    ContatoItem(contato = contato)
                }

            }
        }
    }
}

@Preview
@Composable
private fun ListaContatosPreview(){
    ListaContatos(navController = rememberNavController())
}









