package com.example.recetario.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.recetario.components.UndoButton

@Composable
fun PannaCottaView(navController: NavController) {
    val items = List(50) { "Elemento #$it" } // Lista de elementos.
    Box(
        modifier = Modifier.fillMaxSize() // Ocupa toda la pantalla.
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
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 30.sp
                )}

                Text(
                    text = "\n- 500 ml de crema de leche (nata para montar): Debe tener al menos un 30% de grasa para una textura cremosa.\n" +
                            "- 100 ml de leche entera.\n" +
                            "- 100 g de azúcar granulada.\n" +
                            "- 1 vaina de vainilla.Si no tienes, puedes usar 1 cucharadita de extracto de vainilla puro.\n" +
                            "- 4 g de gelatina en polvo sin sabor (o 2 hojas de gelatina).\n" +
                            "- Una pizca de sal.\n",
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
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 30.sp
                )}
                Text(
                    text = "\n1. GELATINA: Si usas gelatina en polvo, disuélvela en 2 cucharadas de agua fría y déjala hidratar durante 5 minutos." +
                            "Si usas hojas de gelatina, remójalas en agua fría durante 5-10 minutos hasta que estén blandas.\n" +
                            "Abre la vaina de vainilla a lo largo y raspa las semillas con un cuchillo.\n" +
                            "En una cacerola, combina la crema de leche, la leche, el azúcar, las semillas de vainilla, la vaina vacía y la pizca de sal.\n" +
                            "Calienta a fuego medio-bajo, revolviendo ocasionalmente, hasta que esté caliente pero sin hervir (unos 70°C). Apaga el fuego y deja infusionar durante 15-20 minutos.\n"+
                            "Retira la vaina de vainilla de la mezcla.\n" +
                            "Agrega la gelatina hidratada (o las hojas escurridas) a la mezcla caliente y remueve hasta que se disuelva por completo.\n"+
                            "Cuela la mezcla para eliminar cualquier grumo o impureza.\n" +
                            "Vierte la mezcla en moldes individuales (ramequines o copas).\n" +
                            "Refrigera durante al menos 4 horas (preferiblemente toda la noche) hasta que esté firme",
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Justify
                )
                UndoButton() {
                    //navController.navigate(AppRoutes.HOME)
                    navController.popBackStack()
                }
            }
        }
    }
}