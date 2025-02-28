package com.example.recetario.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recetario.R
import com.example.recetario.components.MainButton
import com.example.recetario.navigation.AppRoutes
import androidx.navigation.NavController
import com.example.recetario.components.UndoButton

@Composable
fun CrossaintView(navController: NavController) {
    val backgroundImage: Painter = painterResource(id = R.drawable.cooking)
    val items = List(50) { "Elemento #$it" } // Lista de elementos.
    Box(
        modifier = Modifier.fillMaxSize() // Ocupa toda la pantalla.
    ) {
        // Imagen de fondo.
        Image(
            painter = backgroundImage,
            contentDescription = "Imagen de fondo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize() // Ocupa toda la pantalla
                .alpha(0.5f) // Aplica transparencia (0.5f = 50% de opacidad).
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
                    text = "1 kg. harina de trigo común.\n" +
                            "100 gr azúcar blanca.\n" +
                            "400 gr mantequilla.\n" +
                            "55 gr levadura fresca.\n" +
                            "1 huevo pequeño.\n" +
                            "1 pizca de sal fina.\n" +
                            "550 ml. leche fría.\n" +
                            "1 cda. miel.\n" +
                            "1 cda. vainilla.\n",
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
                    text = "\n1. MASA: En un bol vamos a poner el kilo de harina hacemos un hueco (como un volcán) y le agregamos el azúcar, la sal (en los bordes para que no se junte con la levadura) seguidamente le agregamos la cucharada de miel, en el centro ponemos el huevo, la vainilla y la levadura desgranada (sin que toque la sal) por último agregaremos la mitad de la leche fría y vamos a empezar a mezclar.\n" +
                            "Cuando tengamos un poco integrada la masa la ponemos sobre la mesa y vamos a comenzar a amasarla hasta que quede lisa si ves que se pega, que seguro se va a pegar, agrégale un poco de harina, solo lo necesario, cuando estemos amasando la masa se irá poniendo menos pegajosa. Debe quedar manejable sin pegarse.\n" +
                            "Vamos a amasar 10 minutos contínuos y dejamos reposar por 10 minutos, envolviendo repetiremos dos veces este procedimiento. Culminado este procedimiento procedemos a estirar un poco de la masa y debe transparentarse sin romperse, si eso ocurre está lista para llevarla a lanevera, de lo contrario debemos continuar el amasado pero esta vez solo por 5 minutos y descansa la masa 5 minutos hasta que sea lo suficientemente flexible.\n" +
                            "Al estar la masa lista la cubrimos con un film plástico, la dejamos reposar de 30 a 40 minutos en un lugar sin corriente de aire, bien cerrada. Finalizado el tiempo la llevamos a la refrigeradora por 40 minutos para que descanse bien y tenga la temperatura deseada.\n" +
                            "Sigamos con la otra parte de la masa, la mantequilla. Vamos a estirar los 400 gramos de mantequilla sobre un film plástico envolviendo bien y con un rodillo o botella larga, la estiramos hasta formar un rectángulo que sea parejo. Cuando tengamos el rectángulo la llevamos al congelador. Debe estar muy fría.",
                    color = Color.White,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Justify
                )
                Text(
                    text = "\n2. ESTIRADO DE LA MASA: Sacamos la masa y la ponemos sobre la mesa con un poco de harina y estiramos formando un rectángulo, para ello pondremos en la mitad de la masa el rodillo y comenzaremos a estirar de la mitad hacia arriba y de la mitad hacia abajo debe superar tres veces el tamaño de la mantequilla. Sacamos la mantequilla y la acomodamos en el centro de la masa. La masa debe envolver la totalidad de la mantequilla.\n" +
                            "Luego, ya teniendo la mantequilla dentro de la masa, repetimos el estirado, de esta manera haremos que la mantequilla se reparta bien en el interior de la masa, al finalizar debes doblarla en cuatro partes, llevaremos los dos extremos hacia el centro y volveremos a doblar, cuando miramos de costado tienen que quedar cuatro dobleces de masa . Cubrimos con film y llevamos nuevamente al refrigerador por 20 minutos.\n" +
                            "Pasados los 20 minutos, sacamos la masa de la refrigeradora y la acomodamos sobre la mesa espolvoreada con un poco de harina, recuerda con los laterales más cortos más cerca de ti. Repetimos el estirado, volvemos a guardar con papel film por 20 minutos.\n" +
                            "Este procedimiento lo haremos mínimo cinco veces, cuanto más veces lo hagas mejor te quedará el hojaldre, siempre entre las estiradas de la masa debe descansar, esto evitará que se escape la mantequilla o que se nos rompa la masa. Cuando ya hayas hecho los cinco (5) dobleces déjala descansar y estará lista para usar.",
                    color = Color.White,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Justify
                )
                Text(
                    text = "\n3. FORMA DEL CROSSAINT: Extiende la masa en la mesa de trabajo ligeramente enharinada, hasta obtener un rectángulo de 30×75 cm aproximadamente, y unos 4 mm. de grosor. Corta el rectángulo por la mitad a lo largo.\n" +
                            "Corta triángulos, unos 6 o 7 triángulos de 9 cm de base y 15 de costado. (no es necesario tener un centímetro, calcula que sean más o menos como gustas). Pueden ser finos y crujientes, y otros más pequeños, gorditos y esponjosos.\n" +
                            "Para enrollar los triángulos y darles forma, haz un pequeño corte vertical en la base y empieza a enrollar desde la parte más grueza, sin aplastar la masa.\n" +
                            "Bate el huevo para barnizar los croissants y luego déjalos reposar dos horas en un lugar cálido, sin corrientes de aire, mejor si es un sitio cerrado, para evitar que se cree corteza. Puedes barnizar los croissants antes de dejarlos en reposo y nuevamente antes de introducirlos en el horno.\n",
                    color = Color.White,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Justify
                )
                Text(
                    text = "\n4. HORNO: Coloca los croissants en una bandeja enharinada o con papel antiadherente, necesitarás como mínimo dos bandejas, recuerda dejar espacio suficiente para que no se peguen durante el horneado.\n" +
                            "Precalienta el horno a 200º C.\n" +
                            "Hornea durante 20 minutos aproximadamente, hasta que estén dorados, el tiempo dependerá del horno y del tamaño que le hayas dado a los croissants.\n",
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