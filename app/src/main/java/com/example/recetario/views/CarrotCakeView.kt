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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.shadow
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
fun CarrotCakeView(navController: NavController) {
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
                Image(painter = painterResource(R.drawable.carrotr),
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
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    fontFamily = FontFamily.Monospace
                )}
                Text(
                    text = "\n- 2 ½ tazas de zanahoria rallada\n" +
                            "- 3 tazas de harina de trigo\n" +
                            "- 6 huevos\n" +
                            "- 2 tazas de aceite vegetal\n" +
                            "- ⅓ taza de nuez troceadas\n" +
                            "- 2 cditas de polvo para hornear\n" +
                            "- 1 cdita de bicarbonato de sodio\n" +
                            "- 1 ½ taza de azúcar\n" +
                            "- 2 cdas de canela\n" +
                            "- 200 gr de mantequilla\n" +
                            "- 380 gr de queso crema\n" +
                            "- 3 tazas de azúcar glass\n" +
                            "- 1 chorrito de extracto de vainilla\n" +
                            "- Nueces troceadas para decorar\n",
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
                    fontSize = 25.sp
                )}
                Text(
                    text = "\nMASA: \n" +
                            "1. Incorpora en un bol los ingredientes secos: la harina, sal, azúcar, canela, polvo de hornear y el bicarbonato de sodio.\n" +
                            "2. Precalienta el horno a 180 °C.\n" +
                            "3. Mezcla muy bien con la ayuda de un batidor manual hasta que se integre todo.\n" +
                            "4. Vierte el aceite y mezcla para que se indique con los ingredientes secos.\n" +
                            "5. Agrega poco a poco los seis huecos y mezcla.\n" +
                            "6. Por último, incorpora la zanahoria rallada y las nueces troceadas. Integra muy bien.\n" +
                            "7. Vierte la mezcla en un molde engrasado y enharinado.\n",
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Justify
                )
                Text(
                    text = "\nHORNO: \n" +
                            "8. Hornea durante una hora aproximadamente o hasta que introduzcas un palillo y salga limpio.\n" +
                            "9. Mientras se hornea, con la ayuda de una batidora eléctrica o manual, incorpora la mantequilla y bate hasta cremar.\n" +
                            "10. Incorpora el queso crema, el azúcar glass y la vainilla. Mezcla hasta que se integre y quede una mezcla suave.\n" +
                            "11. Cuando el pastel esté horneado, deja reposar y desmolda.\n" +
                            "12. Unas vez a temperatura ambiente, cúbrelo con el betún.\n" +
                            "13. Decora con las nueves troceadas y listo.\n",
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