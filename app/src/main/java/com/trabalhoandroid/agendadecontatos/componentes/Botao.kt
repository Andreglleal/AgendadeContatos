package com.trabalhoandroid.agendadecontatos.componentes

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.trabalhoandroid.agendadecontatos.ui.theme.Purple500

@Composable
fun Botao(
    onClick: () -> Unit,
    texto: String,

){
    Button(
        onClick,
        modifier = Modifier.padding(20.dp).fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Purple500
        )
    ) {
        Text(text = texto, fontSize = 18.sp, color = Color.White)
    }

}