package com.trabalhoandroid.agendadecontatos.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
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
    ){PaddingValues->
        Column(
            modifier = Modifier.padding(PaddingValues)
        ){
            OutlinedTextField(
                value = name,
                onValueChange = {
                    name = it
                },
                label = {Text(text = "Name")},
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 20.sp,
                ),
                maxLines = 1,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Purple500,
                    cursorColor = Purple500
                ),
                modifier = Modifier.fillMaxWidth().padding(20.dp,80.dp,20.dp,10.dp)
            )
            OutlinedTextField(
                value = sobrenome,
                onValueChange = {
                    sobrenome = it
                },
                label = {Text(text = "Sobrenome")},
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 20.sp,
                ),
                maxLines = 1,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Purple500,
                    cursorColor = Purple500
                ),
                modifier = Modifier.fillMaxWidth().padding(20.dp,0.dp,20.dp,10.dp)
            )
            OutlinedTextField(
                value = idade,
                onValueChange = {
                    idade = it
                },
                label = {Text(text = "idade")},
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 20.sp,
                ),
                maxLines = 1,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Purple500,
                    cursorColor = Purple500
                ),
                modifier = Modifier.fillMaxWidth().padding(20.dp,0.dp,20.dp,10.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
            OutlinedTextField(
                value = celular,
                onValueChange = {
                    celular = it
                },
                label = {Text(text = "Celular")},
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 20.sp,
                ),
                maxLines = 1,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Purple500,
                    cursorColor = Purple500
                ),
                modifier = Modifier.fillMaxWidth().padding(20.dp,0.dp,20.dp,10.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
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
