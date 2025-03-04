package com.example.recetario.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import com.example.recetario.R

@Composable
fun TitleBar(name: String){
    Text(text = name,
        fontSize = 25.sp,
        color = Color.Black,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Monospace)
}

@Composable
fun MainButton(name:String, backcolor:Color, color:Color, onClick:()->Unit){
    Button(onClick = onClick, colors = ButtonDefaults.buttonColors( contentColor = color,
                                                                    containerColor = backcolor
    ),
        border = BorderStroke(2.dp, Color(0,0,0)),
        shape = RectangleShape,
        modifier = Modifier // Tener cuidado al momento de la importación de la libreria Modifier(androidx.compose.ui).
            .height(60.dp) // Altura del botón.
            .widthIn(min = 150.dp) // Ancho.
            .padding(8.dp) // Padding interno.
            .shadow( // Sombra para dar profundidad al botón.
                elevation = 8.dp
            )){
        Text(text = name,
             fontWeight = FontWeight.Bold,
             fontFamily = FontFamily.Monospace // Tipo de letra.
        )
    }
}

@Composable
fun UndoButton(onClick:()->Unit) {
    Button(onClick = onClick,
           colors = ButtonDefaults.buttonColors( contentColor = Color.Black,
                                                 containerColor = Color.Transparent),
           border = BorderStroke(2.dp, Color(0,0,0)),
           shape = RectangleShape
        ) {
        Text(text = "REGRESAR",
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace
        )
    }
}