package com.example.recetario.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
fun CookiesView(navController: NavController) {
    val items = List(50) { "Elemento #$it" }
    Box(
        modifier = Modifier.fillMaxSize()
            .background(Color(238,231,213))
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            items(1) { item ->
                Box(
                    Modifier.fillMaxSize()
                        .background(Color(255, 195, 0))
                ){
                Text(
                    text = "I N G R E D I E N T E S",
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp
                )}
                Text(
                    text = "\n1 ¼ tazas de harina de trigo\n" +
                            "¾ taza de azúcar moreno\n" +
                            "½ taza de azúcar blanca\n" +
                            "½ taza de mantequilla derretida sin sal\n" +
                            "1 cdita de extracto de vainilla\n" +
                            "1 huevo\n" +
                            "150 gr de chocolate negro troceado\n" +
                            "Chispas de chocolate al gusto\n" +
                            "½ cdita de bicarbonato de sodio\n" +
                            "1 cdita de sal\n",
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 22.sp
                )
                Box(
                    Modifier.fillMaxSize()
                        .background(Color(255, 195, 0))
                ){
                Text(
                    text = "P R E P A R A C I Ó N",
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp
                )}
                Text(
                    text = "\n1. MASA: Incorpora en un bol el azúcar blanca, el azúcar moreno y la cucharadita de sal.\n" +
                            "Vierte la mantequilla derretida sin sal. Mezcla muy bien hasta que se integre todo.\n" +
                            "Agrega el huevo y la cucharadita de vainilla. Mezcla perfectamente para que todo se unifique.\n" +
                            "Añade de a poco el harina de trigo y el bicarbonato de sodio.\n" +
                            "Mezcla nuevamente hasta que obtengas una masa suave y un poco pegajosa.\n",
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Justify
                )
                Text(
                    text = "\n2. CHISPAS: Es turno de incorporar el chocolate negro en trozos y las chispas de chocolate. Mezcla, otra vez, para que se integren a la masa.\n" +
                            "Cuando esté integrada, deja en el bol y tapa con un papel encerado. Deja reposar por 30 minutos.\n",
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Justify
                )
                Text(
                    text = "\n3. HORNO: Pasado ese tiempo, precalienta el horno a 180° C. Forra una bandeja con papel encerado.\n" +
                            "Destapa la masa y con la ayuda de un utensilio para servir helado, toma una porción de la masa de galletas y coloca en la bandeja, dejando 8 centímetros de separación.\n" +
                            "Cuando hayas armado todas las bolitas, hornea de 10 a 12 minutos hasta que queden bien doradas y suaves por dentro.\n" +
                            "Retira del horno, deja reposar y degusta.",
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
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