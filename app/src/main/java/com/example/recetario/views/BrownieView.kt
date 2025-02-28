package com.example.recetario.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.recetario.R
import com.example.recetario.components.UndoButton
import com.example.recetario.navigation.AppRoutes

@Composable
fun BrownieView(navController: NavController) {
    val backgroundImage: Painter = painterResource(id = R.drawable.cooking)
    val items = List(50) { "Elemento #$it" }
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = backgroundImage,
            contentDescription = "Imagen de fondo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .alpha(0.5f)
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            items(1) { item ->
                Text(
                    text = "I N G R E D I E N T E S\n",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp
                )
                Text(
                    text = "200 gramos de chocolate negro.\n" +
                            "180 gramos de mantequilla sin sal.\n" +
                            "200 gramos de azúcar moreno.\n" +
                            "3 huevos grandes.\n" +
                            "100 gramos de harina.\n" +
                            "50 gramos de almendras picadas.\n" +
                            "1 cucharadita de levadura química.\n" +
                            "1 pizca de sal.\n",
                    color = Color.White,
                    fontFamily = FontFamily.Cursive,
                    fontSize = 22.sp
                )
                Text(
                    text = "P R E P A R A C I Ó N\n",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp
                )
                Text(
                    text = "\n1. MASA: Precalienta el horno a 180ºC. Mientras tanto, prepara un molde cuadrado o rectangular engrasado y enharinado. Si no tienes harina, puedes usar un poquito de mantequilla para engrasar el molde.\n" +
                            "Derrite el chocolate y la mantequilla: En un bol resistente al calor, coloca el chocolate troceado y la mantequilla. Mételo en el microondas a intervalos de 30 segundos, removiendo entre cada intervalo, hasta que se derrita todo. Si prefieres hacerlo al baño maría, también puedes.\n" +
                            "En otro bol, mezcla la harina, la levadura y la sal. Reserva.\n" +
                            "En un bol grande, bate los huevos con el azúcar hasta que estén espumosos. Luego, incorpora la mezcla de chocolate y mantequilla derretida. A continuación, añade poco a poco los ingredientes secos tamizados y las almendras picadas. Mezcla todo hasta obtener una masa homogénea.\n",
                    color = Color.White,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Justify
                )
                Text(
                    text = "\n2. HORNO: Vierte la masa en el molde preparado y hornea durante 25-30 minutos, o hasta que al insertar un palillo salga húmedo pero sin restos de masa cruda.\n" +
                            "Una vez horneados, deja los brownies enfriar completamente en el molde antes de cortarlos en cuadrados.",
                    color = Color.White,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Justify
                )
                UndoButton() {
                    navController.navigate(AppRoutes.HOME)
                }
            }
        }
    }
}