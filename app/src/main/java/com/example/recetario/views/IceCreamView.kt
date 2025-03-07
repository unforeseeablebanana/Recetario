package com.example.recetario.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
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

@Composable
fun IceCreamView(navController: NavController) {
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
                Spacer(modifier = Modifier.height(10.dp))
                Image(painter = painterResource(R.drawable.icecreamr),
                    contentDescription = "",
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(250.dp)
                        .border(
                            width = 1.dp,
                            color = Color.Transparent,
                            shape = RoundedCornerShape(16.dp)
                        )
                        .shadow(8.dp, shape = RoundedCornerShape(21.dp))
                )
                Spacer(modifier = Modifier.height(40.dp))
                Box(
                    Modifier.fillMaxSize()
                        .background(Color(255, 195, 0))
                ){
                Text(
                    text = "I N G R E D I E N T E S",
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )}
                Text(
                    text = "\n- 500 ml de crema de leche (nata para montar): Con un 30-35% de grasa para una textura cremosa.\n" +
                            "- 500 ml de leche entera.\n" +
                            "- 150 g de azúcar granulada.\n" +
                            "- 1 vaina de vainilla. Si no tienes, usa 1 cucharadita de extracto de vainilla puro.\n" +
                            "- 6 yemas de huevo.\n" +
                            "- Una pizca de sal.",
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
                    fontSize = 25.sp
                )}
                Text(
                    text = "\nMEZCLA: \n" +
                            "1. Abre la vaina de vainilla a lo largo y raspa las semillas con un cuchillo.\n" +
                            "2. En una cacerola, combina la crema de leche, la leche, las semillas de vainilla, la vaina vacía y la pizca de sal.\n" +
                            "3. Calienta a fuego medio-bajo hasta que esté caliente pero sin hervir (unos 70°C). Apaga el fuego y deja infusionar durante 30 minutos.\n" +
                            "4. Preparar la base del helado (crema inglesa):\n" +
                            "5. En un tazón aparte, bate las yemas de huevo con el azúcar hasta que estén pálidas y esponjosas.\n" +
                            "6. Retira la vaina de vainilla de la mezcla de leche y crema.\n" +
                            "7. Vierte un poco de la mezcla caliente sobre las yemas batidas, revolviendo constantemente para temperar (evitar que las yemas se cocinen).\n" +
                            "8. Vierte la mezcla de yemas de vuelta en la cacerola con el resto de la leche y crema.\n" +
                            "9. Cocina a fuego medio-bajo, revolviendo constantemente con una cuchara de madera, hasta que la mezcla espese ligeramente y cubra el dorso de la cuchara (unos 80°C). No dejes que hierva, o las yemas se cuajarán.\n" +
                            "Enfriar la mezcla:\n" +
                            "10. Cuela la mezcla para eliminar cualquier grumo.\n" +
                            "11. Transfiere a un tazón y deja enfriar a temperatura ambiente.\n" +
                            "12. Cubre con plástico adherente, tocando la superficie para evitar que se forme una capa, y refrigera durante al menos 4 horas (preferiblemente toda la noche).\n",
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Justify
                )
                Text(
                    text = "HELADO: Vierte la mezcla fría en la máquina de helados y sigue las instrucciones del fabricante. Chúrrala hasta que alcance una consistencia suave y cremosa (unos 20-30 minutos).\n" +
                            "Si no tienes máquina de helados, vierte la mezcla en un recipiente hermético y congélala, revolviendo cada 30 minutos durante las primeras 2-3 horas para romper los cristales de hielo.",
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Justify
                )
                UndoButton() {
                    navController.popBackStack()
                }
            }
        }
    }
}