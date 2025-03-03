package com.trabalhoandroid.agendadecontatos.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.trabalhoandroid.agendadecontatos.componentes.OutlinedTextFieldCuston
import com.trabalhoandroid.agendadecontatos.ui.theme.Purple400
import com.trabalhoandroid.agendadecontatos.ui.theme.Purple500

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SalvarContatos(navController: NavController){
    var name by remember { mutableStateOf("") }
    var sobrenome by remember { mutableStateOf("") }
    var idade by remember { mutableStateOf("") }
    var celular by remember { mutableStateOf("") }


    Scaffold (
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Purple400
                ),
                title = {
                    Text(
                        text = "Salvar Contatos",
                        color = Color.White
                    )
                }
            )
        }
    ){paddingValues->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            OutlinedTextFieldCuston(
                value = name,
                onValueChange = {
                    name = it
                },
                label ={ Text(text = "Nome") } ,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp,80.dp,20.dp,10.dp)
            )
            OutlinedTextFieldCuston(
                value = sobrenome,
                onValueChange = {
                    sobrenome = it
                },
                label ={ Text(text = "Sobrenome") } ,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp,0.dp,20.dp,10.dp)
            )
            OutlinedTextFieldCuston(
                value = idade,
                onValueChange = {
                    idade = it
                },
                label ={ Text(text = "Idade") } ,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp,0.dp,20.dp,10.dp)
            )
            OutlinedTextFieldCuston(
                value = celular,
                onValueChange = {
                    celular = it
                },
                label ={ Text(text = "Celular") } ,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Phone
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp,0.dp,20.dp,10.dp)
            )
            Button(
                onClick = {
                    navController.navigate("atualizarContatos")
                },
                modifier = Modifier.padding(20.dp).fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Purple500
                )
            ) {
                Text(text = "Salvar", fontSize = 18.sp, color = Color.White)
            }
        }
    }
}
