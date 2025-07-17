package com.trabalhoandroid.agendadecontatos.itemlista

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.trabalhoandroid.agendadecontatos.model.Contato
import com.trabalhoandroid.agendadecontatos.ui.theme.Gray40
import com.trabalhoandroid.agendadecontatos.ui.theme.White

@Composable

fun ContatoItem(
    contato: Contato
){

    Card(
        modifier = Modifier.fillMaxWidth().padding(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Gray40,
            contentColor = White
        )

    ){
        Column(
            modifier = Modifier.fillMaxWidth().padding(20.dp)
        ){
            Text(
                text = "Contato:${contato.nome} ${contato.sobrenome}",
                fontSize = 18.sp,
                color = Color.Black
            )
            Text(
                text = "Idade:${contato.idade}",
                fontSize = 18.sp,
                color = Color.Black
            )
            Text(
                text = "Celular:${contato.celular}",
                fontSize = 18.sp,
                color = Color.Black
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                IconButton(
                    onClick = {}
                ){
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Editar",
                        tint = Color.Black
                    )
                }
                IconButton(
                    onClick = {}
                ){
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "Deletar",
                        tint = Color.Red
                    )
                }
            }

        }

    }

}


