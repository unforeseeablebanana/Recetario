package com.example.recetario.views

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.recetario.R
import com.example.recetario.components.MainButton
import com.example.recetario.navigation.AppRoutes

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavController) {
    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        border = BorderStroke(2.dp, Color.Black)
                    )
            ) {
                CenterAlignedTopAppBar(
                    title = {
                        Text("R E C E T A R I O",
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Monospace)
                    },
                    colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                        containerColor = Color(255,231,210)
                    )
                )
            }
        }
    ) { innerPadding ->
        ContentViewH(
            navController = navController,
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Composable
private fun ContentViewH(navController: NavController, modifier: Modifier = Modifier){
    val backgroundImage: Painter = painterResource(id = R.drawable.background)
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
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start //Las opciones están alineadas a la izquierda y no en el centro.
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(15.dp)
            ) {
                ImageView(R.drawable.pannacotta, "Pannacotta")
                Spacer(modifier = Modifier.width(16.dp))
                MainButton("PANNA-COTTA", Color(255, 195, 0), Color.Black) {
                    navController.navigate(AppRoutes.PANNACOTTA)
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(15.dp)
            ) {
                ImageView(R.drawable.icecream, "Icecream")
                Spacer(modifier = Modifier.width(16.dp))
                MainButton("ICE CREAM", Color(255, 195, 0), Color.Black) {
                    navController.navigate(AppRoutes.ICECREAM)
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(15.dp)
            ) {
                ImageView(R.drawable.cookie, "Cookie")
                Spacer(modifier = Modifier.width(16.dp))
                MainButton("CHOCOLATE COOKIES", Color(255, 195, 0), Color.Black) {
                    navController.navigate(AppRoutes.COOKIES)
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(15.dp)
            ) {
                ImageView(R.drawable.cake, "Cake")
                Spacer(modifier = Modifier.width(16.dp))
                MainButton("CARROT CAKE", Color(255, 195, 0), Color.Black) {
                    navController.navigate(AppRoutes.CARROT)
                }
            }
        }
    }
}

@Composable
fun ImageView(imageId: Int, imageDesc: String) {
    Image( painter = painterResource(id = imageId),
        contentDescription = imageDesc,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(125.dp)
    )
}