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
                Spacer(modifier = Modifier.height(10.dp))
                Image(painter = painterResource(R.drawable.pannacottar),
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
                Box( //Subrayado de texto amarillo
                    Modifier.fillMaxSize()
                        .background(Color(255, 195, 0))
                ){
                   Text(
                    text = "I N G R E D I E N T E S",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 25.sp
                    )}
                Spacer(modifier = Modifier.height(20.dp))
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
                Spacer(modifier = Modifier.height(20.dp))
                Box(
                    Modifier.fillMaxSize()
                        .background(Color(255, 195, 0)) // Fondo amarillo.
                ){
                Text(
                    text = "P R E P A R A C I Ó N",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 25.sp
                )}
                Text(
                    text = "\n1. Si usas gelatina en polvo, disuélvela en 2 cucharadas de agua fría y déjala hidratar durante 5 minutos." +
                            "Si usas hojas de gelatina, remójalas en agua fría durante 5-10 minutos hasta que estén blandas.\n" +
                            "2. Abre la vaina de vainilla a lo largo y raspa las semillas con un cuchillo.\n" +
                            "3. En una cacerola, combina la crema de leche, la leche, el azúcar, las semillas de vainilla, la vaina vacía y la pizca de sal.\n" +
                            "4. Calienta a fuego medio-bajo, revolviendo ocasionalmente, hasta que esté caliente pero sin hervir (unos 70°C). Apaga el fuego y deja infusionar durante 15-20 minutos.\n"+
                            "5. Retira la vaina de vainilla de la mezcla.\n" +
                            "6. Agrega la gelatina hidratada (o las hojas escurridas) a la mezcla caliente y remueve hasta que se disuelva por completo.\n"+
                            "7. Cuela la mezcla para eliminar cualquier grumo o impureza.\n" +
                            "8. Vierte la mezcla en moldes individuales (ramequines o copas).\n" +
                            "9. Refrigera durante al menos 4 horas (preferiblemente toda la noche) hasta que esté firme",
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