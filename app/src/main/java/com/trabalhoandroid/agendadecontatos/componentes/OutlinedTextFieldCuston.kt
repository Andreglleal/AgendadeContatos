package com.trabalhoandroid.agendadecontatos.componentes

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.trabalhoandroid.agendadecontatos.ui.theme.Purple500

@Composable
fun OutlinedTextFieldCuston(
    value: String,
    onValueChange: (String) -> Unit,
    label: @Composable () -> Unit,
    keyboardOptions: KeyboardOptions,
    modifier: Modifier
) {
    OutlinedTextField(
        value,
        onValueChange,
        label = label,
        textStyle = TextStyle(
            color = Color.Black,
            fontSize = 20.sp,
        ),
        maxLines = 1,
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Purple500,
            cursorColor = Purple500
        ),
        modifier = modifier,
        keyboardOptions = keyboardOptions
    )
}